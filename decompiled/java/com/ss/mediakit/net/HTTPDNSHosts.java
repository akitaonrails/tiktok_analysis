package com.ss.mediakit.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class HTTPDNSHosts {
    public static String mTTDNSServer = "/q?host=";
    public boolean mCancelled;
    public Handler mHandler;
    public String[] mHostnames;
    public int mHttpDNSType;
    public String mId;
    public AVMDLNetClient mNetClient;

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(AVMDLDNSParser.mGlobalOwnDNSParseHost);
        sbLIZ.append(mTTDNSServer);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.mHostnames;
            if (i >= strArr.length) {
                return sb.toString();
            }
            if (!TextUtils.isEmpty(strArr[i])) {
                if (i2 == 0) {
                    sb.append(this.mHostnames[i]);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(",");
                    sbLIZ2.append(this.mHostnames[i]);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                i2++;
            }
            i++;
        }
    }

    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    public void start() {
        String str_getURL = _getURL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("batch http dns  url:");
        sbLIZ.append(str_getURL);
        AVMDLLog.d("BatchParseHTTPDNSHosts", C2188811AlT.LIZIZ(sbLIZ));
        for (Method method : this.mNetClient.getClass().getDeclaredMethods()) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(str_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNSHosts.1
                    @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNSHosts.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(str_getURL, null, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNSHosts.2
            @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNSHosts.this._handleResponse(jSONObject, error);
            }
        });
    }

    private void parseResult(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "dns");
            for (int i = 0; i < jSONArray.length(); i++) {
                AVMDLDNSInfo aVMDLDNSInfo = parserResultForSingleHost(JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                if (aVMDLDNSInfo != null) {
                    IPCache.getInstance().put(aVMDLDNSInfo.mHost, aVMDLDNSInfo);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse json exception");
            sbLIZ.append(e);
            AVMDLLog.d("BatchParseHTTPDNSHosts", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private AVMDLDNSInfo parserResultForSingleHost(JSONObject jSONObject) {
        int iOptInt;
        String strOptString;
        long jCurrentTimeMillis;
        String string;
        int i = this.mHttpDNSType;
        String str = "";
        if (i != 2 && i != 1) {
            strOptString = null;
            jCurrentTimeMillis = 0;
        } else {
            if (jSONObject != null && jSONObject.length() != 0) {
                if (jSONObject.has("ttl")) {
                    iOptInt = jSONObject.optInt("ttl");
                } else {
                    iOptInt = 60;
                }
                if (jSONObject.has("host")) {
                    strOptString = jSONObject.optString("host");
                } else {
                    strOptString = null;
                }
                jCurrentTimeMillis = System.currentTimeMillis() + ((long) (iOptInt * LSPassThroughRecordSizeConfig.DEFAULT));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        try {
                            string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            string = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            if (TextUtils.isEmpty(str)) {
                                str = str + string;
                            } else {
                                str = str + "," + string;
                            }
                        }
                    }
                }
            }
            return null;
        }
        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(str)) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", C786410Ut5.k4(Locale.US, "parse result host:%s ips:%s expiredT:%d", new Object[]{strOptString, str, Long.valueOf(jCurrentTimeMillis)}));
            return new AVMDLDNSInfo(this.mHttpDNSType, strOptString, str, jCurrentTimeMillis, this.mId);
        }
        AVMDLLog.d("BatchParseHTTPDNSHosts", "parse result is null");
        return null;
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        Locale locale = Locale.US;
        AVMDLLog.d("BatchParseHTTPDNSHosts", C786410Ut5.k4(locale, "****http dns id:%s type:%d", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType)}));
        if (error != null) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", C786410Ut5.k4(locale, "handle response receive err:%s", new Object[]{error.errStr}));
            return;
        }
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                parseResult(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AVMDLLog.d("BatchParseHTTPDNSHosts", C786410Ut5.k4(Locale.US, "handle response exception:%s", new Object[]{th.toString()}));
            }
            AVMDLLog.d("BatchParseHTTPDNSHosts", C786410Ut5.k4(Locale.US, "****parse end", new Object[0]));
            return;
        }
        AVMDLLog.d("BatchParseHTTPDNSHosts", C786410Ut5.k4(locale, "json null err", new Object[0]));
    }

    public HTTPDNSHosts(String[] strArr, AVMDLNetClient aVMDLNetClient, int i, Handler handler) throws Exception {
        this.mHttpDNSType = 2;
        if (i == 2) {
            if (strArr != null && strArr.length != 0) {
                this.mHttpDNSType = i;
                this.mHostnames = strArr;
                this.mNetClient = aVMDLNetClient;
                if (aVMDLNetClient == null) {
                    this.mNetClient = new AVMDLHTTPNetwork();
                }
                this.mHttpDNSType = i;
                this.mHandler = handler;
                return;
            }
            AVMDLLog.d("BatchParseHTTPDNSHosts", "host array is valid");
            throw new Exception("host array is valid");
        }
        AVMDLLog.d("BatchParseHTTPDNSHosts", "create fail type is not own");
        throw new Exception("type is not own");
    }
}

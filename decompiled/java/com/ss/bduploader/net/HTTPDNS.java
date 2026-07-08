package com.ss.bduploader.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bduploader.BDUploadLog;
import com.ss.bduploader.net.BDVNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class HTTPDNS extends BaseDNS {
    public static String mGlobalGoogleDNSParseHost = "";
    public static String mGlobalOwnDNSParseHost = "";
    public static String mGoogleDNSServerPath = "/resolve?name=";
    public static String mTTDNSServerPath = "/q?host=";
    public int mHttpDNSType;
    public Object mSource;
    public long mSourceId;

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(mGlobalOwnDNSParseHost);
            sbLIZ.append(mTTDNSServerPath);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        } else if (i == 3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://");
            sbLIZ2.append(mGlobalGoogleDNSParseHost);
            sbLIZ2.append(mGoogleDNSServerPath);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void start() {
        String str_getURL = _getURL();
        for (Method method : this.mNetClient.getClass().getDeclaredMethods()) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(str_getURL, null, null, 0, new BDVNetClient.CompletionListener() { // from class: com.ss.bduploader.net.HTTPDNS.1
                    @Override // com.ss.bduploader.net.BDVNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(str_getURL, null, new BDVNetClient.CompletionListener() { // from class: com.ss.bduploader.net.HTTPDNS.2
            @Override // com.ss.bduploader.net.BDVNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private BDUploadDNSInfo parserResult(JSONObject jSONObject) {
        long jCurrentTimeMillis;
        String string;
        int i = this.mHttpDNSType;
        String strLIZIZ = "";
        int iOptInt = 60;
        if (i != 2 && i != 1) {
            jCurrentTimeMillis = 0;
            string = null;
        } else {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                if (jSONObject.has("ttl")) {
                    iOptInt = jSONObject.optInt("ttl");
                }
                jCurrentTimeMillis = System.currentTimeMillis() + ((long) (iOptInt * LSPassThroughRecordSizeConfig.DEFAULT));
                string = null;
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    try {
                        string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        if (TextUtils.isEmpty(strLIZIZ)) {
                            strLIZIZ = strLIZIZ + string;
                        } else {
                            strLIZIZ = strLIZIZ + "," + string;
                        }
                    }
                }
            } else {
                BDUploadLog.d("HTTPDNS", C786410Ut5.j4("no ips in json, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
                return null;
            }
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "Answer");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i3);
                    if (jSONObject2.has("type") && JSONObjectProtectorUtils.getInt(jSONObject2, "type") == 1) {
                        if (jSONObject2.has("TTL")) {
                            iOptInt = jSONObject2.optInt("TTL");
                        }
                        if (jSONObject2.has("data")) {
                            string = jSONObject2.optString("data");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            if (TextUtils.isEmpty(strLIZIZ)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLIZIZ);
                                sbLIZ.append(string);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append(",");
                                sbLIZ2.append(string);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                    }
                }
                jCurrentTimeMillis = System.currentTimeMillis() + ((long) (iOptInt * LSPassThroughRecordSizeConfig.DEFAULT));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        return new BDUploadDNSInfo(this.mHttpDNSType, this.mHostname, strLIZIZ, jCurrentTimeMillis, this.mId);
    }

    public static void setDNSServerHost(String str, String str2) {
        synchronized (HTTPDNS.class) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    mGlobalOwnDNSParseHost = str;
                }
                if (!TextUtils.isEmpty(str2)) {
                    mGlobalGoogleDNSParseHost = str2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        BDUploadLog.d("HTTPDNS", C786410Ut5.j4("****http dns id:%s", new Object[]{this.mId}));
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(this.mHttpDNSType, this.mHostname, null, 0L, this.mId);
        if (error != null) {
            bDUploadDNSInfo.mErrorStr = error.errStr;
        } else if (jSONObject != null && jSONObject.length() != 0) {
            BDUploadDNSInfo bDUploadDNSInfo2 = parserResult(jSONObject);
            if (bDUploadDNSInfo2 != null) {
                IPCache.getInstance().put(this.mHostname, bDUploadDNSInfo2);
                notifySuccess(bDUploadDNSInfo2);
                return;
            }
        } else {
            BDUploadLog.d("HTTPDNS", C786410Ut5.j4("http dns json is empty type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
        }
        notifyError(bDUploadDNSInfo);
    }

    public HTTPDNS(String str, BDVNetClient bDVNetClient, int i, Handler handler) {
        super(str, bDVNetClient, handler);
        this.mHttpDNSType = i;
    }
}

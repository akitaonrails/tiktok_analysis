package com.ss.mediakit.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class HTTPDNS extends BaseDNS {
    public static String mGoogleDNSServer = "/resolve?name=";
    public static String mTTDNSServer = "/q?host=";
    public int mHttpDNSType;
    public Object mSource;
    public long mSourceId;

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        boolean zIsIPv4Reachable = AVMDLMultiNetwork.isIPv4Reachable();
        boolean zIsIPv4Reachable2 = AVMDLMultiNetwork.isIPv4Reachable();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(AVMDLDNSParser.mGlobalOwnDNSParseHost);
            sbLIZ.append(mTTDNSServer);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        } else if (i == 3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://");
            sbLIZ2.append(AVMDLDNSParser.mGlobalGoogleDNSParseHost);
            sbLIZ2.append(mGoogleDNSServer);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        sb.append(this.mHostname);
        int i2 = this.mHttpDNSType;
        if (i2 == 2 || i2 == 1) {
            sb.append("&source=vod");
            AVMDLDataLoaderConfigure config = AVMDLDataLoader.getInstance().getConfig();
            if (config != null && config.mEnableNetworkChangeNotify == 1) {
                if (zIsIPv4Reachable) {
                    if (zIsIPv4Reachable2) {
                        sb.append("&f=0");
                    } else {
                        sb.append("&f=1");
                    }
                } else if (zIsIPv4Reachable2) {
                    sb.append("&f=2");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        String str_getURL = _getURL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("http dns url:");
        sbLIZ.append(str_getURL);
        AVMDLLog.d("HTTPDNS", C2188811AlT.LIZIZ(sbLIZ));
        for (Method method : this.mNetClient.getClass().getDeclaredMethods()) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(str_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNS.1
                    @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(str_getURL, null, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNS.2
            @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private AVMDLDNSInfo parserResult(JSONObject jSONObject) {
        long jCurrentTimeMillis;
        String string;
        int i = this.mHttpDNSType;
        String strLIZIZ = "";
        int iOptInt = 60;
        if (i != 2 && i != 1) {
            jCurrentTimeMillis = 0;
            string = null;
        } else if (jSONObject != null && jSONObject.length() != 0) {
            if (jSONObject.has("ttl")) {
                iOptInt = jSONObject.optInt("ttl");
            }
            AVMDLLog.d("HTTPDNS", C786410Ut5.k4(Locale.US, "receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(iOptInt), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
            int i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
            if (i2 > 0) {
                iOptInt = i2;
            }
            jCurrentTimeMillis = System.currentTimeMillis() + ((long) (iOptInt * LSPassThroughRecordSizeConfig.DEFAULT));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                string = null;
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    try {
                        string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i3);
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
                return null;
            }
        } else {
            return null;
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "Answer");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i4);
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
                AVMDLLog.d("HTTPDNS", C786410Ut5.k4(Locale.US, "receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(iOptInt), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                int i5 = AVMDLDNSParser.mGlobalForceExpiredTime;
                if (i5 > 0) {
                    iOptInt = i5;
                }
                jCurrentTimeMillis = System.currentTimeMillis() + ((long) (iOptInt * LSPassThroughRecordSizeConfig.DEFAULT));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        return new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, strLIZIZ, jCurrentTimeMillis, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        Locale locale = Locale.US;
        AVMDLLog.d("HTTPDNS", C786410Ut5.k4(locale, "****http dns id:%s type:%d host:%s", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType), this.mHostname}));
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, (String) null, 0L, this.mId);
        if (error != null) {
            String str = error.errStr;
            aVMDLDNSInfo.mErrorStr = str;
            AVMDLLog.d("HTTPDNS", C786410Ut5.k4(locale, "handle response receive err:%s", new Object[]{str}));
        } else if (jSONObject != null && jSONObject.length() != 0) {
            try {
                AVMDLDNSInfo aVMDLDNSInfo2 = parserResult(jSONObject);
                if (aVMDLDNSInfo2 != null) {
                    AVMDLLog.d("HTTPDNS", C786410Ut5.k4(Locale.US, "****parse suc for host:%s iplist:%s", new Object[]{this.mHostname, aVMDLDNSInfo2.mIpList}));
                    IPCache.getInstance().put(this.mHostname, aVMDLDNSInfo2);
                    notifySuccess(aVMDLDNSInfo2);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AVMDLLog.d("HTTPDNS", C786410Ut5.k4(Locale.US, "handle response exception:%s", new Object[]{th.toString()}));
            }
            AVMDLLog.d("HTTPDNS", C786410Ut5.k4(Locale.US, "info null err", new Object[0]));
        } else {
            int i = this.mHttpDNSType;
            new Error(i, this.mHostname, this.mId, C786410Ut5.k4(locale, "HTTP dns empty, type:%d", new Object[]{Integer.valueOf(i)}));
            AVMDLLog.d("HTTPDNS", C786410Ut5.k4(locale, "json null err", new Object[0]));
        }
        AVMDLLog.d("HTTPDNS", C786410Ut5.k4(Locale.US, "****parse failed for host:%s", new Object[]{this.mHostname}));
        notifyError(aVMDLDNSInfo);
    }

    public HTTPDNS(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        super(str, aVMDLNetClient, handler);
        this.mHttpDNSType = i;
    }
}

package org.chromium;

import X.C2089108Gj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class CronetAppInfoProvider extends TTAppInfoProvider {
    public static CronetAppInfoProvider sInstance;
    public TTAppInfoProvider.AppInfo mAppInfo;
    public Context mContext;

    @Override // com.ttnet.org.chromium.net.TTAppInfoProvider
    public TTAppInfoProvider.AppInfo getAppInfo() {
        try {
            synchronized (CronetAppInfoProvider.class) {
                try {
                    if (this.mAppInfo == null) {
                        this.mAppInfo = new TTAppInfoProvider.AppInfo();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.mAppInfo.LIZ = CronetAppProviderManager.inst().getAppId();
            this.mAppInfo.LJIL = CronetAppProviderManager.inst().getAppName();
            this.mAppInfo.LJJ = CronetAppProviderManager.inst().getSdkAppId();
            this.mAppInfo.LJJI = CronetAppProviderManager.inst().getSdkVersion();
            this.mAppInfo.LJ = CronetAppProviderManager.inst().getChannel();
            this.mAppInfo.LJIJI = CronetAppProviderManager.inst().getDeviceId();
            this.mAppInfo.LJJIIZI = CronetAppProviderManager.inst().getIsDropFirstTnc();
            this.mAppInfo.LJJIIZ = CronetAppProviderManager.inst().getAbi();
            this.mAppInfo.LIZIZ = CronetAppProviderManager.inst().getDevicePlatform();
            this.mAppInfo.LJIJJLI = CronetAppProviderManager.inst().getDeviceType();
            this.mAppInfo.LJJII = CronetAppProviderManager.inst().getDeviceBrand();
            this.mAppInfo.LJJIII = CronetAppProviderManager.inst().getDeviceModel();
            this.mAppInfo.LJIJJ = CronetAppProviderManager.inst().getNetAccessType();
            this.mAppInfo.LJIJ = CronetAppProviderManager.inst().getOSApi();
            this.mAppInfo.LJJIFFI = CronetAppProviderManager.inst().getOSVersion();
            this.mAppInfo.LJIIZILJ = CronetAppProviderManager.inst().getUserId();
            this.mAppInfo.LIZJ = CronetAppProviderManager.inst().getVersionCode();
            this.mAppInfo.LJJIIJ = CronetAppProviderManager.inst().getVersionName();
            this.mAppInfo.LIZLLL = CronetAppProviderManager.inst().getUpdateVersionCode();
            this.mAppInfo.LJJIIJZLJL = CronetAppProviderManager.inst().getManifestVersionCode();
            this.mAppInfo.LJJIJ = CronetAppProviderManager.inst().getStoreIdc();
            this.mAppInfo.LJIIL = toLowerCase(CronetAppProviderManager.inst().getRegion());
            this.mAppInfo.LJIILIIL = toLowerCase(CronetAppProviderManager.inst().getSysRegion());
            this.mAppInfo.LJIILJJIL = toLowerCase(CronetAppProviderManager.inst().getCarrierRegion());
            this.mAppInfo.LJIILL = CronetAppProviderManager.inst().getInitRegion();
            this.mAppInfo.LJJIJIL = CronetAppProviderManager.inst().getTNCRequestFlags();
            this.mAppInfo.LJIILLIIL = CronetAppProviderManager.inst().getHttpDnsRequestFlags();
            this.mAppInfo.LJJIJL = CardStruct.IStatusCode.DEFAULT;
            Map<String, String> getDomainDependHostMap = CronetAppProviderManager.inst().getGetDomainDependHostMap();
            if (getDomainDependHostMap != null && !getDomainDependHostMap.isEmpty()) {
                this.mAppInfo.LJI = getDomainDependHostMap.get("first");
                this.mAppInfo.LJII = getDomainDependHostMap.get("second");
                this.mAppInfo.LJIIIIZZ = getDomainDependHostMap.get("third");
                this.mAppInfo.LJIIIZ = getDomainDependHostMap.get("httpdns");
                this.mAppInfo.LJIIJ = getDomainDependHostMap.get("boe");
                this.mAppInfo.LJIIJJI = getDomainDependHostMap.get("boe_https");
            }
            Map<String, String> tNCRequestHeader = CronetAppProviderManager.inst().getTNCRequestHeader();
            String strLIZIZ = "";
            if (tNCRequestHeader != null && !tNCRequestHeader.isEmpty()) {
                for (Map.Entry<String, String> entry : tNCRequestHeader.entrySet()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(":");
                    sbLIZ.append(entry.getValue());
                    sbLIZ.append("\r\n");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            String cookieHeaderForTncRequest = "";
            if (getDomainDependHostMap != null && !getDomainDependHostMap.isEmpty()) {
                cookieHeaderForTncRequest = getCookieHeaderForTncRequest(getDomainDependHostMap.get("first"));
            }
            if (!TextUtils.isEmpty(cookieHeaderForTncRequest)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Cookie:");
                sbLIZ2.append(cookieHeaderForTncRequest);
                sbLIZ2.append("\r\n");
                sbLIZ2.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            this.mAppInfo.LJJIJIIJI = strLIZIZ;
            Map<String, String> tNCRequestQuery = CronetAppProviderManager.inst().getTNCRequestQuery();
            String strLIZIZ2 = "";
            if (tNCRequestQuery != null && !tNCRequestQuery.isEmpty()) {
                for (Map.Entry<String, String> entry2 : tNCRequestQuery.entrySet()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(entry2.getKey());
                    sbLIZ3.append(":");
                    sbLIZ3.append(entry2.getValue());
                    sbLIZ3.append("\r\n");
                    sbLIZ3.append(strLIZIZ2);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            this.mAppInfo.LJJIJIIJIL = strLIZIZ2;
            List<String> abSdkVersion = CronetAppProviderManager.inst().getAbSdkVersion();
            String strLIZIZ3 = "";
            if (abSdkVersion != null) {
                if (abSdkVersion.size() > 5 && CronetDependManager.inst().loggerDebug()) {
                    CronetDependManager.inst().loggerD("CronetAppInfoProvider", "ab sdk version count must less than 5");
                }
                int i = 0;
                for (String str : abSdkVersion) {
                    i++;
                    if (i > 5) {
                        break;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(strLIZIZ3);
                        sbLIZ4.append(str);
                        sbLIZ4.append(",");
                        strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                }
            }
            this.mAppInfo.LJFF = strLIZIZ3;
            if (CronetDependManager.inst().loggerDebug()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("AppInfo{, mUserId='");
                sbLIZ5.append(this.mAppInfo.getUserId());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mAppId='");
                sbLIZ5.append(this.mAppInfo.getAppId());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mOSApi='");
                sbLIZ5.append(this.mAppInfo.getOSApi());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mDeviceId='");
                sbLIZ5.append(this.mAppInfo.getDeviceId());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mNetAccessType='");
                sbLIZ5.append(this.mAppInfo.getNetAccessType());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mVersionCode='");
                sbLIZ5.append(this.mAppInfo.getVersionCode());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mDeviceType='");
                sbLIZ5.append(this.mAppInfo.getDeviceType());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mAppName='");
                sbLIZ5.append(this.mAppInfo.getAppName());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mSdkAppID='");
                sbLIZ5.append(this.mAppInfo.getSdkAppID());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mSdkVersion='");
                sbLIZ5.append(this.mAppInfo.getSdkVersion());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mChannel='");
                sbLIZ5.append(this.mAppInfo.getChannel());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mOSVersion='");
                sbLIZ5.append(this.mAppInfo.getOSVersion());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mAbi='");
                sbLIZ5.append(this.mAppInfo.getAbi());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mDevicePlatform='");
                sbLIZ5.append(this.mAppInfo.getDevicePlatform());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mDeviceBrand='");
                sbLIZ5.append(this.mAppInfo.getDeviceBrand());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mDeviceModel='");
                sbLIZ5.append(this.mAppInfo.getDeviceModel());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mVersionName='");
                sbLIZ5.append(this.mAppInfo.getVersionName());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mUpdateVersionCode='");
                sbLIZ5.append(this.mAppInfo.getUpdateVersionCode());
                sbLIZ5.append('\'');
                sbLIZ5.append(", mManifestVersionCode='");
                sbLIZ5.append(this.mAppInfo.getManifestVersionCode());
                sbLIZ5.append('\'');
                sbLIZ5.append('}');
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("get appinfo = ");
                sbLIZ6.append(strLIZIZ4);
                cronetDependManagerInst.loggerD("CronetAppInfoProvider", C2188811AlT.LIZIZ(sbLIZ6));
            }
        } catch (Throwable th) {
        }
        return this.mAppInfo;
    }

    public CronetAppInfoProvider(Context context) {
        this.mContext = C786410Ut5.N3(context);
    }

    private String getCookieHeaderForTncRequest(String str) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (!TextUtils.isEmpty(str) && cookieHandler != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(str);
                Map<String, List<String>> map = cookieHandler.get(C2089108Gj.LIZ(C2188811AlT.LIZIZ(sbLIZ)), null);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str2 : entry.getValue()) {
                                if (i > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i++;
                            }
                            return sb.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static CronetAppInfoProvider inst(Context context) {
        if (sInstance == null) {
            synchronized (CronetAppInfoProvider.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CronetAppInfoProvider(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static String toLowerCase(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.toLowerCase();
    }
}

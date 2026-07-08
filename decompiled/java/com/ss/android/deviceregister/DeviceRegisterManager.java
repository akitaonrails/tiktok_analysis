package com.ss.android.deviceregister;

import X.C0XB4;
import X.C0XCI;
import X.C0XCJ;
import X.C0XCW;
import X.C0XDN;
import X.C0XE7;
import X.C15WI;
import X.C2123908Tt;
import X.C2210471BfJ;
import X.C2211131BgN;
import X.C2211341Bgi;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C844470XAv;
import X.C844700XBs;
import X.InterfaceC2210571BfT;
import X.InterfaceC2210981Bg8;
import X.InterfaceC2211041BgE;
import X.InterfaceC2211211BgV;
import X.InterfaceC2211361Bgk;
import X.InterfaceC2211471Bgv;
import X.InterfaceC2211481Bgw;
import X.InterfaceC2211491Bgx;
import X.InterfaceC845020XCy;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class DeviceRegisterManager {
    public static InterfaceC2211471Bgv api = null;
    public static volatile boolean forceOpenNewUserMode = false;
    public static InterfaceC2211471Bgv mBdtrackerApi = null;
    public static volatile InterfaceC2211361Bgk sAppTraitCallback = null;
    public static Context sContext = null;
    public static volatile boolean sDeleteSharedStorage = true;
    public static boolean sIsBoe;
    public static volatile InterfaceC2211481Bgw sMacAddressApiCallback;
    public static volatile boolean sNeedSharedStorage;
    public static volatile boolean sOpenBpea;
    public static volatile C0XE7 sSensitiveApiCallback;

    public static InterfaceC2211361Bgk getAppTraitCallback() {
        return null;
    }

    public static String getDeviceId() {
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    public static String getInstallId() {
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
    }

    public static InterfaceC2211481Bgw getMacAddressApiCallback() {
        return null;
    }

    public static void getSSIDs(Map map) {
        com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(map);
    }

    public static boolean getSwitchToBdtracker() {
        return true;
    }

    public static void setAppTraitCallback(InterfaceC2211361Bgk interfaceC2211361Bgk) {
    }

    public static void setMacAddressApiCallback(InterfaceC2211481Bgw interfaceC2211481Bgw) {
    }

    public static void setSwitchToBdtracker(boolean z) {
    }

    public static void setUseGoogleAdId(boolean z) {
    }

    static {
        C2210471BfJ c2210471BfJ = new C2210471BfJ();
        mBdtrackerApi = c2210471BfJ;
        api = c2210471BfJ;
        sIsBoe = false;
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager__getDeviceId$___twin___() {
        api.getClass();
        String did2 = AppLog.getDid();
        return TextUtils.isEmpty(did2) ? "" : did2;
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager__getInstallId$___twin___() {
        api.getClass();
        return AppLog.getIid();
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId() {
        if (!C15WI.LIZJ) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                return C810670Vr7.LIZJ(contextLIZ, 0, "applog_stats").getString("device_id", "");
            }
        }
        return com_ss_android_deviceregister_DeviceRegisterManager__getDeviceId$___twin___();
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId() {
        if (!C2211341Bgi.LIZ) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                return C810670Vr7.LIZJ(contextLIZ, 0, "applog_stats").getString("install_id", "");
            }
        }
        return com_ss_android_deviceregister_DeviceRegisterManager__getInstallId$___twin___();
    }

    public static int getAppId() {
        C2210471BfJ c2210471BfJ = (C2210471BfJ) api;
        int i = c2210471BfJ.LIZIZ;
        return (i > 0 || c2210471BfJ.LIZ == null) ? i : c2210471BfJ.LIZ.getAid();
    }

    public static String getClientUDID() {
        api.getClass();
        return AppLog.getClientUdid();
    }

    public static String getClientUDIDWithBackup() {
        api.getClass();
        return AppLog.getClientUdid();
    }

    public static String getCustomVersion() {
        return ((C2210471BfJ) api).LIZLLL;
    }

    public static String getDeviceIdWithBackup() {
        api.getClass();
        return AppLog.getDid();
    }

    public static String getFakePackage() {
        return ((C2210471BfJ) api).LJ;
    }

    public static String getInstallIdWithBackup() {
        api.getClass();
        return AppLog.getIid();
    }

    public static String getOpenIdWithBackup() {
        api.getClass();
        return AppLog.getOpenUdid();
    }

    public static String getOpenUdId() {
        api.getClass();
        return AppLog.getOpenUdid();
    }

    public static Map<String, String> getRequestHeader() {
        api.getClass();
        return AppLog.getRequestHeader();
    }

    public static String getRequestId() {
        api.getClass();
        return C844700XBs.LIZ.LIZIZ(new Object[0]);
    }

    public static int getVersionCode() {
        C2210471BfJ c2210471BfJ = (C2210471BfJ) api;
        if (c2210471BfJ.LIZ != null) {
            return c2210471BfJ.LIZ.getVersionCode();
        }
        return 0;
    }

    public static String getVersionName() {
        C2210471BfJ c2210471BfJ = (C2210471BfJ) api;
        c2210471BfJ.getClass();
        String version = (String) AppLog.getHeaderValue("app_version", "", String.class);
        if (TextUtils.isEmpty(version) && c2210471BfJ.LIZ != null) {
            version = c2210471BfJ.LIZ.getVersion();
        }
        return (TextUtils.equals(version, c2210471BfJ.LIZLLL) || TextUtils.isEmpty(c2210471BfJ.LIZLLL)) ? version : c2210471BfJ.LIZLLL;
    }

    public static boolean isChildMode() {
        api.getClass();
        if (C0XCJ.LIZ() == null) {
            return false;
        }
        return C0XCJ.LIZ().LL;
    }

    public static boolean isLocalTest() {
        return ((C2210471BfJ) api).LJFF;
    }

    public static void tryWaitDeviceIdInit() {
        api.getClass();
        try {
            C0XCJ.LIZIZ();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static InterfaceC2211471Bgv getBdtrackerImpl() {
        return mBdtrackerApi;
    }

    public static C0XE7 getBpeaApiCallback() {
        return sSensitiveApiCallback;
    }

    public static boolean isDeleteSharedStorage() {
        return sDeleteSharedStorage;
    }

    public static boolean isForceOpenNewUserMode() {
        return forceOpenNewUserMode;
    }

    public static boolean isNeedSharedStorage() {
        return sNeedSharedStorage;
    }

    public static boolean isOpenBpe() {
        return sOpenBpea;
    }

    public static void addOnDeviceConfigUpdateListener(final InterfaceC2210981Bg8 interfaceC2210981Bg8) {
        api.getClass();
        if (interfaceC2210981Bg8 != null) {
            AppLog.addDataObserver(new InterfaceC2211041BgE() { // from class: X.1Bfo
                @Override // X.InterfaceC2211041BgE
                public final void LIZJ(JSONObject jSONObject, boolean z) {
                }

                @Override // X.InterfaceC2211041BgE
                public final void LIZIZ(String str, String str2, String str3) {
                    interfaceC2210981Bg8.LIZ(!TextUtils.isEmpty(str));
                }

                @Override // X.InterfaceC2211041BgE
                public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
                    interfaceC2210981Bg8.LIZIZ(str2, str4);
                    InterfaceC2210981Bg8 interfaceC2210981Bg82 = interfaceC2210981Bg8;
                    boolean z2 = !TextUtils.isEmpty(str2);
                    TextUtils.isEmpty(str);
                    interfaceC2210981Bg82.LIZJ(z2);
                }
            });
        }
    }

    public static boolean clearWhenSwitchChildMode(boolean z) {
        api.getClass();
        AppLog.clearWhenSwitchChildMode(z);
        return true;
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager__getSSIDs$___twin___(Map<String, String> map) {
        api.getClass();
        if (map != null) {
            AppLog.getSsidGroup(map);
            String userID = AppLog.getUserID();
            if (userID != null) {
                map.put("user_id", userID);
            }
        }
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(Map map) {
        if (!C15WI.LIZJ) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLIZ, 0, "applog_stats");
                String string = sharedPreferencesLIZJ.getString("device_id", "");
                if (!TextUtils.isEmpty(string)) {
                    map.put("device_id", string);
                }
                String string2 = sharedPreferencesLIZJ.getString("install_id", "");
                if (!TextUtils.isEmpty(string2)) {
                    map.put("install_id", string2);
                }
                String string3 = C810670Vr7.LIZJ(contextLIZ, 0, "snssdk_openudid").getString("openudid", null);
                if (!TextUtils.isEmpty(string3)) {
                    map.put("openudid", string3);
                }
            }
        }
        com_ss_android_deviceregister_DeviceRegisterManager__getSSIDs$___twin___(map);
    }

    public static String getCdid(Context context) {
        api.getClass();
        return C0XB4.LIZ(context);
    }

    public static String getChannel(Context context) {
        C2210471BfJ c2210471BfJ = (C2210471BfJ) api;
        String string = c2210471BfJ.LIZJ;
        if (TextUtils.isEmpty(string) && c2210471BfJ.LIZ != null) {
            string = c2210471BfJ.LIZ.LIZ();
        }
        if (TextUtils.isEmpty(string)) {
            try {
                string = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData.getString("UMENG_CHANNEL");
                c2210471BfJ.LIZJ = string;
                return string;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2211131BgN.LIZ.LJII("BdWrapperImpl getChannel", new Object[0]);
            }
        }
        return string;
    }

    public static boolean isNewUserMode(Context context) {
        api.getClass();
        return AppLog.isNewUserMode(context);
    }

    public static void setAnonymous(boolean z) {
        api.getClass();
        C2210471BfJ.LJI = z;
    }

    public static void setAntiCheatingSwitch(boolean z) {
        api.getClass();
    }

    public static void setAppContext(final InterfaceC2210571BfT interfaceC2210571BfT) {
        ((C2210471BfJ) api).LIZ = interfaceC2210571BfT;
        C0XCW c0xcw = new C0XCW() { // from class: X.1BfS
            @Override // X.C0XCW
            public final void LIZJ() {
            }

            @Override // X.C0XCW
            public final String LIZ() {
                return interfaceC2210571BfT.LIZ();
            }

            @Override // X.InterfaceC844950XCr
            public final String LIZIZ() {
                interfaceC2210571BfT.LIZIZ();
                return null;
            }

            @Override // X.InterfaceC844950XCr
            public final String getAbClient() {
                interfaceC2210571BfT.getAbClient();
                return null;
            }

            @Override // X.InterfaceC844950XCr
            public final String getAbFeature() {
                interfaceC2210571BfT.getAbFeature();
                return null;
            }

            @Override // X.InterfaceC844950XCr
            public final long getAbFlag() {
                interfaceC2210571BfT.getAbFlag();
                return 0L;
            }

            @Override // X.InterfaceC844950XCr
            public final String getAbVersion() {
                return interfaceC2210571BfT.getAbVersion();
            }

            @Override // X.C0XCW
            public final int getAid() {
                return interfaceC2210571BfT.getAid();
            }

            @Override // X.C0XCW
            public final String getAppName() {
                return interfaceC2210571BfT.getAppName();
            }

            @Override // X.C0XCW
            public final String getChannel() {
                return interfaceC2210571BfT.getChannel();
            }

            @Override // X.C0XCW
            public final Context getContext() {
                return interfaceC2210571BfT.getContext();
            }

            @Override // X.C0XCW
            public final long getManifestVersionCode() {
                return interfaceC2210571BfT.getManifestVersionCode();
            }

            @Override // X.C0XCW
            public final long getUpdateVersionCode() {
                return interfaceC2210571BfT.getUpdateVersionCode();
            }

            @Override // X.C0XCW
            public final String getVersion() {
                return interfaceC2210571BfT.getVersion();
            }

            @Override // X.C0XCW
            public final long getVersionCode() {
                return interfaceC2210571BfT.getVersionCode();
            }
        };
        C0XCI c0xci = C0XCJ.LIZIZ;
        c0xci.LIZIZ = c0xcw;
        C0XDN.LIZ = interfaceC2210571BfT;
        ((C2210471BfJ) getBdtrackerImpl()).LIZ = interfaceC2210571BfT;
        c0xci.LIZIZ = new C0XCW() { // from class: X.1BfS
            @Override // X.C0XCW
            public final void LIZJ() {
            }

            @Override // X.C0XCW
            public final String LIZ() {
                return interfaceC2210571BfT.LIZ();
            }

            @Override // X.InterfaceC844950XCr
            public final String LIZIZ() {
                interfaceC2210571BfT.LIZIZ();
                return null;
            }

            @Override // X.InterfaceC844950XCr
            public final String getAbClient() {
                interfaceC2210571BfT.getAbClient();
                return null;
            }

            @Override // X.InterfaceC844950XCr
            public final String getAbFeature() {
                interfaceC2210571BfT.getAbFeature();
                return null;
            }

            @Override // X.InterfaceC844950XCr
            public final long getAbFlag() {
                interfaceC2210571BfT.getAbFlag();
                return 0L;
            }

            @Override // X.InterfaceC844950XCr
            public final String getAbVersion() {
                return interfaceC2210571BfT.getAbVersion();
            }

            @Override // X.C0XCW
            public final int getAid() {
                return interfaceC2210571BfT.getAid();
            }

            @Override // X.C0XCW
            public final String getAppName() {
                return interfaceC2210571BfT.getAppName();
            }

            @Override // X.C0XCW
            public final String getChannel() {
                return interfaceC2210571BfT.getChannel();
            }

            @Override // X.C0XCW
            public final Context getContext() {
                return interfaceC2210571BfT.getContext();
            }

            @Override // X.C0XCW
            public final long getManifestVersionCode() {
                return interfaceC2210571BfT.getManifestVersionCode();
            }

            @Override // X.C0XCW
            public final long getUpdateVersionCode() {
                return interfaceC2210571BfT.getUpdateVersionCode();
            }

            @Override // X.C0XCW
            public final String getVersion() {
                return interfaceC2210571BfT.getVersion();
            }

            @Override // X.C0XCW
            public final long getVersionCode() {
                return interfaceC2210571BfT.getVersionCode();
            }
        };
    }

    public static void setAppId(int i) {
        ((C2210471BfJ) api).LIZIZ = i;
    }

    public static void setAppLanguage(String str) {
        api.getClass();
        AppLog.setAppLanguageAndRegion(str, (String) AppLog.getHeaderValue("app_region", "", String.class));
    }

    public static void setAppRegion(String str) {
        api.getClass();
        AppLog.setAppLanguageAndRegion((String) AppLog.getHeaderValue("app_region", "", String.class), str);
    }

    public static void setChannel(String str) {
        ((C2210471BfJ) api).LIZJ = str;
    }

    public static void setContext(Context context) {
        sContext = C786410Ut5.N3(context);
    }

    public static void setCustomVersion(String str) {
        ((C2210471BfJ) api).LIZLLL = str;
    }

    public static void setFakePackage(String str) {
        ((C2210471BfJ) api).LJ = str;
    }

    public static void setForbidReportPhoneDetailInfo(boolean z) {
        api.getClass();
    }

    public static void setForceOpenNewUserMode(boolean z) {
        forceOpenNewUserMode = z;
    }

    public static void setIsBoe(boolean z) {
        sIsBoe = z;
        C2210471BfJ.LJIIIZ = z;
    }

    public static void setLocalTest(boolean z) {
        ((C2210471BfJ) api).LJFF = z;
    }

    public static void setOpenBpea(boolean z) {
        sOpenBpea = z;
    }

    public static void setPreInstallChannelCallback(InterfaceC2211491Bgx interfaceC2211491Bgx) {
        api.getClass();
    }

    public static void setReleaseBuild(String str) {
        api.getClass();
        C2210471BfJ.LJIIJ = str;
    }

    public static void setSensitiveApiCallback(C0XE7 c0xe7) {
        sSensitiveApiCallback = c0xe7;
    }

    public static void addCustomHeader(String str, Object obj) {
        api.getClass();
        HashMap map = new HashMap();
        map.put(str, obj);
        AppLog.setHeaderInfo(map);
    }

    public static void setAccount(Context context, Account account) {
        api.getClass();
        if (AppLog.hasStarted()) {
            AppLog.setAccount(account);
        } else {
            C2211131BgN.LIZ.LJII("BdWrapperImpl setAccount should be called after init!", new Object[0]);
        }
    }

    public static void setDeviceRegisterURL(String[] strArr, String[] strArr2) {
        api.getClass();
        C2210471BfJ.LJII = strArr;
        C2210471BfJ.LJIIIIZZ = strArr2[0];
    }

    public static void setNewUserMode(Context context, boolean z) {
        api.getClass();
        AppLog.setNewUserMode(context, z);
    }

    public static void setSharedStorageConfig(boolean z, boolean z2) {
        sNeedSharedStorage = z;
        sDeleteSharedStorage = z2;
    }

    public static void updateUserAgentString(Context context, String str) {
        api.getClass();
        AppLog.setUserAgent(str);
    }

    public static boolean getHeader(Context context, JSONObject jSONObject, boolean z) {
        api.getClass();
        JSONObject header = AppLog.getHeader();
        if (header != null) {
            C2123908Tt.LIZJ(jSONObject, header);
            return true;
        }
        return false;
    }

    public static void resetDidWhenSwitchChildMode(boolean z, long j, final InterfaceC2211211BgV interfaceC2211211BgV) {
        api.getClass();
        AppLog.resetDidWhenSwitchChildMode(AppLog.getContext(), z, j, new InterfaceC845020XCy() { // from class: X.1Bfz
            @Override // X.InterfaceC845020XCy
            public final void LIZ() {
                InterfaceC2211211BgV interfaceC2211211BgV2 = interfaceC2211211BgV;
                if (interfaceC2211211BgV2 != null) {
                    interfaceC2211211BgV2.LIZ();
                }
            }

            @Override // X.InterfaceC845020XCy
            public final void LIZIZ(C0XBN c0xbn) {
                InterfaceC2211211BgV interfaceC2211211BgV2 = interfaceC2211211BgV;
                if (interfaceC2211211BgV2 != null) {
                    interfaceC2211211BgV2.LIZIZ(c0xbn.LL, c0xbn.LLILLJJLI);
                }
            }
        });
    }
}

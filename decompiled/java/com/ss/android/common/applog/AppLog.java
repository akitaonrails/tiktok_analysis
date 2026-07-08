package com.ss.android.common.applog;

import X.AnonymousClass1455;
import X.C04WQ;
import X.C098000Yo;
import X.C0CGS;
import X.C0X14;
import X.C0XCJ;
import X.C0XCW;
import X.C0XDN;
import X.C0XDP;
import X.C0XE7;
import X.C137900fp;
import X.C13LP;
import X.C1513180pTo;
import X.C1523690pkl;
import X.C1552630qVR;
import X.C1584320rKY;
import X.C1590220rU4;
import X.C1590320rUE;
import X.C15WI;
import X.C1720406oU;
import X.C19EG;
import X.C1AF1;
import X.C1DS1;
import X.C1EE2;
import X.C2093608Ic;
import X.C21314918bD;
import X.C2210311Bf3;
import X.C2210791Bfp;
import X.C2210851Bfv;
import X.C2210871Bfx;
import X.C2211131BgN;
import X.C2214381Blc;
import X.C2421209eE;
import X.C300620BqO;
import X.C584360Mvy;
import X.C786410Ut5;
import X.C799570VYd;
import X.C804280Vgo;
import X.C810670Vr7;
import X.C820710WHl;
import X.C829800Wgs;
import X.C841860X0u;
import X.C841880X0w;
import X.C844470XAv;
import X.EnumC1584350rKb;
import X.EnumC2210521BfO;
import X.EnumC805430Vif;
import X.EnumC841890X0x;
import X.EnumC919040a1W;
import X.InterfaceC1893690zNX;
import X.InterfaceC21315218bG;
import X.InterfaceC2206951BZd;
import X.InterfaceC2210571BfT;
import X.InterfaceC2210801Bfq;
import X.InterfaceC2210921Bg2;
import X.InterfaceC2211041BgE;
import X.InterfaceC2211051BgF;
import X.InterfaceC2211071BgH;
import X.InterfaceC2211121BgM;
import X.InterfaceC2211211BgV;
import X.InterfaceC2211331Bgh;
import X.InterfaceC2211411Bgp;
import X.InterfaceC2211461Bgu;
import X.InterfaceC845020XCy;
import Y.ARunnableS124S0100000_24;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.settings.model.MatchRule;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.sec.sensor.IEcomSecEventHandleService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomLogEventHandleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.lemon.postmode.service.IPostModeService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.pitaya.IPitayaBundle;
import com.tiktok.geckox.ng.model.Event;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AppLog {
    public static volatile boolean sEnableListenNetChange;
    public static volatile InterfaceC2211331Bgh sGlobalEventCallback;
    public static volatile C1AF1 sIHeaderCustomTimelyCallback;
    public static volatile String tempAbSDKVersion;
    public static volatile AtomicInteger sEventSamplingValue = new AtomicInteger(0);
    public static volatile boolean sIsTouristMode = false;
    public static volatile boolean sEnableEventInTouristMode = true;
    public static volatile long sLogExpireTime = 432000000;
    public static volatile int sLogRetryMaxCount = 10;
    public static volatile boolean sAbortPackMiscIfException = false;
    public static volatile boolean sExtendCursorWindowIfOverflow = false;
    public static InterfaceC2211461Bgu sAppLogApi = new C2210311Bf3();
    public static AtomicLong sUserId = new AtomicLong();
    public static final SimpleDateFormat sDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public static final Object sLogConfigLock = new Object();
    public static final ThreadLocal<Boolean> sIsConfigThread = new ThreadLocal<>();

    public static InterfaceC2211411Bgp getBDInstallInitHook() {
        return null;
    }

    public static boolean getSwitchToBdtracker() {
        return true;
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void setGoogleAId(String str) {
    }

    public static void setSwitchToBdtracker(boolean z) {
    }

    public static void addAppCount() {
        sAppLogApi.getClass();
    }

    public static String com_ss_android_common_applog_AppLog__getInstallId$___twin___() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.getIid();
    }

    public static String com_ss_android_common_applog_AppLog__getServerDeviceId$___twin___() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.getDid();
    }

    public static String com_ss_android_common_applog_AppLog__getUserId$___twin___() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.getUserID();
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() {
        if (!C15WI.LIZJ) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                return C810670Vr7.LIZJ(contextLIZ, 0, "applog_stats").getString("install_id", "");
            }
        }
        return com_ss_android_common_applog_AppLog__getInstallId$___twin___();
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() {
        if (!C15WI.LIZJ) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                return C810670Vr7.LIZJ(contextLIZ, 0, "applog_stats").getString("device_id", "");
            }
        }
        return com_ss_android_common_applog_AppLog__getServerDeviceId$___twin___();
    }

    public static void flush() {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.flush();
    }

    public static String getAbSDKVersion() {
        sAppLogApi.getClass();
        String abSdkVersion = com.bytedance.applog.AppLog.getAbSdkVersion();
        return TextUtils.isEmpty(abSdkVersion) ? C2210311Bf3.LJFF : abSdkVersion;
    }

    public static String getClientId() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.getClientUdid();
    }

    public static String getCurrentSessionId() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.getSessionId();
    }

    public static JSONObject getHeaderCopy() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.getHeader();
    }

    public static long getLastActiveTime() {
        sAppLogApi.getClass();
        return 0L;
    }

    public static String getSessionKey() {
        sAppLogApi.getClass();
        return C2210311Bf3.LJII;
    }

    public static String getUserUniqueId() {
        sAppLogApi.getClass();
        return null;
    }

    public static boolean isEventMapEnabled() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.isEventMapEnabled();
    }

    public static boolean isNewUser() {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.isNewUser();
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId() {
        InitModules.LIZ();
        return com_ss_android_common_applog_AppLog__getUserId$___twin___();
    }

    public static boolean isEnableListenNetChange() {
        return sEnableListenNetChange;
    }

    public static void activeUser(Context context) {
        boolean zLJI = MethodIDManager.LJI(202306);
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.manualActivate();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void addSessionHook(final InterfaceC2211071BgH interfaceC2211071BgH) {
        if (interfaceC2211071BgH == null) {
            return;
        }
        sAppLogApi.getClass();
        InterfaceC2211051BgF interfaceC2211051BgF = new InterfaceC2211051BgF() { // from class: X.1BgG
            @Override // X.InterfaceC2211051BgF
            public final void LIZIZ(long j, String str) {
                interfaceC2211071BgH.LIZIZ(j);
            }

            @Override // X.InterfaceC2211051BgF
            public final void LIZ(String str, long j, JSONObject jSONObject) {
                interfaceC2211071BgH.LIZ(str, j, jSONObject);
            }

            @Override // X.InterfaceC2211051BgF
            public final void LIZJ(String str, long j, JSONObject jSONObject) {
                interfaceC2211071BgH.LIZJ(str, j, jSONObject);
            }
        };
        C2210311Bf3.LJIILLIIL.put(interfaceC2211071BgH, interfaceC2211051BgF);
        com.bytedance.applog.AppLog.addSessionHook(interfaceC2211051BgF);
    }

    public static void appendParamsToEvent(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.has("ab_sdk_version")) {
            String abSDKVersion = getAbSDKVersion();
            if (!TextUtils.isEmpty(abSDKVersion)) {
                try {
                    jSONObject.put("ab_sdk_version", abSDKVersion);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static void clearWhenSwitchChildMode(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.clearWhenSwitchChildMode(z);
    }

    public static void com_ss_android_common_applog_AppLog__getSSIDs$___twin___(Map<String, String> map) {
        sAppLogApi.getClass();
        if (map != null) {
            com.bytedance.applog.AppLog.getSsidGroup(map);
            String userID = com.bytedance.applog.AppLog.getUserID();
            if (userID != null) {
                map.put("user_id", userID);
            }
        }
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(Map map) {
        InitModules.LIZ();
        com_ss_android_common_applog_AppLog__getSSIDs$___twin___(map);
    }

    public static String formatDate(long j) {
        return sDateTimeFormat.format(new Date(j));
    }

    public static boolean isHitStickySamplingDrop(String str) {
        sAppLogApi.getClass();
        return com.bytedance.applog.AppLog.isEventHitStickySamplingDrop(str);
    }

    public static void onActivityCreate(Context context) {
        sAppLogApi.getClass();
    }

    public static void onPause(Context context) {
        boolean zLJI = MethodIDManager.LJI(71732);
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.onPause(context);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void onResume(Context context) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.onResume(context);
    }

    public static void registerGlobalEventCallback(InterfaceC2211331Bgh interfaceC2211331Bgh) {
        boolean z;
        sAppLogApi.getClass();
        if (interfaceC2211331Bgh != null) {
            if (C2210311Bf3.LJIILJJIL != null) {
                z = true;
            } else {
                z = false;
            }
            C2210311Bf3.LJIILJJIL = interfaceC2211331Bgh;
            if (!z) {
                com.bytedance.applog.AppLog.addEventObserver(new C2210871Bfx());
            }
        }
    }

    public static void registerHeaderCustomCallback(C1AF1 c1af1) {
        sAppLogApi.getClass();
        C2210311Bf3.LJI = c1af1;
        com.bytedance.applog.AppLog.registerHeaderCustomCallback(new C2210791Bfp());
    }

    public static void setAbSDKVersion(String str) {
        tempAbSDKVersion = str;
        sAppLogApi.getClass();
        C2210311Bf3.LJFF = str;
        com.bytedance.applog.AppLog.setExternalAbVersion(str);
    }

    public static void setAdjustTerminate(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setAdjustTerminate(z);
    }

    public static void setAppContext(final InterfaceC2210571BfT interfaceC2210571BfT) {
        sAppLogApi.getClass();
        C2210311Bf3.LIZLLL = interfaceC2210571BfT;
        C0XCJ.LIZIZ.LIZIZ = new C0XCW() { // from class: X.1BfR
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
        DeviceRegisterManager.setAppContext(interfaceC2210571BfT);
    }

    public static void setAppTrack(JSONObject jSONObject) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setAppTrack(jSONObject);
    }

    public static void setChildModeBeforeInit(boolean z) {
        sAppLogApi.getClass();
        C2210311Bf3.LJIIJ = z;
    }

    public static void setConfigUpdateListener(final InterfaceC2211121BgM interfaceC2211121BgM) {
        sAppLogApi.getClass();
        if (interfaceC2211121BgM == null) {
            C2210311Bf3.LJIIIZ = null;
        } else {
            C2210311Bf3.LJIIIZ = new WeakReference<>(interfaceC2211121BgM);
            com.bytedance.applog.AppLog.addDataObserver(new InterfaceC2211041BgE() { // from class: X.1Bg3
                @Override // X.InterfaceC2211041BgE
                public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
                }

                @Override // X.InterfaceC2211041BgE
                public final void LIZJ(JSONObject jSONObject, boolean z) {
                    interfaceC2211121BgM.LIZ();
                    interfaceC2211121BgM.LIZIZ();
                }

                @Override // X.InterfaceC2211041BgE
                public final void LIZIZ(String str, String str2, String str3) {
                    interfaceC2211121BgM.LIZ();
                }
            });
        }
    }

    public static void setCustomHeaderControlEnabled(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setCustomHeaderControlEnabled(z);
    }

    public static void setCustomerHeader(Bundle bundle) {
        Object obj;
        sAppLogApi.getClass();
        if (bundle != null && bundle.size() > 0) {
            try {
                if (com.bytedance.applog.AppLog.hasStarted()) {
                    HashMap map = new HashMap();
                    for (String str : bundle.keySet()) {
                        try {
                            try {
                                obj = bundle.get(str);
                            } catch (Exception e) {
                                obj = null;
                                map.put(str, obj);
                            }
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                            map.put(str, obj);
                        }
                        map.put(str, obj);
                    }
                    com.bytedance.applog.AppLog.setHeaderInfo(map);
                    return;
                }
                Bundle bundle2 = C2210311Bf3.LJIILL;
                synchronized (bundle2) {
                    try {
                        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
                    } finally {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2211131BgN.LIZ.LJIILL("NewAppLogBdtrackerImpl setCustomerHeader", th, new Object[0]);
            }
            TryCatchGuardChecker.doCheck(th);
            C2211131BgN.LIZ.LJIILL("NewAppLogBdtrackerImpl setCustomerHeader", th, new Object[0]);
        }
    }

    public static void setEnableNetCommOpt(boolean z) {
        sAppLogApi.getClass();
        C2210311Bf3.LJIIJJI = z;
    }

    public static void setEventParamControlEnabled(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setEventParamControlEnabled(z);
    }

    public static void setEventSamplingEnable(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setEventSamplingEnable(z);
    }

    public static void setLogEncryptConfig(InterfaceC2206951BZd interfaceC2206951BZd) {
        sAppLogApi.getClass();
        if (!C2210311Bf3.LIZIZ) {
            C2210311Bf3.LJ = interfaceC2206951BZd;
        }
    }

    public static void setLogger(InterfaceC2210921Bg2 interfaceC2210921Bg2) {
        ((C2210311Bf3) sAppLogApi).LIZ = interfaceC2210921Bg2;
    }

    public static void setNewMonitorEnabled(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setNewMonitorEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0XE6] */
    public static void setSensitiveApiCallback(final C0XE7 c0xe7) {
        sAppLogApi.getClass();
        if (c0xe7 == null) {
            C2210311Bf3.LJIIL = null;
        } else {
            C2210311Bf3.LJIIL = new C820710WHl(c0xe7) { // from class: X.0XE6
                public final C0XE7 LIZIZ;

                @Override // X.C820710WHl
                public final String LIZ() {
                    return this.LIZIZ.getCountry();
                }

                @Override // X.C820710WHl
                public final Pair<String, Boolean> LIZIZ() {
                    return this.LIZIZ.LIZJ();
                }

                @Override // X.C820710WHl
                public final String LIZJ() {
                    return this.LIZIZ.getNetworkOperator();
                }

                @Override // X.C820710WHl
                public final String LIZLLL() {
                    return this.LIZIZ.LIZIZ();
                }

                @Override // X.C820710WHl
                public final String LJ() {
                    return this.LIZIZ.LIZ();
                }

                {
                    this.LIZIZ = c0xe7;
                }
            };
        }
    }

    public static void setSessionKey(String str) {
        sAppLogApi.getClass();
        C2210311Bf3.LJII = str;
    }

    public static void setStartLogReaperDelay(long j) {
        sAppLogApi.getClass();
        C2210311Bf3.LJIILIIL = j;
    }

    public static void setTeaEventSamplingEnable(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setTeaEventSamplingEnable(z);
    }

    public static void setTerminateImmediately(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setTerminateImmediately(z);
    }

    public static void setUseGoogleAdId(boolean z) {
        sAppLogApi.getClass();
    }

    public static void setUserId(long j) {
        InterfaceC2211121BgM interfaceC2211121BgM;
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setUserID(j);
        WeakReference<InterfaceC2211121BgM> weakReference = C2210311Bf3.LJIIIZ;
        if (weakReference != null && (interfaceC2211121BgM = weakReference.get()) != null) {
            try {
                interfaceC2211121BgM.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void setUserIdIsolateCallback(InterfaceC2210801Bfq interfaceC2210801Bfq) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setDataIsolateCallback(new C2210851Bfv(interfaceC2210801Bfq));
    }

    public static void setUserIdIsolateEnabled(boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setDataIsolateEnabled(z);
        com.bytedance.applog.AppLog.setDataIsolateKey(EnumC2210521BfO.USER_ID);
    }

    public static String addCommonParams(String str, boolean z) {
        C0XDP c0xdp = C0XDP.L0;
        InterfaceC2210571BfT interfaceC2210571BfT = C0XDN.LIZ;
        if (!C2093608Ic.LJ(str) && interfaceC2210571BfT != null) {
            StringBuilder sb = new StringBuilder(str);
            C0XDN.LIZIZ(sb, z, c0xdp);
            return sb.toString();
        }
        return str;
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        C0XDN.LIZIZ(sb, z, C0XDP.L0);
    }

    public static void onEvent(Context context, String str) {
        C786410Ut5.LIZ(context, "event_v1", str, null, 0L, 0L, false, null);
    }

    public static void setEventFilterByClient(List<String> list, boolean z) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.setEventFilterByClient(list, z);
    }

    public static void setEventFilterEnable(Context context, int i) {
        sAppLogApi.getClass();
        C2210311Bf3.LJIIIIZZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void init(android.content.Context r15, boolean r16, X.C1486650on1 r17) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.init(android.content.Context, boolean, X.0on1):void");
    }

    public static void onEvent(Context context, String str, String str2) {
        C786410Ut5.LIZ(context, "event_v1", str, str2, 0L, 0L, false, null);
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.onMiscEvent(str, jSONObject);
    }

    public static void resetDidWhenSwitchChildMode(Context context, boolean z, long j, final InterfaceC2211211BgV interfaceC2211211BgV) {
        sAppLogApi.getClass();
        com.bytedance.applog.AppLog.resetDidWhenSwitchChildMode(context, z, j, new InterfaceC845020XCy() { // from class: X.1Bfy
            @Override // X.InterfaceC845020XCy
            public final void LIZ() {
                interfaceC2211211BgV.LIZ();
            }

            @Override // X.InterfaceC845020XCy
            public final void LIZIZ(C0XBN c0xbn) {
                if (c0xbn != null) {
                    interfaceC2211211BgV.LIZIZ(c0xbn.LL, c0xbn.LLILLJJLI);
                } else {
                    interfaceC2211211BgV.LIZIZ(null, null);
                }
            }
        });
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C786410Ut5.LIZ(context, str, str2, str3, j, j2, false, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog__onEvent$___twin___(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("__applog_need_avoid")) {
            if (jSONObject.optInt("__applog_need_avoid") == 1) {
                return;
            } else {
                jSONObject.remove("__applog_need_avoid");
            }
        }
        appendParamsToEvent(jSONObject);
        ((C2210311Bf3) sAppLogApi).LIZIZ(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if ("event_v1".equalsIgnoreCase(str) && str2 != null && ((HashSet) C15WI.LIZ).contains(str2)) {
            return;
        }
        if ("event_v3".equalsIgnoreCase(str) && jSONObject != null && jSONObject.has("_staging_flag")) {
            jSONObject.remove("_staging_flag");
        }
        if (C1720406oU.LIZIZ.LIZIZ(str2, jSONObject)) {
            return;
        }
        C04WQ.LIZ.LIZ(str2, jSONObject);
        if (PluggableExtentionKt.pluggableSpi(IPostModeService.class) != null) {
            C1EE2.LIZIZ.LJJIL().LIZ(str2, jSONObject);
        }
        if (C1513180pTo.LIZ && str2 != null && jSONObject != null) {
            MLDataCenterService.instance().onAppLogEvent(str2, jSONObject, str);
        }
        ITTMEventStream iTTMEventStream = C829800Wgs.LIZ;
        if (iTTMEventStream != null) {
            iTTMEventStream.emitEventToCaiEventStream(str2, jSONObject);
        }
        new Object() { // from class: X.1Bgj
        }.getClass();
        if (C300620BqO.LIZ() && jSONObject != null) {
            try {
                String str4 = "unknown_page";
                if (u.LJIJI("enter_homepage_tab", str2, true)) {
                    if (!u.LJIJI("page_setting", JSONObjectProtectorUtils.getString(jSONObject, "tab_name"), true)) {
                        String string = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
                        if (string != null && string.length() != 0) {
                            str4 = string;
                        }
                        Activity activityLIZ = C2421209eE.LIZ();
                        if (activityLIZ != null && (activityLIZ instanceof C19EG)) {
                            C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), JSONObjectProtectorUtils.getString(jSONObject, "tab_name"), JSONObjectProtectorUtils.getString(jSONObject, "location"), JSONObjectProtectorUtils.getString(jSONObject, "enter_method")), str4);
                        }
                    }
                } else if (u.LJIJI("enter_search_blankpage", str2, true)) {
                    if (u.LJIJI("click_feed_magnifier", JSONObjectProtectorUtils.getString(jSONObject, "enter_type"), true)) {
                        String string2 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
                        if (string2 != null && string2.length() != 0) {
                            str4 = string2;
                        }
                        Activity activityLIZ2 = C2421209eE.LIZ();
                        if (activityLIZ2 != null && (activityLIZ2 instanceof C19EG)) {
                            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                            String tag = EnumC1584350rKb.SEARCH.getTag();
                            c1584320rKY.getClass();
                            C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "search", (String) C1584320rKY.LIZIZ((C19EG) activityLIZ2, tag).getFirst(), "click_top_icon"), str4);
                        }
                    }
                } else if (u.LJIJI("enter_video_shoot_page", str2, true)) {
                    if (u.LJIJI("direct_shoot", JSONObjectProtectorUtils.getString(jSONObject, "shoot_way"), true) && u.LJIJI("click_plus", JSONObjectProtectorUtils.getString(jSONObject, "enter_method"), true)) {
                        String string3 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
                        if (string3 != null && string3.length() != 0) {
                            str4 = string3;
                        }
                        C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "shoot", "bottom_3tab", "click_bottom_icon"), str4);
                    }
                } else if (u.LJIJI("livesdk_enter_live_merge", str2, true)) {
                    if (u.LJIJI("", JSONObjectProtectorUtils.getString(jSONObject, "enter_method"), true) || u.LJIJI("toplive_icon", JSONObjectProtectorUtils.getString(jSONObject, "enter_method"), true)) {
                        String string4 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from_merge");
                        if (string4 != null && string4.length() != 0) {
                            str4 = string4;
                        }
                        Activity activityLIZ3 = C2421209eE.LIZ();
                        if (activityLIZ3 != null && (activityLIZ3 instanceof C19EG)) {
                            C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                            String tag2 = EnumC1584350rKb.LIVE.getTag();
                            c1584320rKY2.getClass();
                            C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "live", (String) C1584320rKY.LIZIZ((C19EG) activityLIZ3, tag2).getFirst(), "click_top_icon"), str4);
                        }
                    }
                } else if (u.LJIJI("story_fixed_icon_enter", str2, true)) {
                    if (u.LJIJI("camera", JSONObjectProtectorUtils.getString(jSONObject, "enter_content"), true) && u.LJIJI("click", JSONObjectProtectorUtils.getString(jSONObject, "enter_method"), true)) {
                        String string5 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
                        if (string5 != null && string5.length() != 0) {
                            str4 = string5;
                        }
                        Activity activityLIZ4 = C2421209eE.LIZ();
                        if (activityLIZ4 != null && (activityLIZ4 instanceof C19EG)) {
                            C1584320rKY c1584320rKY3 = C1584320rKY.LIZ;
                            String tag3 = EnumC1584350rKb.STORY_CAMERA.getTag();
                            c1584320rKY3.getClass();
                            C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "story_camera", (String) C1584320rKY.LIZIZ((C19EG) activityLIZ4, tag3).getFirst(), "click_top_icon"), str4);
                        }
                    }
                } else if (u.LJIJI("touch_point_jump", str2, true)) {
                    if (!u.LJIJI("1", JSONObjectProtectorUtils.getString(jSONObject, "touch_point_id"), true) && !u.LJIJI("51", JSONObjectProtectorUtils.getString(jSONObject, "touch_point_id"), true) && !u.LJIJI("76", JSONObjectProtectorUtils.getString(jSONObject, "touch_point_id"), true)) {
                        if (u.LJIJI("29", JSONObjectProtectorUtils.getString(jSONObject, "touch_point_id"), true)) {
                            C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "coin", "bottom_2tab", "click_bottom_icon"), "unknown_page");
                        }
                    } else {
                        C1590220rU4.LIZ.getClass();
                        if (C300620BqO.LIZ()) {
                            C1590320rUE c1590320rUE = C1590220rU4.LIZIZ;
                            if (c1590320rUE != null) {
                                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS124S0100000_24(c1590320rUE, 6));
                            }
                            C1590220rU4.LIZIZ = null;
                        }
                    }
                } else if (u.LJIJI("enter_sidebar", str2, true)) {
                    String string6 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
                    if (string6 != null && string6.length() != 0) {
                        str4 = string6;
                    }
                    Activity activityLIZ5 = C2421209eE.LIZ();
                    if (activityLIZ5 != null && (activityLIZ5 instanceof C19EG)) {
                        C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "sidebar", "sidebar_right", JSONObjectProtectorUtils.getString(jSONObject, "enter_method")), str4);
                    }
                } else if (u.LJIJI("tikbot_enter_chat", str2, true) && u.LJIJI("1", JSONObjectProtectorUtils.getString(jSONObject, "is_feed"), true)) {
                    String string7 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
                    if (string7 != null && string7.length() != 0) {
                        str4 = string7;
                    }
                    Activity activityLIZ6 = C2421209eE.LIZ();
                    if (activityLIZ6 != null && (activityLIZ6 instanceof C19EG)) {
                        C1584320rKY c1584320rKY4 = C1584320rKY.LIZ;
                        String tag4 = EnumC1584350rKb.TAKO.getTag();
                        c1584320rKY4.getClass();
                        C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), "tako", (String) C1584320rKY.LIZIZ((C19EG) activityLIZ6, tag4).getFirst(), "click_top_icon"), str4);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        AnonymousClass1455.LIZ.getClass();
        IPitayaBundle iPitayaBundleLIZ = AnonymousClass1455.LIZ();
        if (iPitayaBundleLIZ != null) {
            iPitayaBundleLIZ.onCepEvent(str2, jSONObject);
        }
        IPitayaBundle iPitayaBundleLIZ2 = AnonymousClass1455.LIZ();
        if (iPitayaBundleLIZ2 != null) {
            iPitayaBundleLIZ2.onAppLogEvent(str2, jSONObject);
        }
        if (PluggableExtentionKt.pluggableSpi(IEcomLogEventHandleService.class) != null) {
            C1523690pkl.LIZIZ.LIZ(str2, jSONObject);
        }
        if (PluggableExtentionKt.pluggableSpi(IEcomSecEventHandleService.class) != null) {
            C0CGS.LIZIZ.LIZ(str2, jSONObject);
        }
        if (((Boolean) C137900fp.LIZ.getValue()).booleanValue()) {
            C1552630qVR c1552630qVR = C1552630qVR.LIZ;
            c1552630qVR.getClass();
            if (C1552630qVR.LIZLLL() && str2 != null && str2.length() != 0) {
                c1552630qVR.onEventTrigger(new Event(str2, null, new C098000Yo(jSONObject), MatchRule.MATCH_ALL, null, EnumC919040a1W.NORMAL));
            }
        }
        C804280Vgo.LIZ.getClass();
        if (C1DS1.LIZJ && C804280Vgo.LJIILIIL) {
            if (C13LP.LJJJJ(str2, (Iterable) C1DS1.LJJIII.getValue())) {
                C804280Vgo.LIZ(EnumC805430Vif.IC);
            }
            if (C13LP.LJJJJ(str2, (Iterable) C1DS1.LJJIIJ.getValue())) {
                C804280Vgo.LIZ(EnumC805430Vif.VOD);
                C804280Vgo.LIZ(EnumC805430Vif.FEED_FORYOU);
                if (C584360Mvy.LIZIZ()) {
                    C804280Vgo.LIZ(EnumC805430Vif.FEED_FORYOU_5VV);
                }
            }
            if (C13LP.LJJJJ(str2, (Iterable) C1DS1.LJJIIJZLJL.getValue())) {
                C804280Vgo.LIZ(EnumC805430Vif.SEARCH);
            }
            if (C13LP.LJJJJ(str2, (Iterable) C1DS1.LJJIIZ.getValue())) {
                C804280Vgo.LIZ(EnumC805430Vif.INBOX);
            }
            if (C13LP.LJJJJ(str2, (Iterable) C1DS1.LJJIIZI.getValue())) {
                C804280Vgo.LIZ(EnumC805430Vif.FRIENDS);
            }
            if (C2214381Blc.LIZ() && C13LP.LJJJJ(str2, (Iterable) C2214381Blc.LJFF.getValue())) {
                C804280Vgo.LIZ(EnumC805430Vif.LIVE);
            }
        }
        ((ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class)).onAppLogEvent(str2, jSONObject, str);
        InterfaceC1893690zNX.LIZ.getClass();
        InterfaceC1893690zNX interfaceC1893690zNX = (InterfaceC1893690zNX) PluggableExtentionKt.pluggableSpi(InterfaceC1893690zNX.class, false, false, true);
        if (interfaceC1893690zNX != null) {
            interfaceC1893690zNX.LIZIZ();
        }
        com_ss_android_common_applog_AppLog__onEvent$___twin___(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        InitModules.LIZ();
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_localservice_passthrough_hook_LSMobLancet_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        int i = 0;
        while (true) {
            try {
                CopyOnWriteArrayList<InterfaceC21315218bG> copyOnWriteArrayList = C21314918bD.LIZ;
                if (i >= copyOnWriteArrayList.size()) {
                    break;
                }
                copyOnWriteArrayList.get(i).onEvent(str2, jSONObject);
                i++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q, X.0X14] */
    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_localservice_passthrough_hook_LSMobLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
            return;
        }
        C841880X0w<C0X14, Boolean> c841880X0w = new C841880X0w<>();
        c841880X0w.LIZ = new C0X14(str, str2, str3, jSONObject);
        C841860X0u.LIZJ.LIZLLL(c841880X0w);
        if (c841880X0w.LIZLLL == EnumC841890X0x.INTERCEPT) {
            return;
        }
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_localservice_passthrough_hook_LSMobLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void onEventInternal(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        appendParamsToEvent(jSONObject);
        ((C2210311Bf3) sAppLogApi).LIZIZ(context, str, str2, str3, j, j2, z, jSONObject);
    }
}

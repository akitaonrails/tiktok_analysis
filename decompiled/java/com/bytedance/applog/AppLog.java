package com.bytedance.applog;

import X.AbstractC2194001Atq;
import X.C0C64;
import X.C0XDK;
import X.C0XDM;
import X.C0XDP;
import X.C15WI;
import X.C2209741Be8;
import X.C2209901BeO;
import X.C2210081Beg;
import X.C2210111Bej;
import X.C2210461BfI;
import X.C2211341Bgi;
import X.EnumC2210521BfO;
import X.InterfaceC19397110uf;
import X.InterfaceC2184721Aes;
import X.InterfaceC2192111Aqn;
import X.InterfaceC2201401BDu;
import X.InterfaceC2209861BeK;
import X.InterfaceC2210301Bf2;
import X.InterfaceC2211041BgE;
import X.InterfaceC2211051BgF;
import X.InterfaceC2211161BgQ;
import X.InterfaceC2211181BgS;
import X.InterfaceC2211191BgT;
import X.InterfaceC2211371Bgl;
import X.InterfaceC2211381Bgm;
import X.InterfaceC2211391Bgn;
import X.InterfaceC2211401Bgo;
import X.InterfaceC2211421Bgq;
import X.InterfaceC2211431Bgr;
import X.InterfaceC23070092e;
import X.InterfaceC467610IVj;
import X.InterfaceC801310Vc1;
import X.InterfaceC844530XBb;
import X.InterfaceC844900XCm;
import X.InterfaceC845020XCy;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLog {
    public static final InterfaceC2210301Bf2 gAppLogInstance = newInstance();
    public static volatile boolean gAppLogInstanceInitialized = false;

    public static void init(Context context, C2210081Beg c2210081Beg) {
        com_bytedance_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_initBdTracker(context, c2210081Beg);
    }

    public static void clearAndSetEnv() {
        gAppLogInstance.LLJJJJLIIL();
    }

    public static void disableInsertCache() {
        gAppLogInstance.LLJJIJI();
    }

    public static void flush() {
        gAppLogInstance.flush();
    }

    public static void flushAsync() {
        gAppLogInstance.LJJJIL();
    }

    public static String getAbSdkVersion() {
        return gAppLogInstance.getAbSdkVersion();
    }

    public static boolean getAdjustTerminate() {
        return gAppLogInstance.LLJIJIL();
    }

    public static String getAid() {
        return gAppLogInstance.getAid();
    }

    public static String getAppId() {
        return gAppLogInstance.getAppId();
    }

    public static IBDAccountCallback getBDAccountCallback() {
        return gAppLogInstance.LJIJJ();
    }

    public static InterfaceC844530XBb getBDInstallApi() {
        return gAppLogInstance.LJJJJLI();
    }

    public static InterfaceC2184721Aes getBatchReportSettings() {
        return gAppLogInstance.LJJJJIZL();
    }

    public static String getClientUdid() {
        return gAppLogInstance.LJJLI();
    }

    public static InterfaceC2192111Aqn getCommonParams() {
        return gAppLogInstance.getCommonParams();
    }

    public static Context getContext() {
        return gAppLogInstance.getContext();
    }

    public static String getDid() {
        return gAppLogInstance.getDid();
    }

    public static Integer getDisablePersonalization() {
        return gAppLogInstance.LLFFF();
    }

    public static boolean getEnableEventUserId() {
        return gAppLogInstance.LJLJJL();
    }

    public static boolean getEncryptAndCompress() {
        return gAppLogInstance.LLJZIJLIL();
    }

    public static AbstractC2194001Atq getEventFilterByClient() {
        return gAppLogInstance.LJJJLL();
    }

    public static JSONObject getHeader() {
        return gAppLogInstance.getHeader();
    }

    public static InterfaceC2209861BeK getHeaderCustomCallback() {
        return gAppLogInstance.LJIJI();
    }

    public static int getHttpMonitorPort() {
        return gAppLogInstance.LLILL();
    }

    public static String getIid() {
        return gAppLogInstance.getIid();
    }

    public static C2210081Beg getInitConfig() {
        return gAppLogInstance.LJ();
    }

    public static InterfaceC2211431Bgr getLogCompressor() {
        return gAppLogInstance.LJZ();
    }

    public static InterfaceC801310Vc1 getLogSettingsCallback() {
        return gAppLogInstance.LLIIZ();
    }

    public static InterfaceC23070092e getNetClient() {
        return gAppLogInstance.getNetClient();
    }

    public static String getOpenUdid() {
        return gAppLogInstance.getOpenUdid();
    }

    public static InterfaceC467610IVj getParamsExtractApi() {
        return gAppLogInstance.LJJLIIIJLLLLLLLZ();
    }

    public static Map<String, String> getRequestHeader() {
        return gAppLogInstance.LIZ();
    }

    public static C2209741Be8 getSamplingFilter() {
        return gAppLogInstance.LJJIIZ();
    }

    public static String getSessionId() {
        return gAppLogInstance.getSessionId();
    }

    public static String getSsid() {
        return gAppLogInstance.LLILZLL();
    }

    public static String getUserID() {
        return gAppLogInstance.getUserID();
    }

    public static String getUserUniqueID() {
        return gAppLogInstance.LJIIZILJ();
    }

    public static boolean hasStarted() {
        return gAppLogInstance.LIZLLL();
    }

    public static void initGroupPriority() {
        gAppLogInstance.LLIIJLIL();
    }

    public static boolean isEnableBgSessionTask() {
        return gAppLogInstance.LJJJZ();
    }

    public static boolean isEnableEventInTouristMode() {
        return gAppLogInstance.LLIIJI();
    }

    public static boolean isEnableEventPriority() {
        return gAppLogInstance.LLJJJJ();
    }

    public static boolean isEventMapEnabled() {
        return gAppLogInstance.LJJZ();
    }

    public static boolean isEventParamsExtractEnabled() {
        return gAppLogInstance.LLIFFJFJJ();
    }

    public static boolean isGroupPriorityEnabled() {
        return gAppLogInstance.LLF();
    }

    public static boolean isNewUser() {
        return gAppLogInstance.isNewUser();
    }

    public static boolean isNewUserModeAvailable() {
        return gAppLogInstance.LJJIZ();
    }

    public static boolean isTouristMode() {
        return gAppLogInstance.LJJIJL();
    }

    public static boolean manualActivate() {
        return gAppLogInstance.LJJLIIIJLJLI();
    }

    public static InterfaceC2210301Bf2 newInstance() {
        return new C2209901BeO();
    }

    public static void onActivityPause() {
        gAppLogInstance.LIZJ();
    }

    public static void onBgSessionTaskPause() {
        gAppLogInstance.LJLLILLLL();
    }

    public static void onBgSessionTaskResume() {
        gAppLogInstance.LLL();
    }

    public static void removeAllDataObserver() {
        gAppLogInstance.LJLLI();
    }

    public static void start() {
        gAppLogInstance.start();
    }

    public static void stop() {
        gAppLogInstance.stop();
    }

    public static InterfaceC2210301Bf2 getInstance() {
        return gAppLogInstance;
    }

    public static void addDataObserver(InterfaceC2211041BgE interfaceC2211041BgE) {
        gAppLogInstance.LLILZIL(interfaceC2211041BgE);
    }

    public static void addEventObserver(InterfaceC2211161BgQ interfaceC2211161BgQ) {
        gAppLogInstance.LLJILLL(interfaceC2211161BgQ);
    }

    public static void addEventObserverV2(InterfaceC19397110uf interfaceC19397110uf) {
        gAppLogInstance.LJLIL(interfaceC19397110uf);
    }

    public static void addLaunchObserver(InterfaceC2201401BDu interfaceC2201401BDu) {
        gAppLogInstance.LJIJ(interfaceC2201401BDu);
    }

    public static void addLogReportMonitor(InterfaceC2211191BgT interfaceC2211191BgT) {
        gAppLogInstance.LJLLLLLL(interfaceC2211191BgT);
    }

    public static void addSessionHook(InterfaceC2211051BgF interfaceC2211051BgF) {
        gAppLogInstance.LJZL(interfaceC2211051BgF);
    }

    public static void allowHeaderKey(String str) {
        gAppLogInstance.LLJJIJIL(str);
    }

    public static void blockHeaderKey(String str) {
        gAppLogInstance.LJJJLZIJ(str);
    }

    public static void clearWhenSwitchChildMode(boolean z) {
        gAppLogInstance.LLJJJIL(z);
    }

    public static void forceTimeoutReportSync(long j) {
        boolean zLJI = MethodIDManager.LJI(137841);
        gAppLogInstance.LJIILLIIL(j);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void getSsidGroup(Map<String, String> map) {
        gAppLogInstance.LLIL(map);
    }

    public static boolean isEventHitSamplingDrop(String str) {
        return gAppLogInstance.LJIILL(str);
    }

    public static boolean isEventHitStickySamplingDrop(String str) {
        return gAppLogInstance.LJIILL(str);
    }

    public static boolean isNewUserMode(Context context) {
        return gAppLogInstance.LJFF();
    }

    public static C0XDK newUserMode(Context context) {
        gAppLogInstance.LLJILJIL();
        return null;
    }

    public static void onEvent(String str) {
        gAppLogInstance.onEvent(str);
    }

    public static void onEventV3(String str) {
        gAppLogInstance.onEventV3(str);
    }

    public static void onPause(Context context) {
        gAppLogInstance.LJJJJJ(context);
    }

    public static void onResume(Context context) {
        gAppLogInstance.LJI(context);
    }

    public static void registerAbSdkVersionCallback(InterfaceC2211421Bgq interfaceC2211421Bgq) {
        gAppLogInstance.LLJLIL(interfaceC2211421Bgq);
    }

    public static void registerBgSessionTaskCallback(InterfaceC2211381Bgm interfaceC2211381Bgm) {
        gAppLogInstance.LJJI();
    }

    public static void registerHeaderCustomCallback(InterfaceC2209861BeK interfaceC2209861BeK) {
        gAppLogInstance.LLJLL(interfaceC2209861BeK);
    }

    public static void removeDataObserver(InterfaceC2211041BgE interfaceC2211041BgE) {
        gAppLogInstance.LJLJLJ(interfaceC2211041BgE);
    }

    public static void removeEventObserver(InterfaceC2211161BgQ interfaceC2211161BgQ) {
        gAppLogInstance.LLJLLL(interfaceC2211161BgQ);
    }

    public static void removeEventObserverV2(InterfaceC19397110uf interfaceC19397110uf) {
        gAppLogInstance.LJJJLIIL(interfaceC19397110uf);
    }

    public static void removeHeaderInfo(String str) {
        gAppLogInstance.LLJLLIL(str);
    }

    public static void removeLaunchObserver(InterfaceC2201401BDu interfaceC2201401BDu) {
        gAppLogInstance.LLFII(interfaceC2201401BDu);
    }

    public static void removeSessionHook(InterfaceC2211051BgF interfaceC2211051BgF) {
        gAppLogInstance.LLILII(interfaceC2211051BgF);
    }

    public static void setAccount(Account account) {
        gAppLogInstance.LIZIZ(account);
    }

    public static void setAdjustTerminate(boolean z) {
        gAppLogInstance.LL(z);
    }

    public static void setAppTrack(JSONObject jSONObject) {
        gAppLogInstance.LJIILJJIL(jSONObject);
    }

    public static void setAutoStartGroupPriority(boolean z) {
        gAppLogInstance.LJZI(z);
    }

    public static void setBDAccountCallback(IBDAccountCallback iBDAccountCallback) {
        gAppLogInstance.LLJJIII(iBDAccountCallback);
    }

    public static void setBDInstallEventTrackEnabled(boolean z) {
        gAppLogInstance.LJJLIIIIJ(z);
    }

    public static void setBatchProcessEventCount(int i) {
        gAppLogInstance.LJJZZI(i);
    }

    public static void setBatchProcessInterval(int i) {
        gAppLogInstance.LLILLIZIL(i);
    }

    public static void setBgSessionReportOnPause(boolean z) {
        gAppLogInstance.LLJJI(z);
    }

    public static void setBgSessionTaskEnabled(boolean z) {
        gAppLogInstance.LJLJI(z);
    }

    public static void setBgSessionTaskNavigatorCallback(InterfaceC2211371Bgl interfaceC2211371Bgl) {
        gAppLogInstance.LJJJJZI();
    }

    public static void setCommonParamsEnabled(boolean z) {
        gAppLogInstance.LJJIL(z);
    }

    public static void setCustomHeaderControlEnabled(boolean z) {
        gAppLogInstance.LJJJJJL(z);
    }

    public static void setDataIsolateCallback(InterfaceC2211401Bgo interfaceC2211401Bgo) {
        gAppLogInstance.LLIIIZ(interfaceC2211401Bgo);
    }

    public static void setDataIsolateEnabled(boolean z) {
        gAppLogInstance.LLJJJJJIL(z);
    }

    public static void setDataIsolateKey(EnumC2210521BfO enumC2210521BfO) {
        gAppLogInstance.LJIL(enumC2210521BfO);
    }

    public static void setDefaultHttpClientProxy(Proxy proxy) {
        gAppLogInstance.LJIILIIL(proxy);
    }

    public static void setDevToolsEnable(boolean z) {
        C2210111Bej.LIZ = Boolean.valueOf(z);
    }

    public static void setDisablePersonalization(int i) {
        gAppLogInstance.LJLL(i);
    }

    public static void setEnableEventInTouristMode(boolean z) {
        gAppLogInstance.LJJIJIIJI(z);
    }

    public static void setEnableEventPriority(boolean z) {
        gAppLogInstance.LJJLIIIJ(z);
    }

    public static void setEnableEventUserId(boolean z) {
        gAppLogInstance.LJLIIIL(z);
    }

    public static void setEncryptAndCompress(boolean z) {
        gAppLogInstance.LLJJ(z);
    }

    public static void setEventForwardEnabled(boolean z) {
        gAppLogInstance.LLIZ(z);
    }

    public static void setEventHandler(InterfaceC2211391Bgn interfaceC2211391Bgn) {
        gAppLogInstance.LJJJJL();
    }

    public static void setEventMapEnabled(boolean z) {
        gAppLogInstance.LJJIJIL(z);
    }

    public static void setEventParamControlEnabled(boolean z) {
        gAppLogInstance.LJLZ(z);
    }

    public static void setEventParamsExtractEnabled(boolean z) {
        gAppLogInstance.LJJLL(z);
    }

    public static void setEventSamplingEnable(boolean z) {
        gAppLogInstance.LLFF(z);
    }

    public static void setExternalAbVersion(String str) {
        gAppLogInstance.LJJIJ(str);
    }

    public static void setExtraParams(C0XDM c0xdm) {
        gAppLogInstance.LJJLJ(c0xdm);
    }

    public static void setFetchConfigFirstDelayMills(long j) {
        gAppLogInstance.LLILIL(j);
    }

    public static void setFlushAsyncDefault(boolean z) {
        gAppLogInstance.LJLLL(z);
    }

    public static void setFlushThresholdEnable(boolean z) {
        gAppLogInstance.LJLIIL(z);
    }

    public static void setGroupPriorityEnable(boolean z) {
        gAppLogInstance.LJIIJJI(z);
    }

    public static void setHeaderInfo(HashMap<String, Object> map) {
        gAppLogInstance.LLJLILLLLZIIL(map);
    }

    public static void setHttpMonitorPort(int i) {
        gAppLogInstance.LLILLJJLI(i);
    }

    public static void setInsertByTransactionEnabled(boolean z) {
        gAppLogInstance.LJJIIJ(z);
    }

    public static void setInsertEventOptEnabled(boolean z) {
        gAppLogInstance.LJJJJLL(z);
    }

    public static void setLogCompressor(InterfaceC2211431Bgr interfaceC2211431Bgr) {
        gAppLogInstance.LJLJJLL(interfaceC2211431Bgr);
    }

    public static void setLogSettingsCallback(InterfaceC801310Vc1 interfaceC801310Vc1) {
        gAppLogInstance.LJLLJ(interfaceC801310Vc1);
    }

    public static void setLogger(InterfaceC844900XCm interfaceC844900XCm) {
        gAppLogInstance.LLJJIJIIJIL(interfaceC844900XCm);
    }

    public static void setMaxCacheEventNum(int i) {
        gAppLogInstance.LJJJI(i);
    }

    public static void setMaxRequestOnceReport(int i) {
        gAppLogInstance.LLJJLIIIJLLLLLLLZ(i);
    }

    public static void setMigrateOldAppLogDataEnabled(boolean z) {
        gAppLogInstance.LLD(z);
    }

    public static void setNavigatorCallback(InterfaceC2211371Bgl interfaceC2211371Bgl) {
        gAppLogInstance.LJJJJ();
    }

    public static void setNewMonitorEnabled(boolean z) {
        gAppLogInstance.LJJLIL(z);
    }

    public static void setNewMonitorInDebugMode(boolean z) {
        gAppLogInstance.LLJJL(z);
    }

    public static void setPackLaunchByDesc(boolean z) {
        gAppLogInstance.LJJLJLI(z);
    }

    public static void setPageId(String str) {
        gAppLogInstance.LJJIIZI(str);
    }

    public static void setPageInfoEnabled(boolean z) {
        gAppLogInstance.LJLLLL(z);
    }

    public static void setPageName(String str) {
        gAppLogInstance.LJLJLLL(str);
    }

    public static void setReportDropStrategy(InterfaceC2211181BgS interfaceC2211181BgS) {
        gAppLogInstance.LLFZ(interfaceC2211181BgS);
    }

    public static void setServerFilterByNative(boolean z) {
        gAppLogInstance.LJJLIIIJL(z);
    }

    public static void setServerFilterSaveToKeva(boolean z) {
        gAppLogInstance.LJJL(z);
    }

    public static void setTeaEventSamplingEnable(boolean z) {
        gAppLogInstance.LJJLIIIJJIZ(z);
    }

    public static void setTerminateImmediately(boolean z) {
        gAppLogInstance.LJJIFFI(z);
    }

    public static void setTouchPoint(String str) {
        gAppLogInstance.LJIIJ(str);
    }

    public static void setTouristMode(boolean z) {
        gAppLogInstance.LLILZ(z);
    }

    public static void setTrackResumeEvent(boolean z) {
        gAppLogInstance.LLIIL(z);
    }

    public static void setUriRuntime(C2210461BfI c2210461BfI) {
        gAppLogInstance.LJJLIIJ(c2210461BfI);
    }

    public static void setUserAgent(String str) {
        gAppLogInstance.LJJLIIIJILLIZJL(str);
    }

    public static void setUserID(long j) {
        gAppLogInstance.LJLJL(j);
    }

    public static void setUserUniqueID(String str) {
        gAppLogInstance.LJII(str);
    }

    public static void addEventObserver(int i, InterfaceC2211161BgQ interfaceC2211161BgQ) {
        gAppLogInstance.LLIIII(i, interfaceC2211161BgQ);
    }

    public static void addEventObserverV2(int i, InterfaceC19397110uf interfaceC19397110uf) {
        gAppLogInstance.LLIILZL(i, interfaceC19397110uf);
    }

    public static void addRegisterCustomHeader(Context context, JSONObject jSONObject) {
        gAppLogInstance.LLJI();
    }

    public static void com_bytedance_applog_AppLog__init$___twin___(Context context, C2210081Beg c2210081Beg) {
        synchronized (AppLog.class) {
            try {
                if (gAppLogInstanceInitialized) {
                    return;
                }
                gAppLogInstanceInitialized = true;
                if (TextUtils.isEmpty(c2210081Beg.LJJI) && !TextUtils.isEmpty("applog_stats")) {
                    c2210081Beg.LJJI = "applog_stats";
                }
                gAppLogInstance.LJJLIIIJJI(context, c2210081Beg);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void com_bytedance_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_initBdTracker(Context context, C2210081Beg c2210081Beg) {
        com_bytedance_applog_AppLog__init$___twin___(context, c2210081Beg);
        C15WI.LIZJ = true;
    }

    public static void com_bytedance_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_initBdTracker(Context context, C2210081Beg c2210081Beg) {
        com_bytedance_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_initBdTracker(context, c2210081Beg);
        C2211341Bgi.LIZ = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "batch_applog_fsync_opt_exp", true) > 0) {
            setInsertByTransactionEnabled(true);
        }
    }

    public static boolean isEventHitSamplingDrop(String str, JSONObject jSONObject) {
        return gAppLogInstance.LLIIIL(str, jSONObject);
    }

    public static boolean isEventHitStickySamplingDrop(String str, JSONObject jSONObject) {
        return gAppLogInstance.LLIIIL(str, jSONObject);
    }

    public static void monitorCount(String str, int i) {
        gAppLogInstance.LJL(str, i);
    }

    public static void monitorError(String str, Throwable th) {
        gAppLogInstance.LLIILII(str, th);
    }

    public static void onActivityResumed(Activity activity, int i) {
        gAppLogInstance.onActivityResumed(activity);
    }

    public static void onEvent(String str, String str2) {
        gAppLogInstance.onEvent(str, str2);
    }

    public static void onEventV3(String str, Bundle bundle) {
        gAppLogInstance.LLJJJ(str, bundle);
    }

    public static void onMiscEvent(String str, JSONObject jSONObject) {
        gAppLogInstance.LLIIIILZ(str, jSONObject);
    }

    public static void resetAndReInstall(long j, InterfaceC845020XCy interfaceC845020XCy) {
        gAppLogInstance.LJJIIJZLJL(j, interfaceC845020XCy);
    }

    public static void setAppLanguageAndRegion(String str, String str2) {
        gAppLogInstance.LJIJJLI(str, str2);
    }

    public static void setEventFilterByClient(List<String> list, boolean z) {
        gAppLogInstance.LJLI(list, z);
    }

    public static void setEventForwardHttpHeader(String str, String str2) {
        gAppLogInstance.LLIZLLLIL(str, str2);
    }

    public static void setEventSenderEnable(boolean z, String str) {
        gAppLogInstance.LJJZZIII(z, str);
    }

    public static void setHeaderInfo(String str, Object obj) {
        gAppLogInstance.LJJII(str, obj);
    }

    public static void setNewUserMode(Context context, boolean z) {
        gAppLogInstance.LJJ(z);
    }

    public static void onActivityResumed(String str, int i) {
        gAppLogInstance.LJIIL(str, i);
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        gAppLogInstance.onEventV3(str, jSONObject);
    }

    public static void enableInsertCache(HashSet<String> hashSet, int i, int i2) {
        gAppLogInstance.LLJILJILJ(hashSet, i, i2);
    }

    public static <T> T getHeaderValue(String str, T t, Class<T> cls) {
        return (T) gAppLogInstance.LLJL(str, t, cls);
    }

    public static void setExpectedBatchInterval(String str, String str2, int i) {
        gAppLogInstance.LLI(str, str2, i);
    }

    public static String addNetCommonParams(Context context, String str, boolean z, C0XDP c0xdp) {
        return gAppLogInstance.LJLILLLLZI(context, str, z, c0xdp);
    }

    public static void onEventV3WithView(View view, String str, String str2, JSONObject jSONObject) {
        gAppLogInstance.LJJIJLIJ(view, str, str2, jSONObject);
    }

    public static void putCommonParams(Context context, Map<String, String> map, boolean z, C0XDP c0xdp) {
        gAppLogInstance.LJJJ(context, map, z, c0xdp);
    }

    public static void resetDidWhenSwitchChildMode(Context context, boolean z, long j, InterfaceC845020XCy interfaceC845020XCy) {
        gAppLogInstance.LJIIIIZZ(z, j, interfaceC845020XCy);
    }

    public static String addNetCommonParams(Context context, StringBuilder sb, boolean z, C0XDP c0xdp) {
        return gAppLogInstance.LLJ(context, sb, z, c0xdp);
    }

    public static void onEvent(String str, String str2, String str3, long j, long j2) {
        gAppLogInstance.LLII(str, str2, str3, j, j2);
    }

    public static void onInternalEventV3(String str, Bundle bundle, String str2, String str3, String str4) {
        gAppLogInstance.LLIIIJ(str, bundle, str2, str3, str4);
    }

    public static void onInternalEventV3(String str, JSONObject jSONObject, String str2, String str3, String str4) {
        gAppLogInstance.LJJIII(str, jSONObject, str2, str3, str4);
    }

    public static void onEvent(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        gAppLogInstance.LJJJJI(str, str2, str3, j, j2, jSONObject);
    }
}

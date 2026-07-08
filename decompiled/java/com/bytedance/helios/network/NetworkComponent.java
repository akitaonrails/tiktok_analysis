package com.bytedance.helios.network;

import X.AbstractC839740Wwu;
import X.C08CX;
import X.C0WRY;
import X.C0WS5;
import X.C0WSB;
import X.C0WSC;
import X.C0WSW;
import X.C0WSX;
import X.C0WT3;
import X.C0WZW;
import X.C0X0A;
import X.C13LP;
import X.C1C7U;
import X.C20129813pY;
import X.C2097608Jq;
import X.C786410Ut5;
import X.C822890WPv;
import X.C823280WRi;
import X.C825320WZe;
import X.C840360Wxu;
import X.C840410Wxz;
import X.C840470Wy5;
import X.C840480Wy6;
import X.C840490Wy7;
import X.C840500Wy8;
import X.C840520WyA;
import X.C840550WyD;
import X.ExecutorC822880WPu;
import X.InterfaceC1631620sYq;
import X.InterfaceC2280171EMt;
import X.InterfaceC2280181EMu;
import X.InterfaceC823460WSa;
import X.InterfaceC840420Wy0;
import Y.ARunnableS5S1400000_13;
import Y.ARunnableS92S0000000_13;
import android.app.Application;
import android.net.Uri;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.InventoryConfig;
import com.bytedance.helios.network.api.config.NetworkCondition;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.helios.network.api.config.NetworkSettingsSnapshot;
import com.bytedance.helios.network.api.config.SampleRateConfig;
import com.bytedance.helios.network.api.config.SceneConfig;
import com.bytedance.helios.network.api.config.ShutdownConfig;
import com.bytedance.helios.network.api.config.StackConfig;
import com.bytedance.helios.network.api.config.UploadBacktraceConfig;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.IOkHttpService;
import com.bytedance.helios.network.api.service.ITTNetService;
import com.bytedance.helios.network.runtime.host.model.NetworkAppInfo;
import com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor;
import com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor;
import com.bytedance.helios.network.runtime.host.model.NetworkHostProxy;
import com.bytedance.helios.network.runtime.host.model.NetworkInitCallback;
import com.bytedance.helios.network.runtime.host.model.NetworkStore;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkComponent {
    public static final NetworkComponent INSTANCE = new NetworkComponent();
    public static final C840480Wy6 hostRuntime = new C840480Wy6();
    public static final C840470Wy5 runtimeRegistry = new C840470Wy5(0);
    public static final C840520WyA pumbaaPolicyBridge = new C840520WyA();
    public static final C840500Wy8 pumbaaObserveBridge = new C840500Wy8();

    public static /* synthetic */ void lambda$semisugar$updateSettings$lambda$0$0() {
        C1C7U.LIZ("NetworkComponent@2767.updateSettings$1L");
        updateSettings$lambda$0();
        C1C7U.LIZIZ("NetworkComponent@2767.updateSettings$1L");
    }

    public final void disableUrlConnectionService$network_release() {
        updateUrlConnectionService(null);
    }

    public static final void enableForAll() {
        INSTANCE.updateInventoryConfigOverride(new InventoryConfig(true, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, new NetworkCondition(null, null, null, 7, null)));
    }

    public static final boolean isOffLineEnv() {
        return INSTANCE.isOfflineEnv();
    }

    private final void refreshSceneFlags() {
        if (hostRuntime.LIZ == null) {
            updateKidsModeEnabled(false);
            updateRegressionTestEnv(false);
        } else {
            Boolean boolSceneFlag = sceneFlag("is_kids_mode");
            Boolean bool = Boolean.TRUE;
            updateKidsModeEnabled(Intrinsics.LJFF(boolSceneFlag, bool));
            updateRegressionTestEnv(Intrinsics.LJFF(sceneFlag("is_regression_test"), bool));
        }
    }

    public static final void updateSettings$lambda$0() {
        Set setLLIIJI;
        Set setLLIIJI2;
        ShutdownConfig shutdownConfig;
        Function0<Set<String>> function0;
        Set<String> setInvoke;
        Function0<Set<String>> function02;
        Set<String> setInvoke2;
        C840480Wy6 c840480Wy6 = hostRuntime;
        NetworkHostProxy networkHostProxy = c840480Wy6.LIZ;
        if (networkHostProxy == null || (function02 = networkHostProxy.onePartyDomainList) == null || (setInvoke2 = function02.invoke()) == null || (setLLIIJI = C13LP.LLIIJI(setInvoke2)) == null) {
            setLLIIJI = C08CX.INSTANCE;
        }
        NetworkHostProxy networkHostProxy2 = c840480Wy6.LIZ;
        if (networkHostProxy2 == null || (function0 = networkHostProxy2.thirdPartyDomainList) == null || (setInvoke = function0.invoke()) == null || (setLLIIJI2 = C13LP.LLIIJI(setInvoke)) == null) {
            setLLIIJI2 = C08CX.INSTANCE;
        }
        NetworkComponent networkComponent = INSTANCE;
        NetworkConfig networkConfigNetworkConfigOrNull = networkComponent.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull == null || (shutdownConfig = networkConfigNetworkConfigOrNull.shutdownConfig) == null) {
            shutdownConfig = new ShutdownConfig(0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, false, false, false, false, false, 32767, null);
        }
        C840490Wy7.LIZIZ(setLLIIJI, setLLIIJI2, shutdownConfig);
        C840550WyD c840550WyD = C840550WyD.LIZ;
        NetworkConfig networkConfigNetworkConfigOrNull2 = networkComponent.networkConfigOrNull();
        n nVar = networkConfigNetworkConfigOrNull2 != null ? networkConfigNetworkConfigOrNull2.netWorkTrafficDataTypeConfigs : null;
        c840550WyD.getClass();
        C840550WyD.LIZIZ(nVar);
    }

    public final NetworkAppInfo appInfo() {
        return hostRuntime.LIZLLL;
    }

    public final void clearCurrentEvent() {
        hostRuntime.LJ.set(null);
    }

    public final InterfaceC823460WSa currentEvent() {
        return hostRuntime.LJ.get();
    }

    public final String currentRegion() {
        Function0<String> function0;
        String strInvoke;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        return (networkHostProxy == null || (function0 = networkHostProxy.currentRegionGetter) == null || (strInvoke = function0.invoke()) == null) ? "" : strInvoke;
    }

    public final String deviceIdOrNull() {
        Function0<String> function0;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy == null || (function0 = networkHostProxy.deviceIdGetter) == null) {
            return null;
        }
        return function0.invoke();
    }

    public final NetworkExceptionMonitor exceptionMonitor() {
        return pumbaaObserveBridge.LIZIZ;
    }

    public final NetworkEventMonitor getEventMonitor() {
        return pumbaaObserveBridge.LIZ;
    }

    public final long initTimeMillis() {
        return hostRuntime.LJFF;
    }

    public final String installIdOrNull() {
        Function0<String> function0;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy == null || (function0 = networkHostProxy.installIdGetter) == null) {
            return null;
        }
        return function0.invoke();
    }

    public final InventoryConfig inventoryConfigOverride() {
        return hostRuntime.LJIIIIZZ;
    }

    public final boolean isKidsModeEnabled() {
        return hostRuntime.LJI;
    }

    public final boolean isRegressionTestEnv() {
        return hostRuntime.LJII;
    }

    public final IOkHttpService okHttpServiceOrNull() {
        C840470Wy5 c840470Wy5 = runtimeRegistry;
        if (!c840470Wy5.LJ) {
            c840470Wy5.LJFF = c840470Wy5.LIZ.invoke();
            c840470Wy5.LJ = true;
        }
        return c840470Wy5.LJFF;
    }

    public final IRuleEngineService policyEngine() {
        return pumbaaPolicyBridge.LIZ;
    }

    public final NetworkSettingsSnapshot refreshSettings() {
        C840480Wy6 c840480Wy6 = hostRuntime;
        Function0<NetworkSettingsSnapshot> function0 = c840480Wy6.LIZIZ;
        NetworkSettingsSnapshot networkSettingsSnapshotInvoke = function0 != null ? function0.invoke() : null;
        c840480Wy6.LIZJ = networkSettingsSnapshotInvoke;
        return networkSettingsSnapshotInvoke;
    }

    public final String regionSource() {
        Function0<String> function0;
        String strInvoke;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        return (networkHostProxy == null || (function0 = networkHostProxy.regionSourceGetter) == null || (strInvoke = function0.invoke()) == null) ? "" : strInvoke;
    }

    public final String sandboxState() {
        Function0<String> function0;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy == null || (function0 = networkHostProxy.sandboxStateGetter) == null) {
            return null;
        }
        return function0.invoke();
    }

    public final Function0<NetworkSettingsSnapshot> settingsGetterProvider() {
        return hostRuntime.LIZIZ;
    }

    public final NetworkSettingsSnapshot settingsSnapshot() {
        return hostRuntime.LIZJ;
    }

    public final NetworkStore store() {
        return pumbaaObserveBridge.LIZJ;
    }

    public final ITTNetService ttNetServiceOrNull() {
        C840470Wy5 c840470Wy5 = runtimeRegistry;
        if (!c840470Wy5.LJI) {
            c840470Wy5.LJII = c840470Wy5.LIZIZ.invoke();
            c840470Wy5.LJI = true;
        }
        return c840470Wy5.LJII;
    }

    public final C0X0A urlConnectionServiceOrNull() {
        return runtimeRegistry.LIZLLL;
    }

    public final String userRegion() {
        Function0<String> function0;
        String strInvoke;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        return (networkHostProxy == null || (function0 = networkHostProxy.userRegionGetter) == null || (strInvoke = function0.invoke()) == null) ? "" : strInvoke;
    }

    public final Set<String> appCheckScenes() {
        Set<String> set;
        NetworkSettingsSnapshot networkSettingsSnapshot = settingsSnapshot();
        return (networkSettingsSnapshot == null || (set = networkSettingsSnapshot.checkAppScenes) == null) ? C08CX.INSTANCE : set;
    }

    public final long backgroundFreezeDurationMillis() {
        NetworkSettingsSnapshot networkSettingsSnapshot = settingsSnapshot();
        return networkSettingsSnapshot != null ? networkSettingsSnapshot.backgroundFreezeDuration : TimeUnit.SECONDS.toMillis(2L);
    }

    public final NetworkEventMonitor eventMonitorOrNull() {
        return getEventMonitor();
    }

    public final double interceptorCheckSampleRate() {
        NetworkConfig networkConfigNetworkConfigOrNull = networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null) {
            return networkConfigNetworkConfigOrNull.interceptorCheckSample;
        }
        return 0.1d;
    }

    public final boolean isNetworkEnabled() {
        NetworkConfig networkConfigNetworkConfigOrNull = networkConfigOrNull();
        return networkConfigNetworkConfigOrNull != null && networkConfigNetworkConfigOrNull.enabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isOfflineEnv() {
        /*
            r4 = this;
            com.bytedance.helios.network.runtime.host.model.NetworkAppInfo r3 = r4.appInfo()
            com.bytedance.helios.network.api.config.NetworkSettingsSnapshot r1 = r4.settingsSnapshot()
            r2 = 0
            if (r3 == 0) goto L11
            boolean r0 = r3.isDebug()
            if (r0 != 0) goto L27
        L11:
            if (r1 == 0) goto L21
            java.util.List<java.lang.String> r1 = r1.testEnvChannels
            if (r1 == 0) goto L21
            if (r3 == 0) goto L29
            java.lang.String r0 = r3.channel
        L1b:
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 != 0) goto L27
        L21:
            boolean r0 = r4.isRegressionTestEnv()
            if (r0 == 0) goto L28
        L27:
            r2 = 1
        L28:
            return r2
        L29:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.NetworkComponent.isOfflineEnv():boolean");
    }

    public final NetworkConfig networkConfigOrNull() {
        NetworkSettingsSnapshot networkSettingsSnapshot = settingsSnapshot();
        if (networkSettingsSnapshot != null) {
            return networkSettingsSnapshot.networkConfig;
        }
        return null;
    }

    public final SampleRateConfig sampleRateConfigOrNull() {
        NetworkSettingsSnapshot networkSettingsSnapshot = settingsSnapshot();
        if (networkSettingsSnapshot != null) {
            return networkSettingsSnapshot.sampleRateConfig;
        }
        return null;
    }

    public final String settingsVersionOrNull() {
        NetworkSettingsSnapshot networkSettingsSnapshot = settingsSnapshot();
        if (networkSettingsSnapshot != null) {
            return networkSettingsSnapshot.version;
        }
        return null;
    }

    public final Set<String> ttpRegionsOrNull() {
        NetworkSettingsSnapshot networkSettingsSnapshot = settingsSnapshot();
        if (networkSettingsSnapshot != null) {
            return networkSettingsSnapshot.ttpRegion;
        }
        return null;
    }

    public final void updateSettings() {
        String str = settingsVersionOrNull();
        updateSettingsSnapshot(refreshSettings());
        if (Intrinsics.LJFF(str, settingsVersionOrNull())) {
            return;
        }
        C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS92S0000000_13(58));
    }

    private final void bindCommonProxy(NetworkHostProxy networkHostProxy) {
        Object obj;
        IRuleEngineService iRuleEngineService;
        NetworkEventMonitor networkEventMonitor;
        NetworkExceptionMonitor networkExceptionMonitor;
        hostRuntime.LIZ = networkHostProxy;
        NetworkStore networkStore = null;
        if (networkHostProxy != null) {
            obj = networkHostProxy.ruleEngine;
        } else {
            obj = null;
        }
        if (obj instanceof IRuleEngineService) {
            iRuleEngineService = (IRuleEngineService) obj;
        } else {
            iRuleEngineService = null;
        }
        updatePolicyEngine(iRuleEngineService);
        C840500Wy8 c840500Wy8 = pumbaaObserveBridge;
        if (networkHostProxy != null) {
            networkEventMonitor = networkHostProxy.eventMonitor;
            networkExceptionMonitor = networkHostProxy.exceptionMonitor;
            networkStore = networkHostProxy.store;
        } else {
            networkEventMonitor = null;
            networkExceptionMonitor = null;
        }
        c840500Wy8.LIZ = networkEventMonitor;
        c840500Wy8.LIZIZ = networkExceptionMonitor;
        c840500Wy8.LIZJ = networkStore;
        refreshSceneFlags();
    }

    public final void afterRegisterTTNetInterceptor(Object obj) {
        Function1<Object, Unit> function1;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (function1 = networkHostProxy.doAfterRegisterTTNetInterceptor) != null) {
            function1.invoke(obj);
        }
    }

    public final void beforeRegisterTTNetInterceptor(Object obj) {
        Function1<Object, Unit> function1;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (function1 = networkHostProxy.doBeforeRegisterTTNetInterceptor) != null) {
            function1.invoke(obj);
        }
    }

    public final void bindCurrentEvent(InterfaceC823460WSa interfaceC823460WSa) {
        hostRuntime.LJ.set(interfaceC823460WSa);
    }

    public final Boolean sceneFlag(String str) {
        Map<String, Function0<Boolean>> map;
        Function0<Boolean> function0;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (map = networkHostProxy.sceneStatusGetter) != null && (function0 = map.get(str)) != null) {
            return function0.invoke();
        }
        return null;
    }

    public final INetworkApiService selectService(int i) {
        C840470Wy5 c840470Wy5 = runtimeRegistry;
        switch (i) {
            case 400000:
            case 400001:
                return c840470Wy5.LIZLLL;
            case 400101:
            case 400102:
            case 400103:
                if (!c840470Wy5.LJ) {
                    c840470Wy5.LJFF = c840470Wy5.LIZ.invoke();
                    c840470Wy5.LJ = true;
                }
                return c840470Wy5.LJFF;
            case 400203:
            case 400204:
            case 400205:
                if (!c840470Wy5.LJI) {
                    c840470Wy5.LJII = c840470Wy5.LIZIZ.invoke();
                    c840470Wy5.LJI = true;
                }
                return c840470Wy5.LJII;
            default:
                c840470Wy5.getClass();
                return null;
        }
    }

    public final Map<String, String> sparkEvent(String str) {
        Function1<String, Map<String, String>> function1;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (function1 = networkHostProxy.getSparkEvent) != null) {
            return function1.invoke(str);
        }
        return null;
    }

    public final void stopTracking$network_release(C840360Wxu c840360Wxu) {
        Object obj;
        C0WSB c0wsb;
        C0WSC c0wsc;
        pumbaaObserveBridge.getClass();
        Object obj2 = null;
        if (c840360Wxu != null) {
            obj = c840360Wxu.LIZIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof C0WSC) && (c0wsc = (C0WSC) obj) != null) {
            c0wsc.stop();
        }
        if (c840360Wxu != null) {
            obj2 = c840360Wxu.LIZ;
        }
        if ((obj2 instanceof C0WSB) && (c0wsb = (C0WSB) obj2) != null) {
            c0wsb.LJIILJJIL();
        }
    }

    public final void updateAppInfo(NetworkAppInfo networkAppInfo) {
        hostRuntime.LIZLLL = networkAppInfo;
    }

    public final void updateCommonProxy(NetworkHostProxy networkHostProxy) {
        bindCommonProxy(networkHostProxy);
    }

    public final void updateEventMonitor(NetworkEventMonitor networkEventMonitor) {
        pumbaaObserveBridge.LIZ = networkEventMonitor;
    }

    public final void updateExceptionMonitor(NetworkExceptionMonitor networkExceptionMonitor) {
        pumbaaObserveBridge.LIZIZ = networkExceptionMonitor;
    }

    public final void updateInventoryConfigOverride(InventoryConfig inventoryConfig) {
        hostRuntime.LJIIIIZZ = inventoryConfig;
    }

    public final void updateKidsModeEnabled(boolean z) {
        hostRuntime.LJI = z;
    }

    public final void updateOkHttpService$network_release(IOkHttpService iOkHttpService) {
        C840470Wy5 c840470Wy5 = runtimeRegistry;
        c840470Wy5.LJFF = iOkHttpService;
        c840470Wy5.LJ = true;
    }

    public final void updatePolicyEngine(IRuleEngineService iRuleEngineService) {
        pumbaaPolicyBridge.LIZ = iRuleEngineService;
    }

    public final void updateRegressionTestEnv(boolean z) {
        hostRuntime.LJII = z;
    }

    public final void updateSettingsGetter(Function0<NetworkSettingsSnapshot> function0) {
        hostRuntime.LIZIZ = function0;
    }

    public final void updateSettingsSnapshot(NetworkSettingsSnapshot networkSettingsSnapshot) {
        hostRuntime.LIZJ = networkSettingsSnapshot;
    }

    public final void updateStore(NetworkStore networkStore) {
        pumbaaObserveBridge.LIZJ = networkStore;
    }

    public final void updateTTNetService$network_release(ITTNetService iTTNetService) {
        C840470Wy5 c840470Wy5 = runtimeRegistry;
        c840470Wy5.LJII = iTTNetService;
        c840470Wy5.LJI = true;
    }

    public final void updateUrlConnectionService(C0X0A c0x0a) {
        runtimeRegistry.LIZLLL = c0x0a;
    }

    public final void notifySpark(String str, Map<String, String> map) {
        Function2<String, Map<String, String>, Unit> function2;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (function2 = networkHostProxy.notifySpark) != null) {
            function2.invoke(str, map);
        }
    }

    public final void recordFrequency(String str, String str2) {
        pumbaaObserveBridge.getClass();
        PumbaaPerformanceTrackManager.LJIIIIZZ(str, str2);
    }

    public final void reportPerf(String str, long j) {
        pumbaaObserveBridge.getClass();
        C823280WRi.LJI("sky_eye_apm_log", new JSONObject().put("EventName", "MethodTimeCost"), new JSONObject().put(str, j), null);
    }

    public final void reportPerfUs(String str, float f) {
        double d;
        SampleRateConfig sampleRateConfigSampleRateConfigOrNull = sampleRateConfigOrNull();
        if (sampleRateConfigSampleRateConfigOrNull != null) {
            d = sampleRateConfigSampleRateConfigOrNull.localAPMConfig;
        } else {
            d = 1.0E-4d;
        }
        if (!C0WRY.LIZ(d)) {
            return;
        }
        pumbaaObserveBridge.getClass();
        C823280WRi.LJI("sky_eye_apm_log", new JSONObject().put("EventName", "MethodTimeCost_us"), new JSONObject().put(str, Float.valueOf(f)), null);
    }

    public final void reportPerformanceError(Throwable th, String str) {
        pumbaaObserveBridge.getClass();
        C0WS5.LIZIZ(str, th);
    }

    public final C840360Wxu startTracking$network_release(String str, String str2) {
        pumbaaObserveBridge.getClass();
        try {
            C0WSB c0wsbLIZIZ = PumbaaPerformanceTrackManager.LIZIZ(str);
            if (c0wsbLIZIZ != null) {
                c0wsbLIZIZ.LJIIIZ();
                return new C840360Wxu(c0wsbLIZIZ, c0wsbLIZIZ.LJFF(str2));
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("network_component_start_tracking_error", th);
            return null;
        }
    }

    public final void switchEventHandler(C0WT3 c0wt3, boolean z) {
        runtimeRegistry.LIZJ.invoke(c0wt3, Boolean.valueOf(z));
    }

    public final void monitorThrowable(Throwable th, String str, Map<String, String> map) {
        NetworkExceptionMonitor networkExceptionMonitor = pumbaaObserveBridge.LIZIZ;
        if (networkExceptionMonitor != null) {
            networkExceptionMonitor.monitorThrowable(th, str, map);
        }
    }

    public final Set<String> onNativeRequestIntercepted(String str, Map<String, String> map, List<String> list) {
        InterfaceC1631620sYq<String, Map<String, String>, List<String>, Set<String>> interfaceC1631620sYq;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (interfaceC1631620sYq = networkHostProxy.nativeRequestInterceptor) != null) {
            return interfaceC1631620sYq.invoke(str, map, list);
        }
        return null;
    }

    public final void reportException(String str, String str2, Throwable th) throws Throwable {
        String str3;
        pumbaaObserveBridge.getClass();
        if (str2 == null) {
            str3 = str;
        } else {
            str3 = str2;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("tag", str);
        if (str2 == null) {
            str2 = "null";
        }
        pairArr[1] = new Pair("message", str2);
        C823280WRi.LJII(str3, th, C2097608Jq.LJIIJ(pairArr));
    }

    public final void init(NetworkAppInfo networkAppInfo, NetworkHostProxy networkHostProxy, Function0<NetworkSettingsSnapshot> function0, NetworkInitCallback networkInitCallback, boolean z) {
        ExecutorC822880WPu executorC822880WPu;
        n nVar;
        Set setLLIIJI;
        Set setLLIIJI2;
        ShutdownConfig shutdownConfig;
        Function0<Set<String>> function02;
        Set<String> setInvoke;
        Function0<Set<String>> function03;
        Set<String> setInvoke2;
        updateAppInfo(networkAppInfo);
        updateSettingsGetter(function0);
        updateCommonProxy(networkHostProxy);
        updateSettingsSnapshot(refreshSettings());
        if (!C825320WZe.LIZLLL()) {
            return;
        }
        if (C825320WZe.LIZLLL()) {
            C840410Wxz.LIZ = new InterfaceC840420Wy0() { // from class: X.0Wxr
                @Override // X.InterfaceC840420Wy0
                public final void LIZ(int i, String str, Map map) {
                    String str2;
                    String str3;
                    URL url;
                    String str4;
                    Object obj;
                    List list;
                    C840360Wxu c840360WxuStartTracking$network_release = NetworkComponent.INSTANCE.startTracking$network_release("10820", "NetworkTTNet_response");
                    String str5 = null;
                    if (map == null || (list = (List) map.get("x-tt-trace-id")) == null || (str2 = (String) ListProtector.get(list, 0)) == null) {
                        str2 = "";
                    }
                    List listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{'-'}, false, 0, 6);
                    C0WSC c0wsc = null;
                    if (listLJJLIIIJ.size() > 1) {
                        str3 = (String) ListProtector.get(listLJJLIIIJ, 1);
                    } else {
                        str3 = null;
                    }
                    try {
                        str5 = str;
                        url = new URL(str5);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        url = null;
                    }
                    C2090808Ha<String, String> c2090808Ha = C840390Wxx.LIZ;
                    synchronized (c2090808Ha) {
                        try {
                            str4 = (String) C19719512Dh.LIZJ(c2090808Ha).remove(str3);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (url != null) {
                        try {
                            url.toString();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            NetworkComponent.INSTANCE.stopTracking$network_release(c840360WxuStartTracking$network_release);
                            throw th2;
                        }
                    }
                    if (c840360WxuStartTracking$network_release != null) {
                        obj = c840360WxuStartTracking$network_release.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof C0WSC) {
                        c0wsc = (C0WSC) obj;
                    }
                    C840300Wxo c840300Wxo = new C840300Wxo(str5, map, i, str3, str4, c0wsc);
                    C840390Wxx.LIZIZ.getClass();
                    List listLIZ = C840290Wxn.LIZ(c840300Wxo);
                    C840390Wxx.LIZJ.getClass();
                    C1259404wK.LIZ(listLIZ);
                    NetworkComponent.INSTANCE.stopTracking$network_release(c840360WxuStartTracking$network_release);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:131:0x028e  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x0292  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x02ab  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x02bb  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x02cf  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x0314  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x0345  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x0388  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x039e  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x03bb  */
                /* JADX WARN: Removed duplicated region for block: B:164:0x03d0  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x043d  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x0491  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x04ae A[PHI: r0
                  0x04ae: PHI (r0v141 java.lang.String) = (r0v140 java.lang.String), (r0v146 java.lang.String) binds: [B:181:0x04a8, B:183:0x04ac] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:189:0x04c3  */
                /* JADX WARN: Removed duplicated region for block: B:192:0x04ce  */
                /* JADX WARN: Removed duplicated region for block: B:194:0x04d6  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x04e6  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x04f2  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x0509  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x0519  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x05b7  */
                /* JADX WARN: Removed duplicated region for block: B:255:0x0627  */
                /* JADX WARN: Removed duplicated region for block: B:259:0x0637  */
                /* JADX WARN: Removed duplicated region for block: B:260:0x063b  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x063e  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x0641  */
                /* JADX WARN: Removed duplicated region for block: B:264:0x0646  */
                /* JADX WARN: Removed duplicated region for block: B:265:0x064a  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x065b  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[PHI: r7
                  0x0076: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v11 java.lang.String) binds: [B:29:0x0073, B:16:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[PHI: r7
                  0x0079: PHI (r7v9 java.lang.String) = (r7v1 java.lang.String), (r7v11 java.lang.String) binds: [B:29:0x0073, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
                @Override // X.InterfaceC840420Wy0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C840350Wxt LIZIZ(java.lang.String r32, java.util.List r33, java.util.Map r34) throws java.net.URISyntaxException {
                    /*
                        Method dump skipped, instruction units count: 1665
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C840330Wxr.LIZIZ(java.lang.String, java.util.List, java.util.Map):X.0Wxt");
                }
            };
        }
        IRuleEngineService iRuleEngineServicePolicyEngine = policyEngine();
        if (iRuleEngineServicePolicyEngine != null) {
            iRuleEngineServicePolicyEngine.LJFF(new AbstractC839740Wwu() { // from class: X.0Wy4
                @Override // X.AbstractC839740Wwu
                public final Object LIZ(List<? extends Object> list) {
                    Set<String> setKeySet;
                    InterfaceC823460WSa interfaceC823460WSaCurrentEvent = NetworkComponent.INSTANCE.currentEvent();
                    if (interfaceC823460WSaCurrentEvent instanceof C840660WyO) {
                        Map<String, String> mapLJ = ((C840660WyO) interfaceC823460WSaCurrentEvent).LJ();
                        if (mapLJ == null || (setKeySet = mapLJ.keySet()) == null) {
                            return C08CX.INSTANCE;
                        }
                        return setKeySet;
                    }
                    return C08CX.INSTANCE;
                }
            });
            iRuleEngineServicePolicyEngine.LJFF(new AbstractC839740Wwu() { // from class: X.0Wy3
                @Override // X.AbstractC839740Wwu
                public final Object LIZ(List<? extends Object> list) {
                    Set<String> setKeySet;
                    InterfaceC823460WSa interfaceC823460WSaCurrentEvent = NetworkComponent.INSTANCE.currentEvent();
                    if (interfaceC823460WSaCurrentEvent instanceof C840660WyO) {
                        Map<String, List<String>> mapLJI = ((C840660WyO) interfaceC823460WSaCurrentEvent).LJI();
                        if (mapLJI == null || (setKeySet = mapLJI.keySet()) == null) {
                            return C08CX.INSTANCE;
                        }
                        return setKeySet;
                    }
                    return C08CX.INSTANCE;
                }
            });
            iRuleEngineServicePolicyEngine.LJFF(new AbstractC839740Wwu() { // from class: X.0Wy2
                @Override // X.AbstractC839740Wwu
                public final Object LIZ(List<? extends Object> list) {
                    Set<String> setKeySet;
                    InterfaceC823460WSa interfaceC823460WSaCurrentEvent = NetworkComponent.INSTANCE.currentEvent();
                    if (interfaceC823460WSaCurrentEvent instanceof C840660WyO) {
                        Map<String, List<String>> mapLJIIIZ = ((C840660WyO) interfaceC823460WSaCurrentEvent).LJIIIZ();
                        if (mapLJIIIZ == null || (setKeySet = mapLJIIIZ.keySet()) == null) {
                            return C08CX.INSTANCE;
                        }
                        return setKeySet;
                    }
                    return C08CX.INSTANCE;
                }
            });
        }
        C20129813pY.LIZ();
        switchEventHandler(new C0WT3() { // from class: X.0WSc
            @Override // X.C0WT3
            public final int LIZIZ() {
                return 8;
            }

            @Override // X.C0WT3
            public final int priority() {
                return -200;
            }

            private final void LIZ$redex$base(InterfaceC823460WSa interfaceC823460WSa) {
                UploadBacktraceConfig uploadBacktraceConfig;
                Set<String> set;
                if (!(interfaceC823460WSa instanceof C840760WyY)) {
                    return;
                }
                C840750WyX c840750WyX = interfaceC823460WSa.LIZ().LIZ;
                NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
                if (networkConfigNetworkConfigOrNull == null || !C0WRY.LIZ(networkConfigNetworkConfigOrNull.networkBacktraceSampleRate)) {
                    return;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<Uri> it2 = ((C840760WyY) interfaceC823460WSa).LIZIZ.iterator();
                while (it2.hasNext()) {
                    String string = it2.next().toString();
                    NetworkConfig networkConfigNetworkConfigOrNull2 = NetworkComponent.INSTANCE.networkConfigOrNull();
                    if (networkConfigNetworkConfigOrNull2 != null && (uploadBacktraceConfig = networkConfigNetworkConfigOrNull2.uploadBacktraceUrl) != null && (set = uploadBacktraceConfig.webImage) != null && (!(set instanceof Collection) || !set.isEmpty())) {
                        Iterator<T> it3 = set.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            } else if (a0.LJJIIZI(string, (String) it3.next(), false)) {
                                linkedHashSet.add(string);
                                break;
                            }
                        }
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS5S1400000_13(new Throwable(), linkedHashSet, C786410Ut5.u3().getName(), c840750WyX, interfaceC823460WSa, 4));
                }
            }

            private final void LIZ$redex$opt(InterfaceC823460WSa interfaceC823460WSa) {
                UploadBacktraceConfig uploadBacktraceConfig;
                Set<String> set;
                if (!(interfaceC823460WSa instanceof C840760WyY)) {
                    return;
                }
                C840750WyX c840750WyX = interfaceC823460WSa.LIZ().LIZ;
                NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
                if (networkConfigNetworkConfigOrNull == null || !C0WRY.LIZ(networkConfigNetworkConfigOrNull.networkBacktraceSampleRate)) {
                    return;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List<Uri> list = ((C840760WyY) interfaceC823460WSa).LIZIZ;
                int i = 0;
                int size = list.size();
                while (i < size) {
                    Uri uri = list.get(i);
                    i++;
                    String string = uri.toString();
                    NetworkConfig networkConfigNetworkConfigOrNull2 = NetworkComponent.INSTANCE.networkConfigOrNull();
                    if (networkConfigNetworkConfigOrNull2 != null && (uploadBacktraceConfig = networkConfigNetworkConfigOrNull2.uploadBacktraceUrl) != null && (set = uploadBacktraceConfig.webImage) != null && (!(set instanceof Collection) || !set.isEmpty())) {
                        Iterator<T> it2 = set.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (a0.LJJIIZI(string, (String) it2.next(), false)) {
                                linkedHashSet.add(string);
                                break;
                            }
                        }
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS5S1400000_13(new Throwable(), linkedHashSet, C786410Ut5.u3().getName(), c840750WyX, interfaceC823460WSa, 4));
                }
            }

            @Override // X.C0WT3
            public final void LIZ(InterfaceC823460WSa interfaceC823460WSa) {
                if (!ReDexExperimentOpt.getAbTest()) {
                    LIZ$redex$base(interfaceC823460WSa);
                } else {
                    LIZ$redex$opt(interfaceC823460WSa);
                }
            }
        }, true);
        switchEventHandler(new C0WT3() { // from class: X.0WyW
            @Override // X.C0WT3
            public final int LIZIZ() {
                return 8;
            }

            @Override // X.C0WT3
            public final int priority() {
                return -100;
            }

            private final void LIZ$redex$base(InterfaceC823460WSa interfaceC823460WSa) {
                StackConfig stackConfig;
                NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
                if (networkConfigNetworkConfigOrNull != null) {
                    stackConfig = networkConfigNetworkConfigOrNull.stackConfig;
                } else {
                    stackConfig = null;
                }
                if ((interfaceC823460WSa instanceof C840760WyY) && stackConfig != null) {
                    C840750WyX c840750WyX = interfaceC823460WSa.LIZ().LIZ;
                    for (SceneConfig sceneConfig : stackConfig.sceneConfigs) {
                        if (sceneConfig.targets.contains(Integer.valueOf(c840750WyX.LIZ)) && C0WRY.LIZ(sceneConfig.sampleRate)) {
                            if (!sceneConfig.blockList.isEmpty()) {
                                C840760WyY c840760WyY = (C840760WyY) interfaceC823460WSa;
                                for (Uri uri : c840760WyY.LIZIZ) {
                                    String string = uri.toString();
                                    if (!a0.LJJJIL(string)) {
                                        Set<String> set = sceneConfig.blockList;
                                        if (!(set instanceof Collection) || !set.isEmpty()) {
                                            Iterator<T> it2 = set.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    if (a0.LJJIIZI(string, (String) it2.next(), false)) {
                                                        LIZJ(c840760WyY, sceneConfig, uri);
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (!sceneConfig.allowList.isEmpty()) {
                                C840760WyY c840760WyY2 = (C840760WyY) interfaceC823460WSa;
                                for (Uri uri2 : c840760WyY2.LIZIZ) {
                                    String string2 = uri2.toString();
                                    if (!a0.LJJJIL(string2)) {
                                        Set<String> set2 = sceneConfig.allowList;
                                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                            Iterator<T> it3 = set2.iterator();
                                            while (it3.hasNext()) {
                                                if (a0.LJJIIZI(string2, (String) it3.next(), false)) {
                                                    break;
                                                }
                                            }
                                        }
                                        LIZJ(c840760WyY2, sceneConfig, uri2);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            private final void LIZ$redex$opt(InterfaceC823460WSa interfaceC823460WSa) {
                StackConfig stackConfig;
                NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
                if (networkConfigNetworkConfigOrNull != null) {
                    stackConfig = networkConfigNetworkConfigOrNull.stackConfig;
                } else {
                    stackConfig = null;
                }
                if ((interfaceC823460WSa instanceof C840760WyY) && stackConfig != null) {
                    C840750WyX c840750WyX = interfaceC823460WSa.LIZ().LIZ;
                    List<SceneConfig> list = stackConfig.sceneConfigs;
                    int i = 0;
                    int size = list.size();
                    while (i < size) {
                        SceneConfig sceneConfig = list.get(i);
                        i++;
                        SceneConfig sceneConfig2 = sceneConfig;
                        if (sceneConfig2.targets.contains(Integer.valueOf(c840750WyX.LIZ)) && C0WRY.LIZ(sceneConfig2.sampleRate)) {
                            if (!sceneConfig2.blockList.isEmpty()) {
                                C840760WyY c840760WyY = (C840760WyY) interfaceC823460WSa;
                                List<Uri> list2 = c840760WyY.LIZIZ;
                                int i2 = 0;
                                int size2 = list2.size();
                                while (i2 < size2) {
                                    Uri uri = list2.get(i2);
                                    i2++;
                                    Uri uri2 = uri;
                                    String string = uri2.toString();
                                    if (!a0.LJJJIL(string)) {
                                        Set<String> set = sceneConfig2.blockList;
                                        if (!(set instanceof Collection) || !set.isEmpty()) {
                                            Iterator<T> it2 = set.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    break;
                                                } else if (a0.LJJIIZI(string, (String) it2.next(), false)) {
                                                    LIZJ(c840760WyY, sceneConfig2, uri2);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (!sceneConfig2.allowList.isEmpty()) {
                                C840760WyY c840760WyY2 = (C840760WyY) interfaceC823460WSa;
                                List<Uri> list3 = c840760WyY2.LIZIZ;
                                int i3 = 0;
                                int size3 = list3.size();
                                while (i3 < size3) {
                                    Uri uri3 = list3.get(i3);
                                    i3++;
                                    Uri uri4 = uri3;
                                    String string2 = uri4.toString();
                                    if (!a0.LJJJIL(string2)) {
                                        Set<String> set2 = sceneConfig2.allowList;
                                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                            Iterator<T> it3 = set2.iterator();
                                            while (it3.hasNext()) {
                                                if (a0.LJJIIZI(string2, (String) it3.next(), false)) {
                                                    break;
                                                }
                                            }
                                        }
                                        LIZJ(c840760WyY2, sceneConfig2, uri4);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // X.C0WT3
            public final void LIZ(InterfaceC823460WSa interfaceC823460WSa) {
                if (!ReDexExperimentOpt.getAbTest()) {
                    LIZ$redex$base(interfaceC823460WSa);
                } else {
                    LIZ$redex$opt(interfaceC823460WSa);
                }
            }

            public static void LIZJ(C840760WyY c840760WyY, SceneConfig sceneConfig, Uri uri) {
                Map<Uri, Set<String>> map = c840760WyY.LIZJ;
                Set<String> linkedHashSet = map.get(uri);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                linkedHashSet.add(sceneConfig.name);
                map.put(uri, linkedHashSet);
                if (sceneConfig.isCollectStack) {
                    c840760WyY.LJFF = true;
                } else {
                    c840760WyY.LJ = true;
                }
                c840760WyY.LIZ.LJJIFFI.LIZIZ = true;
            }
        }, true);
        Application application = networkAppInfo.application;
        synchronized (PumbaaEfficientThread.class) {
            try {
                PumbaaEfficientThread.LIZIZ();
                executorC822880WPu = PumbaaEfficientThread.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C822890WPv.LIZIZ(application, executorC822880WPu);
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
        C0WSW.LIZIZ = isOfflineEnv();
        C0WSX c0wsx = new C0WSX() { // from class: X.0Ww0
            @Override // X.C0WSX
            public final void LIZ(int i, String str, String str2, Throwable th2) throws Throwable {
                if (C0WSW.LIZIZ && i == 6 && th2 != null) {
                    NetworkComponent.INSTANCE.reportException(str, str2, th2);
                }
            }

            @Override // X.C0WSX
            public final void LIZIZ(String str, Function0<String> function04, int i, Throwable th2) throws Throwable {
                String strInvoke;
                if (!C0WSW.LIZIZ && i == 6 && th2 != null) {
                    NetworkComponent networkComponent = NetworkComponent.INSTANCE;
                    if (function04 != null) {
                        strInvoke = function04.invoke();
                    } else {
                        strInvoke = null;
                    }
                    networkComponent.reportException(str, strInvoke, th2);
                }
            }
        };
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
        if (!copyOnWriteArrayList2.contains(c0wsx)) {
            copyOnWriteArrayList2.add(c0wsx);
        }
        C840480Wy6 c840480Wy6 = hostRuntime;
        NetworkHostProxy networkHostProxy2 = c840480Wy6.LIZ;
        if (networkHostProxy2 != null) {
            if (networkHostProxy2 == null || (function03 = networkHostProxy2.onePartyDomainList) == null || (setInvoke2 = function03.invoke()) == null || (setLLIIJI = C13LP.LLIIJI(setInvoke2)) == null) {
                setLLIIJI = C08CX.INSTANCE;
            }
            NetworkHostProxy networkHostProxy3 = c840480Wy6.LIZ;
            if (networkHostProxy3 == null || (function02 = networkHostProxy3.thirdPartyDomainList) == null || (setInvoke = function02.invoke()) == null || (setLLIIJI2 = C13LP.LLIIJI(setInvoke)) == null) {
                setLLIIJI2 = C08CX.INSTANCE;
            }
            boolean zLJFF = Intrinsics.LJFF(sceneFlag("is_kids_mode"), Boolean.TRUE);
            NetworkConfig networkConfigNetworkConfigOrNull = networkConfigOrNull();
            if (networkConfigNetworkConfigOrNull == null || (shutdownConfig = networkConfigNetworkConfigOrNull.shutdownConfig) == null) {
                shutdownConfig = new ShutdownConfig(0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, false, false, false, false, false, 32767, null);
            }
            if (!zLJFF) {
                long jNanoTime = System.nanoTime();
                C840490Wy7.LIZIZ(setLLIIJI, setLLIIJI2, shutdownConfig);
                long jNanoTime2 = System.nanoTime();
                C840490Wy7.LJ.set(true);
                INSTANCE.reportPerfUs("initDomainAllowList", (jNanoTime2 - jNanoTime) / 1000.0f);
            }
        }
        C840550WyD c840550WyD = C840550WyD.LIZ;
        NetworkConfig networkConfigNetworkConfigOrNull2 = networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull2 != null) {
            nVar = networkConfigNetworkConfigOrNull2.netWorkTrafficDataTypeConfigs;
        } else {
            nVar = null;
        }
        c840550WyD.getClass();
        C840550WyD.LIZIZ(nVar);
        if (networkInitCallback != null) {
            networkInitCallback.onInitialized();
        }
    }

    public final void onPreInvokeIntercepted(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        InterfaceC2280171EMt<Integer, String, String, Object, Object[], String, C0WZW, Unit> interfaceC2280171EMt;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (interfaceC2280171EMt = networkHostProxy.preInvokeInterceptor) != null) {
            interfaceC2280171EMt.yc(Integer.valueOf(i), str, str2, obj, objArr, str3, c0wzw);
        }
    }

    public final void onPostInvokeIntercepted(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        InterfaceC2280181EMu<Integer, String, String, Object, Object[], Object, C0WZW, Boolean, Unit> interfaceC2280181EMu;
        NetworkHostProxy networkHostProxy = hostRuntime.LIZ;
        if (networkHostProxy != null && (interfaceC2280181EMu = networkHostProxy.postInvokeInterceptor) != null) {
            interfaceC2280181EMu.dN(Integer.valueOf(i), str, str2, obj, objArr, obj2, c0wzw, Boolean.valueOf(z));
        }
    }
}

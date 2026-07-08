package com.bytedance.pns.engine;

import X.AbstractC19994813Le;
import X.C098200Yq;
import X.C0WR6;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C825620Wa8;
import X.C826640Wbm;
import X.InterfaceC825580Wa4;
import Y.ARunnableS18S1100000_13;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pns.engine.ConstPoolConfig;
import com.bytedance.pns.engine.RuleEngineService;
import com.bytedance.pns.engine.internal.Logging;
import com.bytedance.pns.engine.internal.OfflineHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleEngineService {
    public static ConfigProvider config;
    public static boolean enableNameList;
    public static boolean enableValidate;
    public static List<String> extraConfigs;
    public static Reporter reporter;
    public static final RuleEngineService INSTANCE = new RuleEngineService();
    public static volatile AtomicBoolean loaded = new AtomicBoolean(false);

    public static /* synthetic */ void lambda$semisugar$report$lambda$9$0(String str, Params params) {
        C1C7U.LIZ("RuleEngineService@cd5a.report$1L");
        report$lambda$9(str, params);
        C1C7U.LIZIZ("RuleEngineService@cd5a.report$1L");
    }

    private final native InitStatistics nativeActivate(ConfigProvider configProvider, String str, List<String> list, List<String> list2, List<String> list3, boolean z, long j, int i, boolean z2, String str2, List<String> list4);

    private final native int nativeBloomFilterContains(String str, String str2);

    private final native void nativeBloomFilterInsert(String str, String str2);

    private final native long nativeBloomFilterVersion(String str);

    private final native void nativeDestroy();

    private final native long nativeGetConstPoolVersion();

    private final native int nativeGetStrategyVersion();

    private final native int nativeInitBloomFilters(String str);

    private final native boolean nativeIsActivated();

    private final native Boolean nativeIsInNameList(String str, String str2, boolean z);

    private final native int nativeLoadBloomFilter(String str, String str2);

    private final native void nativeLoadConstPoolExtra(List<String> list);

    private final native void nativeUpdateConfig(String str);

    private final native ExecuteResult nativeValidate(String str, String str2, ParamProvider paramProvider, AsyncCallback asyncCallback, List<String> list, List<String> list2, boolean z);

    public static final void destroy() {
        if (!loaded.get()) {
            Logging.d("so has not load success");
            return;
        }
        try {
            INSTANCE.nativeDestroy();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("destroy error", th);
        }
    }

    public static final RealConfigProvider getConfigProvider() {
        final ConfigProvider configProvider = config;
        if (configProvider != null) {
            return new RealConfigProvider() { // from class: X.0Wa7
                @Override // com.bytedance.pns.engine.RealConfigProvider, com.bytedance.pns.engine.ConfigProvider
                public final boolean enableCallbackWithoutStrategy() {
                    return true;
                }

                @Override // com.bytedance.pns.engine.RealConfigProvider, com.bytedance.pns.engine.ConfigProvider
                public final String getBuiltinConfig() {
                    return "";
                }

                @Override // com.bytedance.pns.engine.RealConfigProvider, com.bytedance.pns.engine.ConfigProvider
                public final ConstPoolConfig getConstPoolConfig() {
                    List<String> extraConfig;
                    ArrayList arrayList = new ArrayList();
                    ConstPoolConfig constPoolConfig = this.LIZ.getConstPoolConfig();
                    if (constPoolConfig != null && (extraConfig = constPoolConfig.getExtraConfig()) != null) {
                        arrayList.addAll(extraConfig);
                    }
                    List<String> list = RuleEngineService.extraConfigs;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    ConstPoolConfig constPoolConfig2 = this.LIZ.getConstPoolConfig();
                    return new ConstPoolConfig(constPoolConfig2 != null ? constPoolConfig2.getBaseConfigs() : null, arrayList);
                }

                @Override // com.bytedance.pns.engine.RealConfigProvider, com.bytedance.pns.engine.ConfigProvider
                public final String getStrategyConfig() {
                    return OfflineHelper.isEnableMock() ? OfflineHelper.takeLocalStrategy() : this.LIZ.getStrategyConfig();
                }

                @Override // com.bytedance.pns.engine.RealConfigProvider, com.bytedance.pns.engine.ConfigProvider
                public final List<String> getBuiltinStrategyConfig() {
                    return C13BV.INSTANCE;
                }

                {
                    super(this.LIZ);
                }
            };
        }
        return null;
    }

    public static final long getConstPoolVersion() {
        long jNativeGetConstPoolVersion = -1;
        if (!loaded.get()) {
            return -1L;
        }
        try {
            jNativeGetConstPoolVersion = INSTANCE.nativeGetConstPoolVersion();
            return jNativeGetConstPoolVersion;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("getConstPoolVersion error", th);
            return jNativeGetConstPoolVersion;
        }
    }

    public static final int getStrategyVersion() {
        int iNativeGetStrategyVersion = -1;
        if (!loaded.get()) {
            return -1;
        }
        try {
            iNativeGetStrategyVersion = INSTANCE.nativeGetStrategyVersion();
            return iNativeGetStrategyVersion;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("getStrategyVersion error", th);
            return iNativeGetStrategyVersion;
        }
    }

    public static final boolean isActivated() {
        boolean zNativeIsActivated = false;
        if (!loaded.get()) {
            Logging.d("so has not load success");
            return false;
        }
        try {
            zNativeIsActivated = INSTANCE.nativeIsActivated();
            return zNativeIsActivated;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("isActivated error", th);
            return zNativeIsActivated;
        }
    }

    public static final InitStatistics activate(ConfigProvider configProvider) {
        boolean z;
        String strategyConfig;
        long jNanoTime = System.nanoTime();
        List<String> baseConfigs = null;
        if (configProvider == null) {
            return null;
        }
        boolean zEnableLog = configProvider.enableLog();
        Logging.setEnable(zEnableLog);
        if (!configProvider.enableActivate()) {
            Logging.d("activate disable");
            return null;
        }
        C825620Wa8.LIZ.getClass();
        if (C825620Wa8.LIZJ == null) {
            C825620Wa8.LIZJ = new BPEAHandler(C786410Ut5.W2(C825620Wa8.LIZIZ));
        }
        RuleEngineService ruleEngineService = INSTANCE;
        ruleEngineService.loadSo(zEnableLog);
        if (!loaded.get()) {
            Logging.d("so has not load success");
            return null;
        }
        if (isActivated()) {
            Logging.d("service has been activated");
            return null;
        }
        config = configProvider;
        double dReportSampleRate = configProvider.reportSampleRate();
        if (dReportSampleRate >= 1.0d || (dReportSampleRate > 0.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= dReportSampleRate)) {
            z = true;
        } else {
            z = false;
        }
        Context context = configProvider.getContext();
        if (context != null) {
            OfflineHelper.INSTANCE.init(context);
        }
        enableValidate = configProvider.enableValidateAbility();
        enableNameList = configProvider.enableNameListAbility();
        if (OfflineHelper.isEnableMock()) {
            strategyConfig = OfflineHelper.takeLocalStrategy();
        } else {
            strategyConfig = configProvider.getStrategyConfig();
        }
        if (strategyConfig != null && strategyConfig.length() != 0) {
            ConstPoolConfig constPoolConfig = configProvider.getConstPoolConfig();
            if (constPoolConfig != null) {
                baseConfigs = constPoolConfig.getBaseConfigs();
            }
            InitStatistics initStatisticsNativeActivate = ruleEngineService.nativeActivate(configProvider, strategyConfig, baseConfigs, configProvider.getStrategyAllowList(), configProvider.getStrategyBlockList(), zEnableLog, configProvider.capacity(), configProvider.tc(), configProvider.enableCallbackWithoutStrategy(), configProvider.getBuiltinConfig(), configProvider.getBuiltinStrategyConfig());
            if (z && initStatisticsNativeActivate != null) {
                initStatisticsNativeActivate.setTotalCost((System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (zEnableLog) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("activate cost time ");
                sbLIZ.append((System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                sbLIZ.append(" μs");
                Logging.d(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (z) {
                ruleEngineService.report("pns_decision_init_stats", initStatisticsNativeActivate);
            }
            return initStatisticsNativeActivate;
        }
        Logging.d("strategy config is null");
        return null;
    }

    public static final void loadConstPoolExtra(List<String> list) {
        if (!loaded.get()) {
            return;
        }
        extraConfigs = list;
        try {
            INSTANCE.nativeLoadConstPoolExtra(list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("loadConstPoolExtra error", th);
        }
    }

    public static final void registerReporter(Reporter reporter2) {
        reporter = reporter2;
    }

    private final void reportValidate(DecisionStatistics decisionStatistics) {
        report("pns_decision_execute_result", decisionStatistics);
    }

    public static final void updateConfig(ConfigProvider configProvider) {
        String strategyConfig;
        RuleEngineService ruleEngineService = INSTANCE;
        if (configProvider != null) {
            strategyConfig = configProvider.getStrategyConfig();
        } else {
            strategyConfig = null;
        }
        ruleEngineService.nativeUpdateConfig(strategyConfig);
    }

    public final long bloomFilterVersion(String str) {
        if (!loaded.get()) {
            return -1L;
        }
        return nativeBloomFilterVersion(str);
    }

    public final int loadBloomFilters(String str) {
        if (!loaded.get()) {
            return -1;
        }
        return nativeInitBloomFilters(str);
    }

    public final void loadSo(boolean z) {
        long jNanoTime;
        if (z) {
            jNanoTime = System.nanoTime();
        } else {
            jNanoTime = 0;
        }
        loaded.set(C826640Wbm.LIZ("pns_ttmachine_adapter"));
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load so cost ");
            sbLIZ.append((System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            sbLIZ.append(" μs");
            Logging.d(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final Boolean isInNameList(String str, String str2) {
        long jNanoTime;
        ConfigProvider configProvider = config;
        if (configProvider != null && configProvider.enableLog()) {
            jNanoTime = System.nanoTime();
        } else {
            jNanoTime = 0;
        }
        Boolean boolIsInNameList = isInNameList(str, str2, false);
        ConfigProvider configProvider2 = config;
        if (configProvider2 != null && configProvider2.enableLog()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("name list ");
            sbLIZ.append(str2);
            sbLIZ.append(" query cost time ");
            sbLIZ.append((System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            sbLIZ.append(" μs");
            Logging.d(C2188811AlT.LIZIZ(sbLIZ));
        }
        return boolIsInNameList;
    }

    private final void logcatExecuteResult(ExecuteResult executeResult, InterfaceC825580Wa4 interfaceC825580Wa4) {
        List<StrategyResult> list;
        if (executeResult != null && (list = executeResult.results) != null) {
            for (StrategyResult strategyResult : list) {
                List<Action> list2 = strategyResult.actions;
                if (list2 != null && !list2.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("triggerId ");
                    sbLIZ.append(interfaceC825580Wa4.triggerId());
                    sbLIZ.append(" triggerBiz ");
                    sbLIZ.append(interfaceC825580Wa4.triggerBiz());
                    sbLIZ.append(" strategy ");
                    sbLIZ.append(strategyResult.strategyName);
                    sbLIZ.append(" result hit's actions ");
                    sbLIZ.append(strategyResult.getActionNames());
                    Logging.d(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    private final void report(String str, Params params) {
        Object c098200Yq;
        if (str != null && params != null) {
            C825620Wa8 c825620Wa8 = C825620Wa8.LIZ;
            ARunnableS18S1100000_13 aRunnableS18S1100000_13 = new ARunnableS18S1100000_13(params, str, 28);
            c825620Wa8.getClass();
            try {
                BPEAHandler bPEAHandler = C825620Wa8.LIZJ;
                if (bPEAHandler != null) {
                    c098200Yq = Boolean.valueOf(C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS18S1100000_13));
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                Logging.e("post task fail,", thM5exceptionOrNullimpl);
            }
        }
    }

    public static final void report$lambda$9(String str, Params params) {
        Reporter reporter2 = reporter;
        if (reporter2 != null) {
            reporter2.report(str, params);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.pns.engine.ExecuteResult validate(final X.InterfaceC825580Wa4 r21, final com.bytedance.pns.engine.AsyncCallback r22) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pns.engine.RuleEngineService.validate(X.0Wa4, com.bytedance.pns.engine.AsyncCallback):com.bytedance.pns.engine.ExecuteResult");
    }

    public static final Object validate$lambda$4(InterfaceC825580Wa4 interfaceC825580Wa4, String str) {
        C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query(str);
        if (c0wr6Query == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ParamProvider query key ");
            sbLIZ.append(str);
            sbLIZ.append(" is null ");
            Logging.d(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return c0wr6Query.LIZ();
    }

    public final int bloomFilterContains(String str, String str2) {
        if (!loaded.get()) {
            return -1;
        }
        return nativeBloomFilterContains(str, str2);
    }

    public final void bloomFilterInsert(String str, String str2) {
        if (!loaded.get()) {
            return;
        }
        nativeBloomFilterInsert(str, str2);
    }

    public final int loadBloomFilter(String str, String str2) {
        if (!loaded.get()) {
            return -1;
        }
        return nativeLoadBloomFilter(str, str2);
    }

    public static final Boolean isInNameList(String str, String str2, boolean z) {
        boolean z2;
        Boolean boolNativeIsInNameList = null;
        if (!enableNameList || !loaded.get()) {
            return null;
        }
        boolean z3 = false;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            if (str2 == null || str2.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                try {
                    boolNativeIsInNameList = INSTANCE.nativeIsInNameList(str, str2, z);
                    return boolNativeIsInNameList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Logging.e("isInNameList error", th);
                }
            }
        }
        return boolNativeIsInNameList;
    }

    public static final void validate$lambda$6(boolean z, AsyncCallback asyncCallback, boolean z2, InterfaceC825580Wa4 interfaceC825580Wa4, ExecuteResult executeResult) {
        DecisionStatistics decisionStatistics;
        DecisionStatistics decisionStatistics2;
        if (z && executeResult != null && (decisionStatistics2 = executeResult.statistics) != null) {
            decisionStatistics2.setTriggerBiz(interfaceC825580Wa4.triggerBiz());
            decisionStatistics2.setStrategyStats(executeResult.results);
        }
        if (asyncCallback != null) {
            asyncCallback.onCall(executeResult);
        }
        if (z2) {
            INSTANCE.logcatExecuteResult(executeResult, interfaceC825580Wa4);
        }
        if (z) {
            RuleEngineService ruleEngineService = INSTANCE;
            if (executeResult != null) {
                decisionStatistics = executeResult.statistics;
            } else {
                decisionStatistics = null;
            }
            ruleEngineService.reportValidate(decisionStatistics);
        }
    }
}

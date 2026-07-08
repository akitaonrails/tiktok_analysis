package com.ss.android.ugc.aweme.services.performance;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public interface ICreativePerformanceMonitorService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void destroyMonitors(String str);

    String getBatteryPercent();

    int getBatteryState();

    String getBatteryTemperature();

    Map<String, Double> getCpuRate();

    String getCpuUsedRate();

    void getJatoBoostAbilityForEditPage();

    void getJatoBoostAbilityForPublishPage();

    void getJatoBoostAbilityForShootPage();

    Map<String, Long> getMemory();

    String getMemoryUsedRate();

    void startBlockMonitor(String str, int i, long j, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, long j, LagDataCallback lagDataCallback, Function0<? extends HashMap<String, String>> function0);

    void startJatoBoostAbility(long j);

    void stopBlockMonitor(String str);

    void stopFpsMonitor(String str);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startFpsMonitor$default(ICreativePerformanceMonitorService iCreativePerformanceMonitorService, String str, long j, LagDataCallback lagDataCallback, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    function0 = null;
                }
                iCreativePerformanceMonitorService.startFpsMonitor(str, j, lagDataCallback, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFpsMonitor");
        }
    }
}

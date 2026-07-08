package com.bytedance.pumbaa.base2.performance;

import X.C01GW;
import X.C09CT;
import X.C0WS5;
import X.C0WSB;
import X.C0WSJ;
import X.C0WSM;
import X.C0WSN;
import X.C1247904uT;
import X.C1248004uU;
import X.C308480C7i;
import X.C452501pT;
import Y.ARunnableS92S0000000_13;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PumbaaPerformanceTrackManager {
    public static PumbaaPerformanceTrackConfig LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static Function0<Boolean> LJ;
    public static Function0<Long> LJFF;
    public static String LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C0WSM());
    public static final Map<String, C0WSB> LJIIJJI = Collections.synchronizedMap(new LinkedHashMap());

    public static boolean LJI() {
        return LIZIZ && LIZLLL;
    }

    public static boolean LJII() {
        PerfSlaConfig perfSlaConfig;
        PerfSlaConfig perfSlaConfig2 = C1247904uT.LIZ.init;
        return (perfSlaConfig2 == null || !perfSlaConfig2.enable || (perfSlaConfig = C1247904uT.LIZ.init) == null || Long.valueOf(perfSlaConfig.thresholdMs) == null) ? false : true;
    }

    public static C0WSB LIZIZ(String str) {
        PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig;
        PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig2;
        ExecutionPerfConfig executionPerfConfig;
        Float f;
        ExecutionPerfConfig executionPerfConfig2;
        Map<String, Float> map;
        if (!LIZIZ || ((((pumbaaPerformanceTrackConfig = LIZ) == null || (executionPerfConfig2 = pumbaaPerformanceTrackConfig.executionPerfSample) == null || (map = executionPerfConfig2.apiSampleRate) == null || (f = map.get(str)) == null) && ((pumbaaPerformanceTrackConfig2 = LIZ) == null || (executionPerfConfig = pumbaaPerformanceTrackConfig2.executionPerfSample) == null || (f = executionPerfConfig.defaultSampleRate) == null)) || !C0WSN.LIZ(f.floatValue()))) {
            return null;
        }
        return new C0WSB("execution_perf", str, 4);
    }

    public static C0WSB LIZJ(String str) {
        boolean z;
        PerfSlaConfig perfSlaConfig;
        PerfSlaConfig perfSlaConfig2 = C1247904uT.LIZ.controlExecution;
        if (perfSlaConfig2 != null && perfSlaConfig2.enable) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (perfSlaConfig = C1247904uT.LIZ.controlExecution) == null || Long.valueOf(perfSlaConfig.thresholdMs) == null) {
            return null;
        }
        C0WSB c0wsb = new C0WSB("execution_perf", str, 4);
        c0wsb.LJIIJJI = true;
        return c0wsb;
    }

    public static C0WSB LIZLLL(boolean z) {
        String str;
        boolean z2;
        C0WSB c0wsb;
        try {
            if (!LJIIIZ.get()) {
                return null;
            }
            String str2 = "init_perf_lite";
            if (z) {
                str = "init_perf_lite";
            } else {
                str = "init_perf_old";
            }
            Map<String, C0WSB> map = LJIIJJI;
            map.containsKey(str);
            if (!LIZIZ || !LIZJ) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (LJII()) {
                    if (!z) {
                        str2 = "init_perf_old";
                    }
                    c0wsb = new C0WSB(str2, null, 6);
                    c0wsb.LJIIJJI = true;
                } else {
                    c0wsb = null;
                }
            } else {
                c0wsb = new C0WSB(str, null, 6);
            }
            map.put(str, c0wsb);
            return c0wsb;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("createInitTrackerFromOutside_error", th);
            return null;
        }
    }

    public static Pair LJ(boolean z) {
        boolean z2;
        try {
            if (!LIZIZ || !LIZJ) {
                z2 = false;
            } else {
                z2 = true;
            }
            String str = "init_perf_lite";
            if (z2) {
                if (!z) {
                    str = "init_perf_old";
                }
                Map<String, C0WSB> map = LJIIJJI;
                if (map.containsKey(str)) {
                    return new Pair(map.get(str), Boolean.TRUE);
                }
                return new Pair(new C0WSB(str, null, 6), Boolean.FALSE);
            }
            if (!LJII()) {
                return null;
            }
            if (!z) {
                str = "init_perf_old";
            }
            Map<String, C0WSB> map2 = LJIIJJI;
            if (map2.containsKey(str)) {
                return new Pair(map2.get(str), Boolean.TRUE);
            }
            C0WSB c0wsb = new C0WSB(str, null, 6);
            c0wsb.LJIIJJI = true;
            return new Pair(c0wsb, Boolean.FALSE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("getOrCreateInitTrackerFromInside_error", th);
            return null;
        }
    }

    public static final class ExecutionPerfConfig {

        @C09CT("api_sample_rate")
        public final Map<String, Float> apiSampleRate;

        @C09CT("default_sample_rate")
        public final Float defaultSampleRate;

        public ExecutionPerfConfig(Float f, Map<String, Float> map) {
            this.defaultSampleRate = f;
            this.apiSampleRate = map;
        }
    }

    public static final class FrequencyConfig {

        @C09CT("frequency_sample_rate")
        public final Float frequencySampleRate;

        @C09CT("report_interval")
        public final Long reportInterval;

        public FrequencyConfig(Float f, Long l) {
            this.frequencySampleRate = f;
            this.reportInterval = l;
        }
    }

    public static void LJIIIIZZ(String str, String str2) {
        if (LJI()) {
            if (str == null) {
                str = "";
            }
            C0WSJ.LIZ(str, Collections.singletonList(str2));
        }
    }

    public static void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Long lInvoke;
        Function0<Long> function0 = LJFF;
        Boolean boolInvoke = null;
        if (function0 != null) {
            lInvoke = function0.invoke();
        } else {
            lInvoke = null;
        }
        jSONObject.put("app_uptime", lInvoke);
        jSONObject2.put("event_type", str);
        jSONObject2.put("pumbaa_version", "6.22.0.1-bugfix");
        Function0<Boolean> function02 = LJ;
        if (function02 != null) {
            boolInvoke = function02.invoke();
        }
        jSONObject2.put("is_first_frame_show", boolInvoke);
        jSONObject2.put("tag", LJI);
    }

    public static final class PumbaaPerformanceTrackConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("execution_perf_sample")
        public final ExecutionPerfConfig executionPerfSample;

        @C09CT("frequency_config")
        public final FrequencyConfig frequency;

        @C09CT("init_perf_sample_rate")
        public final Float initPerfSampleRate;

        @C09CT("use_cpu_time")
        public final boolean useCpuTime;

        public PumbaaPerformanceTrackConfig() {
            this(false, null, null, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PumbaaPerformanceTrackConfig)) {
                return false;
            }
            PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig = (PumbaaPerformanceTrackConfig) obj;
            return this.enable == pumbaaPerformanceTrackConfig.enable && Intrinsics.LJFF(this.frequency, pumbaaPerformanceTrackConfig.frequency) && Intrinsics.LJFF(this.initPerfSampleRate, pumbaaPerformanceTrackConfig.initPerfSampleRate) && Intrinsics.LJFF(this.executionPerfSample, pumbaaPerformanceTrackConfig.executionPerfSample) && this.useCpuTime == pumbaaPerformanceTrackConfig.useCpuTime;
        }

        public PumbaaPerformanceTrackConfig(boolean z, FrequencyConfig frequencyConfig, Float f, ExecutionPerfConfig executionPerfConfig, boolean z2) {
            this.enable = z;
            this.frequency = frequencyConfig;
            this.initPerfSampleRate = f;
            this.executionPerfSample = executionPerfConfig;
            this.useCpuTime = z2;
        }
    }

    public static void LJFF(PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig, String str, Boolean bool, Function0 function0, Function0 function02) {
        boolean zBooleanValue;
        boolean z;
        boolean z2;
        long jLongValue;
        FrequencyConfig frequencyConfig;
        Long l;
        boolean zLIZ;
        FrequencyConfig frequencyConfig2;
        Float f;
        Float f2;
        try {
            if (LJIIIZ.get()) {
                return;
            }
            PerfSlaConfigs perfSlaConfigs = C1248004uU.LIZ;
            PerfSlaConfigs perfSlaConfigs2 = (PerfSlaConfigs) C308480C7i.LIZLLL(PerfSlaConfigs.class, "pns_pumbaa_perf_sla", perfSlaConfigs);
            if (perfSlaConfigs2 != null) {
                perfSlaConfigs = perfSlaConfigs2;
            }
            C1247904uT.LIZ = perfSlaConfigs;
            LIZ = pumbaaPerformanceTrackConfig;
            LJFF = function02;
            LJ = function0;
            LJI = str;
            boolean zLIZ2 = false;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            LJII = zBooleanValue;
            if (pumbaaPerformanceTrackConfig == null) {
                z = false;
            } else {
                z = pumbaaPerformanceTrackConfig.enable;
            }
            LIZIZ = z;
            if (pumbaaPerformanceTrackConfig == null) {
                z2 = false;
            } else {
                z2 = pumbaaPerformanceTrackConfig.useCpuTime;
            }
            LJIIIIZZ = z2;
            if (z) {
                PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig2 = LIZ;
                if (pumbaaPerformanceTrackConfig2 != null && (f2 = pumbaaPerformanceTrackConfig2.initPerfSampleRate) != null) {
                    zLIZ = C0WSN.LIZ(f2.floatValue());
                } else {
                    zLIZ = false;
                }
                LIZJ = zLIZ;
                PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig3 = LIZ;
                if (pumbaaPerformanceTrackConfig3 != null && (frequencyConfig2 = pumbaaPerformanceTrackConfig3.frequency) != null && (f = frequencyConfig2.frequencySampleRate) != null) {
                    zLIZ2 = C0WSN.LIZ(f.floatValue());
                }
                LIZLLL = zLIZ2;
            } else {
                LIZJ = false;
                LIZLLL = false;
            }
            boolean z3 = LIZLLL;
            PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfig4 = LIZ;
            if (pumbaaPerformanceTrackConfig4 != null && (frequencyConfig = pumbaaPerformanceTrackConfig4.frequency) != null && (l = frequencyConfig.reportInterval) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 60;
            }
            try {
                ScheduledFuture<?> scheduledFuture = C0WSJ.LIZJ;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    C0WSJ.LIZJ = null;
                }
                if (z3) {
                    C0WSJ.LIZJ = ((ScheduledExecutorService) LJIIJ.getValue()).scheduleWithFixedDelay(new ARunnableS92S0000000_13(47), jLongValue, jLongValue, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0WS5.LIZIZ("InvokeCountRecorder_init_error", th);
            }
            LJIIIZ.set(true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0WS5.LIZIZ("perf_init_error", th2);
        }
    }
}

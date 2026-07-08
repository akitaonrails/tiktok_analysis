package com.bytedance.memrelief.pressure;

import X.C01GW;
import X.C08M9;
import X.C09Q3;
import X.C13LP;
import X.C1591240rVi;
import X.C1591290rVn;
import X.C1603770rpv;
import X.C1603820rq0;
import X.C1C7U;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1603810rpz;
import Y.ARunnableS124S0100000_24;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public class EwmaMemoryPressure {
    public static final C1603820rq0 Companion = new Object() { // from class: X.0rq0
    };
    public static final C01GW<ScheduledExecutorService> scheduledExecutor$delegate = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(34));
    public final Function0<Double> calculator;
    public C1591240rVi config;
    public final C1591290rVn debounceConfig;
    public boolean debug;
    public int dwellCount;
    public double extremeThreshold;
    public int freezeCount;
    public double highThreshold;
    public double hysteresisAbs;
    public final boolean isJavaHeap;
    public double lowThreshold;
    public double mediumThreshold;
    public final String name;
    public boolean newEwma;
    public C09Q3 pendingLevel;
    public ScheduledFuture<?> scheduledFuture;
    public int warmupRemaining;
    public volatile C09Q3 currentLevel = C09Q3.UNKNOWN;
    public final LinkedList<Double> memoryWindow = new LinkedList<>();
    public double ewmaState = Double.NaN;
    public final AtomicBoolean isInitialized = new AtomicBoolean(false);
    public final AtomicBoolean isMonitoring = new AtomicBoolean(false);
    public final C1603770rpv memoryPressureCallback = new C1603770rpv();

    public static /* synthetic */ void lambda$semisugar$start$lambda$0$0(EwmaMemoryPressure ewmaMemoryPressure) {
        C1C7U.LIZ("EwmaMemoryPressure@8cd0.start$1L");
        start$lambda$0(ewmaMemoryPressure);
        C1C7U.LIZIZ("EwmaMemoryPressure@8cd0.start$1L");
    }

    public final void start() {
        if (!this.isInitialized.get() || !this.isMonitoring.compareAndSet(false, true)) {
            logw("start fail");
            return;
        }
        logi("start period calculate");
        Companion.getClass();
        ScheduledExecutorService value = scheduledExecutor$delegate.getValue();
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 146);
        C1591240rVi c1591240rVi = this.config;
        long j = (c1591240rVi == null ? null : c1591240rVi).LIZ;
        if (c1591240rVi == null) {
            c1591240rVi = null;
        }
        this.scheduledFuture = value.scheduleWithFixedDelay(aRunnableS124S0100000_24, j, c1591240rVi.LIZ, TimeUnit.MILLISECONDS);
    }

    public final void stop() {
        if (this.isInitialized.get()) {
            if (this.isMonitoring.compareAndSet(true, false)) {
                logi("stop period calculate");
                ScheduledFuture<?> scheduledFuture = this.scheduledFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    logi("cancelled scheduled task");
                    this.scheduledFuture = null;
                }
                logi("cleared memory window");
                this.currentLevel = C09Q3.UNKNOWN;
                this.freezeCount = 0;
                this.pendingLevel = null;
                this.dwellCount = 0;
                this.memoryWindow.clear();
                this.ewmaState = Double.NaN;
                C1591240rVi c1591240rVi = this.config;
                this.warmupRemaining = c1591240rVi != null ? c1591240rVi.LIZIZ : 0;
            }
        }
    }

    public final Function0<Double> getCalculator() {
        return this.calculator;
    }

    public final C09Q3 getCurrentLevel() {
        return this.currentLevel;
    }

    public final C1591290rVn getDebounceConfig() {
        return this.debounceConfig;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final double getExtremeThreshold() {
        return this.extremeThreshold;
    }

    public final double getHighThreshold() {
        return this.highThreshold;
    }

    public final double getLowThreshold() {
        return this.lowThreshold;
    }

    public final double getMediumThreshold() {
        return this.mediumThreshold;
    }

    public final C1603770rpv getMemoryPressureCallback() {
        return this.memoryPressureCallback;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNewEwma() {
        return this.newEwma;
    }

    public final boolean isJavaHeap() {
        return this.isJavaHeap;
    }

    private final int logd(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(this.name);
        sbLIZ.append(' ');
        if (this.isJavaHeap) {
            str2 = "Java";
        } else {
            str2 = "Native";
        }
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        return Log.d("MemRelief#Pressure", C2188811AlT.LIZIZ(sbLIZ));
    }

    private final int logi(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(this.name);
        sbLIZ.append(' ');
        if (this.isJavaHeap) {
            str2 = "Java";
        } else {
            str2 = "Native";
        }
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        return Log.i("MemRelief#Pressure", C2188811AlT.LIZIZ(sbLIZ));
    }

    private final int logw(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(this.name);
        sbLIZ.append(' ');
        if (this.isJavaHeap) {
            str2 = "Java";
        } else {
            str2 = "Native";
        }
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        return Log.w("MemRelief#Pressure", C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void onTickLegacyEwma(double d) {
        C1591240rVi c1591240rVi;
        C1591240rVi c1591240rVi2;
        int size = this.memoryWindow.size();
        C1591240rVi c1591240rVi3 = this.config;
        C1591240rVi c1591240rVi4 = null;
        if (c1591240rVi3 == null) {
            c1591240rVi3 = null;
        }
        if (size >= c1591240rVi3.LIZIZ) {
            this.memoryWindow.pollFirst();
        }
        this.memoryWindow.offerLast(Double.valueOf(d));
        int size2 = this.memoryWindow.size();
        C1591240rVi c1591240rVi5 = this.config;
        if (c1591240rVi5 == null) {
            c1591240rVi5 = null;
        }
        if (size2 < c1591240rVi5.LIZIZ) {
            if (this.debug) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skip ewma as too short window size:");
                sbLIZ.append(this.memoryWindow.size());
                logd(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        int i = this.freezeCount;
        if (i > 0) {
            this.freezeCount = i - 1;
            if (this.debug) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("skip ewma as remaining freezeCount:");
                sbLIZ2.append(this.freezeCount);
                logd(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        double dDoubleValue = ((Number) C13LP.LJJJJZI(this.memoryWindow)).doubleValue();
        int size3 = this.memoryWindow.size();
        for (int i2 = 1; i2 < size3; i2++) {
            double dDoubleValue2 = this.memoryWindow.get(i2).doubleValue();
            C1591240rVi c1591240rVi6 = this.config;
            if (c1591240rVi6 == null) {
                c1591240rVi2 = null;
            } else {
                c1591240rVi2 = c1591240rVi6;
            }
            double d2 = c1591240rVi2.LIZJ * dDoubleValue2;
            double d3 = 1;
            if (c1591240rVi6 == null) {
                c1591240rVi6 = null;
            }
            dDoubleValue = d2 + ((d3 - c1591240rVi6.LIZJ) * dDoubleValue);
        }
        C1591240rVi c1591240rVi7 = this.config;
        if (c1591240rVi7 == null) {
            c1591240rVi = null;
        } else {
            c1591240rVi = c1591240rVi7;
        }
        double d4 = dDoubleValue * c1591240rVi.LIZLLL;
        double d5 = 1;
        if (c1591240rVi7 != null) {
            c1591240rVi4 = c1591240rVi7;
        }
        double d6 = d4 + ((d5 - c1591240rVi4.LIZLLL) * d);
        maybeCallback(d6, nextLevelWithHysteresis(d6, this.currentLevel));
    }

    private final void onTickStandardEwma(double d) {
        C1591240rVi c1591240rVi;
        double d2;
        if (Double.isNaN(this.ewmaState)) {
            d2 = d;
        } else {
            C1591240rVi c1591240rVi2 = this.config;
            if (c1591240rVi2 == null) {
                c1591240rVi = null;
            } else {
                c1591240rVi = c1591240rVi2;
            }
            double d3 = c1591240rVi.LIZJ * d;
            double d4 = 1;
            if (c1591240rVi2 == null) {
                c1591240rVi2 = null;
            }
            d2 = d3 + ((d4 - c1591240rVi2.LIZJ) * this.ewmaState);
        }
        this.ewmaState = d2;
        int i = this.warmupRemaining;
        if (i > 0) {
            this.warmupRemaining = i - 1;
            if (this.debug) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skip new ewma as warmup remaining:");
                sbLIZ.append(this.warmupRemaining);
                sbLIZ.append(" ewmaState:");
                sbLIZ.append(this.ewmaState);
                sbLIZ.append(" raw:");
                sbLIZ.append(d);
                logd(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        int i2 = this.freezeCount;
        if (i2 > 0) {
            this.freezeCount = i2 - 1;
            if (this.debug) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("skip new ewma as remaining freezeCount:");
                sbLIZ2.append(this.freezeCount);
                logd(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        maybeCallback(this.ewmaState, nextLevelWithHysteresis(d2, this.currentLevel));
    }

    private final void putToWindow(double d) {
        if (this.newEwma) {
            onTickStandardEwma(d);
        } else {
            onTickLegacyEwma(d);
        }
    }

    public static final void start$lambda$0(EwmaMemoryPressure ewmaMemoryPressure) {
        ewmaMemoryPressure.putToWindow(ewmaMemoryPressure.calculator.invoke().doubleValue());
    }

    public final C09Q3 computeLoadLevel(double d) {
        if (d >= this.extremeThreshold) {
            return C09Q3.EXTREME;
        }
        if (d >= this.highThreshold) {
            return C09Q3.HIGH;
        }
        if (d >= this.mediumThreshold) {
            return C09Q3.MEDIUM;
        }
        if (d >= this.lowThreshold) {
            return C09Q3.LOW;
        }
        return C09Q3.UNKNOWN;
    }

    public final void init(C1591240rVi c1591240rVi) {
        if (this.isInitialized.compareAndSet(false, true)) {
            this.config = c1591240rVi;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init isJavaHeap:");
            sbLIZ.append(this.isJavaHeap);
            sbLIZ.append(" newEwma:");
            sbLIZ.append(this.newEwma);
            sbLIZ.append(" debounce:");
            sbLIZ.append(this.debounceConfig);
            sbLIZ.append(" config:");
            sbLIZ.append(c1591240rVi);
            logi(C2188811AlT.LIZIZ(sbLIZ));
            if (c1591240rVi.LIZ > 0 && c1591240rVi.LIZIZ > 0) {
                double d = c1591240rVi.LIZJ;
                if (d >= 0.0d && d <= 1.0d) {
                    double d2 = c1591240rVi.LIZLLL;
                    if (d2 >= 0.0d && d2 <= 1.0d) {
                        initThreshold(c1591240rVi.LJ, c1591240rVi.LJFF);
                        C1591290rVn c1591290rVn = this.debounceConfig;
                        if (c1591290rVn.LIZ <= 0) {
                            c1591290rVn.LIZ = c1591240rVi.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fix freezeSize:");
                            sbLIZ2.append(this.debounceConfig.LIZ);
                            logi(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        C1591290rVn c1591290rVn2 = this.debounceConfig;
                        if (c1591290rVn2.LIZJ < 0) {
                            c1591290rVn2.LIZJ = 0;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("fix dwellSize:");
                            sbLIZ3.append(this.debounceConfig.LIZJ);
                            logi(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        C1591290rVn c1591290rVn3 = this.debounceConfig;
                        if (c1591290rVn3.LIZIZ <= 0.0d) {
                            c1591290rVn3.LIZIZ = 0.05d;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("fix hysteresisRatio:");
                            sbLIZ4.append(this.debounceConfig.LIZIZ);
                            logi(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        this.hysteresisAbs = C08M9.LIZIZ((this.extremeThreshold - this.lowThreshold) * this.debounceConfig.LIZIZ, 4);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("hysteresisAbs:");
                        sbLIZ5.append(this.hysteresisAbs);
                        sbLIZ5.append(" (ratio=");
                        sbLIZ5.append(this.debounceConfig.LIZIZ);
                        sbLIZ5.append(')');
                        logi(C2188811AlT.LIZIZ(sbLIZ5));
                        if (this.newEwma) {
                            this.warmupRemaining = c1591240rVi.LIZIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("newEwma warmup:");
                            sbLIZ6.append(this.warmupRemaining);
                            logi(C2188811AlT.LIZIZ(sbLIZ6));
                            return;
                        }
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("init fail, config error");
        }
    }

    public final void register(InterfaceC1603810rpz interfaceC1603810rpz) {
        C1603770rpv c1603770rpv = this.memoryPressureCallback;
        synchronized (c1603770rpv.LIZ) {
            try {
                ((ArrayList) c1603770rpv.LIZIZ).add(interfaceC1603810rpz);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C09Q3 c09q3 = this.currentLevel;
        if (c09q3 == C09Q3.UNKNOWN) {
            return;
        }
        try {
            if (this.isJavaHeap) {
                interfaceC1603810rpz.LIZIZ(c09q3);
            } else {
                interfaceC1603810rpz.LIZ(c09q3);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            logw("replay snapshot to new listener failed");
        }
    }

    public final void setCurrentLevel(C09Q3 c09q3) {
        this.currentLevel = c09q3;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setExtremeThreshold(double d) {
        this.extremeThreshold = d;
    }

    public final void setHighThreshold(double d) {
        this.highThreshold = d;
    }

    public final void setLowThreshold(double d) {
        this.lowThreshold = d;
    }

    public final void setMediumThreshold(double d) {
        this.mediumThreshold = d;
    }

    public final void setNewEwma(boolean z) {
        this.newEwma = z;
    }

    public final void unregister(InterfaceC1603810rpz interfaceC1603810rpz) {
        C1603770rpv c1603770rpv = this.memoryPressureCallback;
        synchronized (c1603770rpv.LIZ) {
            try {
                ((ArrayList) c1603770rpv.LIZIZ).remove(interfaceC1603810rpz);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private final void initThreshold(double d, double d2) {
        if (d > 0.0d && d2 > 0.0d && d < d2) {
            this.lowThreshold = C08M9.LIZIZ(d, 2);
            this.extremeThreshold = C08M9.LIZIZ(d2, 2);
            double d3 = d2 - d;
            double d4 = 3;
            this.mediumThreshold = C08M9.LIZIZ((d3 / d4) + d, 2);
            this.highThreshold = C08M9.LIZIZ(d + ((((double) 2) * d3) / d4), 2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("thresholds low:");
            sbLIZ.append(this.lowThreshold);
            sbLIZ.append(", med:");
            sbLIZ.append(this.mediumThreshold);
            sbLIZ.append(", high:");
            sbLIZ.append(this.highThreshold);
            sbLIZ.append(", extreme:");
            sbLIZ.append(this.extremeThreshold);
            logi(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        throw new IllegalArgumentException("init fail, low >= extreme");
    }

    private final C09Q3 nextLevelWithHysteresis(double d, C09Q3 c09q3) {
        double[] dArr = {Double.NEGATIVE_INFINITY, this.lowThreshold, this.mediumThreshold, this.highThreshold, this.extremeThreshold};
        C09Q3[] c09q3ArrValues = C09Q3.values();
        int iOrdinal = c09q3.ordinal();
        while (true) {
            int i = iOrdinal + 1;
            if (i >= 5 || d < dArr[i] + this.hysteresisAbs) {
                break;
            }
            iOrdinal = i;
        }
        if (iOrdinal > c09q3.ordinal()) {
            return c09q3ArrValues[iOrdinal];
        }
        while (iOrdinal > 0 && d < dArr[iOrdinal] - this.hysteresisAbs) {
            iOrdinal--;
        }
        return c09q3ArrValues[iOrdinal];
    }

    public final void maybeCallback(double d, C09Q3 c09q3) {
        if (this.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ewma value:");
            sbLIZ.append(d);
            sbLIZ.append(" newLevel:");
            sbLIZ.append(c09q3);
            sbLIZ.append(" lastLevel:");
            sbLIZ.append(this.currentLevel);
            logd(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c09q3 == this.currentLevel) {
            if (this.pendingLevel != null) {
                this.pendingLevel = null;
                this.dwellCount = 0;
                return;
            }
            return;
        }
        C1591290rVn c1591290rVn = this.debounceConfig;
        int i = c1591290rVn.LIZJ;
        if (i > 0) {
            if (c09q3 != this.pendingLevel) {
                this.pendingLevel = c09q3;
                this.dwellCount = i;
            }
            int i2 = this.dwellCount;
            if (i2 > 0) {
                this.dwellCount = i2 - 1;
                if (this.debug) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dwell pending ");
                    sbLIZ2.append(this.currentLevel);
                    sbLIZ2.append("->");
                    sbLIZ2.append(c09q3);
                    sbLIZ2.append(" remaining:");
                    sbLIZ2.append(this.dwellCount);
                    logd(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            this.pendingLevel = null;
        }
        int i3 = c1591290rVn.LIZ;
        if (i3 > 0) {
            this.freezeCount = i3;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("memory level change from ");
        sbLIZ3.append(this.currentLevel);
        sbLIZ3.append(" to ");
        sbLIZ3.append(c09q3);
        sbLIZ3.append(" value:");
        sbLIZ3.append(d);
        logw(C2188811AlT.LIZIZ(sbLIZ3));
        this.currentLevel = c09q3;
        if (this.isJavaHeap) {
            this.memoryPressureCallback.LIZ(this.currentLevel, null);
        } else {
            this.memoryPressureCallback.LIZ(null, this.currentLevel);
        }
    }

    public EwmaMemoryPressure(boolean z, String str, C1591290rVn c1591290rVn, boolean z2, boolean z3, Function0<Double> function0) {
        this.debug = z;
        this.name = str;
        this.debounceConfig = c1591290rVn;
        this.newEwma = z2;
        this.isJavaHeap = z3;
        this.calculator = function0;
    }
}

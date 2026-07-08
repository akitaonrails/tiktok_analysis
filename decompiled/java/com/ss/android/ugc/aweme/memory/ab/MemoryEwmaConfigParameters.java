package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes25.dex */
public final class MemoryEwmaConfigParameters {
    public static final int $stable = 0;

    @C09CT("alpha")
    public final double alpha;

    @C09CT("dwellSize")
    public final int dwellSize;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("ewmaRate")
    public final double ewmaRate;

    @C09CT("extremeValue")
    public final double extremeValue;

    @C09CT("freezeFactor")
    public final int freezeFactor;

    @C09CT("hysteresisRatio")
    public final double hysteresisRatio;

    @C09CT("lowValue")
    public final double lowValue;

    @C09CT("monitor")
    public final boolean monitor;

    @C09CT("newEwma")
    public final boolean newEwma;

    @C09CT("period")
    public final long period;

    @C09CT("windowSize")
    public final int windowSize;

    public MemoryEwmaConfigParameters() {
        this(true, false, Mp4ScreenVideoLoadTimeout.CONTROL, 5, 0.2d, 0.5d, 0.0d, 0.0d, 1, 0.05d, 2, false);
    }

    public MemoryEwmaConfigParameters(boolean z, boolean z2, long j, int i, double d, double d2, double d3, double d4, int i2, double d5, int i3, boolean z3) {
        this.enable = z;
        this.monitor = z2;
        this.period = j;
        this.windowSize = i;
        this.alpha = d;
        this.ewmaRate = d2;
        this.lowValue = d3;
        this.extremeValue = d4;
        this.freezeFactor = i2;
        this.hysteresisRatio = d5;
        this.dwellSize = i3;
        this.newEwma = z3;
    }
}

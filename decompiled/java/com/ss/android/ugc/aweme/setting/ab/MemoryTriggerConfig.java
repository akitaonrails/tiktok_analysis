package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes25.dex */
public final class MemoryTriggerConfig {

    @C09CT("ewma_alpha")
    public final double alpha;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("ewma_rate")
    public final double ewmaRate;

    @C09CT("extreme")
    public final float extremeJavaUsageRate;

    @C09CT("fast")
    public final long intervalFast;

    @C09CT("slow")
    public final long intervalSlow;

    @C09CT("low")
    public final float lowJavaUsageRate;

    @C09CT("gc")
    public final int minGcSize;

    @C09CT("ewma_period")
    public final long period;

    @C09CT("ewma")
    public final int useEwma;

    @C09CT("window")
    public final int windowSize;

    public MemoryTriggerConfig() {
        this(false, 1, 20000L, 4000L, 0.55f, 0.9f, 3, 0, 0.2d, 0.5d, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryTriggerConfig)) {
            return false;
        }
        MemoryTriggerConfig memoryTriggerConfig = (MemoryTriggerConfig) obj;
        return this.enable == memoryTriggerConfig.enable && this.useEwma == memoryTriggerConfig.useEwma && this.intervalSlow == memoryTriggerConfig.intervalSlow && this.intervalFast == memoryTriggerConfig.intervalFast && Float.compare(this.lowJavaUsageRate, memoryTriggerConfig.lowJavaUsageRate) == 0 && Float.compare(this.extremeJavaUsageRate, memoryTriggerConfig.extremeJavaUsageRate) == 0 && this.windowSize == memoryTriggerConfig.windowSize && this.minGcSize == memoryTriggerConfig.minGcSize && Double.compare(this.alpha, memoryTriggerConfig.alpha) == 0 && Double.compare(this.ewmaRate, memoryTriggerConfig.ewmaRate) == 0 && this.period == memoryTriggerConfig.period;
    }

    public final String toString() {
        return "MemoryTriggerConfig(enable=" + this.enable + ", useEwma=" + this.useEwma + ", intervalSlow=" + this.intervalSlow + ", intervalFast=" + this.intervalFast + ", lowJavaUsageRate=" + this.lowJavaUsageRate + ", extremeJavaUsageRate=" + this.extremeJavaUsageRate + ", windowSize=" + this.windowSize + ", minGcSize=" + this.minGcSize + ", alpha=" + this.alpha + ", ewmaRate=" + this.ewmaRate + ", period=" + this.period + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.useEwma) * 31) + C786410Ut5.Y2(this.intervalSlow)) * 31) + C786410Ut5.Y2(this.intervalFast)) * 31) + Float.floatToIntBits(this.lowJavaUsageRate)) * 31) + Float.floatToIntBits(this.extremeJavaUsageRate)) * 31) + this.windowSize) * 31) + this.minGcSize) * 31) + C786410Ut5.X2(this.alpha)) * 31) + C786410Ut5.X2(this.ewmaRate)) * 31) + C786410Ut5.Y2(this.period);
    }

    public MemoryTriggerConfig(boolean z, int i, long j, long j2, float f, float f2, int i2, int i3, double d, double d2, long j3) {
        this.enable = z;
        this.useEwma = i;
        this.intervalSlow = j;
        this.intervalFast = j2;
        this.lowJavaUsageRate = f;
        this.extremeJavaUsageRate = f2;
        this.windowSize = i2;
        this.minGcSize = i3;
        this.alpha = d;
        this.ewmaRate = d2;
        this.period = j3;
    }
}

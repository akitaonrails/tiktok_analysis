package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes34.dex */
public final class PrewarmConfig {

    @C09CT("enable_eta_pulse")
    public final boolean enableEtaPulse;

    @C09CT("enable_prewarm")
    public final boolean enablePrewarm;

    @C09CT("high_load_cpu_threshold")
    public final float highLoadCpuThreshold;

    @C09CT("high_load_thermal_threshold")
    public final float highLoadThermalThreshold;

    @C09CT("new_device_open")
    public final boolean newDeviceOpen;

    @C09CT("pre_io_keep_ms")
    public final long preIoKeepMs;

    @C09CT("prewarm_max_age_ms")
    public final long prewarmMaxAgeMs;

    @C09CT("prewarm_max_capacity")
    public final int prewarmMaxCapacity;

    @C09CT("pulse_interval_ms")
    public final long pulseIntervalMs;

    @C09CT("pulse_keep_ms")
    public final long pulseKeepMs;

    @C09CT("pulse_max_count")
    public final int pulseMaxCount;

    @C09CT("use_predict_model")
    public final boolean usePredictModel;

    public PrewarmConfig() {
        this(false, false, 3, 3000L, 2000L, 2, 15000L, 80.0f, 1000.0f, Mp4ScreenVideoLoadTimeout.CONTROL, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrewarmConfig)) {
            return false;
        }
        PrewarmConfig prewarmConfig = (PrewarmConfig) obj;
        return this.enableEtaPulse == prewarmConfig.enableEtaPulse && this.enablePrewarm == prewarmConfig.enablePrewarm && this.pulseMaxCount == prewarmConfig.pulseMaxCount && this.pulseKeepMs == prewarmConfig.pulseKeepMs && this.pulseIntervalMs == prewarmConfig.pulseIntervalMs && this.prewarmMaxCapacity == prewarmConfig.prewarmMaxCapacity && this.prewarmMaxAgeMs == prewarmConfig.prewarmMaxAgeMs && Float.compare(this.highLoadThermalThreshold, prewarmConfig.highLoadThermalThreshold) == 0 && Float.compare(this.highLoadCpuThreshold, prewarmConfig.highLoadCpuThreshold) == 0 && this.preIoKeepMs == prewarmConfig.preIoKeepMs && this.newDeviceOpen == prewarmConfig.newDeviceOpen && this.usePredictModel == prewarmConfig.usePredictModel;
    }

    public final String toString() {
        return "PrewarmConfig(enableEtaPulse=" + this.enableEtaPulse + ", enablePrewarm=" + this.enablePrewarm + ", pulseMaxCount=" + this.pulseMaxCount + ", pulseKeepMs=" + this.pulseKeepMs + ", pulseIntervalMs=" + this.pulseIntervalMs + ", prewarmMaxCapacity=" + this.prewarmMaxCapacity + ", prewarmMaxAgeMs=" + this.prewarmMaxAgeMs + ", highLoadThermalThreshold=" + this.highLoadThermalThreshold + ", highLoadCpuThreshold=" + this.highLoadCpuThreshold + ", preIoKeepMs=" + this.preIoKeepMs + ", newDeviceOpen=" + this.newDeviceOpen + ", usePredictModel=" + this.usePredictModel + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((((C786410Ut5.Z2(this.enableEtaPulse) * 31) + C786410Ut5.Z2(this.enablePrewarm)) * 31) + this.pulseMaxCount) * 31) + C786410Ut5.Y2(this.pulseKeepMs)) * 31) + C786410Ut5.Y2(this.pulseIntervalMs)) * 31) + this.prewarmMaxCapacity) * 31) + C786410Ut5.Y2(this.prewarmMaxAgeMs)) * 31) + Float.floatToIntBits(this.highLoadThermalThreshold)) * 31) + Float.floatToIntBits(this.highLoadCpuThreshold)) * 31) + C786410Ut5.Y2(this.preIoKeepMs)) * 31) + C786410Ut5.Z2(this.newDeviceOpen)) * 31) + C786410Ut5.Z2(this.usePredictModel);
    }

    public PrewarmConfig(boolean z, boolean z2, int i, long j, long j2, int i2, long j3, float f, float f2, long j4, boolean z3, boolean z4) {
        this.enableEtaPulse = z;
        this.enablePrewarm = z2;
        this.pulseMaxCount = i;
        this.pulseKeepMs = j;
        this.pulseIntervalMs = j2;
        this.prewarmMaxCapacity = i2;
        this.prewarmMaxAgeMs = j3;
        this.highLoadThermalThreshold = f;
        this.highLoadCpuThreshold = f2;
        this.preIoKeepMs = j4;
        this.newDeviceOpen = z3;
        this.usePredictModel = z4;
    }
}

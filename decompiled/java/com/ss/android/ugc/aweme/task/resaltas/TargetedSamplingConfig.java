package com.ss.android.ugc.aweme.task.resaltas;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TargetedSamplingConfig {

    @C09CT("dump_interval_ms")
    public final long dumpIntervalMs;

    @C09CT("dump_stack")
    public final boolean dumpStack;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("sample_rate")
    public final float sampleRate;

    @C09CT("windows")
    public final List<WindowConfig> windows;

    public TargetedSamplingConfig() {
        this(false, 0.0f, false, 0L, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetedSamplingConfig)) {
            return false;
        }
        TargetedSamplingConfig targetedSamplingConfig = (TargetedSamplingConfig) obj;
        return this.enable == targetedSamplingConfig.enable && Float.compare(this.sampleRate, targetedSamplingConfig.sampleRate) == 0 && this.dumpStack == targetedSamplingConfig.dumpStack && this.dumpIntervalMs == targetedSamplingConfig.dumpIntervalMs && Intrinsics.LJFF(this.windows, targetedSamplingConfig.windows);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TargetedSamplingConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(", dumpStack=");
        sbLIZ.append(this.dumpStack);
        sbLIZ.append(", dumpIntervalMs=");
        sbLIZ.append(this.dumpIntervalMs);
        sbLIZ.append(", windows=");
        sbLIZ.append(this.windows);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + Float.floatToIntBits(this.sampleRate)) * 31) + C786410Ut5.Z2(this.dumpStack)) * 31) + C786410Ut5.Y2(this.dumpIntervalMs)) * 31) + this.windows.hashCode();
    }

    public TargetedSamplingConfig(boolean z, float f, boolean z2, long j, List<WindowConfig> list) {
        this.enable = z;
        this.sampleRate = f;
        this.dumpStack = z2;
        this.dumpIntervalMs = j;
        this.windows = list;
    }

    public TargetedSamplingConfig(boolean z, float f, boolean z2, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.1f : f, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j, (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}

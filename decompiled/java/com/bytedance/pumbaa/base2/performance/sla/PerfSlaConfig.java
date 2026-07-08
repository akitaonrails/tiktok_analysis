package com.bytedance.pumbaa.base2.performance.sla;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PerfSlaConfig {

    @C09CT("discard_time")
    public final int discardTimeSeconds;

    @C09CT("drop_sample_rate")
    public final float dropSampleRate;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_api_discard")
    public final boolean enableApiDiscard;

    @C09CT("enable_discard")
    public final boolean enableDiscard;

    @C09CT("exceeded_sample_rate")
    public final float exceededSampleRate;

    @C09CT("success_sample_rate")
    public final float successSampleRate;

    @C09CT("tag")
    public final String tag;

    @C09CT("threshold")
    public final long thresholdMs;

    public PerfSlaConfig() {
        this(false, 50000L, 0.0f, 0.0f, 0.0f, false, 0, true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerfSlaConfig)) {
            return false;
        }
        PerfSlaConfig perfSlaConfig = (PerfSlaConfig) obj;
        return this.enable == perfSlaConfig.enable && this.thresholdMs == perfSlaConfig.thresholdMs && Float.compare(this.successSampleRate, perfSlaConfig.successSampleRate) == 0 && Float.compare(this.exceededSampleRate, perfSlaConfig.exceededSampleRate) == 0 && Float.compare(this.dropSampleRate, perfSlaConfig.dropSampleRate) == 0 && this.enableDiscard == perfSlaConfig.enableDiscard && this.discardTimeSeconds == perfSlaConfig.discardTimeSeconds && this.enableApiDiscard == perfSlaConfig.enableApiDiscard && Intrinsics.LJFF(this.tag, perfSlaConfig.tag);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfSlaConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", thresholdMs=");
        sbLIZ.append(this.thresholdMs);
        sbLIZ.append(", successSampleRate=");
        sbLIZ.append(this.successSampleRate);
        sbLIZ.append(", exceededSampleRate=");
        sbLIZ.append(this.exceededSampleRate);
        sbLIZ.append(", dropSampleRate=");
        sbLIZ.append(this.dropSampleRate);
        sbLIZ.append(", enableDiscard=");
        sbLIZ.append(this.enableDiscard);
        sbLIZ.append(", discardTimeSeconds=");
        sbLIZ.append(this.discardTimeSeconds);
        sbLIZ.append(", enableApiDiscard=");
        sbLIZ.append(this.enableApiDiscard);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.tag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public final int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iY2 = ((((((((r0 * 31) + C786410Ut5.Y2(this.thresholdMs)) * 31) + Float.floatToIntBits(this.successSampleRate)) * 31) + Float.floatToIntBits(this.exceededSampleRate)) * 31) + Float.floatToIntBits(this.dropSampleRate)) * 31;
        boolean z2 = this.enableDiscard;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i = (((((iY2 + r02) * 31) + this.discardTimeSeconds) * 31) + (this.enableApiDiscard ? 1 : 0)) * 31;
        String str = this.tag;
        return i + (str == null ? 0 : str.hashCode());
    }

    public PerfSlaConfig(boolean z, long j, float f, float f2, float f3, boolean z2, int i, boolean z3, String str) {
        this.enable = z;
        this.thresholdMs = j;
        this.successSampleRate = f;
        this.exceededSampleRate = f2;
        this.dropSampleRate = f3;
        this.enableDiscard = z2;
        this.discardTimeSeconds = i;
        this.enableApiDiscard = z3;
        this.tag = str;
    }
}

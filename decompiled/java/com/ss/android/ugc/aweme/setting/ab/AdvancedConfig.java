package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes25.dex */
public final class AdvancedConfig {

    @C09CT("enable_solaria")
    public final boolean enableSolaria;

    @C09CT("gc_min_interval_ms")
    public final long gcMinIntervalMs;

    @C09CT("gc_timeout_ms")
    public final long gcTimeoutMs;

    @C09CT("trigger_gc_after")
    public final boolean triggerGcAfter;

    @C09CT("trigger_gc_before")
    public final boolean triggerGcBefore;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedConfig)) {
            return false;
        }
        AdvancedConfig advancedConfig = (AdvancedConfig) obj;
        return this.enableSolaria == advancedConfig.enableSolaria && this.triggerGcBefore == advancedConfig.triggerGcBefore && this.triggerGcAfter == advancedConfig.triggerGcAfter && this.gcMinIntervalMs == advancedConfig.gcMinIntervalMs && this.gcTimeoutMs == advancedConfig.gcTimeoutMs;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enableSolaria) * 31) + C786410Ut5.Z2(this.triggerGcBefore)) * 31) + C786410Ut5.Z2(this.triggerGcAfter)) * 31) + C786410Ut5.Y2(this.gcMinIntervalMs)) * 31) + C786410Ut5.Y2(this.gcTimeoutMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdvancedConfig(enableSolaria=");
        sbLIZ.append(this.enableSolaria);
        sbLIZ.append(", triggerGcBefore=");
        sbLIZ.append(this.triggerGcBefore);
        sbLIZ.append(", triggerGcAfter=");
        sbLIZ.append(this.triggerGcAfter);
        sbLIZ.append(", gcMinIntervalMs=");
        sbLIZ.append(this.gcMinIntervalMs);
        sbLIZ.append(", gcTimeoutMs=");
        sbLIZ.append(this.gcTimeoutMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AdvancedConfig() {
        this(false, false, false, 30000L, 10000L);
    }

    public AdvancedConfig(boolean z, boolean z2, boolean z3, long j, long j2) {
        this.enableSolaria = z;
        this.triggerGcBefore = z2;
        this.triggerGcAfter = z3;
        this.gcMinIntervalMs = j;
        this.gcTimeoutMs = j2;
    }
}

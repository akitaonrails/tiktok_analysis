package com.ss.android.ugc.aweme.experiment;

import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class ResolvedCommentFilterSpeedConfig {
    public final int animationDurationMs;
    public final boolean enableClickLatencyReduction;
    public final int filterIconHitAreaSize;
    public final int openDelayMs;

    public ResolvedCommentFilterSpeedConfig() {
        this(false, 0, 100, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedCommentFilterSpeedConfig)) {
            return false;
        }
        ResolvedCommentFilterSpeedConfig resolvedCommentFilterSpeedConfig = (ResolvedCommentFilterSpeedConfig) obj;
        return this.enableClickLatencyReduction == resolvedCommentFilterSpeedConfig.enableClickLatencyReduction && this.animationDurationMs == resolvedCommentFilterSpeedConfig.animationDurationMs && this.openDelayMs == resolvedCommentFilterSpeedConfig.openDelayMs && this.filterIconHitAreaSize == resolvedCommentFilterSpeedConfig.filterIconHitAreaSize;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.enableClickLatencyReduction) * 31) + this.animationDurationMs) * 31) + this.openDelayMs) * 31) + this.filterIconHitAreaSize;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedCommentFilterSpeedConfig(enableClickLatencyReduction=");
        sbLIZ.append(this.enableClickLatencyReduction);
        sbLIZ.append(", animationDurationMs=");
        sbLIZ.append(this.animationDurationMs);
        sbLIZ.append(", openDelayMs=");
        sbLIZ.append(this.openDelayMs);
        sbLIZ.append(", filterIconHitAreaSize=");
        sbLIZ.append(this.filterIconHitAreaSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResolvedCommentFilterSpeedConfig(boolean z, int i, int i2, int i3) {
        this.enableClickLatencyReduction = z;
        this.animationDurationMs = i;
        this.openDelayMs = i2;
        this.filterIconHitAreaSize = i3;
    }
}

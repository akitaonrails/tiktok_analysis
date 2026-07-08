package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CommentFilterSpeedConfig {

    @C09CT("animation_duration_ms")
    public final Integer animationDurationMs;

    @C09CT("enable_click_latency_reduction")
    public final Boolean enableClickLatencyReduction;

    @C09CT("filter_icon_hit_area_size")
    public final Integer filterIconHitAreaSize;

    @C09CT("open_delay_ms")
    public final Integer openDelayMs;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentFilterSpeedConfig)) {
            return false;
        }
        CommentFilterSpeedConfig commentFilterSpeedConfig = (CommentFilterSpeedConfig) obj;
        return Intrinsics.LJFF(this.enableClickLatencyReduction, commentFilterSpeedConfig.enableClickLatencyReduction) && Intrinsics.LJFF(this.animationDurationMs, commentFilterSpeedConfig.animationDurationMs) && Intrinsics.LJFF(this.openDelayMs, commentFilterSpeedConfig.openDelayMs) && Intrinsics.LJFF(this.filterIconHitAreaSize, commentFilterSpeedConfig.filterIconHitAreaSize);
    }

    public int hashCode() {
        Boolean bool = this.enableClickLatencyReduction;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.animationDurationMs;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.openDelayMs;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.filterIconHitAreaSize;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentFilterSpeedConfig(enableClickLatencyReduction=");
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

    public CommentFilterSpeedConfig() {
        this(Boolean.FALSE, 0, 100, 0);
    }

    public CommentFilterSpeedConfig(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.enableClickLatencyReduction = bool;
        this.animationDurationMs = num;
        this.openDelayMs = num2;
        this.filterIconHitAreaSize = num3;
    }
}

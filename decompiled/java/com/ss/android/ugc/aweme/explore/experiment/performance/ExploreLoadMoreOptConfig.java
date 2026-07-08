package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes29.dex */
public final class ExploreLoadMoreOptConfig {

    @C09CT("base_count")
    public final int baseCount;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_count")
    public final int maxCount;

    @C09CT("velocity_high_px_per_sec")
    public final int velocityHighPxPerSec;

    @C09CT("velocity_low_px_per_sec")
    public final int velocityLowPxPerSec;

    public ExploreLoadMoreOptConfig() {
        this(false, 4, 12, 500, LivePreCreateNextRoomPlayer.ENABLE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLoadMoreOptConfig)) {
            return false;
        }
        ExploreLoadMoreOptConfig exploreLoadMoreOptConfig = (ExploreLoadMoreOptConfig) obj;
        return this.enable == exploreLoadMoreOptConfig.enable && this.baseCount == exploreLoadMoreOptConfig.baseCount && this.maxCount == exploreLoadMoreOptConfig.maxCount && this.velocityLowPxPerSec == exploreLoadMoreOptConfig.velocityLowPxPerSec && this.velocityHighPxPerSec == exploreLoadMoreOptConfig.velocityHighPxPerSec;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + this.baseCount) * 31) + this.maxCount) * 31) + this.velocityLowPxPerSec) * 31) + this.velocityHighPxPerSec;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLoadMoreOptConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", baseCount=");
        sbLIZ.append(this.baseCount);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.maxCount);
        sbLIZ.append(", velocityLowPxPerSec=");
        sbLIZ.append(this.velocityLowPxPerSec);
        sbLIZ.append(", velocityHighPxPerSec=");
        sbLIZ.append(this.velocityHighPxPerSec);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLoadMoreOptConfig(boolean z, int i, int i2, int i3, int i4) {
        this.enable = z;
        this.baseCount = i;
        this.maxCount = i2;
        this.velocityLowPxPerSec = i3;
        this.velocityHighPxPerSec = i4;
    }
}

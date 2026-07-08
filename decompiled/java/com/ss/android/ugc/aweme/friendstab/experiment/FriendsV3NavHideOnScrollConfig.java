package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class FriendsV3NavHideOnScrollConfig {

    @C09CT("downward_restore_threshold_dp_per_sec")
    public final float downwardRestoreThresholdDpPerSec;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("snap_anim_duration_ms")
    public final long snapAnimDurationMs;

    public FriendsV3NavHideOnScrollConfig() {
        this(false, 2400.0f, 150L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3NavHideOnScrollConfig)) {
            return false;
        }
        FriendsV3NavHideOnScrollConfig friendsV3NavHideOnScrollConfig = (FriendsV3NavHideOnScrollConfig) obj;
        return this.enable == friendsV3NavHideOnScrollConfig.enable && Float.compare(this.downwardRestoreThresholdDpPerSec, friendsV3NavHideOnScrollConfig.downwardRestoreThresholdDpPerSec) == 0 && this.snapAnimDurationMs == friendsV3NavHideOnScrollConfig.snapAnimDurationMs;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3NavHideOnScrollConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", downwardRestoreThresholdDpPerSec=");
        sbLIZ.append(this.downwardRestoreThresholdDpPerSec);
        sbLIZ.append(", snapAnimDurationMs=");
        sbLIZ.append(this.snapAnimDurationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + Float.floatToIntBits(this.downwardRestoreThresholdDpPerSec)) * 31) + C786410Ut5.Y2(this.snapAnimDurationMs);
    }

    public FriendsV3NavHideOnScrollConfig(boolean z, float f, long j) {
        this.enable = z;
        this.downwardRestoreThresholdDpPerSec = f;
        this.snapAnimDurationMs = j;
    }
}

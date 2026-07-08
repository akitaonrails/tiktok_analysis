package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendsV3ScrollPlayConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fling_play_dy_threshold")
    public final int flingPlayDyThreshold;

    public FriendsV3ScrollPlayConfig() {
        this(false, 150);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3ScrollPlayConfig)) {
            return false;
        }
        FriendsV3ScrollPlayConfig friendsV3ScrollPlayConfig = (FriendsV3ScrollPlayConfig) obj;
        return this.enable == friendsV3ScrollPlayConfig.enable && this.flingPlayDyThreshold == friendsV3ScrollPlayConfig.flingPlayDyThreshold;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.flingPlayDyThreshold;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3ScrollPlayConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", flingPlayDyThreshold=");
        sbLIZ.append(this.flingPlayDyThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FriendsV3ScrollPlayConfig(boolean z, int i) {
        this.enable = z;
        this.flingPlayDyThreshold = i;
    }
}

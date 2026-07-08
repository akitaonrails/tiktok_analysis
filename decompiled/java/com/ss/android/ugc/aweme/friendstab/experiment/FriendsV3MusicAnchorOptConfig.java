package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3MusicAnchorOptConfig {

    @C09CT("friends_v3_music_anchor_display_type")
    public final int displayType;

    @C09CT("friends_v3_music_anchor_opt_enabled")
    public final boolean enabled;

    public FriendsV3MusicAnchorOptConfig() {
        this(false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3MusicAnchorOptConfig)) {
            return false;
        }
        FriendsV3MusicAnchorOptConfig friendsV3MusicAnchorOptConfig = (FriendsV3MusicAnchorOptConfig) obj;
        return this.enabled == friendsV3MusicAnchorOptConfig.enabled && this.displayType == friendsV3MusicAnchorOptConfig.displayType;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + this.displayType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3MusicAnchorOptConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", displayType=");
        sbLIZ.append(this.displayType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FriendsV3MusicAnchorOptConfig(boolean z, int i) {
        this.enabled = z;
        this.displayType = i;
    }
}

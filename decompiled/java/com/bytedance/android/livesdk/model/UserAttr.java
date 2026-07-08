package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class UserAttr {

    @C09CT("admin_permissions")
    public Map<Integer, Integer> adminPermissions;

    @C09CT("has_voting_function")
    public boolean hasVotingFunction;

    @C09CT("is_admin")
    public boolean isAdmin;

    @C09CT("is_channel_admin")
    public boolean isChannelAdmin;

    @C09CT("is_muted")
    public boolean isMuted;

    @C09CT("is_super_admin")
    public boolean isSuperAdmin;

    @C09CT("mute_duration")
    public long muteDuration;

    public final int hashCode() {
        return ((this.isMuted ? 1 : 0) * 31) + (this.isAdmin ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAttr userAttr = (UserAttr) obj;
        if (this.isMuted == userAttr.isMuted && this.isAdmin == userAttr.isAdmin) {
            return true;
        }
        return false;
    }
}

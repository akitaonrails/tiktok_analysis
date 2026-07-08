package com.ss.android.ugc.aweme.story.experiment.streak;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class GroupChatStreakExpConfig implements Serializable {

    @C09CT("is_enabled")
    public final boolean enable;

    @C09CT("max_member_avatar")
    public final int maxMemberAvatar;

    public GroupChatStreakExpConfig() {
        this(false, 10);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getMaxMemberAvatar() {
        return this.maxMemberAvatar;
    }

    public GroupChatStreakExpConfig(boolean z, int i) {
        this.enable = z;
        this.maxMemberAvatar = i;
    }
}

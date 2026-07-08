package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class Entry {

    @C09CT("group_chat_id")
    public final Long groupChatId;

    @C09CT("is_animation")
    public final Boolean isAnimation;

    @C09CT("story_id")
    public final String storyId;

    @C09CT("target_user_id")
    public final Long targetUserId;

    public Entry() {
        this(null, null, null, null);
    }

    public Entry(String str, Long l, Long l2, Boolean bool) {
        this.storyId = str;
        this.targetUserId = l;
        this.groupChatId = l2;
        this.isAnimation = bool;
    }
}

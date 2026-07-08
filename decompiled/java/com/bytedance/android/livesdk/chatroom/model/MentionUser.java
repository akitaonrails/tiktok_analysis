package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class MentionUser {

    @C09CT("allow_mention")
    public boolean allowMention;

    @C09CT("is_in_room")
    public boolean isInRoom;

    @C09CT("is_online")
    public boolean isOnline;

    @C09CT("mention_follow_status")
    public long mentionFollowStatus;

    @C09CT("user")
    public User user;

    @C09CT("tag")
    public String tag = "";

    @C09CT("mention_ban_reason")
    public String mentionBanReason = "";
}

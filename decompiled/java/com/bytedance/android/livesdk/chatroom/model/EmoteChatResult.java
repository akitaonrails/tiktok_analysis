package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes18.dex */
public final class EmoteChatResult {

    @C09CT("msg_id")
    public final long msgId;

    @C09CT("user")
    public final User user;

    @C09CT("user_identity")
    public final UserIdentity userIdentity;

    public EmoteChatResult(long j, User user, UserIdentity userIdentity) {
        this.msgId = j;
        this.user = user;
        this.userIdentity = userIdentity;
    }
}

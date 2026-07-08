package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class SilenceRequest {

    @C09CT("comment_msg_id")
    public long commentMsgId;

    @C09CT("duration")
    public long duration;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_user_id")
    public String secUserId = "";

    @C09CT("silence_type")
    public long silenceType;

    @C09CT("user_id")
    public long userId;
}

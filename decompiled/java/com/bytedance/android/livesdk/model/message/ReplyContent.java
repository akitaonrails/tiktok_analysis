package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyContent {

    @C09CT("replier")
    public User replier;

    @C09CT("replier_room_id")
    public long replierRoomId;

    @C09CT("reply_status")
    public int replyStatus;
}

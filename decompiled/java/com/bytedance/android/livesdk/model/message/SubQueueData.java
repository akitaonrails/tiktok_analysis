package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubQueue;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueueData {

    @C09CT("current_user")
    public User currentUser;

    @C09CT("message_type_action")
    public int messageTypeAction;

    @C09CT("queue")
    public SubQueue queue;
}

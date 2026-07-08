package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubQueue;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueueMessage extends AbstractC1136060ffY {

    @C09CT("current_user")
    public User currentUser;

    @C09CT("message_type_action")
    public int messageTypeAction;

    @C09CT("queue")
    public SubQueue queue;

    public SubQueueMessage() {
        this.type = C001A.SUB_QUEUE_MESSAGE;
    }
}

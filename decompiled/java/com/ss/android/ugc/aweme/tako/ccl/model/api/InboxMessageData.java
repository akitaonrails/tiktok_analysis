package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class InboxMessageData {

    @C09CT("sub_conversation")
    public final ConversationInfo conversationInfo;

    @C09CT("msg")
    public final Message message;

    public InboxMessageData() {
        this(new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null), null);
    }

    public InboxMessageData(Message message, ConversationInfo conversationInfo) {
        this.message = message;
        this.conversationInfo = conversationInfo;
    }
}

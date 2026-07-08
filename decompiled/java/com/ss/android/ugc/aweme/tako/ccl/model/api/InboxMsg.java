package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class InboxMsg {

    @C09CT("cmd_type")
    public final int cmdType;

    @C09CT("data")
    public final InboxMessageData data;

    @C09CT("inbox_msg_id")
    public final String inboxMsgId;

    public InboxMsg() {
        this("", 0, new InboxMessageData(new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null), null));
    }

    public InboxMsg(String str, int i, InboxMessageData inboxMessageData) {
        this.inboxMsgId = str;
        this.cmdType = i;
        this.data = inboxMessageData;
    }
}

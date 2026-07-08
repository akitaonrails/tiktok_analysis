package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SendingBanMessage {

    @C09CT("banned")
    public final Boolean banned;

    @C09CT("content")
    public final String content;

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("msg_type")
    public final String msgType;

    @C09CT("sender_uid")
    public final Long senderUid;

    @C09CT("server_msg_id")
    public final String serverMsgId;

    public SendingBanMessage() {
        this(null, null, null, null, null, null, null);
    }

    public SendingBanMessage(String str, String str2, String str3, Long l, String str4, String str5, Boolean bool) {
        this.msgId = str;
        this.serverMsgId = str2;
        this.msgType = str3;
        this.senderUid = l;
        this.content = str4;
        this.contentPb = str5;
        this.banned = bool;
    }
}

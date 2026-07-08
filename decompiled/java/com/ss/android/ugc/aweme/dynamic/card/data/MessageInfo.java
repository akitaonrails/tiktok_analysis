package com.ss.android.ugc.aweme.dynamic.card.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class MessageInfo {

    @C09CT("from_uid")
    public final String fromUid;

    @C09CT("is_seen")
    public final boolean isSeen;

    @C09CT("is_sender")
    public final int isSender;

    @C09CT("message_create_time")
    public final Long messageCreateTime;

    @C09CT("server_message_id")
    public final String messageId;

    @C09CT("message_uuid")
    public final String messageUuid;

    @C09CT("persistent_ext")
    public final String persistentExt;

    @C09CT("to_uid")
    public final String toUid;

    public MessageInfo(String str, String str2, String str3, String str4, int i, boolean z, Long l, String str5) {
        this.messageId = str;
        this.messageUuid = str2;
        this.fromUid = str3;
        this.toUid = str4;
        this.isSender = i;
        this.isSeen = z;
        this.messageCreateTime = l;
        this.persistentExt = str5;
    }
}

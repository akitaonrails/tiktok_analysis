package com.ss.android.ugc.aweme.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ConversationAudit {

    @C09CT("apply_id")
    public final long applyId;

    @C09CT("apply_reason")
    public final String applyReason;

    @C09CT("apply_status")
    public final int applyStatus;

    @C09CT("apply_user_id")
    public final long applyUserId;

    @C09CT("conversation_short_id")
    public final long conversationShortId;

    @C09CT("create_time_in_ms")
    public final long createTimeInMs;

    @C09CT("invite_user")
    public final long inviteUser;

    @C09CT("modify_time_in_ms")
    public final long modifyTimeInMs;

    @C09CT("modify_user")
    public final long modifyUser;

    public ConversationAudit() {
        this(0L, 0L, 0, 0L, 0L, 0L, 0L, 0L, null);
    }

    public ConversationAudit(long j, long j2, int i, long j3, long j4, long j5, long j6, long j7, String str) {
        this.applyUserId = j;
        this.conversationShortId = j2;
        this.applyStatus = i;
        this.applyId = j3;
        this.createTimeInMs = j4;
        this.modifyTimeInMs = j5;
        this.modifyUser = j6;
        this.inviteUser = j7;
        this.applyReason = str;
    }
}

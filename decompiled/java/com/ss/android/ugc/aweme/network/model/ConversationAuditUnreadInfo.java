package com.ss.android.ugc.aweme.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationAuditUnreadInfo {

    @C09CT("conversation_short_id")
    public final Long conversationShortId;

    @C09CT("latest_audit")
    public final ConversationAudit latestAudit;

    @C09CT("unread_count")
    public final Long unreadCount;

    public ConversationAuditUnreadInfo(Long l, Long l2, ConversationAudit conversationAudit) {
        this.conversationShortId = l;
        this.unreadCount = l2;
        this.latestAudit = conversationAudit;
    }
}

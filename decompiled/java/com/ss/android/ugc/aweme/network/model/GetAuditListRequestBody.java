package com.ss.android.ugc.aweme.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class GetAuditListRequestBody {

    @C09CT("conversation_short_id")
    public final long conversationShortId;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("limit")
    public final int limit;

    public GetAuditListRequestBody() {
        this(0L, 0L, 0);
    }

    public GetAuditListRequestBody(long j, long j2, int i) {
        this.conversationShortId = j;
        this.cursor = j2;
        this.limit = i;
    }
}

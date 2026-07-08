package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StrangerUnlimitRequest {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("to_user_id")
    public final Long toUserId;

    public StrangerUnlimitRequest() {
        this(null, null);
    }

    public StrangerUnlimitRequest(Long l, String str) {
        this.toUserId = l;
        this.conversationId = str;
    }
}

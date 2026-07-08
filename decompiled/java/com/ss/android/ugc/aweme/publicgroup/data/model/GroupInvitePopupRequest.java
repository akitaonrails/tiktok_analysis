package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitePopupRequest {

    @C09CT("conv_short_id")
    public final long conversationShortId;

    @C09CT("invite_id")
    public final String inviteId;

    public GroupInvitePopupRequest() {
        this("", 0L);
    }

    public GroupInvitePopupRequest(String str, long j) {
        this.inviteId = str;
        this.conversationShortId = j;
    }
}

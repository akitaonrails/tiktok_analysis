package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class GetGroupListRequest {

    @C09CT("group_type")
    public final String groupType;

    @C09CT("object_user_id")
    public final long targetId;

    public GetGroupListRequest() {
        this(0L, "");
    }

    public GetGroupListRequest(long j, String str) {
        this.targetId = j;
        this.groupType = str;
    }
}

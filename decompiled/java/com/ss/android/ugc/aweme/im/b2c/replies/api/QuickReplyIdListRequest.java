package com.ss.android.ugc.aweme.im.b2c.replies.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class QuickReplyIdListRequest {

    @C09CT("id_list")
    public final String deletedItems;

    @C09CT("biz_uid")
    public final long uid;

    public QuickReplyIdListRequest() {
        this(0L, "");
    }

    public QuickReplyIdListRequest(long j, String str) {
        this.uid = j;
        this.deletedItems = str;
    }
}

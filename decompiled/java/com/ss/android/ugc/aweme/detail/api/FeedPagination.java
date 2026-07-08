package com.ss.android.ugc.aweme.detail.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedPagination implements Serializable {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("page_token")
    public final String pageToken;

    @C09CT("total_count")
    public final Long totalCount;

    @C09CT("version")
    public final Long version;

    public FeedPagination() {
        this(false, 0L, null, null, null);
    }

    public FeedPagination(boolean z, long j, Long l, Long l2, String str) {
        this.hasMore = z;
        this.cursor = j;
        this.totalCount = l;
        this.version = l2;
        this.pageToken = str;
    }
}

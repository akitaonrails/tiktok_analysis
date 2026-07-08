package com.ss.android.ugc.aweme.detail.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class FeedPaginationControl implements Serializable {

    @C09CT("count")
    public long count;

    @C09CT("cursor")
    public long cursor;

    @C09CT("page_token")
    public String pageToken;

    public FeedPaginationControl() {
        this(0L, 8L, null);
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setPageToken(String str) {
        this.pageToken = str;
    }

    public FeedPaginationControl(long j, long j2, String str) {
        this.cursor = j;
        this.count = j2;
        this.pageToken = str;
    }
}

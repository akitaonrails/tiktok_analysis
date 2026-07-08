package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3CommentConfig {

    @C09CT("default_show_count")
    public final int defaultShowCount;

    @C09CT("expose_comment_cache_time_ms")
    public final long exposeCommentCacheTimeMs;

    @C09CT("view_more_show_count")
    public final int viewMoreShowCount;

    public FriendsV3CommentConfig() {
        this(5, 10, 600000L);
    }

    public FriendsV3CommentConfig(int i, int i2, long j) {
        this.defaultShowCount = i;
        this.viewMoreShowCount = i2;
        this.exposeCommentCacheTimeMs = j;
    }
}

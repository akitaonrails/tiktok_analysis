package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedRequestConfig {

    @C09CT("count_when_fast_scroll")
    public final int countWhenFastScroll;

    @C09CT("count_when_fling")
    public final int countWhenFling;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("loadmore_count")
    public final int loadMoreCount;

    @C09CT("loadmore_empty_retry_count")
    public final int loadMoreEmptyRetryCount;

    @C09CT("loadmore_error_retry_count")
    public final int loadMoreErrorRetryCount;

    @C09CT("loadmore_prefetch_offset")
    public final int loadMorePrefetchOffset;

    @C09CT("loadmore_prefetch_offset_when_fast_scroll")
    public final int loadMorePrefetchOffsetWhenFastScroll;

    @C09CT("loadmore_prefetch_offset_when_fling")
    public final int loadMorePrefetchOffsetWhenFling;

    @C09CT("preload_count")
    public final int preloadCount;

    @C09CT("preload_expired_time_secs")
    public final int preloadExpiredTimeSecs;

    @C09CT("refresh_count")
    public final int refreshCount;

    @C09CT("refresh_empty_retry_count")
    public final int refreshEmptyRetryCount;

    @C09CT("refresh_error_retry_count")
    public final int refreshErrorRetryCount;

    public FriendsV3FeedRequestConfig() {
        this(true, 600, 8, 10, 10, 5, 8, 12, 3, 3, 3, 3, 8, 6);
    }

    public FriendsV3FeedRequestConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.enablePreload = z;
        this.preloadExpiredTimeSecs = i;
        this.preloadCount = i2;
        this.refreshCount = i3;
        this.loadMoreCount = i4;
        this.loadMorePrefetchOffset = i5;
        this.loadMorePrefetchOffsetWhenFastScroll = i6;
        this.loadMorePrefetchOffsetWhenFling = i7;
        this.refreshEmptyRetryCount = i8;
        this.refreshErrorRetryCount = i9;
        this.loadMoreEmptyRetryCount = i10;
        this.loadMoreErrorRetryCount = i11;
        this.countWhenFastScroll = i12;
        this.countWhenFling = i13;
    }
}

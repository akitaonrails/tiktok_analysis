package com.ss.android.ugc.aweme.inbox.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightLoadMoreConfig {

    @C09CT("enable_display_based_trigger")
    public final boolean enableDisplayBasedTrigger;

    @C09CT("enable_load_more")
    public final boolean enableLoadMore;

    @C09CT("enable_post_refresh_auto_load")
    public final boolean enablePostRefreshAutoLoad;

    @C09CT("first_refresh_page_count")
    public final int firstRefreshPageCount;

    @C09CT("front_n_no_story_auto_load_more_n")
    public final int frontNNoStoryAutoLoadMoreN;

    @C09CT("load_more_page_count")
    public final int loadMorePageCount;

    @C09CT("max_consecutive_post_refresh_auto_load")
    public final int maxConsecutivePostRefreshAutoLoad;

    @C09CT("max_invisible_count_for_load_more")
    public final int maxInvisibleCountForLoadMore;

    @C09CT("max_pack_user_story_count")
    public final int maxPackUserStoryCount;

    @C09CT("max_story_total_count")
    public final int maxStoryTotalCount;

    @C09CT("no_scroll_auto_delay_ms")
    public final long noScrollAutoDelayMs;

    @C09CT("preload_page_count")
    public final int preloadPageCount;

    @C09CT("refresh_page_count")
    public final int refreshPageCount;

    public InboxSkylightLoadMoreConfig() {
        this(false, 5, 5, 5, 20, 4, 50, 2, false, false, 20, 400L, 2);
    }

    public InboxSkylightLoadMoreConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8, long j, int i9) {
        this.enableLoadMore = z;
        this.firstRefreshPageCount = i;
        this.preloadPageCount = i2;
        this.refreshPageCount = i3;
        this.loadMorePageCount = i4;
        this.maxInvisibleCountForLoadMore = i5;
        this.maxStoryTotalCount = i6;
        this.maxPackUserStoryCount = i7;
        this.enableDisplayBasedTrigger = z2;
        this.enablePostRefreshAutoLoad = z3;
        this.frontNNoStoryAutoLoadMoreN = i8;
        this.noScrollAutoDelayMs = j;
        this.maxConsecutivePostRefreshAutoLoad = i9;
    }
}

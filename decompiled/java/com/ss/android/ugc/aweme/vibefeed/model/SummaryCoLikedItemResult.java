package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SummaryCoLikedItemResult {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("has_more_item")
    public final Boolean hasMoreItem;

    @C09CT("has_prev")
    public final Boolean hasPrev;

    @C09CT("has_prev_item")
    public final Boolean hasPrevItem;

    @C09CT("feed_items")
    public final List<VibeFeedItem> itemList;

    @C09CT("next_feed_id")
    public final String nextFeedId;

    @C09CT("next_offset")
    public final Integer nextFeedOffset;

    public SummaryCoLikedItemResult() {
        this(null, Boolean.FALSE, "", Boolean.FALSE, null, null, null);
    }

    public SummaryCoLikedItemResult(List<VibeFeedItem> list, Boolean bool, String str, Boolean bool2, Integer num, Boolean bool3, Boolean bool4) {
        this.itemList = list;
        this.hasMore = bool;
        this.nextFeedId = str;
        this.hasPrev = bool2;
        this.nextFeedOffset = num;
        this.hasMoreItem = bool3;
        this.hasPrevItem = bool4;
    }
}

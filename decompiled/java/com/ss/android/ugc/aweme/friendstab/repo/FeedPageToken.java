package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FeedPageToken {

    @C09CT("has_return_item_length")
    public final Integer hasReturnItemLength;

    @C09CT("has_shown_lvb")
    public final Boolean hasShownLvb;

    @C09CT("has_shown_maf_content_count")
    public final int hasShownMafContentCount;

    @C09CT("prev_page_last_item_create_time_unix")
    public final long lastItemCreateTime;

    @C09CT("prev_page_last_item_id")
    public final Long lastItemId;

    @C09CT("maf_shown_map")
    public final Map<String, Boolean> mafShownMap;

    @C09CT("prev_item_is_not_maf")
    public final Boolean prevItemIsNotMaf;

    public FeedPageToken(long j, Long l, Integer num, Boolean bool, Map<String, Boolean> map, int i, Boolean bool2) {
        this.lastItemCreateTime = j;
        this.lastItemId = l;
        this.hasReturnItemLength = num;
        this.hasShownLvb = bool;
        this.mafShownMap = map;
        this.hasShownMafContentCount = i;
        this.prevItemIsNotMaf = bool2;
    }
}

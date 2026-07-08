package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class CommonFeedData {

    @C09CT("feed_list")
    public final List<Feed> feedList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final Integer nextCursor;

    @C09CT("request_id")
    public final String requestID;

    @C09CT("session_id")
    public final String sessionID;

    public CommonFeedData() {
        this(null, false, null, null, null);
    }

    public CommonFeedData(List<Feed> list, boolean z, Integer num, String str, String str2) {
        this.feedList = list;
        this.hasMore = z;
        this.nextCursor = num;
        this.requestID = str;
        this.sessionID = str2;
    }
}

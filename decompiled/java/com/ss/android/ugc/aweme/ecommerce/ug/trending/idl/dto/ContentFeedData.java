package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class ContentFeedData implements Serializable {

    @C09CT("feed_list")
    public final List<Feed> feedList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final Integer nextCursor;
    public final String title;

    public ContentFeedData() {
        this(null, null, null, null, 15, null);
    }

    public ContentFeedData(Boolean bool, Integer num, List<Feed> list, String str) {
        this.hasMore = bool;
        this.nextCursor = num;
        this.feedList = list;
        this.title = str;
    }

    public ContentFeedData(Boolean bool, Integer num, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : str);
    }
}

package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchVideoItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("cover_url_list")
    public final List<String> coverUrlList;

    @C09CT("digg_count")
    public final long diggCount;

    public SearchVideoItem() {
        this(null, 0L, null, 7, null);
    }

    public SearchVideoItem(String str, long j, List<String> list) {
        this.awemeId = str;
        this.diggCount = j;
        this.coverUrlList = list;
    }

    public SearchVideoItem(String str, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}

package com.ss.android.ugc.aweme.series.feed.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaCenterRequest {

    @C09CT("count")
    public final Integer count;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("filter")
    public final Map<String, String> filter;

    @C09CT("is_from_innerfeed_discover")
    public final Boolean isFromInnerfeedDiscover;

    public MiniDramaCenterRequest(Map<String, String> map, String str, Integer num, Boolean bool) {
        this.filter = map;
        this.cursor = str;
        this.count = num;
        this.isFromInnerfeedDiscover = bool;
    }
}

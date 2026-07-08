package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PostSearchInfo implements Serializable {

    @C09CT("query_id")
    public String queryId;

    @C09CT("recalled_query")
    public String recalledQuery;

    @C09CT("recalled_query_search_ts")
    public String recalledQuerySearchTS;

    public PostSearchInfo() {
    }

    public PostSearchInfo(String str, String str2, String str3) {
        this.queryId = str;
        this.recalledQuery = str2;
        this.recalledQuerySearchTS = str3;
    }
}

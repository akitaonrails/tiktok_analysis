package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SuggestedQueryStruct {

    @C09CT("search_queries")
    public List<String> searchQueries;

    public SuggestedQueryStruct() {
        this(null);
    }

    public SuggestedQueryStruct(List<String> list) {
        this.searchQueries = list;
    }

    public final void setSearchQueries(List<String> list) {
        this.searchQueries = list;
    }
}

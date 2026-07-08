package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class SuggestedQueryList extends BaseResponse {

    @C09CT("search_query")
    public SuggestedQueryStruct searchQuery;

    public final SuggestedQueryStruct getSearchQuery() {
        return this.searchQuery;
    }

    public final void setSearchQuery(SuggestedQueryStruct suggestedQueryStruct) {
        this.searchQuery = suggestedQueryStruct;
    }
}

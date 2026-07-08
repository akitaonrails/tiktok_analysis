package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchExtraStruct implements Serializable {

    @C09CT("liveProductStruct")
    public SearchLiveCommdityStruct liveProductStruct;

    @C09CT("search_live_struct")
    public SearchLiveStruct searchLiveStruct;

    @C09CT("searchShopStruct")
    public SearchShopStruct searchShopStruct;

    public final SearchLiveCommdityStruct getLiveProductStruct() {
        return this.liveProductStruct;
    }

    public final SearchLiveStruct getSearchLiveStruct() {
        return this.searchLiveStruct;
    }

    public final SearchShopStruct getSearchShopStruct() {
        return this.searchShopStruct;
    }

    public final void setLiveProductStruct(SearchLiveCommdityStruct searchLiveCommdityStruct) {
        this.liveProductStruct = searchLiveCommdityStruct;
    }

    public final void setSearchLiveStruct(SearchLiveStruct searchLiveStruct) {
        this.searchLiveStruct = searchLiveStruct;
    }

    public final void setSearchShopStruct(SearchShopStruct searchShopStruct) {
        this.searchShopStruct = searchShopStruct;
    }
}

package com.ss.android.ugc.aweme.ecommerce.search.result.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveList extends SearchApiResult {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public Boolean hasMore = Boolean.FALSE;

    @C09CT("e_com_mall_live_card_items")
    public List<EComMallLiveTabCardStruct> liveCardItems;
}

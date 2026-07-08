package com.ss.android.ugc.aweme.ecommerce.search.result.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EComMallLiveTabCardStruct {

    @C09CT("creator_card_info")
    public final EComCreatorSearchStruct creatorCardInfo;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("shop_card_info")
    public final EComShopCardStruct shopCardInfo;

    public EComMallLiveTabCardStruct(EComShopCardStruct eComShopCardStruct, EComCreatorSearchStruct eComCreatorSearchStruct, String str) {
        this.shopCardInfo = eComShopCardStruct;
        this.creatorCardInfo = eComCreatorSearchStruct;
        this.searchResultId = str;
    }
}

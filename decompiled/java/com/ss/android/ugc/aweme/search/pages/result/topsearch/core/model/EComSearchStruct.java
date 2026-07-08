package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EComSearchStruct {

    @C09CT("is_precision_search")
    public final Boolean isPrecisionSearch;

    @C09CT("product_info")
    public final ShopStruct productInfo;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("type")
    public final int type;

    public EComSearchStruct() {
        this(0, null, null, null);
    }

    public EComSearchStruct(int i, ShopStruct shopStruct, String str, Boolean bool) {
        this.type = i;
        this.productInfo = shopStruct;
        this.searchResultId = str;
        this.isPrecisionSearch = bool;
    }
}

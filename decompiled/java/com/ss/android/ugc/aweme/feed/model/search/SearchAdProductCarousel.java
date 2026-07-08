package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdProductCarousel implements Serializable {

    @C09CT("product_list")
    public List<SearchCarouselAdsProductInfo> productList;

    public final List<SearchCarouselAdsProductInfo> getProductList() {
        return this.productList;
    }

    public final void setProductList(List<SearchCarouselAdsProductInfo> list) {
        this.productList = list;
    }
}

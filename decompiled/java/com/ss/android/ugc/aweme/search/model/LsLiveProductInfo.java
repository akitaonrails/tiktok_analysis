package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class LsLiveProductInfo implements Serializable {

    @C09CT("brand_cover")
    public final UrlModel brandCover;

    @C09CT("discount_price")
    public final String discountPrice;

    @C09CT("discount_price_unit")
    public final String discountPriceUnit;

    @C09CT("index_in_shelf")
    public final Integer indexInShelf;

    @C09CT("is_first_shelf")
    public final Integer isFirstShelf;

    @C09CT("is_pining")
    public final Integer isPinning;

    @C09CT("original_price")
    public final String originPrice;

    @C09CT("original_price_unit")
    public final String originPriceUnit;

    @C09CT("product_cover")
    public final UrlModel produceCover;

    @C09CT("product_id")
    public final Long productId;

    @C09CT("product_title")
    public final String productTitle;

    public final Integer isFirstShelf() {
        return this.isFirstShelf;
    }

    public final Integer isPinning() {
        return this.isPinning;
    }

    public LsLiveProductInfo(Long l, String str, String str2, String str3, String str4, String str5, UrlModel urlModel, UrlModel urlModel2, Integer num, Integer num2, Integer num3) {
        this.productId = l;
        this.productTitle = str;
        this.discountPriceUnit = str2;
        this.discountPrice = str3;
        this.originPriceUnit = str4;
        this.originPrice = str5;
        this.produceCover = urlModel;
        this.brandCover = urlModel2;
        this.isPinning = num;
        this.isFirstShelf = num2;
        this.indexInShelf = num3;
    }
}

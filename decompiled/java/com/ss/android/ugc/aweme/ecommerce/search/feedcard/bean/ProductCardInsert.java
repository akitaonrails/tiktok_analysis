package com.ss.android.ugc.aweme.ecommerce.search.feedcard.bean;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductCardInsert implements Serializable {

    @C09CT("card_type")
    public final String cardType;

    @C09CT("product_card_list")
    public final List<ProductCardItem> productCardList;

    public ProductCardInsert(String str, List<ProductCardItem> list) {
        this.cardType = str;
        this.productCardList = list;
    }
}

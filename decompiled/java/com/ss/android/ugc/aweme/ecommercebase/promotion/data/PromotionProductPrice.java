package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PromotionProductPrice implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("min_price")
    public final SinglePriceItem minPrice;

    public PromotionProductPrice() {
        this(null, null);
    }

    public PromotionProductPrice(SinglePriceItem singlePriceItem, String str) {
        this.minPrice = singlePriceItem;
        this.daInfo = str;
    }
}

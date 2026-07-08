package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class FavoriteSkuPrice {

    @C09CT("currency")
    public final String currency;

    @C09CT("price_val")
    public final String price;

    public FavoriteSkuPrice(String str, String str2) {
        this.price = str;
        this.currency = str2;
    }
}

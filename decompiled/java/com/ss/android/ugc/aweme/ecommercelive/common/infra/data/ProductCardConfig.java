package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ProductCardConfig {

    @C09CT("layout_style")
    public final int layoutStyle;

    @C09CT("price_style")
    public final int priceStyle;

    public ProductCardConfig() {
        this(0, 0);
    }

    public ProductCardConfig(int i, int i2) {
        this.layoutStyle = i;
        this.priceStyle = i2;
    }
}

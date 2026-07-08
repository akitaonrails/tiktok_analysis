package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomCartLynxImagePreloadModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("product_count")
    public final int productCount;

    @C09CT("seller_count")
    public final int sellerCount;

    public EcomCartLynxImagePreloadModel() {
        this(false, 0, 0);
    }

    public EcomCartLynxImagePreloadModel(boolean z, int i, int i2) {
        this.enable = z;
        this.productCount = i;
        this.sellerCount = i2;
    }
}

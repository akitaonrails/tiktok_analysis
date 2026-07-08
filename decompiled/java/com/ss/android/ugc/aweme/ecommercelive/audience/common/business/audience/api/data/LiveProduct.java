package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveProduct {

    @C09CT("products")
    public final List<AssembleProduct> products;

    public LiveProduct() {
        this(null);
    }

    public LiveProduct(List<AssembleProduct> list) {
        this.products = list;
    }
}

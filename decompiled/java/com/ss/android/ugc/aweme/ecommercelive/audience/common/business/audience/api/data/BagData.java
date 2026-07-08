package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BagData {

    @C09CT("products")
    public final List<Product> products;

    @C09CT("total")
    public final int total;

    public BagData(List<Product> list, int i) {
        this.products = list;
        this.total = i;
    }
}

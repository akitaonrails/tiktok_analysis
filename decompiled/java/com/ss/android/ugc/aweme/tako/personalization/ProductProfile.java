package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.model.TakoProductCartSignal;
import com.ss.android.ugc.aweme.tako.model.TakoProductOrderSignal;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class ProductProfile {

    @C09CT("cart_product_history")
    public final List<TakoProductCartSignal> cartProducts;

    @C09CT("order_product_history")
    public final List<TakoProductOrderSignal> orderProducts;

    public ProductProfile() {
        this(null, null);
    }

    public ProductProfile(List<TakoProductCartSignal> list, List<TakoProductOrderSignal> list2) {
        this.cartProducts = list;
        this.orderProducts = list2;
    }
}

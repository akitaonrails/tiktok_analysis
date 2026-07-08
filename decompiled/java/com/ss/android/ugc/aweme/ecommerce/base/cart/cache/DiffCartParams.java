package com.ss.android.ugc.aweme.ecommerce.base.cart.cache;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class DiffCartParams {

    @C09CT("cart_item_params")
    public final List<String> diffParams;

    @C09CT("diff_shop_index")
    public final Integer diffShopCount;

    public DiffCartParams(Integer num, List<String> list) {
        this.diffShopCount = num;
        this.diffParams = list;
    }
}

package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CartRefreshEvent {

    @C09CT("add_count")
    public final Integer addCount;

    @C09CT("cart_item")
    public final Map<String, String> cartItem;

    @C09CT("count")
    public final Integer count;

    @C09CT("extra_info")
    public final Map<String, Object> extraInfo;

    @C09CT("is_single_sku")
    public final Boolean isSingleSku;

    @C09CT("refresh")
    public final int refresh;

    @C09CT("toast")
    public final String toast;

    public CartRefreshEvent(int i, Integer num, Map<String, String> map, Integer num2, Map<String, ? extends Object> map2, String str, Boolean bool) {
        this.refresh = i;
        this.count = num;
        this.cartItem = map;
        this.addCount = num2;
        this.extraInfo = map2;
        this.toast = str;
        this.isSingleSku = bool;
    }
}

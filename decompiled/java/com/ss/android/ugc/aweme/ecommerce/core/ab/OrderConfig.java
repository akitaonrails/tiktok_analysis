package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderConfig {

    @C09CT("add_to_cart_entrance_info_keys")
    public List<String> addToCardEntranceInfoKeys;

    @C09CT("order_entrance_info_keys")
    public List<String> orderEntranceInfoKeys;

    @C09CT("single_sku_order_enable")
    public boolean singleSkuOrderEnable;

    public OrderConfig() {
        this(new ArrayList(), new ArrayList(), true);
    }

    public OrderConfig(List<String> list, List<String> list2, boolean z) {
        this.orderEntranceInfoKeys = list;
        this.addToCardEntranceInfoKeys = list2;
        this.singleSkuOrderEnable = z;
    }
}

package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderSubmitRequestParam {

    @C09CT("one_step_order_type")
    public final Integer oneStepOrderType;

    @C09CT("order_shop")
    public final List<OrderShopDigest> orderShopDigest;

    public OrderSubmitRequestParam(List<OrderShopDigest> list, Integer num) {
        this.orderShopDigest = list;
        this.oneStepOrderType = num;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuReachable {

    @C09CT("order_sku")
    public OrderSKUDTO orderSku;

    @C09CT("reachable")
    public Boolean reachable;

    public SkuReachable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuReachable)) {
            return false;
        }
        SkuReachable skuReachable = (SkuReachable) obj;
        return Intrinsics.LJFF(this.orderSku, skuReachable.orderSku) && Intrinsics.LJFF(this.reachable, skuReachable.reachable);
    }

    public SkuReachable(OrderSKUDTO orderSKUDTO, Boolean bool) {
        this.orderSku = orderSKUDTO;
        this.reachable = bool;
    }
}

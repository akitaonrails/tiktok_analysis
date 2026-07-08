package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderShopDigest implements Serializable {
    public static final int $stable = 8;

    @C09CT("delivery_option")
    public final Integer deliveryOption;

    @C09CT("order_sku")
    public final List<OrderSKUDTO> orderSKUs;

    @C09CT("seller_id")
    public final String sellerId;

    public final OrderShopDigest copy(String str, List<OrderSKUDTO> list, Integer num) {
        return new OrderShopDigest(str, list, num);
    }

    public final OrderShopDigest merge(OrderShopDigest orderShopDigest) {
        if (orderShopDigest == null) {
            return this;
        }
        String str = orderShopDigest.sellerId;
        if (str == null) {
            str = this.sellerId;
        }
        List<OrderSKUDTO> list = orderShopDigest.orderSKUs;
        if (list == null) {
            list = this.orderSKUs;
        }
        Integer num = orderShopDigest.deliveryOption;
        if (num == null) {
            num = this.deliveryOption;
        }
        return new OrderShopDigest(str, list, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:4:0x000b, B:7:0x0024, B:6:0x0011), top: B:12:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OrderShopDigest(java.lang.String r4, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO> r5, java.lang.Integer r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.sellerId = r4
            r3.orderSKUs = r5
            r3.deliveryOption = r6
            if (r5 == 0) goto L11
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L24
        L11:
            X.03xw r2 = X.EnumC1014603xw.ERR27     // Catch: java.lang.Throwable -> L2a
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "orderSKUs is empty"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            X.03O0 r0 = X.C03O0.LIZ     // Catch: java.lang.Throwable -> L2a
            r0.getClass()     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C03O0.LIZIZ     // Catch: java.lang.Throwable -> L2a
            X.C1019103yf.LIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L2a
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L2a
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest.<init>(java.lang.String, java.util.List, java.lang.Integer):void");
    }
}

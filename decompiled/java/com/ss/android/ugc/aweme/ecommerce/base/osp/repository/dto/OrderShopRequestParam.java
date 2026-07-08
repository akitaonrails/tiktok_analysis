package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderShopRequestParam {

    @C09CT("order_sku")
    public final List<CreateOrderSku> createOrderSku;

    @C09CT("delivery_option")
    public final int deliveryOption;

    @C09CT("logistics_service_id")
    public final String logisticsServiceId;

    @C09CT("phone_credit")
    public final PhoneCredit phoneCredit;

    @C09CT("pudo_id")
    public final String pudoId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("user_note")
    public final String userNote;

    @C09CT("warehouse_id")
    public final String warehouseId;

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x0015, B:7:0x002e, B:6:0x001b), top: B:12:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OrderShopRequestParam(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku> r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit r10, java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            r3.createOrderSku = r4
            r3.sellerId = r5
            r3.warehouseId = r6
            r3.deliveryOption = r7
            r3.logisticsServiceId = r8
            r3.userNote = r9
            r3.phoneCredit = r10
            r3.pudoId = r11
            if (r4 == 0) goto L1b
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2e
        L1b:
            X.03xw r2 = X.EnumC1014603xw.ERR25     // Catch: java.lang.Throwable -> L34
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "orderSKUs is empty"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L34
            X.03O0 r0 = X.C03O0.LIZ     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C03O0.LIZIZ     // Catch: java.lang.Throwable -> L34
            X.C1019103yf.LIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L34
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L34
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopRequestParam.<init>(java.util.List, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit, java.lang.String):void");
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.coupon;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CouponClaimSuccessEvent {

    @C09CT("voucher_list")
    public final String voucherList;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> LIZ() {
        /*
            r6 = this;
            java.lang.String r5 = r6.voucherList
            r4 = 0
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L4b
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L4b
            r0.getClass()     // Catch: com.google.gson.s -> L4b
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L4b
            if (r0 == 0) goto L18
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L4b
            r0 = 1
            if (r1 != r0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            X.042p r0 = new X.042p     // Catch: com.google.gson.s -> L4b
            r0.<init>()     // Catch: com.google.gson.s -> L4b
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L4b
            goto L3f
        L26:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L4b
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> r0 = com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L4b
            r1.getClass()     // Catch: com.google.gson.s -> L4b
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L4b
            X.13JW r0 = X.C13LE.LJFF(r2, r0)     // Catch: com.google.gson.s -> L4b
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L4b
        L3f:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r5, r0)     // Catch: com.google.gson.s -> L4b
            boolean r0 = r1 instanceof java.util.List     // Catch: com.google.gson.s -> L4b
            if (r0 != 0) goto L48
            r1 = r4
        L48:
            java.util.List r1 = (java.util.List) r1     // Catch: com.google.gson.s -> L4b
            return r1
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimSuccessEvent.LIZ():java.util.List");
    }

    public CouponClaimSuccessEvent(String str) {
        this.voucherList = str;
    }
}

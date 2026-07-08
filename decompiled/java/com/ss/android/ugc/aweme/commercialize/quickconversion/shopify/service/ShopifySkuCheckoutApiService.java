package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service;

import X.C1499850p8J;
import X.InterfaceC1364105Vn;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutProductDetailRequest;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutProductDetailResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutApiService implements IShopifySkuCheckoutApiService {
    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.IShopifySkuCheckoutApiService
    public final Object LIZ(String str, ShopifySkuCheckoutProductDetailRequest shopifySkuCheckoutProductDetailRequest, InterfaceC1364105Vn<? super ShopifySkuCheckoutProductDetailResponse> interfaceC1364105Vn) {
        C1499850p8J c1499850p8JCreateBuilder;
        ShopifySkuCheckoutApi shopifySkuCheckoutApi;
        ShopifySkuCheckoutApi.LIZ.getClass();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) == null || (shopifySkuCheckoutApi = (ShopifySkuCheckoutApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(ShopifySkuCheckoutApi.class)) == null) {
            return null;
        }
        return shopifySkuCheckoutApi.getShopifyProductDetail(shopifySkuCheckoutProductDetailRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.IShopifySkuCheckoutApiService
    public final Object LIZJ(String str, String str2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        boolean z;
        IRetrofitFactory iRetrofitFactory;
        C1499850p8J c1499850p8JCreateBuilder;
        ShopifySkuCheckoutApi shopifySkuCheckoutApi;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !u.LJJIIJZLJL(str2, str, false)) {
            return null;
        }
        ShopifySkuCheckoutApi.LIZ.getClass();
        if (str.length() == 0 || (iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null)) == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) == null || (shopifySkuCheckoutApi = (ShopifySkuCheckoutApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(ShopifySkuCheckoutApi.class)) == null) {
            return null;
        }
        return shopifySkuCheckoutApi.getRaw(str2, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.IShopifySkuCheckoutApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C20038813as
            if (r0 == 0) goto L23
            r4 = r3
            X.13as r4 = (X.C20038813as) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 != r2) goto L2d
            goto L29
        L23:
            X.13as r4 = new X.13as
            r4.<init>(r11, r3)
            goto L14
        L29:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L80
            goto L85
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r1)
            X.14Bx r0 = com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApi.LIZ
            r0.getClass()
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r5 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1
            if (r1 == 0) goto L70
            java.lang.String r0 = X.C0CQT.LIZJ
            X.0p8J r1 = r1.createBuilder(r0)
            if (r1 == 0) goto L70
            X.09Dj r0 = X.C2336109Dj.LJI()
            r1.LIZJ(r0)
            com.bytedance.ies.ugc.aweme.network.TTRetrofit r0 = r1.build()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApi> r1 = com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApi.class
            com.bytedance.retrofit2.Retrofit r0 = r0.retrofit
            java.lang.Object r1 = r0.LIZ(r1)
            com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApi r1 = (com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApi) r1
        L69:
            if (r1 != 0) goto L72
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L70:
            r1 = 0
            goto L69
        L72:
            com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutDataInteractRequest r0 = new com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutDataInteractRequest     // Catch: java.lang.Exception -> L80
            r0.<init>(r13, r14, r15)     // Catch: java.lang.Exception -> L80
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L80
            java.lang.Object r0 = r1.postDataInteract(r12, r0, r4)     // Catch: java.lang.Exception -> L80
            if (r0 != r3) goto L85
            return r3
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L86
        L85:
            r6 = 1
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.ShopifySkuCheckoutApiService.LIZIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}

package com.ss.android.ugc.aweme.checkout.service;

import X.C1385505bZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutTokenResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface ShopifyCheckoutTokenApi {
    public static final C1385505bZ LIZ = C1385505bZ.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/ad/shopify/checkout/auth/")
    Object getShopifyCheckoutToken(@InterfaceC1501070pAH("creative_id") String str, InterfaceC1364105Vn<? super ShopifyCheckoutTokenResponse> interfaceC1364105Vn);
}

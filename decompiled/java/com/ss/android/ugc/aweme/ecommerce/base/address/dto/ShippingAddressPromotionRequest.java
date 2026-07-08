package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddressPromotionRequest {

    @C09CT("address_source")
    public final Integer addressSource;

    @C09CT("server_params")
    public final String serverParams;

    public ShippingAddressPromotionRequest() {
        this(null, null);
    }

    public ShippingAddressPromotionRequest(Integer num, String str) {
        this.addressSource = num;
        this.serverParams = str;
    }
}

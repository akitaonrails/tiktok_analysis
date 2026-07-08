package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public class ShippingAddressSelectResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public ShippingAddressSelectResponse() {
        this(-1, null);
    }

    public ShippingAddressSelectResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}

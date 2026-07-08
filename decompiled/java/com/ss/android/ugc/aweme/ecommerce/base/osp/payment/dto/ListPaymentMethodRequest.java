package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ListPaymentMethodRequest {

    @C09CT("address_id")
    public final String addressId;

    @C09CT("agreement_id")
    public final String agreementId;

    @C09CT("amount")
    public final String amount;

    @C09CT("currency")
    public final String currency;

    @C09CT("entrance")
    public final String entrance;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("region")
    public final String region;

    public ListPaymentMethodRequest() {
        this(null, null, null, null, null, null, null);
    }

    public ListPaymentMethodRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.merchantUserId = str;
        this.region = str2;
        this.currency = str3;
        this.amount = str4;
        this.agreementId = str5;
        this.entrance = str6;
        this.addressId = str7;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;

/* JADX INFO: loaded from: classes2.dex */
public final class ListPaymentMethodResp {

    @C09CT("payment_methods")
    public final PaymentMethodsData pmd;

    @C09CT("address")
    public final Address shippingAddress;

    public ListPaymentMethodResp(PaymentMethodsData paymentMethodsData, Address address) {
        this.pmd = paymentMethodsData;
        this.shippingAddress = address;
    }
}

package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PaymentMethodInfo implements Serializable {

    @C09CT("max_amount")
    public final String maxAmount;

    @C09CT("min_amount")
    public final String minAmount;

    @C09CT("payment_method")
    public final String paymentMethod;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("payment_method_type")
    public final String paymentMethodType;

    public PaymentMethodInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.paymentMethodId = str;
        this.paymentMethod = str2;
        this.paymentMethodToken = str3;
        this.paymentMethodType = str4;
        this.maxAmount = str5;
        this.minAmount = str6;
    }
}

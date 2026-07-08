package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Balance {

    @C09CT("balance")
    public final String balance;

    @C09CT("balance_code")
    public final BalanceCode balanceCode;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    public Balance(String str, String str2, BalanceCode balanceCode, String str3) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.balanceCode = balanceCode;
        this.balance = str3;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentData {

    @C09CT("address")
    public AddressForPay address;

    @C09CT("cashier")
    public final n cashier;

    @C09CT("token_info")
    public final PipoTokenInfo pipoTokenInfo;

    public PaymentData(n nVar, PipoTokenInfo pipoTokenInfo, AddressForPay addressForPay) {
        this.cashier = nVar;
        this.pipoTokenInfo = pipoTokenInfo;
        this.address = addressForPay;
    }
}

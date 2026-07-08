package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PreDealPaymentResponse implements Serializable {

    @C09CT("payment_instrument_info")
    public final PaymentInstrumentInfo paymentInstrumentInfo;

    @C09CT("payment_params")
    public final List<PaymentParam> paymentParams;

    public PreDealPaymentResponse() {
        this(null, null);
    }

    public PreDealPaymentResponse(PaymentInstrumentInfo paymentInstrumentInfo, List<PaymentParam> list) {
        this.paymentInstrumentInfo = paymentInstrumentInfo;
        this.paymentParams = list;
    }
}

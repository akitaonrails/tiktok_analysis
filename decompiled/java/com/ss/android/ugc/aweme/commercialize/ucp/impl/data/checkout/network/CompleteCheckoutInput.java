package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class CompleteCheckoutInput {

    @C09CT("payment")
    public final CompleteCheckoutPaymentInput payment;

    public CompleteCheckoutInput() {
        this(null);
    }

    public CompleteCheckoutInput(CompleteCheckoutPaymentInput completeCheckoutPaymentInput) {
        this.payment = completeCheckoutPaymentInput;
    }
}

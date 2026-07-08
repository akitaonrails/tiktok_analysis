package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CompleteCheckoutPaymentInput {

    @C09CT("instruments")
    public final List<PaymentInstrumentInput> instruments;

    @C09CT("session_id")
    public final String sessionID;

    public CompleteCheckoutPaymentInput() {
        this(null, null);
    }

    public CompleteCheckoutPaymentInput(String str, List<PaymentInstrumentInput> list) {
        this.sessionID = str;
        this.instruments = list;
    }
}

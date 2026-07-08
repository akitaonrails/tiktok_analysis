package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes5.dex */
public final class PaymentInstrumentInput {

    @C09CT("billing_address")
    public final CheckoutDestinationInput billingAddress;

    @C09CT("credential")
    public final PaymentCredentialInput credential;

    @C09CT("handler_id")
    public final String handlerID;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final String type;

    public PaymentInstrumentInput(String str, String str2, String str3, PaymentCredentialInput paymentCredentialInput, CheckoutDestinationInput checkoutDestinationInput) {
        this.id = str;
        this.handlerID = str2;
        this.type = str3;
        this.credential = paymentCredentialInput;
        this.billingAddress = checkoutDestinationInput;
    }
}

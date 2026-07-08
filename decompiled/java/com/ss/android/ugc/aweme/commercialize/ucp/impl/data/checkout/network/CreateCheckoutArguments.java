package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class CreateCheckoutArguments {

    @C09CT("checkout")
    public final CheckoutDraft checkout;

    @C09CT("meta")
    public final CreateCheckoutMeta meta;

    public CreateCheckoutArguments(CreateCheckoutMeta createCheckoutMeta, CheckoutDraft checkoutDraft) {
        this.meta = createCheckoutMeta;
        this.checkout = checkoutDraft;
    }
}

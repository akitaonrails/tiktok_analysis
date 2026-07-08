package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutFulfillmentInput {

    @C09CT("methods")
    public final List<CheckoutFulfillmentMethodInput> methods;

    public CheckoutFulfillmentInput() {
        this(null);
    }

    public CheckoutFulfillmentInput(List<CheckoutFulfillmentMethodInput> list) {
        this.methods = list;
    }
}

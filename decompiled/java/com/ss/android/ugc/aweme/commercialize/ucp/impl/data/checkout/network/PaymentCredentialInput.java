package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class PaymentCredentialInput {

    @C09CT("token")
    public final String token;

    @C09CT("type")
    public final String type;

    public PaymentCredentialInput() {
        this(null, null);
    }

    public PaymentCredentialInput(String str, String str2) {
        this.type = str;
        this.token = str2;
    }
}

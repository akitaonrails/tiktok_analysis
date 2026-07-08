package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class Authentication {

    @C09CT("payload")
    public final String payload;

    @C09CT("version")
    public final AuthenticationVersion version;

    public Authentication(AuthenticationVersion authenticationVersion, String str) {
        this.version = authenticationVersion;
        this.payload = str;
    }
}

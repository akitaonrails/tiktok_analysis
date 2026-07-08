package com.shopify.checkout.models;

import X.C08FF;
import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public enum AuthenticationVersion {
    V1("v1"),
    V2("v2");


    @C09CT("value")
    public final String value;

    public static AuthenticationVersion valueOf(String str) {
        return (AuthenticationVersion) C08FF.LIZ(AuthenticationVersion.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    AuthenticationVersion(String str) {
        this.value = str;
    }
}

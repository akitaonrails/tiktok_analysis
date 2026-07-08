package com.ss.android.ugc.aweme.pipo.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoCheckoutBraintreePaypalConfigModel {

    @C09CT("enable_native")
    public final boolean enable;

    @C09CT("token")
    public final String token;

    public PipoCheckoutBraintreePaypalConfigModel() {
        this(false, null);
    }

    public PipoCheckoutBraintreePaypalConfigModel(boolean z, String str) {
        this.enable = z;
        this.token = str;
    }
}

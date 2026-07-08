package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckoutDiscountsInput {

    @C09CT("codes")
    public final List<String> codes;

    public CheckoutDiscountsInput() {
        this(null);
    }

    public CheckoutDiscountsInput(List<String> list) {
        this.codes = list;
    }
}

package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class SimplePrice implements Serializable {

    @C09CT("currency")
    public final String currency;

    @C09CT("price")
    public final String price;

    public SimplePrice(String str, String str2) {
        this.currency = str;
        this.price = str2;
    }
}

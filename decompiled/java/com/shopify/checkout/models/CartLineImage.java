package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CartLineImage {

    @C09CT("altText")
    public final String altText;

    @C09CT("lg")
    public final String lg;

    @C09CT("md")
    public final String md;

    @C09CT("sm")
    public final String sm;

    public CartLineImage(String str, String str2, String str3, String str4) {
        this.sm = str;
        this.md = str2;
        this.lg = str3;
        this.altText = str4;
    }
}

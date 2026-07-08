package com.shopify.checkout.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CartInfo {

    @C09CT("lines")
    public final List<CartLine> lines;

    @C09CT("price")
    public final Price price;

    @C09CT("token")
    public final String token;

    public CartInfo(String str, List<CartLine> list, Price price) {
        this.token = str;
        this.lines = list;
        this.price = price;
    }
}

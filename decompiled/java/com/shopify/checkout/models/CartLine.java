package com.shopify.checkout.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CartLine {

    @C09CT("discounts")
    public final List<Discount> discounts;

    @C09CT("image")
    public final CartLineImage image;

    @C09CT("merchandiseId")
    public final String merchandiseId;

    @C09CT("price")
    public final Money price;

    @C09CT("productId")
    public final String productId;

    @C09CT("quantity")
    public final int quantity;

    @C09CT("title")
    public final String title;

    public CartLine(String str, String str2, CartLineImage cartLineImage, int i, String str3, Money money, List<Discount> list) {
        this.merchandiseId = str;
        this.productId = str2;
        this.image = cartLineImage;
        this.quantity = i;
        this.title = str3;
        this.price = money;
        this.discounts = list;
    }
}

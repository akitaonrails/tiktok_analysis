package com.shopify.checkout.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class Price {

    @C09CT("discounts")
    public final List<Discount> discounts;

    @C09CT("shipping")
    public final Money shipping;

    @C09CT("subtotal")
    public final Money subtotal;

    @C09CT("taxes")
    public final Money taxes;

    @C09CT("taxesIncluded")
    public final Boolean taxesIncluded;

    @C09CT("total")
    public final Money total;

    public Price() {
        this(null, null, null, null, null, null);
    }

    public Price(Money money, Money money2, Money money3, Boolean bool, Money money4, List<Discount> list) {
        this.total = money;
        this.subtotal = money2;
        this.taxes = money3;
        this.taxesIncluded = bool;
        this.shipping = money4;
        this.discounts = list;
    }
}

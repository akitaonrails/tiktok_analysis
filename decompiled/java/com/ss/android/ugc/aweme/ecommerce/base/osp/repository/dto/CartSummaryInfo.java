package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CartSummaryInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("discounts")
    public final String discounts;

    @C09CT("shipping")
    public final String shipping;

    @C09CT("subtotal")
    public final String subtotal;

    @C09CT("taxes")
    public final String taxes;

    @C09CT("total")
    public final String total;

    public CartSummaryInfo() {
        this(null, null, null, null, null);
    }

    public CartSummaryInfo(String str, String str2, String str3, String str4, String str5) {
        this.subtotal = str;
        this.discounts = str2;
        this.shipping = str3;
        this.taxes = str4;
        this.total = str5;
    }
}

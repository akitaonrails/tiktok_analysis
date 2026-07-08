package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AuctionInfoSchema {

    @C09CT("address_edit_schema")
    public final String addressEditSchema;

    @C09CT("address_list_schema")
    public final String addressListSchema;

    @C09CT("payment_method_schema")
    public final String paymentMethodSchema;

    @C09CT("tax_edit_schema")
    public final String taxSchema;

    public AuctionInfoSchema(String str, String str2, String str3, String str4) {
        this.addressEditSchema = str;
        this.addressListSchema = str2;
        this.paymentMethodSchema = str3;
        this.taxSchema = str4;
    }
}

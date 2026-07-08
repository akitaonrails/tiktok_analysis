package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PudoAddressParam {

    @C09CT("address_id")
    public final String addressId;

    @C09CT("create_order_info_from_bill")
    public final String createOrderInfoFromBill;

    @C09CT("item_id")
    public final String itemId;

    public PudoAddressParam(String str, String str2, String str3) {
        this.itemId = str;
        this.addressId = str2;
        this.createOrderInfoFromBill = str3;
    }
}

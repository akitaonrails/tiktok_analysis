package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressInfoItem {

    @C09CT("button")
    public final StarlingKeyValue button;

    @C09CT("status_code")
    public final String code;

    @C09CT("is_prefill")
    public final Boolean isPrefill;

    @C09CT("shipping_address")
    public final ShippingAddress shippingAddress;

    @C09CT("sub_text")
    public final String text;

    @C09CT("shipping_address_title")
    public final String title;

    @C09CT("jump_type")
    public final AddressJumpType type;

    public AddressInfoItem(String str, ShippingAddress shippingAddress, String str2, StarlingKeyValue starlingKeyValue, AddressJumpType addressJumpType, String str3, Boolean bool) {
        this.title = str;
        this.shippingAddress = shippingAddress;
        this.text = str2;
        this.button = starlingKeyValue;
        this.type = addressJumpType;
        this.code = str3;
        this.isPrefill = bool;
    }
}

package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;

/* JADX INFO: loaded from: classes27.dex */
public final class GetCartEntryRequest {

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("cart_entry_from")
    public final CartEntryFrom cartEntryFrom;

    @C09CT("cart_entry_options")
    public final CartEntryOptions cartEntryOptions;

    @C09CT("field_ctx")
    public final FieldContext fieldContext;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    public GetCartEntryRequest() {
        this(null, null, null, null, null);
    }

    public GetCartEntryRequest(CartEntryFrom cartEntryFrom, CartEntryOptions cartEntryOptions, String str, String str2, FieldContext fieldContext) {
        this.cartEntryFrom = cartEntryFrom;
        this.cartEntryOptions = cartEntryOptions;
        this.pageSourceInfo = str;
        this.buyerAddrId = str2;
        this.fieldContext = fieldContext;
    }
}

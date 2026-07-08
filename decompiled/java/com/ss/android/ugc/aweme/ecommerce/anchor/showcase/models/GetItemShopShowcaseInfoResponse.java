package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class GetItemShopShowcaseInfoResponse implements Serializable {

    @C09CT("extra")
    public final String extra;

    @C09CT("second_line_text")
    public final String secondLineText;

    @C09CT("shop")
    public final PackedShop shop;

    public GetItemShopShowcaseInfoResponse() {
        this(null, null, null);
    }

    public GetItemShopShowcaseInfoResponse(PackedShop packedShop, String str, String str2) {
        this.shop = packedShop;
        this.secondLineText = str;
        this.extra = str2;
    }
}

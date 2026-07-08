package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPSeaBffPrice {

    @C09CT("discount")
    public final String discount;

    @C09CT("hide_price_tip")
    public final String hidePriceTip;

    @C09CT("need_icon")
    public final boolean needIcon;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("real_price")
    public final String realPrice;

    @C09CT("real_price_decimal")
    public final String realPriceDecimal;

    public PDPSeaBffPrice() {
        this(null, null, null, null, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPSeaBffPrice)) {
            return false;
        }
        PDPSeaBffPrice pDPSeaBffPrice = (PDPSeaBffPrice) obj;
        return Intrinsics.LJFF(this.realPrice, pDPSeaBffPrice.realPrice) && Intrinsics.LJFF(this.realPriceDecimal, pDPSeaBffPrice.realPriceDecimal) && Intrinsics.LJFF(this.originalPrice, pDPSeaBffPrice.originalPrice) && Intrinsics.LJFF(this.pricePrefix, pDPSeaBffPrice.pricePrefix) && this.needIcon == pDPSeaBffPrice.needIcon && Intrinsics.LJFF(this.discount, pDPSeaBffPrice.discount) && Intrinsics.LJFF(this.hidePriceTip, pDPSeaBffPrice.hidePriceTip);
    }

    public PDPSeaBffPrice(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.realPrice = str;
        this.realPriceDecimal = str2;
        this.originalPrice = str3;
        this.pricePrefix = str4;
        this.needIcon = z;
        this.discount = str5;
        this.hidePriceTip = str6;
    }
}

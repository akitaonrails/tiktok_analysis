package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutProductSnapshot implements Serializable {

    @C09CT("current_price")
    public final String currentPrice;

    @C09CT("discount_rate")
    public final String discountRate;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("raw_original_price")
    public final Double rawOriginalPrice;

    @C09CT("shipping_strategy")
    public final String shippingStrategy;

    @C09CT("shop_name")
    public final String shopName;

    @C09CT("title")
    public final String title;

    @C09CT("variants_title")
    public final String variantsTitle;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductSnapshot)) {
            return false;
        }
        CheckoutProductSnapshot checkoutProductSnapshot = (CheckoutProductSnapshot) obj;
        return Intrinsics.LJFF(this.title, checkoutProductSnapshot.title) && Intrinsics.LJFF(this.variantsTitle, checkoutProductSnapshot.variantsTitle) && Intrinsics.LJFF(this.imageUrl, checkoutProductSnapshot.imageUrl) && Intrinsics.LJFF(this.currentPrice, checkoutProductSnapshot.currentPrice) && Intrinsics.LJFF(this.originalPrice, checkoutProductSnapshot.originalPrice) && Intrinsics.LJFF(this.discountRate, checkoutProductSnapshot.discountRate) && Intrinsics.LJFF(this.rawOriginalPrice, checkoutProductSnapshot.rawOriginalPrice) && Intrinsics.LJFF(this.shopName, checkoutProductSnapshot.shopName) && Intrinsics.LJFF(this.shippingStrategy, checkoutProductSnapshot.shippingStrategy);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variantsTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentPrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originalPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discountRate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.rawOriginalPrice;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        String str7 = this.shopName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shippingStrategy;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutProductSnapshot(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", variantsTitle=");
        sbLIZ.append(this.variantsTitle);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", currentPrice=");
        sbLIZ.append(this.currentPrice);
        sbLIZ.append(", originalPrice=");
        sbLIZ.append(this.originalPrice);
        sbLIZ.append(", discountRate=");
        sbLIZ.append(this.discountRate);
        sbLIZ.append(", rawOriginalPrice=");
        sbLIZ.append(this.rawOriginalPrice);
        sbLIZ.append(", shopName=");
        sbLIZ.append(this.shopName);
        sbLIZ.append(", shippingStrategy=");
        sbLIZ.append(this.shippingStrategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutProductSnapshot(String str, String str2, String str3, String str4, String str5, String str6, Double d, String str7, String str8) {
        this.title = str;
        this.variantsTitle = str2;
        this.imageUrl = str3;
        this.currentPrice = str4;
        this.originalPrice = str5;
        this.discountRate = str6;
        this.rawOriginalPrice = d;
        this.shopName = str7;
        this.shippingStrategy = str8;
    }
}

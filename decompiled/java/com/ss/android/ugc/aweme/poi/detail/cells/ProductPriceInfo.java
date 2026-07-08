package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class ProductPriceInfo implements Serializable {

    @C09CT("currency")
    public final String currency;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("date")
    public final String date;

    @C09CT("description")
    public final String description;

    @C09CT("discount_num")
    public final Float discountNum;

    @C09CT("discount_percent")
    public final String discountPercent;

    @C09CT("discount_tag")
    public final String discountTag;

    @C09CT("discount_tag_id")
    public final String discountTagId;

    @C09CT("is_use_promotion")
    public final Boolean isUsePromotion;

    @C09CT("offer_price")
    public final String offerPrice;

    @C09CT("offer_price_num")
    public final Float offerPriceNum;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("original_price_num")
    public final Float originalPriceNum;

    @C09CT("price_unit")
    public final String priceUnit;

    @C09CT("save_amount")
    public final Float saveAmount;

    @C09CT("tax_desc")
    public final String taxDesc;

    public ProductPriceInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.offerPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originalPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencySymbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.date;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.originalPriceNum;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.offerPriceNum;
        int iHashCode7 = (iHashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.discountTag;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discountPercent;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Float f3 = this.saveAmount;
        int iHashCode11 = (iHashCode10 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.discountNum;
        int iHashCode12 = (iHashCode11 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str9 = this.priceUnit;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.taxDesc;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.isUsePromotion;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.discountTagId;
        return iHashCode15 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "ProductPriceInfo(offerPrice=" + this.offerPrice + ", originalPrice=" + this.originalPrice + ", currencySymbol=" + this.currencySymbol + ", date=" + this.date + ", description=" + this.description + ", originalPriceNum=" + this.originalPriceNum + ", offerPriceNum=" + this.offerPriceNum + ", currency=" + this.currency + ", discountTag=" + this.discountTag + ", discountPercent=" + this.discountPercent + ", saveAmount=" + this.saveAmount + ", discountNum=" + this.discountNum + ", priceUnit=" + this.priceUnit + ", taxDesc=" + this.taxDesc + ", isUsePromotion=" + this.isUsePromotion + ", discountTagId=" + this.discountTagId + ')';
    }

    public final Boolean isUsePromotion() {
        return this.isUsePromotion;
    }

    public ProductPriceInfo(String str, String str2, String str3, String str4, String str5, Float f, Float f2, String str6, String str7, String str8, Float f3, Float f4, String str9, String str10, Boolean bool, String str11) {
        this.offerPrice = str;
        this.originalPrice = str2;
        this.currencySymbol = str3;
        this.date = str4;
        this.description = str5;
        this.originalPriceNum = f;
        this.offerPriceNum = f2;
        this.currency = str6;
        this.discountTag = str7;
        this.discountPercent = str8;
        this.saveAmount = f3;
        this.discountNum = f4;
        this.priceUnit = str9;
        this.taxDesc = str10;
        this.isUsePromotion = bool;
        this.discountTagId = str11;
    }
}

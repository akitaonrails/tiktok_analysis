package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SkuPrice {

    @C09CT("currency")
    public final String currency;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("discount_num")
    public final Double discountNum;

    @C09CT("discount_percent")
    public final String discountPercent;

    @C09CT("discount_tag")
    public final String discountTag;

    @C09CT("discount_type")
    public final String discountType;

    @C09CT("offer_price")
    public final String offerPrice;

    @C09CT("offer_price_num")
    public final Double offerPriceNum;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("original_price_num")
    public final Double originalPriceNum;

    @C09CT("save_amount")
    public final String saveAmount;

    @C09CT("ttls_track_id")
    public final String ttlsTrackId;

    public int hashCode() {
        String str = this.currencySymbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offerPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountTag;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discountType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.saveAmount;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.discountNum;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str8 = this.discountPercent;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d2 = this.originalPriceNum;
        int iHashCode10 = (iHashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.offerPriceNum;
        int iHashCode11 = (iHashCode10 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str9 = this.ttlsTrackId;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "SkuPrice(currencySymbol=" + this.currencySymbol + ", offerPrice=" + this.offerPrice + ", originalPrice=" + this.originalPrice + ", currency=" + this.currency + ", discountTag=" + this.discountTag + ", discountType=" + this.discountType + ", saveAmount=" + this.saveAmount + ", discountNum=" + this.discountNum + ", discountPercent=" + this.discountPercent + ", originalPriceNum=" + this.originalPriceNum + ", offerPriceNum=" + this.offerPriceNum + ", ttlsTrackId=" + this.ttlsTrackId + ')';
    }

    public SkuPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, Double d2, Double d3, String str9) {
        this.currencySymbol = str;
        this.offerPrice = str2;
        this.originalPrice = str3;
        this.currency = str4;
        this.discountTag = str5;
        this.discountType = str6;
        this.saveAmount = str7;
        this.discountNum = d;
        this.discountPercent = str8;
        this.originalPriceNum = d2;
        this.offerPriceNum = d3;
        this.ttlsTrackId = str9;
    }
}

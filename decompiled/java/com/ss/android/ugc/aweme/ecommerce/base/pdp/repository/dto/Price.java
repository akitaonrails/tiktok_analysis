package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class Price {

    @C09CT("currency")
    public final String currency;

    @C09CT("discount")
    public final String discount;

    @C09CT("discount_value")
    public final Float discountValue;

    @C09CT("max_price")
    public final String maxPrice;

    @C09CT("max_real_price")
    public final String maxRealPrice;

    @C09CT("min_price")
    public final String minPrice;

    @C09CT("min_real_price")
    public final String minRealPrice;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("style")
    public final Integer style;

    public final int hashCode() {
        String str = this.minPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minRealPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxRealPrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discount;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.discountValue;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.pricePrefix;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public Price(String str, String str2, String str3, String str4, String str5, Float f, Integer num, String str6, String str7) {
        this.minPrice = str;
        this.maxPrice = str2;
        this.minRealPrice = str3;
        this.maxRealPrice = str4;
        this.discount = str5;
        this.discountValue = f;
        this.style = num;
        this.pricePrefix = str6;
        this.currency = str7;
    }
}

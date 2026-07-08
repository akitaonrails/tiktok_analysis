package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BundlePrice {

    @C09CT("deposit_fee_desc")
    public final String depositFeeDesc;

    @C09CT("discount")
    public final String discount;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("real_price")
    public final String realPrice;

    @C09CT("save_price")
    public final String savePrice;

    @C09CT("unit_price_desc")
    public final String unitPriceDesc;

    public final int hashCode() {
        String str = this.originalPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.savePrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pricePrefix;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.unitPriceDesc;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.depositFeeDesc;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public BundlePrice(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.originalPrice = str;
        this.realPrice = str2;
        this.discount = str3;
        this.savePrice = str4;
        this.pricePrefix = str5;
        this.unitPriceDesc = str6;
        this.depositFeeDesc = str7;
    }
}

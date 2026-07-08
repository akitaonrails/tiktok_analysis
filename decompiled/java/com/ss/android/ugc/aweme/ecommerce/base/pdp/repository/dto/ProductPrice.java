package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductPrice implements Parcelable {

    @C09CT("currency")
    public String currency;

    @C09CT("currency_symbol")
    public String currencySymbol;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("discount")
    public String discount;

    @C09CT("has_discount")
    public Boolean hasDiscount;

    @C09CT("hide_price_tip")
    public String hidePriceTip;

    @C09CT("max_sku_price")
    public String maxSkuPrice;

    @C09CT("min_sku_price")
    public String minSkuPrice;

    @C09CT("need_icon")
    public Boolean needIcon;

    @C09CT("original_price")
    public String originPrice;

    @C09CT("panel_schema")
    public String panelSchema;

    @C09CT("price_label_info")
    public PromotionLabelVO priceLabels;

    @C09CT("price_prefix")
    public String pricePrefix;

    @C09CT("real_price")
    public String realPrice;

    @C09CT("real_price_decimal")
    public String realPriceDecimal;

    @C09CT("show_hot_zone")
    public Boolean showHotZone;

    @C09CT("symbol_position")
    public Integer symbolPosition;

    @C09CT("tax_include_desc")
    public String taxDescription;

    @C09CT("unit_price_desc")
    public String unitPriceDescription;
    public static final Parcelable.Creator<ProductPrice> CREATOR = new Parcelable.Creator<ProductPrice>() { // from class: X.02oo
        @Override // android.os.Parcelable.Creator
        public final ProductPrice createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z3 = true;
            PromotionLabelVO promotionLabelVOCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                promotionLabelVOCreateFromParcel = PromotionLabelVO.CREATOR.createFromParcel(parcel);
            }
            return new ProductPrice(string, string2, string3, string4, boolValueOf, boolValueOf2, boolValueOf3, string5, string6, string7, string8, string9, string10, numValueOf, string11, string12, promotionLabelVOCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPrice[] newArray(int i) {
            return new ProductPrice[i];
        }
    };
    public static final int $stable = 8;

    public ProductPrice() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return Intrinsics.LJFF(this.originPrice, productPrice.originPrice) && Intrinsics.LJFF(this.realPrice, productPrice.realPrice) && Intrinsics.LJFF(this.realPriceDecimal, productPrice.realPriceDecimal) && Intrinsics.LJFF(this.discount, productPrice.discount) && Intrinsics.LJFF(this.hasDiscount, productPrice.hasDiscount) && Intrinsics.LJFF(this.needIcon, productPrice.needIcon) && Intrinsics.LJFF(this.showHotZone, productPrice.showHotZone) && Intrinsics.LJFF(this.pricePrefix, productPrice.pricePrefix) && Intrinsics.LJFF(this.panelSchema, productPrice.panelSchema) && Intrinsics.LJFF(this.minSkuPrice, productPrice.minSkuPrice) && Intrinsics.LJFF(this.maxSkuPrice, productPrice.maxSkuPrice) && Intrinsics.LJFF(this.currency, productPrice.currency) && Intrinsics.LJFF(this.currencySymbol, productPrice.currencySymbol) && Intrinsics.LJFF(this.symbolPosition, productPrice.symbolPosition) && Intrinsics.LJFF(this.taxDescription, productPrice.taxDescription) && Intrinsics.LJFF(this.unitPriceDescription, productPrice.unitPriceDescription) && Intrinsics.LJFF(this.priceLabels, productPrice.priceLabels) && Intrinsics.LJFF(this.daInfo, productPrice.daInfo) && Intrinsics.LJFF(this.hidePriceTip, productPrice.hidePriceTip);
    }

    public final int hashCode() {
        String str = this.originPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.realPriceDecimal;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.hasDiscount;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.needIcon;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showHotZone;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.pricePrefix;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.panelSchema;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.minSkuPrice;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.maxSkuPrice;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.currency;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currencySymbol;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.symbolPosition;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.taxDescription;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.unitPriceDescription;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        PromotionLabelVO promotionLabelVO = this.priceLabels;
        int iHashCode17 = (iHashCode16 + (promotionLabelVO == null ? 0 : promotionLabelVO.hashCode())) * 31;
        String str13 = this.daInfo;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.hidePriceTip;
        return iHashCode18 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        return "ProductPrice(originPrice=" + this.originPrice + ", realPrice=" + this.realPrice + ", realPriceDecimal=" + this.realPriceDecimal + ", discount=" + this.discount + ", hasDiscount=" + this.hasDiscount + ", needIcon=" + this.needIcon + ", showHotZone=" + this.showHotZone + ", pricePrefix=" + this.pricePrefix + ", panelSchema=" + this.panelSchema + ", minSkuPrice=" + this.minSkuPrice + ", maxSkuPrice=" + this.maxSkuPrice + ", currency=" + this.currency + ", currencySymbol=" + this.currencySymbol + ", symbolPosition=" + this.symbolPosition + ", taxDescription=" + this.taxDescription + ", unitPriceDescription=" + this.unitPriceDescription + ", priceLabels=" + this.priceLabels + ", daInfo=" + this.daInfo + ", hidePriceTip=" + this.hidePriceTip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originPrice);
        parcel.writeString(this.realPrice);
        parcel.writeString(this.realPriceDecimal);
        parcel.writeString(this.discount);
        Boolean bool = this.hasDiscount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.needIcon;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.showHotZone;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pricePrefix);
        parcel.writeString(this.panelSchema);
        parcel.writeString(this.minSkuPrice);
        parcel.writeString(this.maxSkuPrice);
        parcel.writeString(this.currency);
        parcel.writeString(this.currencySymbol);
        Integer num = this.symbolPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.taxDescription);
        parcel.writeString(this.unitPriceDescription);
        PromotionLabelVO promotionLabelVO = this.priceLabels;
        if (promotionLabelVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionLabelVO.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        parcel.writeString(this.hidePriceTip);
    }

    public ProductPrice(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, PromotionLabelVO promotionLabelVO, String str13, String str14) {
        this.originPrice = str;
        this.realPrice = str2;
        this.realPriceDecimal = str3;
        this.discount = str4;
        this.hasDiscount = bool;
        this.needIcon = bool2;
        this.showHotZone = bool3;
        this.pricePrefix = str5;
        this.panelSchema = str6;
        this.minSkuPrice = str7;
        this.maxSkuPrice = str8;
        this.currency = str9;
        this.currencySymbol = str10;
        this.symbolPosition = num;
        this.taxDescription = str11;
        this.unitPriceDescription = str12;
        this.priceLabels = promotionLabelVO;
        this.daInfo = str13;
        this.hidePriceTip = str14;
    }
}

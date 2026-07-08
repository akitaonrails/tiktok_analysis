package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPrice implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("discount")
    public String discount;

    @C09CT("discount_color")
    public Integer discountColor;

    @C09CT("discount_font")
    public Integer discountFont;

    @C09CT("front_load_discount")
    public Boolean frontLoadDiscount;

    @C09CT("has_discount")
    public Boolean hasDiscount;

    @C09CT("hide_price_tip")
    public String hidePriceTip;

    @C09CT("original_price")
    public String originalPrice;

    @C09CT("original_price_color")
    public Integer originalPriceColor;

    @C09CT("original_price_font")
    public Integer originalPriceFont;

    @C09CT("original_price_value")
    public String originalPriceVal;

    @C09CT("pfand_price_desc")
    public String pFandPriceDesc;

    @C09CT("price_label_info")
    public PromotionLabelVO priceLabels;

    @C09CT("price_prefix")
    public String pricePrefix;

    @C09CT("real_price")
    public Price realPrice;

    @C09CT("real_price_decimal")
    public String realPriceDecimal;

    @C09CT("sku_list_price")
    public String skuListPrice;

    @C09CT("unit_price_desc")
    public String unitPriceDescription;
    public static final Parcelable.Creator<SkuPrice> CREATOR = new Parcelable.Creator<SkuPrice>() { // from class: X.02om
        @Override // android.os.Parcelable.Creator
        public final SkuPrice createFromParcel(Parcel parcel) {
            Price priceCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            PromotionLabelVO promotionLabelVOCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                priceCreateFromParcel = null;
            } else {
                priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            Price price = priceCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z2 = true;
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
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                promotionLabelVOCreateFromParcel = null;
            } else {
                promotionLabelVOCreateFromParcel = PromotionLabelVO.CREATOR.createFromParcel(parcel);
            }
            PromotionLabelVO promotionLabelVO = promotionLabelVOCreateFromParcel;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new SkuPrice(price, string, string2, string3, boolValueOf, string4, string5, promotionLabelVO, string6, numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuPrice[] newArray(int i) {
            return new SkuPrice[i];
        }
    };
    public static final int $stable = 8;

    public SkuPrice() {
        this(null, null, null, null, null, null, null, null, null, 15, 14, 11, 12, Boolean.FALSE, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPrice)) {
            return false;
        }
        SkuPrice skuPrice = (SkuPrice) obj;
        return Intrinsics.LJFF(this.realPrice, skuPrice.realPrice) && Intrinsics.LJFF(this.realPriceDecimal, skuPrice.realPriceDecimal) && Intrinsics.LJFF(this.originalPrice, skuPrice.originalPrice) && Intrinsics.LJFF(this.discount, skuPrice.discount) && Intrinsics.LJFF(this.hasDiscount, skuPrice.hasDiscount) && Intrinsics.LJFF(this.originalPriceVal, skuPrice.originalPriceVal) && Intrinsics.LJFF(this.unitPriceDescription, skuPrice.unitPriceDescription) && Intrinsics.LJFF(this.priceLabels, skuPrice.priceLabels) && Intrinsics.LJFF(this.daInfo, skuPrice.daInfo) && Intrinsics.LJFF(this.discountColor, skuPrice.discountColor) && Intrinsics.LJFF(this.discountFont, skuPrice.discountFont) && Intrinsics.LJFF(this.originalPriceColor, skuPrice.originalPriceColor) && Intrinsics.LJFF(this.originalPriceFont, skuPrice.originalPriceFont) && Intrinsics.LJFF(this.frontLoadDiscount, skuPrice.frontLoadDiscount) && Intrinsics.LJFF(this.skuListPrice, skuPrice.skuListPrice) && Intrinsics.LJFF(this.pFandPriceDesc, skuPrice.pFandPriceDesc) && Intrinsics.LJFF(this.hidePriceTip, skuPrice.hidePriceTip) && Intrinsics.LJFF(this.pricePrefix, skuPrice.pricePrefix);
    }

    public final int hashCode() {
        Price price = this.realPrice;
        int iHashCode = (price == null ? 0 : price.hashCode()) * 31;
        String str = this.realPriceDecimal;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalPrice;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discount;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hasDiscount;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.originalPriceVal;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.unitPriceDescription;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PromotionLabelVO promotionLabelVO = this.priceLabels;
        int iHashCode8 = (iHashCode7 + (promotionLabelVO == null ? 0 : promotionLabelVO.hashCode())) * 31;
        String str6 = this.daInfo;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.discountColor;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discountFont;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.originalPriceColor;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.originalPriceFont;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.frontLoadDiscount;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.skuListPrice;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pFandPriceDesc;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.hidePriceTip;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pricePrefix;
        return iHashCode17 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        return "SkuPrice(realPrice=" + this.realPrice + ", realPriceDecimal=" + this.realPriceDecimal + ", originalPrice=" + this.originalPrice + ", discount=" + this.discount + ", hasDiscount=" + this.hasDiscount + ", originalPriceVal=" + this.originalPriceVal + ", unitPriceDescription=" + this.unitPriceDescription + ", priceLabels=" + this.priceLabels + ", daInfo=" + this.daInfo + ", discountColor=" + this.discountColor + ", discountFont=" + this.discountFont + ", originalPriceColor=" + this.originalPriceColor + ", originalPriceFont=" + this.originalPriceFont + ", frontLoadDiscount=" + this.frontLoadDiscount + ", skuListPrice=" + this.skuListPrice + ", pFandPriceDesc=" + this.pFandPriceDesc + ", hidePriceTip=" + this.hidePriceTip + ", pricePrefix=" + this.pricePrefix + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Price price = this.realPrice;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
        parcel.writeString(this.realPriceDecimal);
        parcel.writeString(this.originalPrice);
        parcel.writeString(this.discount);
        Boolean bool = this.hasDiscount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.originalPriceVal);
        parcel.writeString(this.unitPriceDescription);
        PromotionLabelVO promotionLabelVO = this.priceLabels;
        if (promotionLabelVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionLabelVO.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        Integer num = this.discountColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.discountFont;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.originalPriceColor;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.originalPriceFont;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Boolean bool2 = this.frontLoadDiscount;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.skuListPrice);
        parcel.writeString(this.pFandPriceDesc);
        parcel.writeString(this.hidePriceTip);
        parcel.writeString(this.pricePrefix);
    }

    public SkuPrice(Price price, String str, String str2, String str3, Boolean bool, String str4, String str5, PromotionLabelVO promotionLabelVO, String str6, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool2, String str7, String str8, String str9, String str10) {
        this.realPrice = price;
        this.realPriceDecimal = str;
        this.originalPrice = str2;
        this.discount = str3;
        this.hasDiscount = bool;
        this.originalPriceVal = str4;
        this.unitPriceDescription = str5;
        this.priceLabels = promotionLabelVO;
        this.daInfo = str6;
        this.discountColor = num;
        this.discountFont = num2;
        this.originalPriceColor = num3;
        this.originalPriceFont = num4;
        this.frontLoadDiscount = bool2;
        this.skuListPrice = str7;
        this.pFandPriceDesc = str8;
        this.hidePriceTip = str9;
        this.pricePrefix = str10;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C123100dR;
import X.C2188811AlT;
import X.C444920HcY;
import X.C703302op;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePriceItem implements Parcelable {

    @C09CT("after_coupon_price_decimal")
    public String afterCouponPriceDecimal;

    @C09CT("after_coupon_price_decimal_part_format")
    public String afterCouponPriceDecimalPartFormat;

    @C09CT("after_coupon_price_format")
    public String afterCouponPriceFormat;

    @C09CT("after_coupon_price_integer_part_format")
    public String afterCouponPriceIntegerPartFormat;

    @C09CT("currency_name")
    public String currencyName;

    @C09CT("currency_show_mode")
    public Integer currencyShowMode;

    @C09CT("currency_symbol")
    public String currencySymbol;

    @C09CT("decimal_point_symbol")
    public String decimalPointSymbol;

    @C09CT("discount_decimal")
    public String discountDecimal;

    @C09CT("discount_format")
    public String discountFormat;

    @C09CT("discount_full")
    public String discountFull;

    @C09CT("need_icon")
    public Boolean needIcon;

    @C09CT("origin_price_decimal")
    public String originPriceDecimal;

    @C09CT("origin_price_format")
    public String originPriceFormat;

    @C09CT("origin_price_full")
    public String originPriceFull;

    @C09CT("pfand_price_desc")
    public String pFandPriceDesc;

    @C09CT("price_display_mode")
    public Integer priceDisplayMode;

    @C09CT("price_hide_info")
    public SinglePriceHideInfo priceHideInfo;

    @C09CT("price_prefix")
    public String pricePrefix;

    @C09CT("price_serialized_extra")
    public String priceSerializedExtra;

    @C09CT("reduce_price_format")
    public String reducePriceFormat;

    @C09CT("sale_price_decimal")
    public String salePriceDecimal;

    @C09CT("sale_price_decimal_part_format")
    public String salePriceDecimalPartFormat;

    @C09CT("sale_price_format")
    public String salePriceFormat;

    @C09CT("sale_price_full")
    public String salePriceFull;

    @C09CT("sale_price_integer_part_format")
    public String salePriceIntegerPartFormat;

    @C09CT("show_currency_space")
    public Boolean showCurrencySpace;

    @C09CT("single_product_price_format")
    public String singleProductPriceFormat;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("symbol_position")
    public int symbolPosition;

    @C09CT("unit_price_desc")
    public String unitPriceDescription;
    public static final Parcelable.Creator<SinglePriceItem> CREATOR = new Parcelable.Creator<SinglePriceItem>() { // from class: X.02on
        @Override // android.os.Parcelable.Creator
        public final SinglePriceItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            SinglePriceHideInfo singlePriceHideInfo = (SinglePriceHideInfo) parcel.readSerializable();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new SinglePriceItem(string, string2, string3, i, string4, string5, string6, string7, string8, string9, string10, numValueOf, singlePriceHideInfo, string11, string12, boolValueOf, numValueOf2, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SinglePriceItem[] newArray(int i) {
            return new SinglePriceItem[i];
        }
    };
    public static final int $stable = 8;

    public SinglePriceItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SinglePriceItem)) {
            return false;
        }
        SinglePriceItem singlePriceItem = (SinglePriceItem) obj;
        return Intrinsics.LJFF(this.skuId, singlePriceItem.skuId) && Intrinsics.LJFF(this.currencyName, singlePriceItem.currencyName) && Intrinsics.LJFF(this.currencySymbol, singlePriceItem.currencySymbol) && this.symbolPosition == singlePriceItem.symbolPosition && Intrinsics.LJFF(this.salePriceDecimal, singlePriceItem.salePriceDecimal) && Intrinsics.LJFF(this.originPriceDecimal, singlePriceItem.originPriceDecimal) && Intrinsics.LJFF(this.salePriceFormat, singlePriceItem.salePriceFormat) && Intrinsics.LJFF(this.originPriceFormat, singlePriceItem.originPriceFormat) && Intrinsics.LJFF(this.discountFormat, singlePriceItem.discountFormat) && Intrinsics.LJFF(this.discountDecimal, singlePriceItem.discountDecimal) && Intrinsics.LJFF(this.pricePrefix, singlePriceItem.pricePrefix) && Intrinsics.LJFF(this.priceDisplayMode, singlePriceItem.priceDisplayMode) && Intrinsics.LJFF(this.priceHideInfo, singlePriceItem.priceHideInfo) && Intrinsics.LJFF(this.reducePriceFormat, singlePriceItem.reducePriceFormat) && Intrinsics.LJFF(this.singleProductPriceFormat, singlePriceItem.singleProductPriceFormat) && Intrinsics.LJFF(this.showCurrencySpace, singlePriceItem.showCurrencySpace) && Intrinsics.LJFF(this.currencyShowMode, singlePriceItem.currencyShowMode) && Intrinsics.LJFF(this.priceSerializedExtra, singlePriceItem.priceSerializedExtra) && Intrinsics.LJFF(this.unitPriceDescription, singlePriceItem.unitPriceDescription) && Intrinsics.LJFF(this.salePriceIntegerPartFormat, singlePriceItem.salePriceIntegerPartFormat) && Intrinsics.LJFF(this.salePriceDecimalPartFormat, singlePriceItem.salePriceDecimalPartFormat) && Intrinsics.LJFF(this.decimalPointSymbol, singlePriceItem.decimalPointSymbol) && Intrinsics.LJFF(this.pFandPriceDesc, singlePriceItem.pFandPriceDesc) && Intrinsics.LJFF(this.afterCouponPriceFormat, singlePriceItem.afterCouponPriceFormat) && Intrinsics.LJFF(this.afterCouponPriceDecimal, singlePriceItem.afterCouponPriceDecimal) && Intrinsics.LJFF(this.afterCouponPriceIntegerPartFormat, singlePriceItem.afterCouponPriceIntegerPartFormat) && Intrinsics.LJFF(this.afterCouponPriceDecimalPartFormat, singlePriceItem.afterCouponPriceDecimalPartFormat) && Intrinsics.LJFF(this.needIcon, singlePriceItem.needIcon) && Intrinsics.LJFF(this.salePriceFull, singlePriceItem.salePriceFull) && Intrinsics.LJFF(this.originPriceFull, singlePriceItem.originPriceFull) && Intrinsics.LJFF(this.discountFull, singlePriceItem.discountFull);
    }

    public final int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencySymbol;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.symbolPosition) * 31;
        String str4 = this.salePriceDecimal;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originPriceDecimal;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.salePriceFormat;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.originPriceFormat;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discountFormat;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.discountDecimal;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pricePrefix;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.priceDisplayMode;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        SinglePriceHideInfo singlePriceHideInfo = this.priceHideInfo;
        int iHashCode12 = (iHashCode11 + (singlePriceHideInfo == null ? 0 : singlePriceHideInfo.hashCode())) * 31;
        String str11 = this.reducePriceFormat;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.singleProductPriceFormat;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.showCurrencySpace;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.currencyShowMode;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.priceSerializedExtra;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.unitPriceDescription;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.salePriceIntegerPartFormat;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.salePriceDecimalPartFormat;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.decimalPointSymbol;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.pFandPriceDesc;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.afterCouponPriceFormat;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.afterCouponPriceDecimal;
        int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.afterCouponPriceIntegerPartFormat;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.afterCouponPriceDecimalPartFormat;
        int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Boolean bool2 = this.needIcon;
        int iHashCode27 = (iHashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str23 = this.salePriceFull;
        int iHashCode28 = (iHashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.originPriceFull;
        int iHashCode29 = (iHashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.discountFull;
        return iHashCode29 + (str25 != null ? str25.hashCode() : 0);
    }

    public final String toString() {
        return "SinglePriceItem(skuId=" + this.skuId + ", currencyName=" + this.currencyName + ", currencySymbol=" + this.currencySymbol + ", symbolPosition=" + this.symbolPosition + ", salePriceDecimal=" + this.salePriceDecimal + ", originPriceDecimal=" + this.originPriceDecimal + ", salePriceFormat=" + this.salePriceFormat + ", originPriceFormat=" + this.originPriceFormat + ", discountFormat=" + this.discountFormat + ", discountDecimal=" + this.discountDecimal + ", pricePrefix=" + this.pricePrefix + ", priceDisplayMode=" + this.priceDisplayMode + ", priceHideInfo=" + this.priceHideInfo + ", reducePriceFormat=" + this.reducePriceFormat + ", singleProductPriceFormat=" + this.singleProductPriceFormat + ", showCurrencySpace=" + this.showCurrencySpace + ", currencyShowMode=" + this.currencyShowMode + ", priceSerializedExtra=" + this.priceSerializedExtra + ", unitPriceDescription=" + this.unitPriceDescription + ", salePriceIntegerPartFormat=" + this.salePriceIntegerPartFormat + ", salePriceDecimalPartFormat=" + this.salePriceDecimalPartFormat + ", decimalPointSymbol=" + this.decimalPointSymbol + ", pFandPriceDesc=" + this.pFandPriceDesc + ", afterCouponPriceFormat=" + this.afterCouponPriceFormat + ", afterCouponPriceDecimal=" + this.afterCouponPriceDecimal + ", afterCouponPriceIntegerPartFormat=" + this.afterCouponPriceIntegerPartFormat + ", afterCouponPriceDecimalPartFormat=" + this.afterCouponPriceDecimalPartFormat + ", needIcon=" + this.needIcon + ", salePriceFull=" + this.salePriceFull + ", originPriceFull=" + this.originPriceFull + ", discountFull=" + this.discountFull + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skuId);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.currencySymbol);
        parcel.writeInt(this.symbolPosition);
        parcel.writeString(this.salePriceDecimal);
        parcel.writeString(this.originPriceDecimal);
        parcel.writeString(this.salePriceFormat);
        parcel.writeString(this.originPriceFormat);
        parcel.writeString(this.discountFormat);
        parcel.writeString(this.discountDecimal);
        parcel.writeString(this.pricePrefix);
        Integer num = this.priceDisplayMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeSerializable(this.priceHideInfo);
        parcel.writeString(this.reducePriceFormat);
        parcel.writeString(this.singleProductPriceFormat);
        Boolean bool = this.showCurrencySpace;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.currencyShowMode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.priceSerializedExtra);
        parcel.writeString(this.unitPriceDescription);
        parcel.writeString(this.salePriceIntegerPartFormat);
        parcel.writeString(this.salePriceDecimalPartFormat);
        parcel.writeString(this.decimalPointSymbol);
        parcel.writeString(this.pFandPriceDesc);
        parcel.writeString(this.afterCouponPriceFormat);
        parcel.writeString(this.afterCouponPriceDecimal);
        parcel.writeString(this.afterCouponPriceIntegerPartFormat);
        parcel.writeString(this.afterCouponPriceDecimalPartFormat);
        Boolean bool2 = this.needIcon;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.salePriceFull);
        parcel.writeString(this.originPriceFull);
        parcel.writeString(this.discountFull);
    }

    public final String LIZJ() {
        Integer num = this.currencyShowMode;
        return (num == null || num.intValue() != 2) ? this.currencySymbol : this.currencyName;
    }

    public final String LIZLLL() {
        if (!C123100dR.LIZ(this.discountFormat)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('-');
        sbLIZ.append(this.discountFormat);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LJ() {
        if (!C703302op.LIZ(this.originPriceFormat)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.symbolPosition == 0 ? this.originPriceFormat : LIZJ());
        if (Intrinsics.LJFF(this.showCurrencySpace, Boolean.TRUE)) {
            sb.append(" ");
        }
        sb.append(this.symbolPosition == 0 ? LIZJ() : this.originPriceFormat);
        return sb.toString();
    }

    public final String LJFF() {
        if (!C703302op.LIZ(this.salePriceFormat)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.symbolPosition == 0 ? this.salePriceFormat : LIZJ());
        if (Intrinsics.LJFF(this.showCurrencySpace, Boolean.TRUE)) {
            sb.append(" ");
        }
        sb.append(this.symbolPosition == 0 ? LIZJ() : this.salePriceFormat);
        return sb.toString();
    }

    public static void LIZIZ(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i, false), length, spannableStringBuilder.length(), 17);
    }

    public final SpannableStringBuilder LJI(int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.symbolPosition == 0) {
            LIZ(spannableStringBuilder, this.salePriceIntegerPartFormat, this.salePriceDecimalPartFormat, i2, i3);
        } else {
            String strLIZJ = LIZJ();
            if (strLIZJ != null) {
                LIZIZ(spannableStringBuilder, strLIZJ, i);
            }
        }
        if (Intrinsics.LJFF(this.showCurrencySpace, Boolean.TRUE)) {
            LIZIZ(spannableStringBuilder, " ", i2);
        }
        if (this.symbolPosition == 0) {
            String strLIZJ2 = LIZJ();
            if (strLIZJ2 != null) {
                LIZIZ(spannableStringBuilder, strLIZJ2, i);
            }
            return spannableStringBuilder;
        }
        LIZ(spannableStringBuilder, this.salePriceIntegerPartFormat, this.salePriceDecimalPartFormat, i2, i3);
        return spannableStringBuilder;
    }

    public final void LIZ(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2) {
        if (C703302op.LIZ(str)) {
            LIZIZ(spannableStringBuilder, str, i);
            if (C123100dR.LIZ(str2)) {
                String str3 = this.decimalPointSymbol;
                if (str3 != null) {
                    LIZIZ(spannableStringBuilder, str3, i2);
                }
                LIZIZ(spannableStringBuilder, str2, i2);
                return;
            }
            return;
        }
        String str4 = this.salePriceFormat;
        if (str4 == null) {
            return;
        }
        LIZIZ(spannableStringBuilder, str4, i);
    }

    public SinglePriceItem(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, SinglePriceHideInfo singlePriceHideInfo, String str11, String str12, Boolean bool, Integer num2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Boolean bool2, String str23, String str24, String str25) {
        this.skuId = str;
        this.currencyName = str2;
        this.currencySymbol = str3;
        this.symbolPosition = i;
        this.salePriceDecimal = str4;
        this.originPriceDecimal = str5;
        this.salePriceFormat = str6;
        this.originPriceFormat = str7;
        this.discountFormat = str8;
        this.discountDecimal = str9;
        this.pricePrefix = str10;
        this.priceDisplayMode = num;
        this.priceHideInfo = singlePriceHideInfo;
        this.reducePriceFormat = str11;
        this.singleProductPriceFormat = str12;
        this.showCurrencySpace = bool;
        this.currencyShowMode = num2;
        this.priceSerializedExtra = str13;
        this.unitPriceDescription = str14;
        this.salePriceIntegerPartFormat = str15;
        this.salePriceDecimalPartFormat = str16;
        this.decimalPointSymbol = str17;
        this.pFandPriceDesc = str18;
        this.afterCouponPriceFormat = str19;
        this.afterCouponPriceDecimal = str20;
        this.afterCouponPriceIntegerPartFormat = str21;
        this.afterCouponPriceDecimalPartFormat = str22;
        this.needIcon = bool2;
        this.salePriceFull = str23;
        this.originPriceFull = str24;
        this.discountFull = str25;
    }
}

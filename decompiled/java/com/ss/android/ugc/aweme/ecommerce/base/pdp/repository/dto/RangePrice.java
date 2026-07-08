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
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RangePrice implements Parcelable {

    @C09CT("currency_name")
    public String currencyName;

    @C09CT("currency_show_mode")
    public Integer currencyShowMode;

    @C09CT("currency_symbol")
    public String currencySymbol;

    @C09CT("decimal_point_symbol")
    public String decimalPointSymbol;

    @C09CT("discount_full")
    public String discountFull;

    @C09CT("discount_txt")
    public String discountTxt;

    @C09CT("max_discount_decimal")
    public String maxDiscountDecimal;

    @C09CT("max_price_decimal_part_format")
    public String maxPriceDecimalPartFormat;

    @C09CT("max_price_integer_part_format")
    public String maxPriceIntegerPartFormat;

    @C09CT("max_price_sku_id")
    public String maxPriceSkuId;

    @C09CT("min_price_decimal_part_format")
    public String minPriceDecimalPartFormat;

    @C09CT("min_price_full")
    public String minPriceFull;

    @C09CT("min_price_integer_part_format")
    public String minPriceIntegerPartFormat;

    @C09CT("min_price_prefix")
    public String minPricePrefix;

    @C09CT("min_price_sku_id")
    public String minPriceSkuId;

    @C09CT("need_icon")
    public Boolean needIcon;

    @C09CT("origin_price_full")
    public String originPriceFull;

    @C09CT("origin_range_price")
    public String originRangePrice;

    @C09CT("price_display_mode")
    public Integer priceDisplayMode;

    @C09CT("price_hide_info")
    public SinglePriceHideInfo priceHideInfo;

    @C09CT("range_price")
    public String rangePrice;

    @C09CT("show_currency_space")
    public Boolean showCurrencySpace;

    @C09CT("symbol_position")
    public int symbolPosition;
    public static final Parcelable.Creator<RangePrice> CREATOR = new Parcelable.Creator<RangePrice>() { // from class: X.02ol
        @Override // android.os.Parcelable.Creator
        public final RangePrice createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z2 = true;
            Boolean boolValueOf2 = null;
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
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            SinglePriceHideInfo singlePriceHideInfo = (SinglePriceHideInfo) parcel.readSerializable();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new RangePrice(string, string2, string3, string4, i, string5, string6, string7, string8, boolValueOf, numValueOf, numValueOf2, singlePriceHideInfo, string9, string10, string11, string12, string13, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RangePrice[] newArray(int i) {
            return new RangePrice[i];
        }
    };
    public static final int $stable = 8;

    public RangePrice() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangePrice)) {
            return false;
        }
        RangePrice rangePrice = (RangePrice) obj;
        return Intrinsics.LJFF(this.minPriceSkuId, rangePrice.minPriceSkuId) && Intrinsics.LJFF(this.maxPriceSkuId, rangePrice.maxPriceSkuId) && Intrinsics.LJFF(this.currencyName, rangePrice.currencyName) && Intrinsics.LJFF(this.currencySymbol, rangePrice.currencySymbol) && this.symbolPosition == rangePrice.symbolPosition && Intrinsics.LJFF(this.rangePrice, rangePrice.rangePrice) && Intrinsics.LJFF(this.maxDiscountDecimal, rangePrice.maxDiscountDecimal) && Intrinsics.LJFF(this.discountTxt, rangePrice.discountTxt) && Intrinsics.LJFF(this.originRangePrice, rangePrice.originRangePrice) && Intrinsics.LJFF(this.showCurrencySpace, rangePrice.showCurrencySpace) && Intrinsics.LJFF(this.currencyShowMode, rangePrice.currencyShowMode) && Intrinsics.LJFF(this.priceDisplayMode, rangePrice.priceDisplayMode) && Intrinsics.LJFF(this.priceHideInfo, rangePrice.priceHideInfo) && Intrinsics.LJFF(this.minPriceIntegerPartFormat, rangePrice.minPriceIntegerPartFormat) && Intrinsics.LJFF(this.minPriceDecimalPartFormat, rangePrice.minPriceDecimalPartFormat) && Intrinsics.LJFF(this.maxPriceIntegerPartFormat, rangePrice.maxPriceIntegerPartFormat) && Intrinsics.LJFF(this.maxPriceDecimalPartFormat, rangePrice.maxPriceDecimalPartFormat) && Intrinsics.LJFF(this.decimalPointSymbol, rangePrice.decimalPointSymbol) && Intrinsics.LJFF(this.needIcon, rangePrice.needIcon) && Intrinsics.LJFF(this.minPriceFull, rangePrice.minPriceFull) && Intrinsics.LJFF(this.minPricePrefix, rangePrice.minPricePrefix) && Intrinsics.LJFF(this.originPriceFull, rangePrice.originPriceFull) && Intrinsics.LJFF(this.discountFull, rangePrice.discountFull);
    }

    public final int hashCode() {
        String str = this.minPriceSkuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxPriceSkuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencySymbol;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.symbolPosition) * 31;
        String str5 = this.rangePrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxDiscountDecimal;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.discountTxt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.originRangePrice;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.showCurrencySpace;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.currencyShowMode;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.priceDisplayMode;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        SinglePriceHideInfo singlePriceHideInfo = this.priceHideInfo;
        int iHashCode12 = (iHashCode11 + (singlePriceHideInfo == null ? 0 : singlePriceHideInfo.hashCode())) * 31;
        String str9 = this.minPriceIntegerPartFormat;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.minPriceDecimalPartFormat;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.maxPriceIntegerPartFormat;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.maxPriceDecimalPartFormat;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.decimalPointSymbol;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.needIcon;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.minPriceFull;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.minPricePrefix;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.originPriceFull;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.discountFull;
        return iHashCode21 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        return "RangePrice(minPriceSkuId=" + this.minPriceSkuId + ", maxPriceSkuId=" + this.maxPriceSkuId + ", currencyName=" + this.currencyName + ", currencySymbol=" + this.currencySymbol + ", symbolPosition=" + this.symbolPosition + ", rangePrice=" + this.rangePrice + ", maxDiscountDecimal=" + this.maxDiscountDecimal + ", discountTxt=" + this.discountTxt + ", originRangePrice=" + this.originRangePrice + ", showCurrencySpace=" + this.showCurrencySpace + ", currencyShowMode=" + this.currencyShowMode + ", priceDisplayMode=" + this.priceDisplayMode + ", priceHideInfo=" + this.priceHideInfo + ", minPriceIntegerPartFormat=" + this.minPriceIntegerPartFormat + ", minPriceDecimalPartFormat=" + this.minPriceDecimalPartFormat + ", maxPriceIntegerPartFormat=" + this.maxPriceIntegerPartFormat + ", maxPriceDecimalPartFormat=" + this.maxPriceDecimalPartFormat + ", decimalPointSymbol=" + this.decimalPointSymbol + ", needIcon=" + this.needIcon + ", minPriceFull=" + this.minPriceFull + ", minPricePrefix=" + this.minPricePrefix + ", originPriceFull=" + this.originPriceFull + ", discountFull=" + this.discountFull + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.minPriceSkuId);
        parcel.writeString(this.maxPriceSkuId);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.currencySymbol);
        parcel.writeInt(this.symbolPosition);
        parcel.writeString(this.rangePrice);
        parcel.writeString(this.maxDiscountDecimal);
        parcel.writeString(this.discountTxt);
        parcel.writeString(this.originRangePrice);
        Boolean bool = this.showCurrencySpace;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.currencyShowMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.priceDisplayMode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeSerializable(this.priceHideInfo);
        parcel.writeString(this.minPriceIntegerPartFormat);
        parcel.writeString(this.minPriceDecimalPartFormat);
        parcel.writeString(this.maxPriceIntegerPartFormat);
        parcel.writeString(this.maxPriceDecimalPartFormat);
        parcel.writeString(this.decimalPointSymbol);
        Boolean bool2 = this.needIcon;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.minPriceFull);
        parcel.writeString(this.minPricePrefix);
        parcel.writeString(this.originPriceFull);
        parcel.writeString(this.discountFull);
    }

    public final String LIZIZ() {
        Integer num = this.currencyShowMode;
        return (num == null || num.intValue() != 2) ? this.currencySymbol : this.currencyName;
    }

    public final String LIZJ() {
        if (!C123100dR.LIZ(this.discountTxt)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('-');
        sbLIZ.append(this.discountTxt);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZLLL() {
        if (!C703302op.LIZ(this.originRangePrice)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.symbolPosition == 0 ? this.originRangePrice : LIZIZ());
        if (Intrinsics.LJFF(this.showCurrencySpace, Boolean.TRUE)) {
            sb.append(" ");
        }
        sb.append(this.symbolPosition == 0 ? LIZIZ() : this.originRangePrice);
        return sb.toString();
    }

    public final String LJ() {
        if (!C703302op.LIZ(this.rangePrice)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.symbolPosition == 0 ? this.rangePrice : LIZIZ());
        if (Intrinsics.LJFF(this.showCurrencySpace, Boolean.TRUE)) {
            sb.append(" ");
        }
        sb.append(this.symbolPosition == 0 ? LIZIZ() : this.rangePrice);
        return sb.toString();
    }

    public static SpannableStringBuilder LJFF(RangePrice rangePrice) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C703302op.LIZ(rangePrice.minPriceIntegerPartFormat)) {
            if (rangePrice.symbolPosition == 0) {
                String str = rangePrice.minPriceIntegerPartFormat;
                if (str != null) {
                    LIZ(spannableStringBuilder, str, 12);
                }
                if (C703302op.LIZ(rangePrice.minPriceDecimalPartFormat)) {
                    String str2 = rangePrice.decimalPointSymbol;
                    if (str2 != null) {
                        LIZ(spannableStringBuilder, str2, 72);
                    }
                    LIZ(spannableStringBuilder, rangePrice.minPriceDecimalPartFormat, 72);
                }
                LIZ(spannableStringBuilder, " - ", 12);
                String str3 = rangePrice.maxPriceIntegerPartFormat;
                if (str3 != null) {
                    LIZ(spannableStringBuilder, str3, 12);
                }
                if (C703302op.LIZ(rangePrice.maxPriceDecimalPartFormat)) {
                    String str4 = rangePrice.decimalPointSymbol;
                    if (str4 != null) {
                        LIZ(spannableStringBuilder, str4, 72);
                    }
                    LIZ(spannableStringBuilder, rangePrice.maxPriceDecimalPartFormat, 72);
                }
            } else {
                String strLIZIZ = rangePrice.LIZIZ();
                if (strLIZIZ != null) {
                    LIZ(spannableStringBuilder, strLIZIZ, 72);
                }
            }
            if (Intrinsics.LJFF(rangePrice.showCurrencySpace, Boolean.TRUE)) {
                LIZ(spannableStringBuilder, " ", 12);
            }
            if (rangePrice.symbolPosition == 0) {
                String strLIZIZ2 = rangePrice.LIZIZ();
                if (strLIZIZ2 != null) {
                    LIZ(spannableStringBuilder, strLIZIZ2, 72);
                }
            } else {
                String str5 = rangePrice.minPriceIntegerPartFormat;
                if (str5 != null) {
                    LIZ(spannableStringBuilder, str5, 12);
                }
                if (C703302op.LIZ(rangePrice.minPriceDecimalPartFormat)) {
                    String str6 = rangePrice.decimalPointSymbol;
                    if (str6 != null) {
                        LIZ(spannableStringBuilder, str6, 72);
                    }
                    LIZ(spannableStringBuilder, rangePrice.minPriceDecimalPartFormat, 72);
                }
                LIZ(spannableStringBuilder, " - ", 12);
                String str7 = rangePrice.maxPriceIntegerPartFormat;
                if (str7 != null) {
                    LIZ(spannableStringBuilder, str7, 12);
                }
                if (C703302op.LIZ(rangePrice.maxPriceDecimalPartFormat)) {
                    String str8 = rangePrice.decimalPointSymbol;
                    if (str8 != null) {
                        LIZ(spannableStringBuilder, str8, 72);
                    }
                    LIZ(spannableStringBuilder, rangePrice.maxPriceDecimalPartFormat, 72);
                    return spannableStringBuilder;
                }
            }
            return spannableStringBuilder;
        }
        return null;
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i, false), length, spannableStringBuilder.length(), 17);
    }

    public RangePrice(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, Boolean bool, Integer num, Integer num2, SinglePriceHideInfo singlePriceHideInfo, String str9, String str10, String str11, String str12, String str13, Boolean bool2, String str14, String str15, String str16, String str17) {
        this.minPriceSkuId = str;
        this.maxPriceSkuId = str2;
        this.currencyName = str3;
        this.currencySymbol = str4;
        this.symbolPosition = i;
        this.rangePrice = str5;
        this.maxDiscountDecimal = str6;
        this.discountTxt = str7;
        this.originRangePrice = str8;
        this.showCurrencySpace = bool;
        this.currencyShowMode = num;
        this.priceDisplayMode = num2;
        this.priceHideInfo = singlePriceHideInfo;
        this.minPriceIntegerPartFormat = str9;
        this.minPriceDecimalPartFormat = str10;
        this.maxPriceIntegerPartFormat = str11;
        this.maxPriceDecimalPartFormat = str12;
        this.decimalPointSymbol = str13;
        this.needIcon = bool2;
        this.minPriceFull = str14;
        this.minPricePrefix = str15;
        this.originPriceFull = str16;
        this.discountFull = str17;
    }
}

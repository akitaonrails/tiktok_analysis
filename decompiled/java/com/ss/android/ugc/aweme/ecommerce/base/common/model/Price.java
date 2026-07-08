package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.FeeTag;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Promotion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Price implements Parcelable, Serializable {

    @C09CT("currency")
    public String currency;

    @C09CT("discount_percentage")
    public String discountPercentage;

    @C09CT("fee_tags")
    public List<FeeTag> feeTags;

    @C09CT("payment_methods_promotions")
    public List<PaymentPromotion> paymentPromotions;

    @C09CT("price_str")
    public String priceStr;

    @C09CT("price_text_color")
    public Integer priceTextColor;

    @C09CT("price_text_font")
    public Integer priceTextFont;

    @C09CT("price_val")
    public String priceVal;

    @C09CT("promotions")
    public List<Promotion> promotions;

    @C09CT("real_price_decimal")
    public String realPriceDecimal;

    @C09CT("symbol")
    public String symbol;
    public static final Parcelable.Creator<Price> CREATOR = new Parcelable.Creator<Price>() { // from class: X.02Qr
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Promotion.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(FeeTag.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(PaymentPromotion.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Price(string, string2, string3, string4, string5, arrayList, numValueOf, arrayList2, arrayList3, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i) {
            return new Price[i];
        }
    };
    public static final int $stable = 8;

    public Price() {
    }

    public final Price copy(String str, String str2, String str3, String str4, String str5, List<Promotion> list, Integer num, List<FeeTag> list2, List<PaymentPromotion> list3, Integer num2, String str6) {
        return new Price(str, str2, str3, str4, str5, list, num, list2, list3, num2, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return Intrinsics.LJFF(this.priceStr, price.priceStr) && Intrinsics.LJFF(this.priceVal, price.priceVal) && Intrinsics.LJFF(this.currency, price.currency) && Intrinsics.LJFF(this.symbol, price.symbol) && Intrinsics.LJFF(this.realPriceDecimal, price.realPriceDecimal) && Intrinsics.LJFF(this.promotions, price.promotions) && Intrinsics.LJFF(this.priceTextColor, price.priceTextColor) && Intrinsics.LJFF(this.feeTags, price.feeTags) && Intrinsics.LJFF(this.paymentPromotions, price.paymentPromotions) && Intrinsics.LJFF(this.priceTextFont, price.priceTextFont) && Intrinsics.LJFF(this.discountPercentage, price.discountPercentage);
    }

    public int hashCode() {
        String str = this.priceStr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.priceVal;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.realPriceDecimal;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Promotion> list = this.promotions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.priceTextColor;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<FeeTag> list2 = this.feeTags;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PaymentPromotion> list3 = this.paymentPromotions;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.priceTextFont;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.discountPercentage;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "Price(priceStr=" + this.priceStr + ", priceVal=" + this.priceVal + ", currency=" + this.currency + ", symbol=" + this.symbol + ", realPriceDecimal=" + this.realPriceDecimal + ", promotions=" + this.promotions + ", priceTextColor=" + this.priceTextColor + ", feeTags=" + this.feeTags + ", paymentPromotions=" + this.paymentPromotions + ", priceTextFont=" + this.priceTextFont + ", discountPercentage=" + this.discountPercentage + ')';
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    public final List<FeeTag> getFeeTags() {
        return this.feeTags;
    }

    public final List<PaymentPromotion> getPaymentPromotions() {
        return this.paymentPromotions;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final Integer getPriceTextColor() {
        return this.priceTextColor;
    }

    public final Integer getPriceTextFont() {
        return this.priceTextFont;
    }

    public final String getPriceVal() {
        return this.priceVal;
    }

    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    public final String getRealPriceDecimal() {
        return this.realPriceDecimal;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.priceStr);
        parcel.writeString(this.priceVal);
        parcel.writeString(this.currency);
        parcel.writeString(this.symbol);
        parcel.writeString(this.realPriceDecimal);
        List<Promotion> list = this.promotions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Promotion> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().promotionId);
            }
        }
        Integer num = this.priceTextColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<FeeTag> list2 = this.feeTags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<FeeTag> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeString(it3.next().tagName);
            }
        }
        List<PaymentPromotion> list3 = this.paymentPromotions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<PaymentPromotion> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.priceTextFont;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.discountPercentage);
    }

    public Price(String str, String str2, String str3, String str4, String str5, List<Promotion> list, Integer num, List<FeeTag> list2, List<PaymentPromotion> list3, Integer num2, String str6) {
        this.priceStr = str;
        this.priceVal = str2;
        this.currency = str3;
        this.symbol = str4;
        this.realPriceDecimal = str5;
        this.promotions = list;
        this.priceTextColor = num;
        this.feeTags = list2;
        this.paymentPromotions = list3;
        this.priceTextFont = num2;
        this.discountPercentage = str6;
    }
}

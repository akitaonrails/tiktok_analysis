package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistStyle;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class WaistStyle implements Parcelable {

    @C09CT("coupon_icon_color")
    public final CustomColor couponIconColor;

    @C09CT("discount_background_color")
    public final CustomColor discountBgColor;

    @C09CT("discount_text_color")
    public final CustomColor discountTextColor;

    @C09CT("original_price_color")
    public final CustomColor originalPriceColor;

    @C09CT("promotion_label_background_color")
    public final CustomColor promotionLabelBgColor;

    @C09CT("promotion_label_text_color")
    public final CustomColor promotionLabelTextColor;

    @C09CT("real_price_color")
    public final CustomColor realPriceColor;
    public static final Parcelable.Creator<WaistStyle> CREATOR = new Parcelable.Creator<WaistStyle>() { // from class: X.0vzj
        @Override // android.os.Parcelable.Creator
        public final WaistStyle createFromParcel(Parcel parcel) {
            return new WaistStyle((CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()), (CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()), (CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()), (CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()), (CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()), (CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()), (CustomColor) parcel.readParcelable(WaistStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WaistStyle[] newArray(int i) {
            return new WaistStyle[i];
        }
    };
    public static final int $stable = 8;

    public WaistStyle() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaistStyle)) {
            return false;
        }
        WaistStyle waistStyle = (WaistStyle) obj;
        return Intrinsics.LJFF(this.discountTextColor, waistStyle.discountTextColor) && Intrinsics.LJFF(this.discountBgColor, waistStyle.discountBgColor) && Intrinsics.LJFF(this.realPriceColor, waistStyle.realPriceColor) && Intrinsics.LJFF(this.couponIconColor, waistStyle.couponIconColor) && Intrinsics.LJFF(this.originalPriceColor, waistStyle.originalPriceColor) && Intrinsics.LJFF(this.promotionLabelTextColor, waistStyle.promotionLabelTextColor) && Intrinsics.LJFF(this.promotionLabelBgColor, waistStyle.promotionLabelBgColor);
    }

    public final int hashCode() {
        CustomColor customColor = this.discountTextColor;
        int iHashCode = (customColor == null ? 0 : customColor.hashCode()) * 31;
        CustomColor customColor2 = this.discountBgColor;
        int iHashCode2 = (iHashCode + (customColor2 == null ? 0 : customColor2.hashCode())) * 31;
        CustomColor customColor3 = this.realPriceColor;
        int iHashCode3 = (iHashCode2 + (customColor3 == null ? 0 : customColor3.hashCode())) * 31;
        CustomColor customColor4 = this.couponIconColor;
        int iHashCode4 = (iHashCode3 + (customColor4 == null ? 0 : customColor4.hashCode())) * 31;
        CustomColor customColor5 = this.originalPriceColor;
        int iHashCode5 = (iHashCode4 + (customColor5 == null ? 0 : customColor5.hashCode())) * 31;
        CustomColor customColor6 = this.promotionLabelTextColor;
        int iHashCode6 = (iHashCode5 + (customColor6 == null ? 0 : customColor6.hashCode())) * 31;
        CustomColor customColor7 = this.promotionLabelBgColor;
        return iHashCode6 + (customColor7 != null ? customColor7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaistStyle(discountTextColor=");
        sbLIZ.append(this.discountTextColor);
        sbLIZ.append(", discountBgColor=");
        sbLIZ.append(this.discountBgColor);
        sbLIZ.append(", realPriceColor=");
        sbLIZ.append(this.realPriceColor);
        sbLIZ.append(", couponIconColor=");
        sbLIZ.append(this.couponIconColor);
        sbLIZ.append(", originalPriceColor=");
        sbLIZ.append(this.originalPriceColor);
        sbLIZ.append(", promotionLabelTextColor=");
        sbLIZ.append(this.promotionLabelTextColor);
        sbLIZ.append(", promotionLabelBgColor=");
        sbLIZ.append(this.promotionLabelBgColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.discountTextColor, i);
        parcel.writeParcelable(this.discountBgColor, i);
        parcel.writeParcelable(this.realPriceColor, i);
        parcel.writeParcelable(this.couponIconColor, i);
        parcel.writeParcelable(this.originalPriceColor, i);
        parcel.writeParcelable(this.promotionLabelTextColor, i);
        parcel.writeParcelable(this.promotionLabelBgColor, i);
    }

    public WaistStyle(CustomColor customColor, CustomColor customColor2, CustomColor customColor3, CustomColor customColor4, CustomColor customColor5, CustomColor customColor6, CustomColor customColor7) {
        this.discountTextColor = customColor;
        this.discountBgColor = customColor2;
        this.realPriceColor = customColor3;
        this.couponIconColor = customColor4;
        this.originalPriceColor = customColor5;
        this.promotionLabelTextColor = customColor6;
        this.promotionLabelBgColor = customColor7;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductPriceV2 implements Parcelable {

    @C09CT("deposit_fee_desc")
    public String depositFeeDesc;

    @C09CT("min_after_coupon_price")
    public SinglePriceItem minAfterCouponPrice;

    @C09CT("min_price")
    public SinglePriceItem minPrice;

    @C09CT("need_icon")
    public Boolean needIcon;

    @C09CT("price_type")
    public int priceType;

    @C09CT("range_price")
    public RangePrice rangePrice;

    @C09CT("tax_include_desc")
    public String taxIncludeDesc;
    public static final Parcelable.Creator<ProductPriceV2> CREATOR = new Parcelable.Creator<ProductPriceV2>() { // from class: X.02oY
        @Override // android.os.Parcelable.Creator
        public final ProductPriceV2 createFromParcel(Parcel parcel) {
            SinglePriceItem singlePriceItemCreateFromParcel;
            RangePrice rangePriceCreateFromParcel;
            SinglePriceItem singlePriceItemCreateFromParcel2;
            boolean z;
            int i = parcel.readInt();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                singlePriceItemCreateFromParcel = null;
            } else {
                singlePriceItemCreateFromParcel = SinglePriceItem.CREATOR.createFromParcel(parcel);
            }
            SinglePriceItem singlePriceItem = singlePriceItemCreateFromParcel;
            if (parcel.readInt() == 0) {
                rangePriceCreateFromParcel = null;
            } else {
                rangePriceCreateFromParcel = RangePrice.CREATOR.createFromParcel(parcel);
            }
            RangePrice rangePrice = rangePriceCreateFromParcel;
            if (parcel.readInt() == 0) {
                singlePriceItemCreateFromParcel2 = null;
            } else {
                singlePriceItemCreateFromParcel2 = SinglePriceItem.CREATOR.createFromParcel(parcel);
            }
            SinglePriceItem singlePriceItem2 = singlePriceItemCreateFromParcel2;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ProductPriceV2(i, singlePriceItem, rangePrice, singlePriceItem2, string, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPriceV2[] newArray(int i) {
            return new ProductPriceV2[i];
        }
    };
    public static final int $stable = 8;

    public ProductPriceV2() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceV2)) {
            return false;
        }
        ProductPriceV2 productPriceV2 = (ProductPriceV2) obj;
        return this.priceType == productPriceV2.priceType && Intrinsics.LJFF(this.minPrice, productPriceV2.minPrice) && Intrinsics.LJFF(this.rangePrice, productPriceV2.rangePrice) && Intrinsics.LJFF(this.minAfterCouponPrice, productPriceV2.minAfterCouponPrice) && Intrinsics.LJFF(this.taxIncludeDesc, productPriceV2.taxIncludeDesc) && Intrinsics.LJFF(this.needIcon, productPriceV2.needIcon) && Intrinsics.LJFF(this.depositFeeDesc, productPriceV2.depositFeeDesc);
    }

    public final int hashCode() {
        int i = this.priceType * 31;
        SinglePriceItem singlePriceItem = this.minPrice;
        int iHashCode = (i + (singlePriceItem == null ? 0 : singlePriceItem.hashCode())) * 31;
        RangePrice rangePrice = this.rangePrice;
        int iHashCode2 = (iHashCode + (rangePrice == null ? 0 : rangePrice.hashCode())) * 31;
        SinglePriceItem singlePriceItem2 = this.minAfterCouponPrice;
        int iHashCode3 = (iHashCode2 + (singlePriceItem2 == null ? 0 : singlePriceItem2.hashCode())) * 31;
        String str = this.taxIncludeDesc;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.needIcon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.depositFeeDesc;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductPriceV2(priceType=");
        sbLIZ.append(this.priceType);
        sbLIZ.append(", minPrice=");
        sbLIZ.append(this.minPrice);
        sbLIZ.append(", rangePrice=");
        sbLIZ.append(this.rangePrice);
        sbLIZ.append(", minAfterCouponPrice=");
        sbLIZ.append(this.minAfterCouponPrice);
        sbLIZ.append(", taxIncludeDesc=");
        sbLIZ.append(this.taxIncludeDesc);
        sbLIZ.append(", needIcon=");
        sbLIZ.append(this.needIcon);
        sbLIZ.append(", depositFeeDesc=");
        sbLIZ.append(this.depositFeeDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.priceType);
        SinglePriceItem singlePriceItem = this.minPrice;
        if (singlePriceItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singlePriceItem.writeToParcel(parcel, i);
        }
        RangePrice rangePrice = this.rangePrice;
        if (rangePrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rangePrice.writeToParcel(parcel, i);
        }
        SinglePriceItem singlePriceItem2 = this.minAfterCouponPrice;
        if (singlePriceItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singlePriceItem2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.taxIncludeDesc);
        Boolean bool = this.needIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.depositFeeDesc);
    }

    public ProductPriceV2(int i, SinglePriceItem singlePriceItem, RangePrice rangePrice, SinglePriceItem singlePriceItem2, String str, Boolean bool, String str2) {
        this.priceType = i;
        this.minPrice = singlePriceItem;
        this.rangePrice = rangePrice;
        this.minAfterCouponPrice = singlePriceItem2;
        this.taxIncludeDesc = str;
        this.needIcon = bool;
        this.depositFeeDesc = str2;
    }
}

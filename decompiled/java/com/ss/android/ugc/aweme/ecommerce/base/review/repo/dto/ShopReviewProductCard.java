package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C1405550mgD;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ShopReviewProductCard implements Parcelable {

    @C09CT("display_image")
    public final Image displayImage;

    @C09CT("display_origin_price")
    public final String displayOriginPrice;

    @C09CT("display_product_name")
    public final String displayProductName;

    @C09CT("display_product_type")
    public final Integer displayProductType;

    @C09CT("display_real_price")
    public final String displayRealPrice;

    @C09CT("pdp_schema")
    public final String pdpSchema;
    public static final C1405550mgD Companion = new Object() { // from class: X.0mgD
    };
    public static final Parcelable.Creator<ShopReviewProductCard> CREATOR = new Parcelable.Creator<ShopReviewProductCard>() { // from class: X.0mgC
        @Override // android.os.Parcelable.Creator
        public final ShopReviewProductCard createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(ShopReviewProductCard.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ShopReviewProductCard(string, image, numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShopReviewProductCard[] newArray(int i) {
            return new ShopReviewProductCard[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopReviewProductCard)) {
            return false;
        }
        ShopReviewProductCard shopReviewProductCard = (ShopReviewProductCard) obj;
        return Intrinsics.LJFF(this.displayProductName, shopReviewProductCard.displayProductName) && Intrinsics.LJFF(this.displayImage, shopReviewProductCard.displayImage) && Intrinsics.LJFF(this.displayProductType, shopReviewProductCard.displayProductType) && Intrinsics.LJFF(this.displayOriginPrice, shopReviewProductCard.displayOriginPrice) && Intrinsics.LJFF(this.displayRealPrice, shopReviewProductCard.displayRealPrice) && Intrinsics.LJFF(this.pdpSchema, shopReviewProductCard.pdpSchema);
    }

    public final int hashCode() {
        String str = this.displayProductName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.displayImage;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.displayProductType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.displayOriginPrice;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayRealPrice;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pdpSchema;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopReviewProductCard(displayProductName=");
        sbLIZ.append(this.displayProductName);
        sbLIZ.append(", displayImage=");
        sbLIZ.append(this.displayImage);
        sbLIZ.append(", displayProductType=");
        sbLIZ.append(this.displayProductType);
        sbLIZ.append(", displayOriginPrice=");
        sbLIZ.append(this.displayOriginPrice);
        sbLIZ.append(", displayRealPrice=");
        sbLIZ.append(this.displayRealPrice);
        sbLIZ.append(", pdpSchema=");
        sbLIZ.append(this.pdpSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.displayProductName);
        parcel.writeParcelable(this.displayImage, i);
        Integer num = this.displayProductType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.displayOriginPrice);
        parcel.writeString(this.displayRealPrice);
        parcel.writeString(this.pdpSchema);
    }

    public ShopReviewProductCard(String str, Image image, Integer num, String str2, String str3, String str4) {
        this.displayProductName = str;
        this.displayImage = image;
        this.displayProductType = num;
        this.displayOriginPrice = str2;
        this.displayRealPrice = str3;
        this.pdpSchema = str4;
    }
}

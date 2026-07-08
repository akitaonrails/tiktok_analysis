package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductLogo implements Parcelable {

    @C09CT("dark_mode_image")
    public final Image darkModeImage;

    @C09CT("image")
    public final Image image;

    @C09CT("productLogoType")
    public final Integer productLogoType;

    @C09CT("promotion_id")
    public final String promotionId;
    public static final Parcelable.Creator<ProductLogo> CREATOR = new Parcelable.Creator<ProductLogo>() { // from class: X.02p9
        @Override // android.os.Parcelable.Creator
        public final ProductLogo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Image image = (Image) parcel.readParcelable(ProductLogo.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(ProductLogo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ProductLogo(image, image2, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductLogo[] newArray(int i) {
            return new ProductLogo[i];
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
        if (!(obj instanceof ProductLogo)) {
            return false;
        }
        ProductLogo productLogo = (ProductLogo) obj;
        return Intrinsics.LJFF(this.image, productLogo.image) && Intrinsics.LJFF(this.darkModeImage, productLogo.darkModeImage) && Intrinsics.LJFF(this.productLogoType, productLogo.productLogoType) && Intrinsics.LJFF(this.promotionId, productLogo.promotionId);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkModeImage;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.productLogoType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.promotionId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductLogo(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", darkModeImage=");
        sbLIZ.append(this.darkModeImage);
        sbLIZ.append(", productLogoType=");
        sbLIZ.append(this.productLogoType);
        sbLIZ.append(", promotionId=");
        sbLIZ.append(this.promotionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.darkModeImage, i);
        Integer num = this.productLogoType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.promotionId);
    }

    public ProductLogo(Image image, Image image2, Integer num, String str) {
        this.image = image;
        this.darkModeImage = image2;
        this.productLogoType = num;
        this.promotionId = str;
    }
}

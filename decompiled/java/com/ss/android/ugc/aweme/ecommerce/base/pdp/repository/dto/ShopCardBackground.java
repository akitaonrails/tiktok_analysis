package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopCardBackground;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopCardBackground implements Parcelable {

    @C09CT("image")
    public Image image;

    @C09CT("shop_background_type")
    public Integer shopBackgroundType;

    @C09CT("text_logo")
    public Image textLogo;
    public static final Parcelable.Creator<ShopCardBackground> CREATOR = new Parcelable.Creator<ShopCardBackground>() { // from class: X.02kq
        @Override // android.os.Parcelable.Creator
        public final ShopCardBackground createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Image image = (Image) parcel.readParcelable(ShopCardBackground.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ShopCardBackground(image, numValueOf, (Image) parcel.readParcelable(ShopCardBackground.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShopCardBackground[] newArray(int i) {
            return new ShopCardBackground[i];
        }
    };
    public static final int $stable = 8;

    public ShopCardBackground() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopCardBackground)) {
            return false;
        }
        ShopCardBackground shopCardBackground = (ShopCardBackground) obj;
        return Intrinsics.LJFF(this.image, shopCardBackground.image) && Intrinsics.LJFF(this.shopBackgroundType, shopCardBackground.shopBackgroundType) && Intrinsics.LJFF(this.textLogo, shopCardBackground.textLogo);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Integer num = this.shopBackgroundType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Image image2 = this.textLogo;
        return iHashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopCardBackground(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", shopBackgroundType=");
        sbLIZ.append(this.shopBackgroundType);
        sbLIZ.append(", textLogo=");
        sbLIZ.append(this.textLogo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.image, i);
        Integer num = this.shopBackgroundType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.textLogo, i);
    }

    public ShopCardBackground(Image image, Integer num, Image image2) {
        this.image = image;
        this.shopBackgroundType = num;
        this.textLogo = image2;
    }
}

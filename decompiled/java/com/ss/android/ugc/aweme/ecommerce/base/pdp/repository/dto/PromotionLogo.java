package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionLogo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("dark_mode_image")
    public Image darkModeImage;

    @C09CT("image")
    public Image image;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("promotionLogoType")
    public Integer promotionLogoType;
    public static final Parcelable.Creator<PromotionLogo> CREATOR = new Parcelable.Creator<PromotionLogo>() { // from class: X.02jm
        @Override // android.os.Parcelable.Creator
        public final PromotionLogo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Image image = (Image) parcel.readParcelable(PromotionLogo.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(PromotionLogo.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PromotionLogo(image, image2, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionLogo[] newArray(int i) {
            return new PromotionLogo[i];
        }
    };
    public static final int $stable = 8;

    public PromotionLogo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLogo)) {
            return false;
        }
        PromotionLogo promotionLogo = (PromotionLogo) obj;
        return Intrinsics.LJFF(this.image, promotionLogo.image) && Intrinsics.LJFF(this.darkModeImage, promotionLogo.darkModeImage) && Intrinsics.LJFF(this.promotionId, promotionLogo.promotionId) && Intrinsics.LJFF(this.promotionLogoType, promotionLogo.promotionLogoType) && Intrinsics.LJFF(this.daInfo, promotionLogo.daInfo);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkModeImage;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.promotionId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.promotionLogoType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionLogo(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", darkModeImage=");
        sbLIZ.append(this.darkModeImage);
        sbLIZ.append(", promotionId=");
        sbLIZ.append(this.promotionId);
        sbLIZ.append(", promotionLogoType=");
        sbLIZ.append(this.promotionLogoType);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.darkModeImage, i);
        parcel.writeString(this.promotionId);
        Integer num = this.promotionLogoType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.daInfo);
    }

    public PromotionLogo(Image image, Image image2, String str, Integer num, String str2) {
        this.image = image;
        this.darkModeImage = image2;
        this.promotionId = str;
        this.promotionLogoType = num;
        this.daInfo = str2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaistBannerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PromotionWaistBannerBackground implements Parcelable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_color_dark")
    public final String backgroundColorDark;

    @C09CT("background_img")
    public final Icon backgroundImg;

    @C09CT("background_radius")
    public final Integer backgroundRadius;
    public static final Parcelable.Creator<PromotionWaistBannerBackground> CREATOR = new Parcelable.Creator<PromotionWaistBannerBackground>() { // from class: X.0mgj
        @Override // android.os.Parcelable.Creator
        public final PromotionWaistBannerBackground createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Icon icon = (Icon) parcel.readParcelable(PromotionWaistBannerBackground.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PromotionWaistBannerBackground(icon, string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionWaistBannerBackground[] newArray(int i) {
            return new PromotionWaistBannerBackground[i];
        }
    };
    public static final int $stable = 8;

    public PromotionWaistBannerBackground() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionWaistBannerBackground)) {
            return false;
        }
        PromotionWaistBannerBackground promotionWaistBannerBackground = (PromotionWaistBannerBackground) obj;
        return Intrinsics.LJFF(this.backgroundImg, promotionWaistBannerBackground.backgroundImg) && Intrinsics.LJFF(this.backgroundColor, promotionWaistBannerBackground.backgroundColor) && Intrinsics.LJFF(this.backgroundColorDark, promotionWaistBannerBackground.backgroundColorDark) && Intrinsics.LJFF(this.backgroundRadius, promotionWaistBannerBackground.backgroundRadius);
    }

    public final int hashCode() {
        Icon icon = this.backgroundImg;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColorDark;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.backgroundRadius;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionWaistBannerBackground(backgroundImg=");
        sbLIZ.append(this.backgroundImg);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", backgroundColorDark=");
        sbLIZ.append(this.backgroundColorDark);
        sbLIZ.append(", backgroundRadius=");
        sbLIZ.append(this.backgroundRadius);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.backgroundImg, i);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.backgroundColorDark);
        Integer num = this.backgroundRadius;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public PromotionWaistBannerBackground(Icon icon, String str, String str2, Integer num) {
        this.backgroundImg = icon;
        this.backgroundColor = str;
        this.backgroundColorDark = str2;
        this.backgroundRadius = num;
    }
}

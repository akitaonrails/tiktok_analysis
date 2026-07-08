package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaPdpGradientColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaBannerBackground implements Parcelable {

    @C09CT("border_color")
    public CustomColor borderColor;

    @C09CT("default_gradient")
    public SeaPdpGradientColor defaultGradient;

    @C09CT("image")
    public Icon image;
    public static final Parcelable.Creator<SeaBannerBackground> CREATOR = new Parcelable.Creator<SeaBannerBackground>() { // from class: X.02iZ
        @Override // android.os.Parcelable.Creator
        public final SeaBannerBackground createFromParcel(Parcel parcel) {
            SeaPdpGradientColor seaPdpGradientColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                seaPdpGradientColorCreateFromParcel = null;
            } else {
                seaPdpGradientColorCreateFromParcel = SeaPdpGradientColor.CREATOR.createFromParcel(parcel);
            }
            return new SeaBannerBackground(seaPdpGradientColorCreateFromParcel, (Icon) parcel.readParcelable(SeaBannerBackground.class.getClassLoader()), (CustomColor) parcel.readParcelable(SeaBannerBackground.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SeaBannerBackground[] newArray(int i) {
            return new SeaBannerBackground[i];
        }
    };
    public static final int $stable = 8;

    public SeaBannerBackground() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaBannerBackground)) {
            return false;
        }
        SeaBannerBackground seaBannerBackground = (SeaBannerBackground) obj;
        return Intrinsics.LJFF(this.defaultGradient, seaBannerBackground.defaultGradient) && Intrinsics.LJFF(this.image, seaBannerBackground.image) && Intrinsics.LJFF(this.borderColor, seaBannerBackground.borderColor);
    }

    public final int hashCode() {
        SeaPdpGradientColor seaPdpGradientColor = this.defaultGradient;
        int iHashCode = (seaPdpGradientColor == null ? 0 : seaPdpGradientColor.hashCode()) * 31;
        Icon icon = this.image;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        CustomColor customColor = this.borderColor;
        return iHashCode2 + (customColor != null ? customColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaBannerBackground(defaultGradient=");
        sbLIZ.append(this.defaultGradient);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", borderColor=");
        sbLIZ.append(this.borderColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SeaPdpGradientColor seaPdpGradientColor = this.defaultGradient;
        if (seaPdpGradientColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpGradientColor.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.borderColor, i);
    }

    public SeaBannerBackground(SeaPdpGradientColor seaPdpGradientColor, Icon icon, CustomColor customColor) {
        this.defaultGradient = seaPdpGradientColor;
        this.image = icon;
        this.borderColor = customColor;
    }
}

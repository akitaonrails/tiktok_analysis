package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaPdpGradientColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpGradientColor implements Parcelable {

    @C09CT("end")
    public CustomColor end;

    @C09CT("start")
    public CustomColor start;
    public static final Parcelable.Creator<SeaPdpGradientColor> CREATOR = new Parcelable.Creator<SeaPdpGradientColor>() { // from class: X.02ia
        @Override // android.os.Parcelable.Creator
        public final SeaPdpGradientColor createFromParcel(Parcel parcel) {
            return new SeaPdpGradientColor((CustomColor) parcel.readParcelable(SeaPdpGradientColor.class.getClassLoader()), (CustomColor) parcel.readParcelable(SeaPdpGradientColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpGradientColor[] newArray(int i) {
            return new SeaPdpGradientColor[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpGradientColor() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpGradientColor)) {
            return false;
        }
        SeaPdpGradientColor seaPdpGradientColor = (SeaPdpGradientColor) obj;
        return Intrinsics.LJFF(this.start, seaPdpGradientColor.start) && Intrinsics.LJFF(this.end, seaPdpGradientColor.end);
    }

    public final int hashCode() {
        CustomColor customColor = this.start;
        int iHashCode = (customColor == null ? 0 : customColor.hashCode()) * 31;
        CustomColor customColor2 = this.end;
        return iHashCode + (customColor2 != null ? customColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpGradientColor(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, i);
        parcel.writeParcelable(this.end, i);
    }

    public SeaPdpGradientColor(CustomColor customColor, CustomColor customColor2) {
        this.start = customColor;
        this.end = customColor2;
    }
}

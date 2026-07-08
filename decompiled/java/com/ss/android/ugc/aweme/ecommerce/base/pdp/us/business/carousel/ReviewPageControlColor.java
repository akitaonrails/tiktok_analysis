package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ReviewPageControlColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewPageControlColor implements Parcelable {

    @C09CT("dark_mode_color")
    public final Integer darkModeColor;

    @C09CT("light_mode_color")
    public final Integer lightModeColor;
    public static final Parcelable.Creator<ReviewPageControlColor> CREATOR = new Parcelable.Creator<ReviewPageControlColor>() { // from class: X.0vxD
        @Override // android.os.Parcelable.Creator
        public final ReviewPageControlColor createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ReviewPageControlColor(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewPageControlColor[] newArray(int i) {
            return new ReviewPageControlColor[i];
        }
    };
    public static final int $stable = 8;

    public ReviewPageControlColor() {
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
        if (!(obj instanceof ReviewPageControlColor)) {
            return false;
        }
        ReviewPageControlColor reviewPageControlColor = (ReviewPageControlColor) obj;
        return Intrinsics.LJFF(this.darkModeColor, reviewPageControlColor.darkModeColor) && Intrinsics.LJFF(this.lightModeColor, reviewPageControlColor.lightModeColor);
    }

    public final int hashCode() {
        Integer num = this.darkModeColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.lightModeColor;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewPageControlColor(darkModeColor=");
        sbLIZ.append(this.darkModeColor);
        sbLIZ.append(", lightModeColor=");
        sbLIZ.append(this.lightModeColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.darkModeColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.lightModeColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public ReviewPageControlColor(Integer num, Integer num2) {
        this.darkModeColor = num;
        this.lightModeColor = num2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;

/* JADX INFO: loaded from: classes2.dex */
public final class Padding implements Parcelable {

    @C09CT("bottom")
    public final float bottom;

    @C09CT("left")
    public final float left;

    @C09CT("right")
    public final float right;

    @C09CT("top")
    public final float top;
    public static final Parcelable.Creator<Padding> CREATOR = new Parcelable.Creator<Padding>() { // from class: X.03vA
        @Override // android.os.Parcelable.Creator
        public final Padding createFromParcel(Parcel parcel) {
            return new Padding(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Padding[] newArray(int i) {
            return new Padding[i];
        }
    };
    public static final int $stable = 8;

    public Padding() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Float.compare(this.top, padding.top) == 0 && Float.compare(this.bottom, padding.bottom) == 0 && Float.compare(this.left, padding.left) == 0 && Float.compare(this.right, padding.right) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.top);
        parcel.writeFloat(this.bottom);
        parcel.writeFloat(this.left);
        parcel.writeFloat(this.right);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.top) * 31) + Float.floatToIntBits(this.bottom)) * 31) + Float.floatToIntBits(this.left)) * 31) + Float.floatToIntBits(this.right);
    }

    public Padding(float f, float f2, float f3, float f4) {
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
    }
}

package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop;

/* JADX INFO: loaded from: classes9.dex */
public final class CutSameMediaItemCrop implements Parcelable {
    public static final Parcelable.Creator<CutSameMediaItemCrop> CREATOR = new Parcelable.Creator<CutSameMediaItemCrop>() { // from class: X.0L8D
        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItemCrop createFromParcel(Parcel parcel) {
            return new CutSameMediaItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItemCrop[] newArray(int i) {
            return new CutSameMediaItemCrop[i];
        }
    };

    @C09CT("lowerRightX")
    public final float lowerRightX;

    @C09CT("lowerRightY")
    public final float lowerRightY;

    @C09CT("upperLeftX")
    public final float upperLeftX;

    @C09CT("upperLeftY")
    public final float upperLeftY;

    public CutSameMediaItemCrop() {
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
        if (!(obj instanceof CutSameMediaItemCrop)) {
            return false;
        }
        CutSameMediaItemCrop cutSameMediaItemCrop = (CutSameMediaItemCrop) obj;
        return Float.compare(this.upperLeftX, cutSameMediaItemCrop.upperLeftX) == 0 && Float.compare(this.upperLeftY, cutSameMediaItemCrop.upperLeftY) == 0 && Float.compare(this.lowerRightX, cutSameMediaItemCrop.lowerRightX) == 0 && Float.compare(this.lowerRightY, cutSameMediaItemCrop.lowerRightY) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSameMediaItemCrop(upperLeftX=");
        sbLIZ.append(this.upperLeftX);
        sbLIZ.append(", upperLeftY=");
        sbLIZ.append(this.upperLeftY);
        sbLIZ.append(", lowerRightX=");
        sbLIZ.append(this.lowerRightX);
        sbLIZ.append(", lowerRightY=");
        sbLIZ.append(this.lowerRightY);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.upperLeftX);
        parcel.writeFloat(this.upperLeftY);
        parcel.writeFloat(this.lowerRightX);
        parcel.writeFloat(this.lowerRightY);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.upperLeftX) * 31) + Float.floatToIntBits(this.upperLeftY)) * 31) + Float.floatToIntBits(this.lowerRightX)) * 31) + Float.floatToIntBits(this.lowerRightY);
    }

    public CutSameMediaItemCrop(float f, float f2, float f3, float f4) {
        this.upperLeftX = f;
        this.upperLeftY = f2;
        this.lowerRightX = f3;
        this.lowerRightY = f4;
    }
}

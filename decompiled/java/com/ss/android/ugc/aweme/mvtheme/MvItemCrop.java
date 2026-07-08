package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MvItemCrop;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MvItemCrop implements Serializable, Parcelable {
    public static final Parcelable.Creator<MvItemCrop> CREATOR = new Parcelable.Creator<MvItemCrop>() { // from class: X.0L8E
        @Override // android.os.Parcelable.Creator
        public final MvItemCrop createFromParcel(Parcel parcel) {
            return new MvItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MvItemCrop[] newArray(int i) {
            return new MvItemCrop[i];
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

    public final MvItemCrop copy(float f, float f2, float f3, float f4) {
        return new MvItemCrop(f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MvItemCrop)) {
            return false;
        }
        MvItemCrop mvItemCrop = (MvItemCrop) obj;
        return Float.compare(this.upperLeftX, mvItemCrop.upperLeftX) == 0 && Float.compare(this.upperLeftY, mvItemCrop.upperLeftY) == 0 && Float.compare(this.lowerRightX, mvItemCrop.lowerRightX) == 0 && Float.compare(this.lowerRightY, mvItemCrop.lowerRightY) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MvItemCrop(upperLeftX=");
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

    public int hashCode() {
        return (((((Float.floatToIntBits(this.upperLeftX) * 31) + Float.floatToIntBits(this.upperLeftY)) * 31) + Float.floatToIntBits(this.lowerRightX)) * 31) + Float.floatToIntBits(this.lowerRightY);
    }

    public final float getLowerRightX() {
        return this.lowerRightX;
    }

    public final float getLowerRightY() {
        return this.lowerRightY;
    }

    public final float getUpperLeftX() {
        return this.upperLeftX;
    }

    public final float getUpperLeftY() {
        return this.upperLeftY;
    }

    public MvItemCrop(float f, float f2, float f3, float f4) {
        this.upperLeftX = f;
        this.upperLeftY = f2;
        this.lowerRightX = f3;
        this.lowerRightY = f4;
    }
}

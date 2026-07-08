package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.DuetLayoutInfo;

/* JADX INFO: loaded from: classes21.dex */
public final class DuetLayoutInfo implements Parcelable {
    public static final Parcelable.Creator<DuetLayoutInfo> CREATOR = new Parcelable.Creator<DuetLayoutInfo>() { // from class: X.0kvc
        @Override // android.os.Parcelable.Creator
        public final DuetLayoutInfo createFromParcel(Parcel parcel) {
            return new DuetLayoutInfo(parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final DuetLayoutInfo[] newArray(int i) {
            return new DuetLayoutInfo[i];
        }
    };
    public final int type;
    public final float x1;
    public final float x2;
    public final float y1;
    public final float y2;

    public DuetLayoutInfo() {
        this(-1, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final DuetLayoutInfo copy(int i, float f, float f2, float f3, float f4) {
        return new DuetLayoutInfo(i, f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutInfo)) {
            return false;
        }
        DuetLayoutInfo duetLayoutInfo = (DuetLayoutInfo) obj;
        return this.type == duetLayoutInfo.type && Float.compare(this.x1, duetLayoutInfo.x1) == 0 && Float.compare(this.y1, duetLayoutInfo.y1) == 0 && Float.compare(this.x2, duetLayoutInfo.x2) == 0 && Float.compare(this.y2, duetLayoutInfo.y2) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DuetLayoutInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", x1=");
        sbLIZ.append(this.x1);
        sbLIZ.append(", y1=");
        sbLIZ.append(this.y1);
        sbLIZ.append(", x2=");
        sbLIZ.append(this.x2);
        sbLIZ.append(", y2=");
        sbLIZ.append(this.y2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeFloat(this.x1);
        parcel.writeFloat(this.y1);
        parcel.writeFloat(this.x2);
        parcel.writeFloat(this.y2);
    }

    public int hashCode() {
        return (((((((this.type * 31) + Float.floatToIntBits(this.x1)) * 31) + Float.floatToIntBits(this.y1)) * 31) + Float.floatToIntBits(this.x2)) * 31) + Float.floatToIntBits(this.y2);
    }

    public final int getType() {
        return this.type;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getY2() {
        return this.y2;
    }

    public DuetLayoutInfo(int i, float f, float f2, float f3, float f4) {
        this.type = i;
        this.x1 = f;
        this.y1 = f2;
        this.x2 = f3;
        this.y2 = f4;
    }
}

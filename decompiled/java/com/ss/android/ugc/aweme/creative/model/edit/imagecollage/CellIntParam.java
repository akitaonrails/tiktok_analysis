package com.ss.android.ugc.aweme.creative.model.edit.imagecollage;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CellIntParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class CellIntParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<CellIntParam> CREATOR = new Parcelable.Creator<CellIntParam>() { // from class: X.0HKK
        @Override // android.os.Parcelable.Creator
        public final CellIntParam createFromParcel(Parcel parcel) {
            return new CellIntParam(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CellIntParam[] newArray(int i) {
            return new CellIntParam[i];
        }
    };

    @C09CT("height")
    public final int height;

    @C09CT("width")
    public final int width;

    @C09CT("x")
    public final int x;

    @C09CT("y")
    public final int y;

    public CellIntParam() {
        this(0, 0, 0, 0);
    }

    public final CellIntParam copy(int i, int i2, int i3, int i4) {
        return new CellIntParam(i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellIntParam)) {
            return false;
        }
        CellIntParam cellIntParam = (CellIntParam) obj;
        return this.x == cellIntParam.x && this.y == cellIntParam.y && this.width == cellIntParam.width && this.height == cellIntParam.height;
    }

    public int hashCode() {
        return (((((this.x * 31) + this.y) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellIntParam(x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public CellIntParam(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }
}

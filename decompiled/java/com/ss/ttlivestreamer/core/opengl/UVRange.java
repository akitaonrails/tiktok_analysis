package com.ss.ttlivestreamer.core.opengl;

import X.C1271700jCK;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ttlivestreamer.core.opengl.UVRange;

/* JADX INFO: loaded from: classes21.dex */
public final class UVRange implements Parcelable {
    public static final C1271700jCK CREATOR = new Parcelable.Creator<UVRange>() { // from class: X.0jCK
        @Override // android.os.Parcelable.Creator
        public final UVRange createFromParcel(Parcel parcel) {
            UVRange uVRange = new UVRange();
            uVRange.uMin = parcel.readFloat();
            uVRange.uMax = parcel.readFloat();
            uVRange.vMin = parcel.readFloat();
            uVRange.vMax = parcel.readFloat();
            return uVRange;
        }

        @Override // android.os.Parcelable.Creator
        public final UVRange[] newArray(int i) {
            return new UVRange[i];
        }
    };
    public float uMax;
    public float uMin;
    public float vMax;
    public float vMin;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UVRange() {
        this.uMax = 1.0f;
        this.vMax = 1.0f;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UVRange(uMin=");
        sbLIZ.append(this.uMin);
        sbLIZ.append(", uMax=");
        sbLIZ.append(this.uMax);
        sbLIZ.append(", vMin=");
        sbLIZ.append(this.vMin);
        sbLIZ.append(", vMax=");
        sbLIZ.append(this.vMax);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.uMin);
        parcel.writeFloat(this.uMax);
        parcel.writeFloat(this.vMin);
        parcel.writeFloat(this.vMax);
    }

    public UVRange(float f, float f2, float f3, float f4) {
        this();
        this.uMin = f;
        this.uMax = f2;
        this.vMin = f3;
        this.vMax = f4;
    }
}

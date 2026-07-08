package com.ss.android.vesdk;

import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VECherEffectParam implements Parcelable {
    public static final Parcelable.Creator<VECherEffectParam> CREATOR = new C2325341G0m(17);
    public double[] duration;
    public int length;
    public String[] matrix;
    public boolean[] segUseCher;
    public int totalNum;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double[] getDuration() {
        return this.duration;
    }

    public String[] getMatrix() {
        return this.matrix;
    }

    public boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    public void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.matrix.length);
        parcel.writeInt(this.totalNum);
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public VECherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this(strArr, dArr, strArr.length, zArr);
    }

    public VECherEffectParam(String[] strArr, double[] dArr, int i, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.length = i;
        this.segUseCher = zArr;
        this.totalNum = zArr.length;
    }
}

package com.ss.android.vesdk.model;

import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEPrePlayParams implements Parcelable {
    public static final Parcelable.Creator<VEPrePlayParams> CREATOR = new C2325341G0m(58);
    public int duration;
    public boolean isLoop;
    public int stopStrategy;
    public int timeUnit;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEPrePlayParams() {
    }

    public VEPrePlayParams(Parcel parcel) {
        boolean z;
        this.duration = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isLoop = z;
        this.stopStrategy = parcel.readInt();
    }

    public VEPrePlayParams(int i, boolean z) {
        this.duration = i;
        this.isLoop = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeByte(this.isLoop ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.stopStrategy);
    }

    public VEPrePlayParams(int i, boolean z, int i2) {
        this.duration = i;
        this.isLoop = z;
        this.stopStrategy = i2;
    }
}

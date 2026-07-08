package com.ss.android.vesdk;

import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEARCoreParam implements Parcelable {
    public static final Parcelable.Creator<VEARCoreParam> CREATOR = new C2325341G0m(12);
    public boolean enableARCore;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEARCoreParam() {
    }

    public boolean isEnableARCore() {
        return this.enableARCore;
    }

    public VEARCoreParam(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableARCore = z;
    }

    public void setEnableARCore(boolean z) {
        this.enableARCore = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.enableARCore ? (byte) 1 : (byte) 0);
    }
}

package com.ss.android.vesdk;

import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEVolumeParam implements Parcelable {
    public static final Parcelable.Creator<VEVolumeParam> CREATOR = new C2325341G0m(19);
    public float bgmPlayVolume;
    public boolean enhanceSysPlayVolume;
    public int trackIndex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEVolumeParam() {
        this.trackIndex = -1;
        this.bgmPlayVolume = -1.0f;
    }

    public VEVolumeParam(Parcel parcel) {
        boolean z;
        this.trackIndex = -1;
        this.bgmPlayVolume = -1.0f;
        this.bgmPlayVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enhanceSysPlayVolume = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bgmPlayVolume);
        parcel.writeByte(this.enhanceSysPlayVolume ? (byte) 1 : (byte) 0);
    }
}

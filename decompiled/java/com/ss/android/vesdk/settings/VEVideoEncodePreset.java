package com.ss.android.vesdk.settings;

import X.C08FF;
import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public enum VEVideoEncodePreset implements Parcelable {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;

    public static final Parcelable.Creator<VEVideoEncodePreset> CREATOR = new C1864730ycp(28);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static VEVideoEncodePreset valueOf(String str) {
        return (VEVideoEncodePreset) C08FF.LIZ(VEVideoEncodePreset.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}

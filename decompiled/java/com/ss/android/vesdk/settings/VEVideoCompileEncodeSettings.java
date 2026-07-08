package com.ss.android.vesdk.settings;

import X.C1864730ycp;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public class VEVideoCompileEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoCompileEncodeSettings> CREATOR = new C1864730ycp(27);
    public boolean enableHwBufferEncode;
    public boolean isSupportHWEncoder;
    public VEVideoHWEncodeSettings mHWEncodeSetting;
    public VEVideoSWEncodeSettings mSWEncodeSetting;
    public boolean useHWEncoder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoCompileEncodeSettings() {
        this.mHWEncodeSetting = new VEVideoHWEncodeSettings();
        this.mSWEncodeSetting = new VEVideoSWEncodeSettings();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoCompileEncodeSettings{useHWEncoder=");
        sbLIZ.append(this.useHWEncoder);
        sbLIZ.append(", isSupportHWEncoder=");
        sbLIZ.append(this.isSupportHWEncoder);
        sbLIZ.append(", mHWEncodeSetting=");
        sbLIZ.append(this.mHWEncodeSetting);
        sbLIZ.append(", mSWEncodeSetting=");
        sbLIZ.append(this.mSWEncodeSetting);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEVideoCompileEncodeSettings(Parcel parcel) {
        boolean z;
        this.mHWEncodeSetting = new VEVideoHWEncodeSettings();
        this.mSWEncodeSetting = new VEVideoSWEncodeSettings();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useHWEncoder = z;
        this.isSupportHWEncoder = parcel.readByte() != 0;
        this.mHWEncodeSetting = (VEVideoHWEncodeSettings) parcel.readParcelable(VEVideoHWEncodeSettings.class.getClassLoader());
        this.mSWEncodeSetting = (VEVideoSWEncodeSettings) parcel.readParcelable(VEVideoSWEncodeSettings.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.useHWEncoder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mHWEncodeSetting, i);
        parcel.writeParcelable(this.mSWEncodeSetting, i);
    }
}

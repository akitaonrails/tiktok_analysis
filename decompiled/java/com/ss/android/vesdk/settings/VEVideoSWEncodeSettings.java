package com.ss.android.vesdk.settings;

import X.C1864730ycp;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: loaded from: classes28.dex */
public class VEVideoSWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoSWEncodeSettings> CREATOR = new C1864730ycp(31);
    public int mBitrateMode;
    public int mBps;
    public double mByteVC1Crf;
    public double mByteVC1HdrCrf;
    public int mByteVC1Preset;
    public int mCrf;
    public double mFHDCrfRatio;
    public int mGop;
    public double mHFpsOffset;
    public int mMaxQP;
    public long mMaxRate;
    public int mMinQP;
    public int mPreset;
    public int mProfile;
    public double mQPOffset;
    public double mSDCrfRatio;
    public int mThreadCount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoSWEncodeSettings() {
        this.mCrf = 15;
        this.mHFpsOffset = -1.0d;
        this.mByteVC1HdrCrf = 21.0d;
        this.mByteVC1Crf = 22.0d;
        this.mSDCrfRatio = 1.0d;
        this.mThreadCount = 6;
        this.mMinQP = 15;
        this.mMaxQP = 39;
        this.mFHDCrfRatio = 1.0d;
        this.mBps = 4000000;
        this.mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
        this.mPreset = VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.mByteVC1Preset = -1;
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mMaxRate = 15000000L;
        this.mGop = 35;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoSWEncodeSettings{mCrf=");
        sbLIZ.append(this.mCrf);
        sbLIZ.append(", mBps=");
        sbLIZ.append(this.mBps);
        sbLIZ.append(", mBitrateMode=");
        sbLIZ.append(this.mBitrateMode);
        sbLIZ.append(", mPreset=");
        sbLIZ.append(this.mPreset);
        sbLIZ.append(", mProfile=");
        sbLIZ.append(this.mProfile);
        sbLIZ.append(", mMaxRate=");
        sbLIZ.append(this.mMaxRate);
        sbLIZ.append(", mGop=");
        sbLIZ.append(this.mGop);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEVideoSWEncodeSettings(Parcel parcel) {
        this.mCrf = 15;
        this.mHFpsOffset = -1.0d;
        this.mByteVC1HdrCrf = 21.0d;
        this.mByteVC1Crf = 22.0d;
        this.mSDCrfRatio = 1.0d;
        this.mThreadCount = 6;
        this.mMinQP = 15;
        this.mMaxQP = 39;
        this.mFHDCrfRatio = 1.0d;
        this.mBps = 4000000;
        this.mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
        this.mPreset = VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.mByteVC1Preset = -1;
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mMaxRate = 15000000L;
        this.mGop = 35;
        this.mCrf = parcel.readInt();
        this.mQPOffset = parcel.readDouble();
        this.mHFpsOffset = parcel.readDouble();
        this.mByteVC1Crf = parcel.readDouble();
        this.mByteVC1HdrCrf = parcel.readDouble();
        this.mSDCrfRatio = parcel.readDouble();
        this.mThreadCount = parcel.readInt();
        this.mMinQP = parcel.readInt();
        this.mMaxQP = parcel.readInt();
        this.mFHDCrfRatio = parcel.readDouble();
        this.mPreset = parcel.readInt();
        this.mByteVC1Preset = parcel.readInt();
        this.mProfile = parcel.readInt();
        this.mMaxRate = parcel.readLong();
        this.mBps = parcel.readInt();
        this.mBitrateMode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCrf);
        parcel.writeDouble(this.mQPOffset);
        parcel.writeDouble(this.mHFpsOffset);
        parcel.writeDouble(this.mByteVC1Crf);
        parcel.writeDouble(this.mSDCrfRatio);
        parcel.writeDouble(this.mByteVC1HdrCrf);
        parcel.writeInt(this.mThreadCount);
        parcel.writeInt(this.mMinQP);
        parcel.writeInt(this.mMaxQP);
        parcel.writeDouble(this.mFHDCrfRatio);
        parcel.writeInt(this.mPreset);
        parcel.writeInt(this.mByteVC1Preset);
        parcel.writeInt(this.mProfile);
        parcel.writeLong(this.mMaxRate);
        parcel.writeInt(this.mBps);
        parcel.writeInt(this.mBitrateMode);
    }
}

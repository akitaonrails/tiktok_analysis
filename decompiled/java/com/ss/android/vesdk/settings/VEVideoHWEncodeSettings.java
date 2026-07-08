package com.ss.android.vesdk.settings;

import X.C1864730ycp;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public class VEVideoHWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoHWEncodeSettings> CREATOR = new C1864730ycp(30);
    public double m2K_bitrate_ratio;
    public double m4K_bitrate_ratio;
    public long mBitrate;
    public int mCodecType;
    public double mFullHd_bitrate_ratio;
    public int mGop;
    public double mH_fps_bitrate_ratio;
    public double mHdr_bitrate_ratio;
    public double mHevc_bitrate_ratio;
    public double mHp_bitrate_ratio;
    public int mProfile;
    public double mPseudoLandscape_bitrate_ratio;
    public int mQpMax;
    public int mQpMin;
    public double mSd_bitrate_ratio;
    public double transition_bitrate_ratio;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoHWEncodeSettings() {
        this.mBitrate = 6000000L;
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mHp_bitrate_ratio = 0.75d;
        this.mFullHd_bitrate_ratio = 1.0d;
        this.mSd_bitrate_ratio = 1.0d;
        this.mH_fps_bitrate_ratio = 1.0d;
        this.transition_bitrate_ratio = 1.0d;
        this.m2K_bitrate_ratio = 1.0d;
        this.m4K_bitrate_ratio = 1.0d;
        this.mPseudoLandscape_bitrate_ratio = 1.0d;
        this.mHevc_bitrate_ratio = 1.0d;
        this.mHdr_bitrate_ratio = 1.0d;
        this.mGop = 35;
        this.mCodecType = 0;
        this.mQpMin = -1;
        this.mQpMax = -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoHWEncodeSettings{mBitrate=");
        sbLIZ.append(this.mBitrate);
        sbLIZ.append(", mProfile=");
        sbLIZ.append(this.mProfile);
        sbLIZ.append(", mHp_bitrate_ratio=");
        sbLIZ.append(this.mHp_bitrate_ratio);
        sbLIZ.append(", mFullHd_bitrate_ratio=");
        sbLIZ.append(this.mFullHd_bitrate_ratio);
        sbLIZ.append(", mSd_bitrate_ratio=");
        sbLIZ.append(this.mSd_bitrate_ratio);
        sbLIZ.append(", mH_fps_bitrate_ratio=");
        sbLIZ.append(this.mH_fps_bitrate_ratio);
        sbLIZ.append(", transition_bitrate_ratio=");
        sbLIZ.append(this.transition_bitrate_ratio);
        sbLIZ.append(", m2KbitrateRatio=");
        sbLIZ.append(this.m2K_bitrate_ratio);
        sbLIZ.append(", m4KbiterateRatio=");
        sbLIZ.append(this.m4K_bitrate_ratio);
        sbLIZ.append(", mPseudoLandscape_bitrate_ratio =");
        sbLIZ.append(this.mPseudoLandscape_bitrate_ratio);
        sbLIZ.append(", mHevc_bitrate_ratio=");
        sbLIZ.append(this.mHevc_bitrate_ratio);
        sbLIZ.append(", mHdr_bitrate_ratio=");
        sbLIZ.append(this.mHdr_bitrate_ratio);
        sbLIZ.append(", mGop=");
        sbLIZ.append(this.mGop);
        sbLIZ.append(", mCodecType=");
        sbLIZ.append(this.mCodecType);
        sbLIZ.append(", mQpMin=");
        sbLIZ.append(this.mQpMin);
        sbLIZ.append(", mQpMax=");
        sbLIZ.append(this.mQpMax);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEVideoHWEncodeSettings(Parcel parcel) {
        this.mBitrate = 6000000L;
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mHp_bitrate_ratio = 0.75d;
        this.mFullHd_bitrate_ratio = 1.0d;
        this.mSd_bitrate_ratio = 1.0d;
        this.mH_fps_bitrate_ratio = 1.0d;
        this.transition_bitrate_ratio = 1.0d;
        this.m2K_bitrate_ratio = 1.0d;
        this.m4K_bitrate_ratio = 1.0d;
        this.mPseudoLandscape_bitrate_ratio = 1.0d;
        this.mHevc_bitrate_ratio = 1.0d;
        this.mHdr_bitrate_ratio = 1.0d;
        this.mGop = 35;
        this.mCodecType = 0;
        this.mQpMin = -1;
        this.mQpMax = -1;
        this.mBitrate = parcel.readLong();
        this.mProfile = parcel.readInt();
        this.mHp_bitrate_ratio = parcel.readDouble();
        this.mFullHd_bitrate_ratio = parcel.readDouble();
        this.mSd_bitrate_ratio = parcel.readDouble();
        this.mH_fps_bitrate_ratio = parcel.readDouble();
        this.mHevc_bitrate_ratio = parcel.readDouble();
        this.mHdr_bitrate_ratio = parcel.readDouble();
        this.mGop = parcel.readInt();
        this.transition_bitrate_ratio = parcel.readDouble();
        this.m2K_bitrate_ratio = parcel.readDouble();
        this.m4K_bitrate_ratio = parcel.readDouble();
        this.mPseudoLandscape_bitrate_ratio = parcel.readDouble();
        this.mCodecType = parcel.readInt();
        this.mQpMin = parcel.readInt();
        this.mQpMax = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mBitrate);
        parcel.writeInt(this.mProfile);
        parcel.writeDouble(this.mHp_bitrate_ratio);
        parcel.writeDouble(this.mFullHd_bitrate_ratio);
        parcel.writeDouble(this.mSd_bitrate_ratio);
        parcel.writeDouble(this.mH_fps_bitrate_ratio);
        parcel.writeDouble(this.mHevc_bitrate_ratio);
        parcel.writeDouble(this.mPseudoLandscape_bitrate_ratio);
        parcel.writeDouble(this.mHdr_bitrate_ratio);
        parcel.writeInt(this.mGop);
        parcel.writeDouble(this.transition_bitrate_ratio);
        parcel.writeDouble(this.m2K_bitrate_ratio);
        parcel.writeDouble(this.m4K_bitrate_ratio);
        parcel.writeInt(this.mCodecType);
        parcel.writeInt(this.mQpMin);
        parcel.writeInt(this.mQpMax);
    }
}

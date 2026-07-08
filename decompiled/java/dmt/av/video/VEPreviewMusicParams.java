package dmt.av.video;

import X.C1466660oGm;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes23.dex */
public class VEPreviewMusicParams implements Parcelable {
    public static final Parcelable.Creator<VEPreviewMusicParams> CREATOR = new C1466660oGm(15);
    public double avgLoudness;
    public float balancedGain;
    public int bgmDelay;
    public double bgmLoudness;
    public Boolean changeTone;
    public long endTime;
    public long fadeInLength;
    public long fadeOutLength;
    public boolean isFastImport;
    public boolean isMusicIllegal;
    public int isMusicLoop;
    public boolean isSoundLoop;
    public int mDuration;
    public int mInPoint;
    public int mOutPoint;
    public String mPath;
    public int mShootDuration;
    public float mVolume;
    public long minLength;
    public String musicId;
    public int musicMaxLoopDuration;
    public String musicName;
    public int muteEnd;
    public int muteStart;
    public int pageType;
    public double peakLoudness;
    public float previewStartTime;
    public Float soundSpeed;
    public long startTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEPreviewMusicParams() {
        this.soundSpeed = Float.valueOf(1.0f);
        this.changeTone = Boolean.TRUE;
        this.pageType = 1;
        this.isFastImport = false;
        this.bgmLoudness = 0.0d;
        this.peakLoudness = 0.0d;
        this.avgLoudness = 0.0d;
        this.fadeInLength = 0L;
        this.fadeOutLength = 0L;
        this.balancedGain = 1.0f;
        this.minLength = 0L;
        this.startTime = 0L;
        this.endTime = 0L;
        this.isMusicLoop = 0;
        this.musicMaxLoopDuration = 0;
        this.mVolume = 1.0f;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEPreviewMusicParams{mPath='");
        sbLIZ.append(this.mPath);
        sbLIZ.append('\'');
        sbLIZ.append(", mInPoint=");
        sbLIZ.append(this.mInPoint);
        sbLIZ.append(", mDuration=");
        sbLIZ.append(this.mDuration);
        sbLIZ.append(", mShootDuration=");
        sbLIZ.append(this.mShootDuration);
        sbLIZ.append(", mVolume=");
        sbLIZ.append(this.mVolume);
        sbLIZ.append(", previewStartTime=");
        sbLIZ.append(this.previewStartTime);
        sbLIZ.append(", bgmdelay=");
        sbLIZ.append(this.bgmDelay);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEPreviewMusicParams(Parcel parcel) {
        boolean z;
        boolean z2;
        this.soundSpeed = Float.valueOf(1.0f);
        this.changeTone = Boolean.TRUE;
        this.pageType = 1;
        this.isFastImport = false;
        this.bgmLoudness = 0.0d;
        this.peakLoudness = 0.0d;
        this.avgLoudness = 0.0d;
        this.fadeInLength = 0L;
        this.fadeOutLength = 0L;
        this.balancedGain = 1.0f;
        this.minLength = 0L;
        this.startTime = 0L;
        this.endTime = 0L;
        this.isMusicLoop = 0;
        this.musicMaxLoopDuration = 0;
        this.mPath = parcel.readString();
        this.mInPoint = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mVolume = parcel.readFloat();
        this.musicId = parcel.readString();
        this.musicName = parcel.readString();
        this.soundSpeed = Float.valueOf(parcel.readFloat());
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.changeTone = Boolean.valueOf(z);
        this.pageType = parcel.readInt();
        this.previewStartTime = parcel.readFloat();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isFastImport = z2;
        this.muteStart = parcel.readInt();
        this.muteEnd = parcel.readInt();
        this.isSoundLoop = parcel.readByte() == 1;
        this.bgmDelay = parcel.readInt();
        this.bgmLoudness = parcel.readDouble();
        this.peakLoudness = parcel.readDouble();
        this.avgLoudness = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPath);
        parcel.writeInt(this.mInPoint);
        parcel.writeInt(this.mDuration);
        parcel.writeFloat(this.mVolume);
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicName);
        parcel.writeFloat(this.soundSpeed.floatValue());
        parcel.writeInt(this.changeTone.booleanValue() ? 1 : 0);
        parcel.writeInt(this.pageType);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeInt(this.isFastImport ? 1 : 0);
        parcel.writeInt(this.muteStart);
        parcel.writeInt(this.muteEnd);
        parcel.writeByte(this.isSoundLoop ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bgmDelay);
        parcel.writeDouble(this.bgmLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.avgLoudness);
    }
}

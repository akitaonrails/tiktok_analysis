package com.ss.android.ugc.aweme.creative.model.music;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioRatioInfo implements Parcelable {
    public static final Parcelable.Creator<AudioRatioInfo> CREATOR = new Parcelable.Creator<AudioRatioInfo>() { // from class: X.0o4B
        @Override // android.os.Parcelable.Creator
        public final AudioRatioInfo createFromParcel(Parcel parcel) {
            return new AudioRatioInfo(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRatioInfo[] newArray(int i) {
            return new AudioRatioInfo[i];
        }
    };

    @C09CT("music_ratio")
    public float musicRatio;

    @C09CT("sing_ratio")
    public float singRatio;

    @C09CT("speech_ratio")
    public float speechRatio;

    public AudioRatioInfo() {
        this(0.0f, 0.0f, 0.0f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRatioInfo)) {
            return false;
        }
        AudioRatioInfo audioRatioInfo = (AudioRatioInfo) obj;
        return Float.compare(this.singRatio, audioRatioInfo.singRatio) == 0 && Float.compare(this.speechRatio, audioRatioInfo.speechRatio) == 0 && Float.compare(this.musicRatio, audioRatioInfo.musicRatio) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioRatioInfo(singRatio=");
        sbLIZ.append(this.singRatio);
        sbLIZ.append(", speechRatio=");
        sbLIZ.append(this.speechRatio);
        sbLIZ.append(", musicRatio=");
        sbLIZ.append(this.musicRatio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.singRatio);
        parcel.writeFloat(this.speechRatio);
        parcel.writeFloat(this.musicRatio);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.singRatio) * 31) + Float.floatToIntBits(this.speechRatio)) * 31) + Float.floatToIntBits(this.musicRatio);
    }

    public AudioRatioInfo(float f, float f2, float f3) {
        this.singRatio = f;
        this.speechRatio = f2;
        this.musicRatio = f3;
    }
}

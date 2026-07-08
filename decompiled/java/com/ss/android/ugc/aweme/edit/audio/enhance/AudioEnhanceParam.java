package com.ss.android.ugc.aweme.edit.audio.enhance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioEnhanceParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<AudioEnhanceParam> CREATOR = new Parcelable.Creator<AudioEnhanceParam>() { // from class: X.0EiD
        @Override // android.os.Parcelable.Creator
        public final AudioEnhanceParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z4 = false;
            }
            return new AudioEnhanceParam(z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioEnhanceParam[] newArray(int i) {
            return new AudioEnhanceParam[i];
        }
    };

    @C09CT("enable_music_enhance")
    public final boolean enableMusicEnhance;

    @C09CT("enable_origin_enhance")
    public final boolean enableOriginEnhance;

    @C09CT("support_music_enhance")
    public final boolean supportMusicEnhance;

    @C09CT("support_origin_enhance")
    public final boolean supportOriginEnhance;

    public AudioEnhanceParam() {
        this(false, false, false, false);
    }

    public final AudioEnhanceParam copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new AudioEnhanceParam(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEnhanceParam)) {
            return false;
        }
        AudioEnhanceParam audioEnhanceParam = (AudioEnhanceParam) obj;
        return this.supportOriginEnhance == audioEnhanceParam.supportOriginEnhance && this.supportMusicEnhance == audioEnhanceParam.supportMusicEnhance && this.enableOriginEnhance == audioEnhanceParam.enableOriginEnhance && this.enableMusicEnhance == audioEnhanceParam.enableMusicEnhance;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.supportOriginEnhance) * 31) + C786410Ut5.Z2(this.supportMusicEnhance)) * 31) + C786410Ut5.Z2(this.enableOriginEnhance)) * 31) + C786410Ut5.Z2(this.enableMusicEnhance);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioEnhanceParam(supportOriginEnhance=");
        sbLIZ.append(this.supportOriginEnhance);
        sbLIZ.append(", supportMusicEnhance=");
        sbLIZ.append(this.supportMusicEnhance);
        sbLIZ.append(", enableOriginEnhance=");
        sbLIZ.append(this.enableOriginEnhance);
        sbLIZ.append(", enableMusicEnhance=");
        sbLIZ.append(this.enableMusicEnhance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportOriginEnhance ? 1 : 0);
        parcel.writeInt(this.supportMusicEnhance ? 1 : 0);
        parcel.writeInt(this.enableOriginEnhance ? 1 : 0);
        parcel.writeInt(this.enableMusicEnhance ? 1 : 0);
    }

    public final boolean getEnableMusicEnhance() {
        return this.enableMusicEnhance;
    }

    public final boolean getEnableOriginEnhance() {
        return this.enableOriginEnhance;
    }

    public final boolean getSupportMusicEnhance() {
        return this.supportMusicEnhance;
    }

    public final boolean getSupportOriginEnhance() {
        return this.supportOriginEnhance;
    }

    public AudioEnhanceParam(boolean z, boolean z2, boolean z3, boolean z4) {
        this.supportOriginEnhance = z;
        this.supportMusicEnhance = z2;
        this.enableOriginEnhance = z3;
        this.enableMusicEnhance = z4;
    }
}

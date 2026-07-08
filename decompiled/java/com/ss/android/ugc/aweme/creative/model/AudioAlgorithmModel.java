package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioAlgorithmModel implements Parcelable {
    public static final Parcelable.Creator<AudioAlgorithmModel> CREATOR = new Parcelable.Creator<AudioAlgorithmModel>() { // from class: X.0mlo
        @Override // android.os.Parcelable.Creator
        public final AudioAlgorithmModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
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
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            float f3 = parcel.readFloat();
            float f4 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new AudioAlgorithmModel(z, z2, z3, z4, z5, f, f2, f3, f4, z6, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAlgorithmModel[] newArray(int i) {
            return new AudioAlgorithmModel[i];
        }
    };

    @C09CT("edit_volume_level_end")
    public float editVolumeEnd;

    @C09CT("edit_volume_level_start")
    public float editVolumeStart;

    @C09CT("is_aec_on")
    public boolean isAECOn;

    @C09CT("is_denoise_on")
    public boolean isDenoiseOn;

    @C09CT("is_loudness_check_on")
    public boolean isLoudnessCheckOn;

    @C09CT("is_loudness_on")
    public boolean isLoudnessOn;

    @C09CT("is_mic_enabled")
    public boolean isMicEnabled;

    @C09CT("record_is_mic_on")
    public boolean isMicOn;

    @C09CT("is_ta_on")
    public boolean isTAOn;

    @C09CT("shoot_volume_level_end")
    public float shootVolumeEnd;

    @C09CT("shoot_volume_level_start")
    public float shootVolumeStart;

    public AudioAlgorithmModel() {
        this(false, false, false, false, false, -1.0f, -1.0f, -1.0f, -1.0f, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAECOn ? 1 : 0);
        parcel.writeInt(this.isTAOn ? 1 : 0);
        parcel.writeInt(this.isLoudnessOn ? 1 : 0);
        parcel.writeInt(this.isLoudnessCheckOn ? 1 : 0);
        parcel.writeInt(this.isDenoiseOn ? 1 : 0);
        parcel.writeFloat(this.editVolumeStart);
        parcel.writeFloat(this.editVolumeEnd);
        parcel.writeFloat(this.shootVolumeStart);
        parcel.writeFloat(this.shootVolumeEnd);
        parcel.writeInt(this.isMicOn ? 1 : 0);
        parcel.writeInt(this.isMicEnabled ? 1 : 0);
    }

    public AudioAlgorithmModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, float f2, float f3, float f4, boolean z6, boolean z7) {
        this.isAECOn = z;
        this.isTAOn = z2;
        this.isLoudnessOn = z3;
        this.isLoudnessCheckOn = z4;
        this.isDenoiseOn = z5;
        this.editVolumeStart = f;
        this.editVolumeEnd = f2;
        this.shootVolumeStart = f3;
        this.shootVolumeEnd = f4;
        this.isMicOn = z6;
        this.isMicEnabled = z7;
    }
}

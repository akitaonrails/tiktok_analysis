package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C1438470nXJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;

/* JADX INFO: loaded from: classes23.dex */
public final class MicDataModel implements Parcelable {

    @C09CT("edit_default_volume")
    public float editDefaultVolume;

    @C09CT("edit_volume_change_mark")
    public boolean editVolumeChangeMark;

    @C09CT("enable_microphone_with_bgm")
    public boolean enableMicWithBgm;

    @C09CT("is_use_audio_graph")
    public boolean isUseAudioGraphWithBgm;

    @C09CT("mic_state_before_retake")
    public int micStateBeforeRetake;

    @C09CT("record_original_sound_with_bgm")
    public boolean recordOriginalSoundWithBGM;
    public static final C1438470nXJ Companion = new Object() { // from class: X.0nXJ
    };
    public static final Parcelable.Creator<MicDataModel> CREATOR = new Parcelable.Creator<MicDataModel>() { // from class: X.0nXI
        @Override // android.os.Parcelable.Creator
        public final MicDataModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f = parcel.readFloat();
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
            return new MicDataModel(f, z, z2, z3, z4, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MicDataModel[] newArray(int i) {
            return new MicDataModel[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.editDefaultVolume);
        parcel.writeInt(this.editVolumeChangeMark ? 1 : 0);
        parcel.writeInt(this.recordOriginalSoundWithBGM ? 1 : 0);
        parcel.writeInt(this.enableMicWithBgm ? 1 : 0);
        parcel.writeInt(this.isUseAudioGraphWithBgm ? 1 : 0);
        parcel.writeInt(this.micStateBeforeRetake);
    }

    public MicDataModel() {
        this(-1.0f, false, false, false, false, -1);
    }

    public MicDataModel(float f, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.editDefaultVolume = f;
        this.editVolumeChangeMark = z;
        this.recordOriginalSoundWithBGM = z2;
        this.enableMicWithBgm = z3;
        this.isUseAudioGraphWithBgm = z4;
        this.micStateBeforeRetake = i;
    }
}

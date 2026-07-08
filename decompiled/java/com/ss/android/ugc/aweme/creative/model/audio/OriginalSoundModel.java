package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.OriginalSoundModel;

/* JADX INFO: loaded from: classes23.dex */
public final class OriginalSoundModel implements Parcelable {
    public static final Parcelable.Creator<OriginalSoundModel> CREATOR = new Parcelable.Creator<OriginalSoundModel>() { // from class: X.0nWW
        @Override // android.os.Parcelable.Creator
        public final OriginalSoundModel createFromParcel(Parcel parcel) {
            boolean z;
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new OriginalSoundModel(f, z);
        }

        @Override // android.os.Parcelable.Creator
        public final OriginalSoundModel[] newArray(int i) {
            return new OriginalSoundModel[i];
        }
    };

    @C040H
    public boolean isMuted;

    @C040H
    public float voiceVolume;

    public OriginalSoundModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.voiceVolume);
        parcel.writeInt(this.isMuted ? 1 : 0);
    }

    public /* synthetic */ OriginalSoundModel(int i) {
        this(0.0f, false);
    }

    public OriginalSoundModel(float f, boolean z) {
        this.voiceVolume = f;
        this.isMuted = z;
    }
}

package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C1438400nXC;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AudioVolumeAdjustModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioVolumeAdjustModel implements Parcelable {

    @C09CT("audio_volume_dbrange")
    public double dbRange;
    public static final C1438400nXC Companion = new Object() { // from class: X.0nXC
    };
    public static final Parcelable.Creator<AudioVolumeAdjustModel> CREATOR = new Parcelable.Creator<AudioVolumeAdjustModel>() { // from class: X.0nWZ
        @Override // android.os.Parcelable.Creator
        public final AudioVolumeAdjustModel createFromParcel(Parcel parcel) {
            return new AudioVolumeAdjustModel(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioVolumeAdjustModel[] newArray(int i) {
            return new AudioVolumeAdjustModel[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.dbRange);
    }

    public AudioVolumeAdjustModel() {
        this(-1.0d);
    }

    public AudioVolumeAdjustModel(double d) {
        this.dbRange = d;
    }
}

package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.VolumeInfoModel;

/* JADX INFO: loaded from: classes23.dex */
public final class VolumeInfoModel implements Parcelable {
    public static final Parcelable.Creator<VolumeInfoModel> CREATOR = new Parcelable.Creator<VolumeInfoModel>() { // from class: X.0nWf
        @Override // android.os.Parcelable.Creator
        public final VolumeInfoModel createFromParcel(Parcel parcel) {
            return new VolumeInfoModel(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final VolumeInfoModel[] newArray(int i) {
            return new VolumeInfoModel[i];
        }
    };

    @C09CT("music_volume")
    public float musicVolume;

    @C09CT("video_volume")
    public float videoVolume;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.musicVolume);
        parcel.writeFloat(this.videoVolume);
    }

    public VolumeInfoModel() {
        this(-1.0f, -1.0f);
    }

    public VolumeInfoModel(float f, float f2) {
        this.musicVolume = f;
        this.videoVolume = f2;
    }
}

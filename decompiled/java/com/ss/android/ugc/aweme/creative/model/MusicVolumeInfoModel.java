package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicVolumeInfoModel implements Parcelable {
    public static final Parcelable.Creator<MusicVolumeInfoModel> CREATOR = new Parcelable.Creator<MusicVolumeInfoModel>() { // from class: X.0nXK
        @Override // android.os.Parcelable.Creator
        public final MusicVolumeInfoModel createFromParcel(Parcel parcel) {
            return new MusicVolumeInfoModel(parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicVolumeInfoModel[] newArray(int i) {
            return new MusicVolumeInfoModel[i];
        }
    };

    @C09CT("duet_src_loudness")
    public float duetSrcLoudness;

    @C09CT("music_volume_info_music_id")
    public String musicId;

    @C09CT("music_volume_info_json")
    public String musicVolumeInfo;

    public MusicVolumeInfoModel() {
        this(null, null, Float.MIN_VALUE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicVolumeInfo);
        parcel.writeFloat(this.duetSrcLoudness);
    }

    public MusicVolumeInfoModel(String str, String str2, float f) {
        this.musicId = str;
        this.musicVolumeInfo = str2;
        this.duetSrcLoudness = f;
    }
}

package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.MusicModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class MusicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicModel> CREATOR = new Parcelable.Creator<MusicModel>() { // from class: X.0MhS
        @Override // android.os.Parcelable.Creator
        public final MusicModel createFromParcel(Parcel parcel) {
            return new MusicModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicModel[] newArray(int i) {
            return new MusicModel[i];
        }
    };

    @C09CT("music_id")
    public String musicId;

    public MusicModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicId);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public MusicModel(String str) {
        this.musicId = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }
}

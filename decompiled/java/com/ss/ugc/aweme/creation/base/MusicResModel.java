package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import com.ss.ugc.aweme.creation.base.MusicResModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class MusicResModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicResModel> CREATOR = new Parcelable.Creator<MusicResModel>() { // from class: X.0MhD
        @Override // android.os.Parcelable.Creator
        public final MusicResModel createFromParcel(Parcel parcel) {
            return new MusicResModel((DependencyInfo) parcel.readParcelable(MusicResModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicResModel[] newArray(int i) {
            return new MusicResModel[i];
        }
    };

    @C09CT("dependency_info")
    public DependencyInfo dependencyInfo;

    @C09CT("music_id")
    public String musicId;

    public MusicResModel() {
        this(null, "");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dependencyInfo, i);
        parcel.writeString(this.musicId);
    }

    public final DependencyInfo getDependencyInfo() {
        return this.dependencyInfo;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final void setDependencyInfo(DependencyInfo dependencyInfo) {
        this.dependencyInfo = dependencyInfo;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public MusicResModel(DependencyInfo dependencyInfo, String str) {
        this.dependencyInfo = dependencyInfo;
        this.musicId = str;
    }
}

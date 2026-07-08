package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeDefaultMusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModeDefaultMusicModel implements Parcelable {
    public static final Parcelable.Creator<PhotoModeDefaultMusicModel> CREATOR = new Parcelable.Creator<PhotoModeDefaultMusicModel>() { // from class: X.0MJu
        @Override // android.os.Parcelable.Creator
        public final PhotoModeDefaultMusicModel createFromParcel(Parcel parcel) {
            return new PhotoModeDefaultMusicModel((MusicModel) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeDefaultMusicModel[] newArray(int i) {
            return new PhotoModeDefaultMusicModel[i];
        }
    };

    @C040H
    public final String musicFilePath;

    @C040H
    public final MusicModel musicModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeDefaultMusicModel)) {
            return false;
        }
        PhotoModeDefaultMusicModel photoModeDefaultMusicModel = (PhotoModeDefaultMusicModel) obj;
        return Intrinsics.LJFF(this.musicFilePath, photoModeDefaultMusicModel.musicFilePath) && Intrinsics.LJFF(this.musicModel, photoModeDefaultMusicModel.musicModel);
    }

    public final int hashCode() {
        return (this.musicFilePath.hashCode() * 31) + this.musicModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeDefaultMusicModel(musicFilePath=");
        sbLIZ.append(this.musicFilePath);
        sbLIZ.append(", musicModel=");
        sbLIZ.append(this.musicModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicFilePath);
        parcel.writeSerializable(this.musicModel);
    }

    public PhotoModeDefaultMusicModel(MusicModel musicModel, String str) {
        this.musicFilePath = str;
        this.musicModel = musicModel;
    }
}

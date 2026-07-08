package com.ss.android.ugc.aweme.creative.model.album;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.AlbumMobModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AlbumMobModel implements Parcelable {
    public static final Parcelable.Creator<AlbumMobModel> CREATOR = new Parcelable.Creator<AlbumMobModel>() { // from class: X.0nWn
        @Override // android.os.Parcelable.Creator
        public final AlbumMobModel createFromParcel(Parcel parcel) {
            return new AlbumMobModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumMobModel[] newArray(int i) {
            return new AlbumMobModel[i];
        }
    };

    @C040H
    public String albumFromPage;

    @C040H
    public String albumFromScene;

    public AlbumMobModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.albumFromPage);
        parcel.writeString(this.albumFromScene);
    }

    public /* synthetic */ AlbumMobModel(int i) {
        this("", "");
    }

    public AlbumMobModel(String str, String str2) {
        this.albumFromPage = str;
        this.albumFromScene = str2;
    }
}

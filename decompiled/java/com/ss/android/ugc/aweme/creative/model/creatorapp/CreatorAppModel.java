package com.ss.android.ugc.aweme.creative.model.creatorapp;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.creatorapp.CreatorAppModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CreatorAppModel implements Parcelable {
    public static final Parcelable.Creator<CreatorAppModel> CREATOR = new Parcelable.Creator<CreatorAppModel>() { // from class: X.0nX9
        @Override // android.os.Parcelable.Creator
        public final CreatorAppModel createFromParcel(Parcel parcel) {
            return new CreatorAppModel(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CreatorAppModel[] newArray(int i) {
            return new CreatorAppModel[i];
        }
    };

    @C040H
    public final int enterAlbumScene;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enterAlbumScene);
    }

    public CreatorAppModel(int i) {
        this.enterAlbumScene = i;
    }
}

package com.ss.android.ugc.aweme.creative.model.album;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumOpenApiModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AlbumOpenApiModel> CREATOR = new Parcelable.Creator<AlbumOpenApiModel>() { // from class: X.0Khz
        @Override // android.os.Parcelable.Creator
        public final AlbumOpenApiModel createFromParcel(Parcel parcel) {
            return new AlbumOpenApiModel(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumOpenApiModel[] newArray(int i) {
            return new AlbumOpenApiModel[i];
        }
    };
    public int supportFlags;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportFlags);
    }

    public final int getSupportFlags() {
        return this.supportFlags;
    }

    public AlbumOpenApiModel(int i) {
        this.supportFlags = i;
    }

    public final void setSupportFlags(int i) {
        this.supportFlags = i;
    }
}

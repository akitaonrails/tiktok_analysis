package com.ss.android.ugc.aweme.shortvideo.album.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.internal.AlbumOpenApiSessionData;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumOpenApiSessionData implements Parcelable {
    public static final Parcelable.Creator<AlbumOpenApiSessionData> CREATOR = new Parcelable.Creator<AlbumOpenApiSessionData>() { // from class: X.0Kgu
        @Override // android.os.Parcelable.Creator
        public final AlbumOpenApiSessionData createFromParcel(Parcel parcel) {
            return new AlbumOpenApiSessionData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumOpenApiSessionData[] newArray(int i) {
            return new AlbumOpenApiSessionData[i];
        }
    };
    public final String businessKey;
    public final String launchIntentKey;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.businessKey);
        parcel.writeString(this.launchIntentKey);
    }

    public AlbumOpenApiSessionData(String str, String str2) {
        this.businessKey = str;
        this.launchIntentKey = str2;
    }
}

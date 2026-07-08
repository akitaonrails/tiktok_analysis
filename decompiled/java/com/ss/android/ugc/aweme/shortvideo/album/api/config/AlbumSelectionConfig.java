package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumSelectionConfig implements Parcelable {
    public AlbumSelectionMode mode;
    public float videoMaxSeconds;
    public float videoMinSeconds;
    public static final Parcelable.Creator<AlbumSelectionConfig> CREATOR = new Parcelable.Creator<AlbumSelectionConfig>() { // from class: X.0Kgr
        @Override // android.os.Parcelable.Creator
        public final AlbumSelectionConfig createFromParcel(Parcel parcel) {
            return new AlbumSelectionConfig((AlbumSelectionMode) parcel.readParcelable(AlbumSelectionConfig.class.getClassLoader()), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumSelectionConfig[] newArray(int i) {
            return new AlbumSelectionConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumSelectionConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mode, i);
        parcel.writeFloat(this.videoMinSeconds);
        parcel.writeFloat(this.videoMaxSeconds);
    }

    public /* synthetic */ AlbumSelectionConfig(int i) {
        this(AlbumSelectionMode.Single.INSTANCE, 0.0f, 0.0f);
    }

    public AlbumSelectionConfig(AlbumSelectionMode albumSelectionMode, float f, float f2) {
        this.mode = albumSelectionMode;
        this.videoMinSeconds = f;
        this.videoMaxSeconds = f2;
    }
}

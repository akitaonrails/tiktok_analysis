package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumExportResolution;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumOutputConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class AlbumOutputConfig implements Parcelable {
    public AlbumExportResolution resolution;
    public static final Parcelable.Creator<AlbumOutputConfig> CREATOR = new Parcelable.Creator<AlbumOutputConfig>() { // from class: X.1DQ8
        @Override // android.os.Parcelable.Creator
        public final AlbumOutputConfig createFromParcel(Parcel parcel) {
            return new AlbumOutputConfig(AlbumExportResolution.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumOutputConfig[] newArray(int i) {
            return new AlbumOutputConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumOutputConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.resolution.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlbumOutputConfig(int i) {
        this(AlbumExportResolution.f78default);
        AlbumExportResolution.Companion.getClass();
    }

    public AlbumOutputConfig(AlbumExportResolution albumExportResolution) {
        this.resolution = albumExportResolution;
    }
}

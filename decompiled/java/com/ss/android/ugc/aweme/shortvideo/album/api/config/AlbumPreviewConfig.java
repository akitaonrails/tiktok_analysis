package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumPreviewConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class AlbumPreviewConfig implements Parcelable {
    public boolean supportPreview;
    public static final Parcelable.Creator<AlbumPreviewConfig> CREATOR = new Parcelable.Creator<AlbumPreviewConfig>() { // from class: X.1DPu
        @Override // android.os.Parcelable.Creator
        public final AlbumPreviewConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AlbumPreviewConfig(z);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumPreviewConfig[] newArray(int i) {
            return new AlbumPreviewConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumPreviewConfig() {
        this(true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportPreview ? 1 : 0);
    }

    public AlbumPreviewConfig(boolean z) {
        this.supportPreview = z;
    }
}

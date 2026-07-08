package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumMediaConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSupportTab;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumMediaConfig implements Parcelable {
    public boolean enableCameraSource;
    public boolean enableSystemAlbum;
    public AlbumSupportTab supportMediaTab;
    public static final Parcelable.Creator<AlbumMediaConfig> CREATOR = new Parcelable.Creator<AlbumMediaConfig>() { // from class: X.0Kgc
        @Override // android.os.Parcelable.Creator
        public final AlbumMediaConfig createFromParcel(Parcel parcel) {
            boolean z;
            AlbumSupportTab albumSupportTabCreateFromParcel = AlbumSupportTab.CREATOR.createFromParcel(parcel);
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new AlbumMediaConfig(albumSupportTabCreateFromParcel, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumMediaConfig[] newArray(int i) {
            return new AlbumMediaConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumMediaConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlbumMediaConfig(int i) {
        this(AlbumSupportTab.UNSPECIFIED, false, false);
        AlbumSupportTab.Companion.getClass();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportMediaTab.flag);
        parcel.writeInt(this.enableCameraSource ? 1 : 0);
        parcel.writeInt(this.enableSystemAlbum ? 1 : 0);
    }

    public AlbumMediaConfig(AlbumSupportTab albumSupportTab, boolean z, boolean z2) {
        this.supportMediaTab = albumSupportTab;
        this.enableCameraSource = z;
        this.enableSystemAlbum = z2;
    }
}

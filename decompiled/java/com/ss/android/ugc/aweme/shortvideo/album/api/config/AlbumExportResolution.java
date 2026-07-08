package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import X.C1DQ9;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumExportResolution;

/* JADX INFO: loaded from: classes36.dex */
public final class AlbumExportResolution implements Parcelable {
    public final int maxHeight;
    public final int maxWidth;
    public static final C1DQ9 Companion = new Object() { // from class: X.1DQ9
    };
    public static final Parcelable.Creator<AlbumExportResolution> CREATOR = new Parcelable.Creator<AlbumExportResolution>() { // from class: X.1DQ7
        @Override // android.os.Parcelable.Creator
        public final AlbumExportResolution createFromParcel(Parcel parcel) {
            return new AlbumExportResolution(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumExportResolution[] newArray(int i) {
            return new AlbumExportResolution[i];
        }
    };
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final AlbumExportResolution f78default = new AlbumExportResolution(-1, -1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxWidth);
        parcel.writeInt(this.maxHeight);
    }

    public AlbumExportResolution(int i, int i2) {
        this.maxWidth = i;
        this.maxHeight = i2;
    }
}

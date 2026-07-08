package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import X.C523900Kge;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSupportTab;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumSupportTab implements Parcelable {
    public final int flag;
    public static final C523900Kge Companion = new Object() { // from class: X.0Kge
    };
    public static final Parcelable.Creator<AlbumSupportTab> CREATOR = new Parcelable.Creator<AlbumSupportTab>() { // from class: X.0Kgd
        @Override // android.os.Parcelable.Creator
        public final AlbumSupportTab createFromParcel(Parcel parcel) {
            return new AlbumSupportTab(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumSupportTab[] newArray(int i) {
            return new AlbumSupportTab[i];
        }
    };
    public static final int $stable = 8;
    public static final AlbumSupportTab MIXED = new AlbumSupportTab(64);
    public static final AlbumSupportTab PHOTO = new AlbumSupportTab(3);
    public static final AlbumSupportTab VIDEO = new AlbumSupportTab(4);
    public static final AlbumSupportTab LIVE_PHOTO = new AlbumSupportTab(8);
    public static final AlbumSupportTab AI_CONTENT = new AlbumSupportTab(16);
    public static final AlbumSupportTab UNSPECIFIED = new AlbumSupportTab(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.flag);
    }

    public AlbumSupportTab(int i) {
        this.flag = i;
    }

    public final boolean LIZ(AlbumSupportTab albumSupportTab) {
        int i = albumSupportTab.flag;
        if (i == 0) {
            if (this.flag == 0) {
                return true;
            }
            return false;
        }
        if ((i & this.flag) != 0) {
            return true;
        }
        return false;
    }

    public final AlbumSupportTab LIZIZ(AlbumSupportTab albumSupportTab) {
        int i = this.flag;
        if (i != 0) {
            return new AlbumSupportTab(albumSupportTab.flag | i);
        }
        throw new IllegalArgumentException("Do not use UNSPECIFIED type");
    }
}

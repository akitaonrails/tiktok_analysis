package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public class AlbumNextButtonConfig implements Parcelable {
    public int nextBtnColor;
    public int nextBtnTitle;
    public int nextBtnTitleColor;
    public static final Parcelable.Creator<AlbumNextButtonConfig> CREATOR = new Parcelable.Creator<AlbumNextButtonConfig>() { // from class: X.0Kk6
        @Override // android.os.Parcelable.Creator
        public final AlbumNextButtonConfig createFromParcel(Parcel parcel) {
            return new AlbumNextButtonConfig(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumNextButtonConfig[] newArray(int i) {
            return new AlbumNextButtonConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumNextButtonConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.nextBtnTitle);
        parcel.writeInt(this.nextBtnTitleColor);
        parcel.writeInt(this.nextBtnColor);
    }

    public /* synthetic */ AlbumNextButtonConfig(int i) {
        this(R.string.m6n, R.attr.a0p, R.attr.a04);
    }

    public AlbumNextButtonConfig(int i, int i2, int i3) {
        this.nextBtnTitle = i;
        this.nextBtnTitleColor = i2;
        this.nextBtnColor = i3;
    }
}

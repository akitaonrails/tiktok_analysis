package com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumDefaultBottomActionBarConfig implements AlbumBottomActionBarConfig {
    public String hintText;
    public final AlbumNextButtonConfig nextButton;
    public static final Parcelable.Creator<AlbumDefaultBottomActionBarConfig> CREATOR = new Parcelable.Creator<AlbumDefaultBottomActionBarConfig>() { // from class: X.0Kgq
        @Override // android.os.Parcelable.Creator
        public final AlbumDefaultBottomActionBarConfig createFromParcel(Parcel parcel) {
            return new AlbumDefaultBottomActionBarConfig((AlbumNextButtonConfig) parcel.readParcelable(AlbumDefaultBottomActionBarConfig.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumDefaultBottomActionBarConfig[] newArray(int i) {
            return new AlbumDefaultBottomActionBarConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumDefaultBottomActionBarConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.nextButton, i);
        parcel.writeString(this.hintText);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomActionBarConfig
    public final AlbumNextButtonConfig O7() {
        return this.nextButton;
    }

    public /* synthetic */ AlbumDefaultBottomActionBarConfig(int i) {
        this(new AlbumNextButtonConfig(0), null);
    }

    public AlbumDefaultBottomActionBarConfig(AlbumNextButtonConfig albumNextButtonConfig, String str) {
        this.nextButton = albumNextButtonConfig;
        this.hintText = str;
    }
}

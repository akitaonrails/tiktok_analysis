package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumPluginAdaptConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumPluginAdaptConfig implements Parcelable {
    public boolean showPluginUnreadyTips;
    public static final Parcelable.Creator<AlbumPluginAdaptConfig> CREATOR = new Parcelable.Creator<AlbumPluginAdaptConfig>() { // from class: X.0Kgy
        @Override // android.os.Parcelable.Creator
        public final AlbumPluginAdaptConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AlbumPluginAdaptConfig(z);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumPluginAdaptConfig[] newArray(int i) {
            return new AlbumPluginAdaptConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumPluginAdaptConfig() {
        this(true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showPluginUnreadyTips ? 1 : 0);
    }

    public AlbumPluginAdaptConfig(boolean z) {
        this.showPluginUnreadyTips = z;
    }
}

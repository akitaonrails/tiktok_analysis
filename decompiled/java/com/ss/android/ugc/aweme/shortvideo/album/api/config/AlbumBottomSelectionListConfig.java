package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomSelectionListConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class AlbumBottomSelectionListConfig implements Parcelable {
    public boolean supportDragAndDrop;
    public static final Parcelable.Creator<AlbumBottomSelectionListConfig> CREATOR = new Parcelable.Creator<AlbumBottomSelectionListConfig>() { // from class: X.1DPt
        @Override // android.os.Parcelable.Creator
        public final AlbumBottomSelectionListConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AlbumBottomSelectionListConfig(z);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumBottomSelectionListConfig[] newArray(int i) {
            return new AlbumBottomSelectionListConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumBottomSelectionListConfig() {
        this(true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportDragAndDrop ? 1 : 0);
    }

    public AlbumBottomSelectionListConfig(boolean z) {
        this.supportDragAndDrop = z;
    }
}

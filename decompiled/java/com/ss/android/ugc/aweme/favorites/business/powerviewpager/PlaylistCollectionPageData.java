package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionPage;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.PlaylistCollectionPageData;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistCollectionPageData extends PowerViewPagerFragmentItem<PlaylistCollectionPage> {
    public static final Parcelable.Creator<PlaylistCollectionPageData> CREATOR = new Parcelable.Creator<PlaylistCollectionPageData>() { // from class: X.0hBv
        @Override // android.os.Parcelable.Creator
        public final PlaylistCollectionPageData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new PlaylistCollectionPageData();
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistCollectionPageData[] newArray(int i) {
            return new PlaylistCollectionPageData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.RavenMusicCollectionFragmentData;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenMusicCollectionFragmentData extends PowerViewPagerFragmentItem<RavenMusicCollectionFragment> {
    public final boolean lazyLoad;
    public static final Parcelable.Creator<RavenMusicCollectionFragmentData> CREATOR = new Parcelable.Creator<RavenMusicCollectionFragmentData>() { // from class: X.0hBu
        @Override // android.os.Parcelable.Creator
        public final RavenMusicCollectionFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new RavenMusicCollectionFragmentData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final RavenMusicCollectionFragmentData[] newArray(int i) {
            return new RavenMusicCollectionFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.lazyLoad ? 1 : 0);
    }

    public RavenMusicCollectionFragmentData(boolean z) {
        this.lazyLoad = z;
    }
}

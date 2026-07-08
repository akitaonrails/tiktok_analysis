package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.MusicCollectionFragmentData;

/* JADX INFO: loaded from: classes19.dex */
public final class MusicCollectionFragmentData extends PowerViewPagerFragmentItem<MusicCollectionFragment> {
    public final boolean lazyLoad;
    public static final Parcelable.Creator<MusicCollectionFragmentData> CREATOR = new Parcelable.Creator<MusicCollectionFragmentData>() { // from class: X.0hFa
        @Override // android.os.Parcelable.Creator
        public final MusicCollectionFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MusicCollectionFragmentData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicCollectionFragmentData[] newArray(int i) {
            return new MusicCollectionFragmentData[i];
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

    public MusicCollectionFragmentData(boolean z) {
        this.lazyLoad = z;
    }
}

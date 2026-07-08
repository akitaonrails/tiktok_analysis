package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.StickerCollectListFragmentData;
import com.ss.android.ugc.aweme.favorites.business.sticker.StickerCollectListFragment;

/* JADX INFO: loaded from: classes19.dex */
public final class StickerCollectListFragmentData extends PowerViewPagerFragmentItem<StickerCollectListFragment> {
    public static final Parcelable.Creator<StickerCollectListFragmentData> CREATOR = new Parcelable.Creator<StickerCollectListFragmentData>() { // from class: X.0hVR
        @Override // android.os.Parcelable.Creator
        public final StickerCollectListFragmentData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new StickerCollectListFragmentData();
        }

        @Override // android.os.Parcelable.Creator
        public final StickerCollectListFragmentData[] newArray(int i) {
            return new StickerCollectListFragmentData[i];
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

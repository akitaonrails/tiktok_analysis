package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoriteVideoTabRootFragmentData;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;

/* JADX INFO: loaded from: classes33.dex */
public final class FavoriteVideoTabRootFragmentData extends PowerViewPagerFragmentItem<FavoriteVideoTabRootFragment> {
    public final Bundle listFragmentArgs;
    public static final Parcelable.Creator<FavoriteVideoTabRootFragmentData> CREATOR = new Parcelable.Creator<FavoriteVideoTabRootFragmentData>() { // from class: X.19Km
        @Override // android.os.Parcelable.Creator
        public final FavoriteVideoTabRootFragmentData createFromParcel(Parcel parcel) {
            return new FavoriteVideoTabRootFragmentData(parcel.readBundle(FavoriteVideoTabRootFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteVideoTabRootFragmentData[] newArray(int i) {
            return new FavoriteVideoTabRootFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.listFragmentArgs);
    }

    public FavoriteVideoTabRootFragmentData(Bundle bundle) {
        this.listFragmentArgs = bundle;
    }
}

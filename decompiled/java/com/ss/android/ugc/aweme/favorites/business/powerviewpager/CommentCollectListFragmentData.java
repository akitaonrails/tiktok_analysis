package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectListFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.CommentCollectListFragmentData;

/* JADX INFO: loaded from: classes19.dex */
public final class CommentCollectListFragmentData extends PowerViewPagerFragmentItem<CommentCollectListFragment> {
    public final boolean isMyProfile;
    public static final Parcelable.Creator<CommentCollectListFragmentData> CREATOR = new Parcelable.Creator<CommentCollectListFragmentData>() { // from class: X.0hVT
        @Override // android.os.Parcelable.Creator
        public final CommentCollectListFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CommentCollectListFragmentData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentCollectListFragmentData[] newArray(int i) {
            return new CommentCollectListFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isMyProfile ? 1 : 0);
    }

    public CommentCollectListFragmentData(boolean z) {
        this.isMyProfile = z;
    }
}

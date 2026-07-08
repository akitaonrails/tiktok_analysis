package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListTabFragmentData;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolPostsListTabFragmentData extends PowerViewPagerFragmentItem<SchoolPostsListFragment> {
    public final int index;
    public static final Parcelable.Creator<SchoolPostsListTabFragmentData> CREATOR = new Parcelable.Creator<SchoolPostsListTabFragmentData>() { // from class: X.0iHc
        @Override // android.os.Parcelable.Creator
        public final SchoolPostsListTabFragmentData createFromParcel(Parcel parcel) {
            return new SchoolPostsListTabFragmentData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SchoolPostsListTabFragmentData[] newArray(int i) {
            return new SchoolPostsListTabFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchoolPostsListTabFragmentData) && this.index == ((SchoolPostsListTabFragmentData) obj).index;
    }

    public final int hashCode() {
        return this.index;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolPostsListTabFragmentData(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
    }

    public SchoolPostsListTabFragmentData(int i) {
        this.index = i;
    }
}

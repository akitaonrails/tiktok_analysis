package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListTabFragmentData;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolGroupsListTabFragmentData extends PowerViewPagerFragmentItem<SchoolGroupsListFragment> {
    public final int index;
    public static final Parcelable.Creator<SchoolGroupsListTabFragmentData> CREATOR = new Parcelable.Creator<SchoolGroupsListTabFragmentData>() { // from class: X.0iHZ
        @Override // android.os.Parcelable.Creator
        public final SchoolGroupsListTabFragmentData createFromParcel(Parcel parcel) {
            return new SchoolGroupsListTabFragmentData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SchoolGroupsListTabFragmentData[] newArray(int i) {
            return new SchoolGroupsListTabFragmentData[i];
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
        return (obj instanceof SchoolGroupsListTabFragmentData) && this.index == ((SchoolGroupsListTabFragmentData) obj).index;
    }

    public final int hashCode() {
        return this.index;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolGroupsListTabFragmentData(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
    }

    public SchoolGroupsListTabFragmentData(int i) {
        this.index = i;
    }
}

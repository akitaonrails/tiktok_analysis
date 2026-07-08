package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListTabFragmentData;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolUsersListTabFragmentData extends PowerViewPagerFragmentItem<SchoolUsersListFragment> {
    public final int index;
    public static final Parcelable.Creator<SchoolUsersListTabFragmentData> CREATOR = new Parcelable.Creator<SchoolUsersListTabFragmentData>() { // from class: X.0iHb
        @Override // android.os.Parcelable.Creator
        public final SchoolUsersListTabFragmentData createFromParcel(Parcel parcel) {
            return new SchoolUsersListTabFragmentData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SchoolUsersListTabFragmentData[] newArray(int i) {
            return new SchoolUsersListTabFragmentData[i];
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
        return (obj instanceof SchoolUsersListTabFragmentData) && this.index == ((SchoolUsersListTabFragmentData) obj).index;
    }

    public final int hashCode() {
        return this.index;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolUsersListTabFragmentData(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
    }

    public SchoolUsersListTabFragmentData(int i) {
        this.index = i;
    }
}

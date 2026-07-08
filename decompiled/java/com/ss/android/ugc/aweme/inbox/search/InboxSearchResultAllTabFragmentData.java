package com.ss.android.ugc.aweme.inbox.search;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultAllTabFragmentData;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResultAllTabFragmentData extends PowerViewPagerFragmentItem<InboxSearchResultAllTabFragment> {
    public final int index;
    public static final Parcelable.Creator<InboxSearchResultAllTabFragmentData> CREATOR = new Parcelable.Creator<InboxSearchResultAllTabFragmentData>() { // from class: X.0iPs
        @Override // android.os.Parcelable.Creator
        public final InboxSearchResultAllTabFragmentData createFromParcel(Parcel parcel) {
            return new InboxSearchResultAllTabFragmentData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InboxSearchResultAllTabFragmentData[] newArray(int i) {
            return new InboxSearchResultAllTabFragmentData[i];
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
        return (obj instanceof InboxSearchResultAllTabFragmentData) && this.index == ((InboxSearchResultAllTabFragmentData) obj).index;
    }

    public final int hashCode() {
        return this.index;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResultAllTabFragmentData(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
    }

    public InboxSearchResultAllTabFragmentData(int i) {
        this.index = i;
    }
}

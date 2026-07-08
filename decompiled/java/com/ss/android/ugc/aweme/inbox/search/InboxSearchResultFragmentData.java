package com.ss.android.ugc.aweme.inbox.search;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultFragmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResultFragmentData extends PowerViewPagerFragmentItem<InboxSearchResultFragment> {
    public final int index;
    public final String name;
    public static final Parcelable.Creator<InboxSearchResultFragmentData> CREATOR = new Parcelable.Creator<InboxSearchResultFragmentData>() { // from class: X.0iPv
        @Override // android.os.Parcelable.Creator
        public final InboxSearchResultFragmentData createFromParcel(Parcel parcel) {
            return new InboxSearchResultFragmentData(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InboxSearchResultFragmentData[] newArray(int i) {
            return new InboxSearchResultFragmentData[i];
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
        if (!(obj instanceof InboxSearchResultFragmentData)) {
            return false;
        }
        InboxSearchResultFragmentData inboxSearchResultFragmentData = (InboxSearchResultFragmentData) obj;
        return this.index == inboxSearchResultFragmentData.index && Intrinsics.LJFF(this.name, inboxSearchResultFragmentData.name);
    }

    public final int hashCode() {
        return (this.index * 31) + this.name.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResultFragmentData(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.name);
    }

    public InboxSearchResultFragmentData(int i, String str) {
        this.index = i;
        this.name = str;
    }
}

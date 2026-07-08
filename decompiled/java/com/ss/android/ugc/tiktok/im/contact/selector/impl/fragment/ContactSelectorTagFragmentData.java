package com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment;

import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment.ContactSelectorTagFragmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ContactSelectorTagFragmentData extends PowerViewPagerFragmentItem<ContactSelectorTabFragment> {
    public static final Parcelable.Creator<ContactSelectorTagFragmentData> CREATOR = new Parcelable.Creator<ContactSelectorTagFragmentData>() { // from class: X.0hya
        @Override // android.os.Parcelable.Creator
        public final ContactSelectorTagFragmentData createFromParcel(Parcel parcel) {
            return new ContactSelectorTagFragmentData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactSelectorTagFragmentData[] newArray(int i) {
            return new ContactSelectorTagFragmentData[i];
        }
    };
    public final String tabKey;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactSelectorTagFragmentData) && Intrinsics.LJFF(this.tabKey, ((ContactSelectorTagFragmentData) obj).tabKey);
    }

    public final int hashCode() {
        return this.tabKey.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactSelectorTagFragmentData(tabKey=");
        sbLIZ.append(this.tabKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tabKey);
    }

    @Override // com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem
    public final int getId() {
        return this.tabKey.hashCode();
    }

    public ContactSelectorTagFragmentData(String str) {
        this.tabKey = str;
    }

    @Override // com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}

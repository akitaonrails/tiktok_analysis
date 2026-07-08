package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TabTemplateFragmentItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TabTemplateFragmentItem extends PowerViewPagerFragmentItem<TakoImageCreateTabFragment> {
    public final String tabEnName;
    public final String tabId;
    public final String tabName;
    public final Integer tabType;
    public final TakoPageContext takoPageContext;
    public static final Parcelable.Creator<TabTemplateFragmentItem> CREATOR = new Parcelable.Creator<TabTemplateFragmentItem>() { // from class: X.0yJ0
        @Override // android.os.Parcelable.Creator
        public final TabTemplateFragmentItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TabTemplateFragmentItem(string, string2, string3, numValueOf, (TakoPageContext) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TabTemplateFragmentItem[] newArray(int i) {
            return new TabTemplateFragmentItem[i];
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
        if (!(obj instanceof TabTemplateFragmentItem)) {
            return false;
        }
        TabTemplateFragmentItem tabTemplateFragmentItem = (TabTemplateFragmentItem) obj;
        return Intrinsics.LJFF(this.tabId, tabTemplateFragmentItem.tabId) && Intrinsics.LJFF(this.tabName, tabTemplateFragmentItem.tabName) && Intrinsics.LJFF(this.tabEnName, tabTemplateFragmentItem.tabEnName) && Intrinsics.LJFF(this.tabType, tabTemplateFragmentItem.tabType) && Intrinsics.LJFF(this.takoPageContext, tabTemplateFragmentItem.takoPageContext);
    }

    public final int hashCode() {
        int iHashCode = ((this.tabId.hashCode() * 31) + this.tabName.hashCode()) * 31;
        String str = this.tabEnName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.tabType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TakoPageContext takoPageContext = this.takoPageContext;
        return iHashCode3 + (takoPageContext != null ? takoPageContext.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabTemplateFragmentItem(tabId=");
        sbLIZ.append(this.tabId);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", tabEnName=");
        sbLIZ.append(this.tabEnName);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.tabType);
        sbLIZ.append(", takoPageContext=");
        sbLIZ.append(this.takoPageContext);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.tabId);
        parcel.writeString(this.tabName);
        parcel.writeString(this.tabEnName);
        Integer num = this.tabType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeSerializable(this.takoPageContext);
    }

    public TabTemplateFragmentItem(String str, String str2, String str3, Integer num, TakoPageContext takoPageContext) {
        this.tabId = str;
        this.tabName = str2;
        this.tabEnName = str3;
        this.tabType = num;
        this.takoPageContext = takoPageContext;
    }
}

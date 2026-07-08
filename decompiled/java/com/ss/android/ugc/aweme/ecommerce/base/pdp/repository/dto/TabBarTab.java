package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarTab;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TabBarTab implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("facade_id_list")
    public final List<String> facadeIdList;

    @C09CT("leading_icon")
    public final String icon;

    @C09CT("name")
    public final String name;
    public static final Parcelable.Creator<TabBarTab> CREATOR = new Parcelable.Creator<TabBarTab>() { // from class: X.0mhA
        @Override // android.os.Parcelable.Creator
        public final TabBarTab createFromParcel(Parcel parcel) {
            return new TabBarTab(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabBarTab[] newArray(int i) {
            return new TabBarTab[i];
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
        if (!(obj instanceof TabBarTab)) {
            return false;
        }
        TabBarTab tabBarTab = (TabBarTab) obj;
        return Intrinsics.LJFF(this.facadeIdList, tabBarTab.facadeIdList) && Intrinsics.LJFF(this.name, tabBarTab.name) && Intrinsics.LJFF(this.icon, tabBarTab.icon) && Intrinsics.LJFF(this.daInfo, tabBarTab.daInfo);
    }

    public final int hashCode() {
        List<String> list = this.facadeIdList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabBarTab(facadeIdList=");
        sbLIZ.append(this.facadeIdList);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.facadeIdList);
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        parcel.writeString(this.daInfo);
    }

    public TabBarTab(List<String> list, String str, String str2, String str3) {
        this.facadeIdList = list;
        this.name = str;
        this.icon = str2;
        this.daInfo = str3;
    }
}

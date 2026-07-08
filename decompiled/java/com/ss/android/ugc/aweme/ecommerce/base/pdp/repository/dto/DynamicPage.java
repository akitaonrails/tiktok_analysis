package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class DynamicPage implements Parcelable {

    @C09CT("bottom_navigation")
    public final BottomNavigation bottomNav;

    @C09CT("bricks")
    public final List<BrickInfo> bricks;

    @C09CT("common_data")
    public final CommonData commonData;

    @C09CT("header_navigation")
    public final HeaderNavigation headerNav;

    @C09CT("page_name")
    public final Integer pageName;

    @C09CT("tabs")
    public final List<Tab> tabs;

    @C09CT("version")
    public final String version;
    public static final Parcelable.Creator<DynamicPage> CREATOR = new Parcelable.Creator<DynamicPage>() { // from class: X.0wQx
        @Override // android.os.Parcelable.Creator
        public final DynamicPage createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            ArrayList arrayList2;
            CommonData commonDataCreateFromParcel;
            HeaderNavigation headerNavigationCreateFromParcel;
            String string = parcel.readString();
            BottomNavigation bottomNavigationCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BrickInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Tab.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                commonDataCreateFromParcel = null;
            } else {
                commonDataCreateFromParcel = CommonData.CREATOR.createFromParcel(parcel);
            }
            CommonData commonData = commonDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                headerNavigationCreateFromParcel = null;
            } else {
                headerNavigationCreateFromParcel = HeaderNavigation.CREATOR.createFromParcel(parcel);
            }
            HeaderNavigation headerNavigation = headerNavigationCreateFromParcel;
            if (parcel.readInt() != 0) {
                bottomNavigationCreateFromParcel = BottomNavigation.CREATOR.createFromParcel(parcel);
            }
            return new DynamicPage(string, arrayList, numValueOf, arrayList2, commonData, headerNavigation, bottomNavigationCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicPage[] newArray(int i) {
            return new DynamicPage[i];
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
        if (!(obj instanceof DynamicPage)) {
            return false;
        }
        DynamicPage dynamicPage = (DynamicPage) obj;
        return Intrinsics.LJFF(this.version, dynamicPage.version) && Intrinsics.LJFF(this.bricks, dynamicPage.bricks) && Intrinsics.LJFF(this.pageName, dynamicPage.pageName) && Intrinsics.LJFF(this.tabs, dynamicPage.tabs) && Intrinsics.LJFF(this.commonData, dynamicPage.commonData) && Intrinsics.LJFF(this.headerNav, dynamicPage.headerNav) && Intrinsics.LJFF(this.bottomNav, dynamicPage.bottomNav);
    }

    public final int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BrickInfo> list = this.bricks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.pageName;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Tab> list2 = this.tabs;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CommonData commonData = this.commonData;
        int iHashCode5 = (iHashCode4 + (commonData == null ? 0 : commonData.hashCode())) * 31;
        HeaderNavigation headerNavigation = this.headerNav;
        int iHashCode6 = (iHashCode5 + (headerNavigation == null ? 0 : headerNavigation.hashCode())) * 31;
        BottomNavigation bottomNavigation = this.bottomNav;
        return iHashCode6 + (bottomNavigation != null ? bottomNavigation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicPage(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", bricks=");
        sbLIZ.append(this.bricks);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.pageName);
        sbLIZ.append(", tabs=");
        sbLIZ.append(this.tabs);
        sbLIZ.append(", commonData=");
        sbLIZ.append(this.commonData);
        sbLIZ.append(", headerNav=");
        sbLIZ.append(this.headerNav);
        sbLIZ.append(", bottomNav=");
        sbLIZ.append(this.bottomNav);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.version);
        List<BrickInfo> list = this.bricks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BrickInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.pageName;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<Tab> list2 = this.tabs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Tab> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        CommonData commonData = this.commonData;
        if (commonData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonData.writeToParcel(parcel, i);
        }
        HeaderNavigation headerNavigation = this.headerNav;
        if (headerNavigation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headerNavigation.writeToParcel(parcel, i);
        }
        BottomNavigation bottomNavigation = this.bottomNav;
        if (bottomNavigation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomNavigation.writeToParcel(parcel, i);
        }
    }

    public DynamicPage(String str, List<BrickInfo> list, Integer num, List<Tab> list2, CommonData commonData, HeaderNavigation headerNavigation, BottomNavigation bottomNavigation) {
        this.version = str;
        this.bricks = list;
        this.pageName = num;
        this.tabs = list2;
        this.commonData = commonData;
        this.headerNav = headerNavigation;
        this.bottomNav = bottomNavigation;
    }
}

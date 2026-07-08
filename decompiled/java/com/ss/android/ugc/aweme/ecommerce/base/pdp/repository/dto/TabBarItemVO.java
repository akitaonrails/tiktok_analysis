package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C033W;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TabBarItemVO implements Parcelable, InterfaceC718502rH {

    @C09CT("appear_facade_id")
    public final String appearFacadeId;

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("disappear_facade_id")
    public final String disappearFacadeId;

    @C09CT("tab_bar_tab_list")
    public final List<TabBarTab> tabBarTabList;
    public static final Parcelable.Creator<TabBarItemVO> CREATOR = new Parcelable.Creator<TabBarItemVO>() { // from class: X.0mh9
        @Override // android.os.Parcelable.Creator
        public final TabBarItemVO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TabBarTab.CREATOR.createFromParcel(parcel));
                }
            }
            return new TabBarItemVO(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabBarItemVO[] newArray(int i) {
            return new TabBarItemVO[i];
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
        if (!(obj instanceof TabBarItemVO)) {
            return false;
        }
        TabBarItemVO tabBarItemVO = (TabBarItemVO) obj;
        return Intrinsics.LJFF(this.tabBarTabList, tabBarItemVO.tabBarTabList) && Intrinsics.LJFF(this.daInfo, tabBarItemVO.daInfo) && Intrinsics.LJFF(this.btmCode, tabBarItemVO.btmCode) && Intrinsics.LJFF(this.appearFacadeId, tabBarItemVO.appearFacadeId) && Intrinsics.LJFF(this.disappearFacadeId, tabBarItemVO.disappearFacadeId);
    }

    public final int hashCode() {
        List<TabBarTab> list = this.tabBarTabList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.daInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.btmCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appearFacadeId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disappearFacadeId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabBarItemVO(tabBarTabList=");
        sbLIZ.append(this.tabBarTabList);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", btmCode=");
        sbLIZ.append(this.btmCode);
        sbLIZ.append(", appearFacadeId=");
        sbLIZ.append(this.appearFacadeId);
        sbLIZ.append(", disappearFacadeId=");
        sbLIZ.append(this.disappearFacadeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<TabBarTab> list = this.tabBarTabList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TabBarTab> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
        parcel.writeString(this.btmCode);
        parcel.writeString(this.appearFacadeId);
        parcel.writeString(this.disappearFacadeId);
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        return C13BV.INSTANCE;
    }

    public TabBarItemVO(List<TabBarTab> list, String str, String str2, String str3, String str4) {
        this.tabBarTabList = list;
        this.daInfo = str;
        this.btmCode = str2;
        this.appearFacadeId = str3;
        this.disappearFacadeId = str4;
    }
}

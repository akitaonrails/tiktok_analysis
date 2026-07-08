package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1753290vj5;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Tab implements Parcelable {

    @C09CT("node_id")
    public final String nodeId;

    @C09CT("tab_name")
    public final Integer tabName;

    @C09CT("tab_name_en")
    public final String tabNameEn;

    @C09CT("tab_title")
    public final String tabTitle;

    @C09CT("to_brick")
    public final Integer toBrick;
    public static final C1753290vj5 Companion = new Object() { // from class: X.0vj5
    };
    public static final Parcelable.Creator<Tab> CREATOR = new Parcelable.Creator<Tab>() { // from class: X.0vis
        @Override // android.os.Parcelable.Creator
        public final Tab createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Tab(numValueOf, string, numValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Tab[] newArray(int i) {
            return new Tab[i];
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
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Intrinsics.LJFF(this.tabName, tab.tabName) && Intrinsics.LJFF(this.tabTitle, tab.tabTitle) && Intrinsics.LJFF(this.toBrick, tab.toBrick) && Intrinsics.LJFF(this.nodeId, tab.nodeId) && Intrinsics.LJFF(this.tabNameEn, tab.tabNameEn);
    }

    public final int hashCode() {
        Integer num = this.tabName;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tabTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.toBrick;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.nodeId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tabNameEn;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tab(tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", tabTitle=");
        sbLIZ.append(this.tabTitle);
        sbLIZ.append(", toBrick=");
        sbLIZ.append(this.toBrick);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(this.nodeId);
        sbLIZ.append(", tabNameEn=");
        sbLIZ.append(this.tabNameEn);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.tabName;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.tabTitle);
        Integer num2 = this.toBrick;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.nodeId);
        parcel.writeString(this.tabNameEn);
    }

    public Tab(Integer num, String str, Integer num2, String str2, String str3) {
        this.tabName = num;
        this.tabTitle = str;
        this.toBrick = num2;
        this.nodeId = str2;
        this.tabNameEn = str3;
    }
}

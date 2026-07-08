package com.bytedance.effectcreatormobile.infrastructure.define.model.router.routerdata;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.infrastructure.define.model.router.routerdata.AMEPanelCommonRouterData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AMEPanelCommonRouterData extends BaseAMERouterData {
    public final String actionMode;
    public String category;
    public final String enterFrom;
    public final String panelEnterFrom;
    public final String resId;
    public static final Parcelable.Creator<AMEPanelCommonRouterData> CREATOR = new Parcelable.Creator<AMEPanelCommonRouterData>() { // from class: X.0vL0
        @Override // android.os.Parcelable.Creator
        public final AMEPanelCommonRouterData createFromParcel(Parcel parcel) {
            return new AMEPanelCommonRouterData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AMEPanelCommonRouterData[] newArray(int i) {
            return new AMEPanelCommonRouterData[i];
        }
    };
    public static final int $stable = 8;

    public final AMEPanelCommonRouterData copy(String str, String str2, String str3, String str4, String str5) {
        return new AMEPanelCommonRouterData(str, str2, str3, str4, str5);
    }

    @Override // com.bytedance.effectcreatormobile.infrastructure.define.model.router.routerdata.BaseAMERouterData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMEPanelCommonRouterData)) {
            return false;
        }
        AMEPanelCommonRouterData aMEPanelCommonRouterData = (AMEPanelCommonRouterData) obj;
        return Intrinsics.LJFF(this.resId, aMEPanelCommonRouterData.resId) && Intrinsics.LJFF(this.category, aMEPanelCommonRouterData.category) && Intrinsics.LJFF(this.actionMode, aMEPanelCommonRouterData.actionMode) && Intrinsics.LJFF(this.enterFrom, aMEPanelCommonRouterData.enterFrom) && Intrinsics.LJFF(this.panelEnterFrom, aMEPanelCommonRouterData.panelEnterFrom);
    }

    public int hashCode() {
        return (((((((this.resId.hashCode() * 31) + this.category.hashCode()) * 31) + this.actionMode.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.panelEnterFrom.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEPanelCommonRouterData(resId=");
        sbLIZ.append(this.resId);
        sbLIZ.append(", category=");
        sbLIZ.append(this.category);
        sbLIZ.append(", actionMode=");
        sbLIZ.append(this.actionMode);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", panelEnterFrom=");
        sbLIZ.append(this.panelEnterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.effectcreatormobile.infrastructure.define.model.router.routerdata.BaseAMERouterData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resId);
        parcel.writeString(this.category);
        parcel.writeString(this.actionMode);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.panelEnterFrom);
    }

    public final String getActionMode() {
        return this.actionMode;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getPanelEnterFrom() {
        return this.panelEnterFrom;
    }

    public final String getResId() {
        return this.resId;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public AMEPanelCommonRouterData(String str, String str2, String str3, String str4, String str5) {
        this.resId = str;
        this.category = str2;
        this.actionMode = str3;
        this.enterFrom = str4;
        this.panelEnterFrom = str5;
    }
}

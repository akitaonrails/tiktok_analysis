package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.AppendixArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticPanelModule implements Parcelable {

    @C09CT("appendix_area")
    public AppendixArea appendixArea;

    @C09CT("da_info")
    public Map<String, String> daInfo;

    @C09CT("logistic_area")
    public LogisticArea logisticArea;

    @C09CT("selection_bars")
    public List<SelectionBar> selectionBar;

    @C09CT("show_selection_bar")
    public Boolean showSelectionBar;
    public static final Parcelable.Creator<LogisticPanelModule> CREATOR = new Parcelable.Creator<LogisticPanelModule>() { // from class: X.02ks
        @Override // android.os.Parcelable.Creator
        public final LogisticPanelModule createFromParcel(Parcel parcel) {
            LogisticArea logisticAreaCreateFromParcel;
            AppendixArea appendixAreaCreateFromParcel;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                logisticAreaCreateFromParcel = null;
            } else {
                logisticAreaCreateFromParcel = LogisticArea.CREATOR.createFromParcel(parcel);
            }
            LogisticArea logisticArea = logisticAreaCreateFromParcel;
            if (parcel.readInt() == 0) {
                appendixAreaCreateFromParcel = null;
            } else {
                appendixAreaCreateFromParcel = AppendixArea.CREATOR.createFromParcel(parcel);
            }
            AppendixArea appendixArea = appendixAreaCreateFromParcel;
            boolean z = false;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(SelectionBar.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new LogisticPanelModule(logisticArea, appendixArea, linkedHashMap, arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticPanelModule[] newArray(int i) {
            return new LogisticPanelModule[i];
        }
    };
    public static final int $stable = 8;

    public LogisticPanelModule() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticPanelModule)) {
            return false;
        }
        LogisticPanelModule logisticPanelModule = (LogisticPanelModule) obj;
        return Intrinsics.LJFF(this.logisticArea, logisticPanelModule.logisticArea) && Intrinsics.LJFF(this.appendixArea, logisticPanelModule.appendixArea) && Intrinsics.LJFF(this.daInfo, logisticPanelModule.daInfo) && Intrinsics.LJFF(this.selectionBar, logisticPanelModule.selectionBar) && Intrinsics.LJFF(this.showSelectionBar, logisticPanelModule.showSelectionBar);
    }

    public final int hashCode() {
        LogisticArea logisticArea = this.logisticArea;
        int iHashCode = (logisticArea == null ? 0 : logisticArea.hashCode()) * 31;
        AppendixArea appendixArea = this.appendixArea;
        int iHashCode2 = (iHashCode + (appendixArea == null ? 0 : appendixArea.hashCode())) * 31;
        Map<String, String> map = this.daInfo;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<SelectionBar> list = this.selectionBar;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showSelectionBar;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticPanelModule(logisticArea=");
        sbLIZ.append(this.logisticArea);
        sbLIZ.append(", appendixArea=");
        sbLIZ.append(this.appendixArea);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", selectionBar=");
        sbLIZ.append(this.selectionBar);
        sbLIZ.append(", showSelectionBar=");
        sbLIZ.append(this.showSelectionBar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticArea logisticArea = this.logisticArea;
        if (logisticArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticArea.writeToParcel(parcel, i);
        }
        AppendixArea appendixArea = this.appendixArea;
        if (appendixArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appendixArea.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.daInfo;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        List<SelectionBar> list = this.selectionBar;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SelectionBar> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.showSelectionBar;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public LogisticPanelModule(LogisticArea logisticArea, AppendixArea appendixArea, Map<String, String> map, List<SelectionBar> list, Boolean bool) {
        this.logisticArea = logisticArea;
        this.appendixArea = appendixArea;
        this.daInfo = map;
        this.selectionBar = list;
        this.showSelectionBar = bool;
    }
}

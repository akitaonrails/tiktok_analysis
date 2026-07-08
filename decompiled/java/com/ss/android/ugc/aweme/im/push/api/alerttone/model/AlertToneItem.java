package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AlertToneItem implements Parcelable {
    public static final Parcelable.Creator<AlertToneItem> CREATOR = new Parcelable.Creator<AlertToneItem>() { // from class: X.0Yxz
        @Override // android.os.Parcelable.Creator
        public final AlertToneItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AlertToneValueItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new AlertToneItem(string, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlertToneItem[] newArray(int i) {
            return new AlertToneItem[i];
        }
    };

    @C09CT("alert_scene")
    public final String alertToneScene;

    @C09CT("alert_scene_title")
    public final String alertToneSceneTitle;

    @C09CT("alert_value_items")
    public final List<AlertToneValueItem> alertToneValueItems;

    @C09CT("selected_value")
    public final String selectedValue;

    public AlertToneItem() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertToneItem)) {
            return false;
        }
        AlertToneItem alertToneItem = (AlertToneItem) obj;
        return Intrinsics.LJFF(this.alertToneScene, alertToneItem.alertToneScene) && Intrinsics.LJFF(this.alertToneSceneTitle, alertToneItem.alertToneSceneTitle) && Intrinsics.LJFF(this.alertToneValueItems, alertToneItem.alertToneValueItems) && Intrinsics.LJFF(this.selectedValue, alertToneItem.selectedValue);
    }

    public final int hashCode() {
        String str = this.alertToneScene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alertToneSceneTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AlertToneValueItem> list = this.alertToneValueItems;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.selectedValue;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlertToneItem(alertToneScene=");
        sbLIZ.append(this.alertToneScene);
        sbLIZ.append(", alertToneSceneTitle=");
        sbLIZ.append(this.alertToneSceneTitle);
        sbLIZ.append(", alertToneValueItems=");
        sbLIZ.append(this.alertToneValueItems);
        sbLIZ.append(", selectedValue=");
        sbLIZ.append(this.selectedValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.alertToneScene);
        parcel.writeString(this.alertToneSceneTitle);
        List<AlertToneValueItem> list = this.alertToneValueItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AlertToneValueItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.selectedValue);
    }

    public AlertToneItem(String str, String str2, List<AlertToneValueItem> list, String str3) {
        this.alertToneScene = str;
        this.alertToneSceneTitle = str2;
        this.alertToneValueItems = list;
        this.selectedValue = str3;
    }

    public static AlertToneItem LIZ(AlertToneItem alertToneItem, String str, String str2, int i) {
        String str3;
        List<AlertToneValueItem> list = null;
        if ((i & 1) != 0) {
            str3 = alertToneItem.alertToneScene;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str = alertToneItem.alertToneSceneTitle;
        }
        if ((i & 4) != 0) {
            list = alertToneItem.alertToneValueItems;
        }
        if ((i & 8) != 0) {
            str2 = alertToneItem.selectedValue;
        }
        alertToneItem.getClass();
        return new AlertToneItem(str3, str, list, str2);
    }
}

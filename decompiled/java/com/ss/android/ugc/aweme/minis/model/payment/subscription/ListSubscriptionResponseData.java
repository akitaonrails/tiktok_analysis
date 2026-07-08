package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.ListSubscriptionResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ListSubscriptionResponseData implements Parcelable {

    @C09CT("active_list")
    public final Map<String, MinisSubscriptionInfo> activeList;

    @C09CT("inactive_list")
    public final Map<String, MinisSubscriptionInfo> inactiveList;
    public static final Parcelable.Creator<ListSubscriptionResponseData> CREATOR = new Parcelable.Creator<ListSubscriptionResponseData>() { // from class: X.0iB4
        @Override // android.os.Parcelable.Creator
        public final ListSubscriptionResponseData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), MinisSubscriptionInfo.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap2.put(parcel.readString(), MinisSubscriptionInfo.CREATOR.createFromParcel(parcel));
            }
            return new ListSubscriptionResponseData(linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final ListSubscriptionResponseData[] newArray(int i) {
            return new ListSubscriptionResponseData[i];
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
        if (!(obj instanceof ListSubscriptionResponseData)) {
            return false;
        }
        ListSubscriptionResponseData listSubscriptionResponseData = (ListSubscriptionResponseData) obj;
        return Intrinsics.LJFF(this.activeList, listSubscriptionResponseData.activeList) && Intrinsics.LJFF(this.inactiveList, listSubscriptionResponseData.inactiveList);
    }

    public final int hashCode() {
        return (this.activeList.hashCode() * 31) + this.inactiveList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListSubscriptionResponseData(activeList=");
        sbLIZ.append(this.activeList);
        sbLIZ.append(", inactiveList=");
        sbLIZ.append(this.inactiveList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, MinisSubscriptionInfo> map = this.activeList;
        parcel.writeInt(map.size());
        for (Map.Entry<String, MinisSubscriptionInfo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
        Map<String, MinisSubscriptionInfo> map2 = this.inactiveList;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, MinisSubscriptionInfo> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            entry2.getValue().writeToParcel(parcel, i);
        }
    }

    public ListSubscriptionResponseData() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public ListSubscriptionResponseData(Map<String, MinisSubscriptionInfo> map, Map<String, MinisSubscriptionInfo> map2) {
        this.activeList = map;
        this.inactiveList = map2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SubscribePeriodInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscribePeriodInfo implements Parcelable {

    @C09CT("default_selected_period_text")
    public final String defaultSelectedPeriodText;

    @C09CT("supported_period_info")
    public final List<SnsPeriodInfo> periodInfoList;
    public static final Parcelable.Creator<SubscribePeriodInfo> CREATOR = new Parcelable.Creator<SubscribePeriodInfo>() { // from class: X.040d
        @Override // android.os.Parcelable.Creator
        public final SubscribePeriodInfo createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SnsPeriodInfo.CREATOR.createFromParcel(parcel));
            }
            return new SubscribePeriodInfo(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SubscribePeriodInfo[] newArray(int i) {
            return new SubscribePeriodInfo[i];
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
        if (!(obj instanceof SubscribePeriodInfo)) {
            return false;
        }
        SubscribePeriodInfo subscribePeriodInfo = (SubscribePeriodInfo) obj;
        return Intrinsics.LJFF(this.periodInfoList, subscribePeriodInfo.periodInfoList) && Intrinsics.LJFF(this.defaultSelectedPeriodText, subscribePeriodInfo.defaultSelectedPeriodText);
    }

    public final int hashCode() {
        int iHashCode = this.periodInfoList.hashCode() * 31;
        String str = this.defaultSelectedPeriodText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribePeriodInfo(periodInfoList=");
        sbLIZ.append(this.periodInfoList);
        sbLIZ.append(", defaultSelectedPeriodText=");
        sbLIZ.append(this.defaultSelectedPeriodText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SnsPeriodInfo> list = this.periodInfoList;
        parcel.writeInt(list.size());
        Iterator<SnsPeriodInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultSelectedPeriodText);
    }

    public SubscribePeriodInfo(List<SnsPeriodInfo> list, String str) {
        this.periodInfoList = list;
        this.defaultSelectedPeriodText = str;
    }
}

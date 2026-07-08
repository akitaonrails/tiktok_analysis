package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIMarketingInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIMarketingTool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIMarketingInfo implements Parcelable {
    public static final Parcelable.Creator<CBIMarketingInfo> CREATOR = new Parcelable.Creator<CBIMarketingInfo>() { // from class: X.0ulb
        @Override // android.os.Parcelable.Creator
        public final CBIMarketingInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CBIMarketingTool.CREATOR.createFromParcel(parcel));
                }
            }
            return new CBIMarketingInfo(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CBIMarketingInfo[] newArray(int i) {
            return new CBIMarketingInfo[i];
        }
    };

    @C09CT("marketing_tools")
    public final List<CBIMarketingTool> marketingTools;

    public CBIMarketingInfo() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CBIMarketingInfo) && Intrinsics.LJFF(this.marketingTools, ((CBIMarketingInfo) obj).marketingTools);
    }

    public final int hashCode() {
        List<CBIMarketingTool> list = this.marketingTools;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIMarketingInfo(marketingTools=");
        sbLIZ.append(this.marketingTools);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CBIMarketingTool> list = this.marketingTools;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CBIMarketingTool> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public CBIMarketingInfo(List<CBIMarketingTool> list) {
        this.marketingTools = list;
    }
}

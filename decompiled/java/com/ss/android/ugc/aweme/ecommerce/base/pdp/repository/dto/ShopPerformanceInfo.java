package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PerformanceMetric;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformanceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopPerformanceInfo implements Parcelable {

    @C09CT("detail_page_url")
    public String detailPageUrl;

    @C09CT("performance_metrics")
    public List<PerformanceMetric> performanceMetrics;
    public static final Parcelable.Creator<ShopPerformanceInfo> CREATOR = new Parcelable.Creator<ShopPerformanceInfo>() { // from class: X.02Xh
        @Override // android.os.Parcelable.Creator
        public final ShopPerformanceInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PerformanceMetric.CREATOR.createFromParcel(parcel));
                }
            }
            return new ShopPerformanceInfo(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShopPerformanceInfo[] newArray(int i) {
            return new ShopPerformanceInfo[i];
        }
    };
    public static final int $stable = 8;

    public ShopPerformanceInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopPerformanceInfo)) {
            return false;
        }
        ShopPerformanceInfo shopPerformanceInfo = (ShopPerformanceInfo) obj;
        return Intrinsics.LJFF(this.detailPageUrl, shopPerformanceInfo.detailPageUrl) && Intrinsics.LJFF(this.performanceMetrics, shopPerformanceInfo.performanceMetrics);
    }

    public final int hashCode() {
        String str = this.detailPageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PerformanceMetric> list = this.performanceMetrics;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopPerformanceInfo(detailPageUrl=");
        sbLIZ.append(this.detailPageUrl);
        sbLIZ.append(", performanceMetrics=");
        sbLIZ.append(this.performanceMetrics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.detailPageUrl);
        List<PerformanceMetric> list = this.performanceMetrics;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<PerformanceMetric> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ShopPerformanceInfo(String str, List<PerformanceMetric> list) {
        this.detailPageUrl = str;
        this.performanceMetrics = list;
    }
}

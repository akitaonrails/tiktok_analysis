package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicSellingPointsBase implements Parcelable {

    @C09CT("dynamic_selling_points")
    public List<DynamicSellingPoint> dynamicSellingPoints;

    @C09CT("start_to_show_time")
    public Integer startToShowTime;

    @C09CT("stay_time")
    public Integer stayTime;
    public static final Parcelable.Creator<DynamicSellingPointsBase> CREATOR = new Parcelable.Creator<DynamicSellingPointsBase>() { // from class: X.02mc
        @Override // android.os.Parcelable.Creator
        public final DynamicSellingPointsBase createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DynamicSellingPoint.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new DynamicSellingPointsBase(arrayList, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicSellingPointsBase[] newArray(int i) {
            return new DynamicSellingPointsBase[i];
        }
    };
    public static final int $stable = 8;

    public DynamicSellingPointsBase() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSellingPointsBase)) {
            return false;
        }
        DynamicSellingPointsBase dynamicSellingPointsBase = (DynamicSellingPointsBase) obj;
        return Intrinsics.LJFF(this.dynamicSellingPoints, dynamicSellingPointsBase.dynamicSellingPoints) && Intrinsics.LJFF(this.startToShowTime, dynamicSellingPointsBase.startToShowTime) && Intrinsics.LJFF(this.stayTime, dynamicSellingPointsBase.stayTime);
    }

    public final int hashCode() {
        List<DynamicSellingPoint> list = this.dynamicSellingPoints;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.startToShowTime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stayTime;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicSellingPointsBase(dynamicSellingPoints=");
        sbLIZ.append(this.dynamicSellingPoints);
        sbLIZ.append(", startToShowTime=");
        sbLIZ.append(this.startToShowTime);
        sbLIZ.append(", stayTime=");
        sbLIZ.append(this.stayTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<DynamicSellingPoint> list = this.dynamicSellingPoints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DynamicSellingPoint> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.startToShowTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.stayTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public DynamicSellingPointsBase(List<DynamicSellingPoint> list, Integer num, Integer num2) {
        this.dynamicSellingPoints = list;
        this.startToShowTime = num;
        this.stayTime = num2;
    }
}

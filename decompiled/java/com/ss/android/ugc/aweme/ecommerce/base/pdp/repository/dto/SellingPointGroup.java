package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SellingPointGroup implements Parcelable {

    @C09CT("selling_point_style")
    public final Integer sellingPointStyle;

    @C09CT("selling_points")
    public final List<PdpSellingPoint> sellingPoints;

    @C09CT("start_to_show_time")
    public final Integer startToShowTime;

    @C09CT("stay_time")
    public final Integer stayTime;
    public static final Parcelable.Creator<SellingPointGroup> CREATOR = new Parcelable.Creator<SellingPointGroup>() { // from class: X.02yi
        @Override // android.os.Parcelable.Creator
        public final SellingPointGroup createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            Integer numValueOf2;
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PdpSellingPoint.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new SellingPointGroup(numValueOf, arrayList, numValueOf2, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final SellingPointGroup[] newArray(int i) {
            return new SellingPointGroup[i];
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
        if (!(obj instanceof SellingPointGroup)) {
            return false;
        }
        SellingPointGroup sellingPointGroup = (SellingPointGroup) obj;
        return Intrinsics.LJFF(this.sellingPointStyle, sellingPointGroup.sellingPointStyle) && Intrinsics.LJFF(this.sellingPoints, sellingPointGroup.sellingPoints) && Intrinsics.LJFF(this.startToShowTime, sellingPointGroup.startToShowTime) && Intrinsics.LJFF(this.stayTime, sellingPointGroup.stayTime);
    }

    public final int hashCode() {
        Integer num = this.sellingPointStyle;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PdpSellingPoint> list = this.sellingPoints;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.startToShowTime;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.stayTime;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SellingPointGroup(sellingPointStyle=");
        sbLIZ.append(this.sellingPointStyle);
        sbLIZ.append(", sellingPoints=");
        sbLIZ.append(this.sellingPoints);
        sbLIZ.append(", startToShowTime=");
        sbLIZ.append(this.startToShowTime);
        sbLIZ.append(", stayTime=");
        sbLIZ.append(this.stayTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.sellingPointStyle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<PdpSellingPoint> list = this.sellingPoints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PdpSellingPoint> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.startToShowTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.stayTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public SellingPointGroup(Integer num, List<PdpSellingPoint> list, Integer num2, Integer num3) {
        this.sellingPointStyle = num;
        this.sellingPoints = list;
        this.startToShowTime = num2;
        this.stayTime = num3;
    }
}

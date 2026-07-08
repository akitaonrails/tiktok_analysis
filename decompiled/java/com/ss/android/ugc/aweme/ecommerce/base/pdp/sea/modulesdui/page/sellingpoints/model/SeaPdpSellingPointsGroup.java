package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpSellingPointsGroup implements Parcelable {

    @C09CT("anim_duration")
    public Long animDuration;

    @C09CT("selling_points")
    public List<SeaPdpSellingPointsItem> sellingPoints;

    @C09CT("show_num")
    public Integer showNum;

    @C09CT("stay_time")
    public Long stayTime;

    @C09CT("view_height")
    public Integer viewHeight;
    public static final Parcelable.Creator<SeaPdpSellingPointsGroup> CREATOR = new Parcelable.Creator<SeaPdpSellingPointsGroup>() { // from class: X.02oL
        @Override // android.os.Parcelable.Creator
        public final SeaPdpSellingPointsGroup createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            Long lValueOf2;
            ArrayList arrayList;
            SeaPdpSellingPointsItem seaPdpSellingPointsItemCreateFromParcel;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    if (parcel.readInt() == 0) {
                        seaPdpSellingPointsItemCreateFromParcel = null;
                    } else {
                        seaPdpSellingPointsItemCreateFromParcel = SeaPdpSellingPointsItem.CREATOR.createFromParcel(parcel);
                    }
                    arrayList.add(seaPdpSellingPointsItemCreateFromParcel);
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new SeaPdpSellingPointsGroup(numValueOf, lValueOf, lValueOf2, arrayList, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpSellingPointsGroup[] newArray(int i) {
            return new SeaPdpSellingPointsGroup[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpSellingPointsGroup() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpSellingPointsGroup)) {
            return false;
        }
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = (SeaPdpSellingPointsGroup) obj;
        return Intrinsics.LJFF(this.showNum, seaPdpSellingPointsGroup.showNum) && Intrinsics.LJFF(this.stayTime, seaPdpSellingPointsGroup.stayTime) && Intrinsics.LJFF(this.animDuration, seaPdpSellingPointsGroup.animDuration) && Intrinsics.LJFF(this.sellingPoints, seaPdpSellingPointsGroup.sellingPoints) && Intrinsics.LJFF(this.viewHeight, seaPdpSellingPointsGroup.viewHeight);
    }

    public final int hashCode() {
        Integer num = this.showNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.stayTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.animDuration;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<SeaPdpSellingPointsItem> list = this.sellingPoints;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.viewHeight;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSellingPointsGroup(showNum=");
        sbLIZ.append(this.showNum);
        sbLIZ.append(", stayTime=");
        sbLIZ.append(this.stayTime);
        sbLIZ.append(", animDuration=");
        sbLIZ.append(this.animDuration);
        sbLIZ.append(", sellingPoints=");
        sbLIZ.append(this.sellingPoints);
        sbLIZ.append(", viewHeight=");
        sbLIZ.append(this.viewHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.showNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.stayTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.animDuration;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        List<SeaPdpSellingPointsItem> list = this.sellingPoints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SeaPdpSellingPointsItem seaPdpSellingPointsItem : list) {
                if (seaPdpSellingPointsItem == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    seaPdpSellingPointsItem.writeToParcel(parcel, i);
                }
            }
        }
        Integer num2 = this.viewHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public SeaPdpSellingPointsGroup(Integer num, Long l, Long l2, List<SeaPdpSellingPointsItem> list, Integer num2) {
        this.showNum = num;
        this.stayTime = l;
        this.animDuration = l2;
        this.sellingPoints = list;
        this.viewHeight = num2;
    }
}

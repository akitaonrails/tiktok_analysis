package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardActivityInfo implements Parcelable {

    @C09CT("activity_id")
    public final Long activityId;

    @C09CT("activity_num")
    public final Integer activityNum;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int activityStatus;

    @C09CT("begin_time")
    public final Long beginTime;

    @C09CT("end_time")
    public final Long endTime;
    public static final Parcelable.Creator<BillboardActivityInfo> CREATOR = new Parcelable.Creator<BillboardActivityInfo>() { // from class: X.0v8N
        @Override // android.os.Parcelable.Creator
        public final BillboardActivityInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            Long lValueOf2;
            int i = parcel.readInt();
            Long lValueOf3 = null;
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
            if (parcel.readInt() != 0) {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            return new BillboardActivityInfo(i, numValueOf, lValueOf, lValueOf2, lValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardActivityInfo[] newArray(int i) {
            return new BillboardActivityInfo[i];
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
        if (!(obj instanceof BillboardActivityInfo)) {
            return false;
        }
        BillboardActivityInfo billboardActivityInfo = (BillboardActivityInfo) obj;
        return this.activityStatus == billboardActivityInfo.activityStatus && Intrinsics.LJFF(this.activityNum, billboardActivityInfo.activityNum) && Intrinsics.LJFF(this.activityId, billboardActivityInfo.activityId) && Intrinsics.LJFF(this.beginTime, billboardActivityInfo.beginTime) && Intrinsics.LJFF(this.endTime, billboardActivityInfo.endTime);
    }

    public final int hashCode() {
        int i = this.activityStatus * 31;
        Integer num = this.activityNum;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.activityId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.beginTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endTime;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardActivityInfo(activityStatus=");
        sbLIZ.append(this.activityStatus);
        sbLIZ.append(", activityNum=");
        sbLIZ.append(this.activityNum);
        sbLIZ.append(", activityId=");
        sbLIZ.append(this.activityId);
        sbLIZ.append(", beginTime=");
        sbLIZ.append(this.beginTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityStatus);
        Integer num = this.activityNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.activityId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.beginTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.endTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public BillboardActivityInfo(int i, Integer num, Long l, Long l2, Long l3) {
        this.activityStatus = i;
        this.activityNum = num;
        this.activityId = l;
        this.beginTime = l2;
        this.endTime = l3;
    }
}

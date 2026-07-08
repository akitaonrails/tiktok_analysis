package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardGiveawayInfo implements Parcelable {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int activityStatus;

    @C09CT("open_time")
    public final String openTime;

    @C09CT("start_time")
    public final String startTime;
    public static final Parcelable.Creator<BillboardGiveawayInfo> CREATOR = new Parcelable.Creator<BillboardGiveawayInfo>() { // from class: X.0v8O
        @Override // android.os.Parcelable.Creator
        public final BillboardGiveawayInfo createFromParcel(Parcel parcel) {
            return new BillboardGiveawayInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardGiveawayInfo[] newArray(int i) {
            return new BillboardGiveawayInfo[i];
        }
    };
    public static final int $stable = 8;

    public BillboardGiveawayInfo() {
        this(0, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillboardGiveawayInfo)) {
            return false;
        }
        BillboardGiveawayInfo billboardGiveawayInfo = (BillboardGiveawayInfo) obj;
        return this.activityStatus == billboardGiveawayInfo.activityStatus && Intrinsics.LJFF(this.activityId, billboardGiveawayInfo.activityId) && Intrinsics.LJFF(this.startTime, billboardGiveawayInfo.startTime) && Intrinsics.LJFF(this.openTime, billboardGiveawayInfo.openTime);
    }

    public final int hashCode() {
        int i = this.activityStatus * 31;
        String str = this.activityId;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openTime;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardGiveawayInfo(activityStatus=");
        sbLIZ.append(this.activityStatus);
        sbLIZ.append(", activityId=");
        sbLIZ.append(this.activityId);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", openTime=");
        sbLIZ.append(this.openTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityStatus);
        parcel.writeString(this.activityId);
        parcel.writeString(this.startTime);
        parcel.writeString(this.openTime);
    }

    public BillboardGiveawayInfo(int i, String str, String str2, String str3) {
        this.activityStatus = i;
        this.activityId = str;
        this.startTime = str2;
        this.openTime = str3;
    }
}

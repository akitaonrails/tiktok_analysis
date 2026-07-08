package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WaterFallRedDotRequest extends SocialFeedRedDotRequest {

    @C09CT("not_entering_friend_tab_number")
    public Integer notEnterFriendsTabNum;

    @C09CT("order_type")
    public Integer orderType;

    public WaterFallRedDotRequest() {
        this(null, null);
    }

    public final WaterFallRedDotRequest copy(Integer num, Integer num2) {
        return new WaterFallRedDotRequest(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaterFallRedDotRequest)) {
            return false;
        }
        WaterFallRedDotRequest waterFallRedDotRequest = (WaterFallRedDotRequest) obj;
        return Intrinsics.LJFF(this.notEnterFriendsTabNum, waterFallRedDotRequest.notEnterFriendsTabNum) && Intrinsics.LJFF(this.orderType, waterFallRedDotRequest.orderType);
    }

    public int hashCode() {
        Integer num = this.notEnterFriendsTabNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.orderType;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaterFallRedDotRequest(notEnterFriendsTabNum=");
        sbLIZ.append(this.notEnterFriendsTabNum);
        sbLIZ.append(", orderType=");
        sbLIZ.append(this.orderType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getNotEnterFriendsTabNum() {
        return this.notEnterFriendsTabNum;
    }

    public final Integer getOrderType() {
        return this.orderType;
    }

    public final void setNotEnterFriendsTabNum(Integer num) {
        this.notEnterFriendsTabNum = num;
    }

    public final void setOrderType(Integer num) {
        this.orderType = num;
    }

    public WaterFallRedDotRequest(Integer num, Integer num2) {
        this.notEnterFriendsTabNum = num;
        this.orderType = num2;
    }
}

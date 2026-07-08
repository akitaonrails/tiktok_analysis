package com.ss.android.ugc.aweme.ecommerce.ug.earncash;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LatamInviteRequestExtraData {

    @C09CT("receiver_user_id")
    public final String receiverUserId;

    @C09CT("receiver_user_type")
    public final Integer receiverUserType;

    @C09CT("task_instance_id")
    public final String taskInstanceId;

    public LatamInviteRequestExtraData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatamInviteRequestExtraData)) {
            return false;
        }
        LatamInviteRequestExtraData latamInviteRequestExtraData = (LatamInviteRequestExtraData) obj;
        return Intrinsics.LJFF(this.receiverUserType, latamInviteRequestExtraData.receiverUserType) && Intrinsics.LJFF(this.receiverUserId, latamInviteRequestExtraData.receiverUserId) && Intrinsics.LJFF(this.taskInstanceId, latamInviteRequestExtraData.taskInstanceId);
    }

    public final int hashCode() {
        Integer num = this.receiverUserType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.receiverUserId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskInstanceId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LatamInviteRequestExtraData(receiverUserType=");
        sbLIZ.append(this.receiverUserType);
        sbLIZ.append(", receiverUserId=");
        sbLIZ.append(this.receiverUserId);
        sbLIZ.append(", taskInstanceId=");
        sbLIZ.append(this.taskInstanceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LatamInviteRequestExtraData(Integer num, String str, String str2) {
        this.receiverUserType = num;
        this.receiverUserId = str;
        this.taskInstanceId = str2;
    }
}

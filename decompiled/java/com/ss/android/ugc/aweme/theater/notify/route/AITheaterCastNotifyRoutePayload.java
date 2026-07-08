package com.ss.android.ugc.aweme.theater.notify.route;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCastNotifyRoutePayload {

    @C09CT("is_cast_member")
    public final Boolean isCastMember;

    @C09CT("recall_way")
    public final String recallWay;

    @C09CT("server_task_id")
    public final String serverTaskId;

    @C09CT("success")
    public final Boolean success;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCastNotifyRoutePayload)) {
            return false;
        }
        AITheaterCastNotifyRoutePayload aITheaterCastNotifyRoutePayload = (AITheaterCastNotifyRoutePayload) obj;
        return Intrinsics.LJFF(this.success, aITheaterCastNotifyRoutePayload.success) && Intrinsics.LJFF(this.isCastMember, aITheaterCastNotifyRoutePayload.isCastMember) && Intrinsics.LJFF(this.serverTaskId, aITheaterCastNotifyRoutePayload.serverTaskId) && Intrinsics.LJFF(this.recallWay, aITheaterCastNotifyRoutePayload.recallWay);
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isCastMember;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.serverTaskId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recallWay;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCastNotifyRoutePayload(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", isCastMember=");
        sbLIZ.append(this.isCastMember);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", recallWay=");
        sbLIZ.append(this.recallWay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isCastMember() {
        return this.isCastMember;
    }

    public AITheaterCastNotifyRoutePayload(Boolean bool, Boolean bool2, String str, String str2) {
        this.success = bool;
        this.isCastMember = bool2;
        this.serverTaskId = str;
        this.recallWay = str2;
    }
}

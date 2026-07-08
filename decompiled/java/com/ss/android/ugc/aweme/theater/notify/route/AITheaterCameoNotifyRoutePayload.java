package com.ss.android.ugc.aweme.theater.notify.route;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCameoNotifyRoutePayload {

    @C09CT("cameo_id")
    public final String cameoId;

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
        if (!(obj instanceof AITheaterCameoNotifyRoutePayload)) {
            return false;
        }
        AITheaterCameoNotifyRoutePayload aITheaterCameoNotifyRoutePayload = (AITheaterCameoNotifyRoutePayload) obj;
        return Intrinsics.LJFF(this.success, aITheaterCameoNotifyRoutePayload.success) && Intrinsics.LJFF(this.cameoId, aITheaterCameoNotifyRoutePayload.cameoId) && Intrinsics.LJFF(this.serverTaskId, aITheaterCameoNotifyRoutePayload.serverTaskId) && Intrinsics.LJFF(this.recallWay, aITheaterCameoNotifyRoutePayload.recallWay);
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.cameoId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverTaskId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recallWay;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCameoNotifyRoutePayload(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", recallWay=");
        sbLIZ.append(this.recallWay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AITheaterCameoNotifyRoutePayload(Boolean bool, String str, String str2, String str3) {
        this.success = bool;
        this.cameoId = str;
        this.serverTaskId = str2;
        this.recallWay = str3;
    }
}

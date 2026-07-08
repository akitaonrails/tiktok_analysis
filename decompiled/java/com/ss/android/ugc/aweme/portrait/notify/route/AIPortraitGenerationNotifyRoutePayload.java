package com.ss.android.ugc.aweme.portrait.notify.route;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitGenerationNotifyRoutePayload {
    public static final int $stable = 0;

    @C09CT("enter_way")
    public final String enterWay;

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
        if (!(obj instanceof AIPortraitGenerationNotifyRoutePayload)) {
            return false;
        }
        AIPortraitGenerationNotifyRoutePayload aIPortraitGenerationNotifyRoutePayload = (AIPortraitGenerationNotifyRoutePayload) obj;
        return Intrinsics.LJFF(this.success, aIPortraitGenerationNotifyRoutePayload.success) && Intrinsics.LJFF(this.serverTaskId, aIPortraitGenerationNotifyRoutePayload.serverTaskId) && Intrinsics.LJFF(this.recallWay, aIPortraitGenerationNotifyRoutePayload.recallWay) && Intrinsics.LJFF(this.enterWay, aIPortraitGenerationNotifyRoutePayload.enterWay);
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.serverTaskId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recallWay;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterWay;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitGenerationNotifyRoutePayload(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", recallWay=");
        sbLIZ.append(this.recallWay);
        sbLIZ.append(", enterWay=");
        sbLIZ.append(this.enterWay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIPortraitGenerationNotifyRoutePayload(Boolean bool, String str, String str2, String str3) {
        this.success = bool;
        this.serverTaskId = str;
        this.recallWay = str2;
        this.enterWay = str3;
    }
}

package com.ss.android.ugc.aweme.theater.notify.route;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCastPostDeleteNotifyRoutePayload {

    @C09CT("draft_video_id")
    public final String draftVideoId;

    @C09CT("recall_way")
    public final String recallWay;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCastPostDeleteNotifyRoutePayload)) {
            return false;
        }
        AITheaterCastPostDeleteNotifyRoutePayload aITheaterCastPostDeleteNotifyRoutePayload = (AITheaterCastPostDeleteNotifyRoutePayload) obj;
        return Intrinsics.LJFF(this.draftVideoId, aITheaterCastPostDeleteNotifyRoutePayload.draftVideoId) && Intrinsics.LJFF(this.recallWay, aITheaterCastPostDeleteNotifyRoutePayload.recallWay);
    }

    public int hashCode() {
        String str = this.draftVideoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recallWay;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCastPostDeleteNotifyRoutePayload(draftVideoId=");
        sbLIZ.append(this.draftVideoId);
        sbLIZ.append(", recallWay=");
        sbLIZ.append(this.recallWay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AITheaterCastPostDeleteNotifyRoutePayload(String str, String str2) {
        this.draftVideoId = str;
        this.recallWay = str2;
    }
}

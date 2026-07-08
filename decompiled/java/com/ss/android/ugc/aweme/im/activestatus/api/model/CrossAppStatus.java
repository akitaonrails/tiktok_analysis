package com.ss.android.ugc.aweme.im.activestatus.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes14.dex */
public final class CrossAppStatus {

    @C09CT("active_time")
    public final long activeTime;

    @C09CT("app_id")
    public final int appId;

    @C09CT("inactive_time")
    public final long inactiveTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossAppStatus)) {
            return false;
        }
        CrossAppStatus crossAppStatus = (CrossAppStatus) obj;
        return this.appId == crossAppStatus.appId && this.activeTime == crossAppStatus.activeTime && this.inactiveTime == crossAppStatus.inactiveTime;
    }

    public final int hashCode() {
        return (((this.appId * 31) + C786410Ut5.Y2(this.activeTime)) * 31) + C786410Ut5.Y2(this.inactiveTime);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CrossAppStatus(appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", activeTime=");
        sbLIZ.append(this.activeTime);
        sbLIZ.append(", inactiveTime=");
        sbLIZ.append(this.inactiveTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CrossAppStatus(int i, long j, long j2) {
        this.appId = i;
        this.activeTime = j;
        this.inactiveTime = j2;
    }
}

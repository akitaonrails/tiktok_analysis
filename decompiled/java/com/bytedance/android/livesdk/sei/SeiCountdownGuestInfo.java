package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SeiCountdownGuestInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long countdownId;

    @C09CT("duration")
    public final long duration;

    @C09CT("stime")
    public final long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("tscore")
    public final long targetScore;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiCountdownGuestInfo)) {
            return false;
        }
        SeiCountdownGuestInfo seiCountdownGuestInfo = (SeiCountdownGuestInfo) obj;
        return this.countdownId == seiCountdownGuestInfo.countdownId && this.status == seiCountdownGuestInfo.status && this.startTime == seiCountdownGuestInfo.startTime && this.duration == seiCountdownGuestInfo.duration && this.targetScore == seiCountdownGuestInfo.targetScore;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiCountdownGuestInfo(countdownId=");
        sbLIZ.append(this.countdownId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", targetScore=");
        sbLIZ.append(this.targetScore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiCountdownGuestInfo(long j, int i, long j2, long j3, long j4) {
        this.countdownId = j;
        this.status = i;
        this.startTime = j2;
        this.duration = j3;
        this.targetScore = j4;
    }
}

package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.streak.api.pet.LogPb;

/* JADX INFO: loaded from: classes.dex */
public final class StreakPushContentResponse {

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("user_info")
    public final StreakPushUserInfo pushUserInfo;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public StreakPushContentResponse() {
        this(null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPushContentResponse(pushUserInfo=");
        sbLIZ.append(this.pushUserInfo);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakPushContentResponse(StreakPushUserInfo streakPushUserInfo, Integer num, String str, LogPb logPb) {
        this.pushUserInfo = streakPushUserInfo;
        this.statusCode = num;
        this.statusMsg = str;
        this.logPb = logPb;
    }
}

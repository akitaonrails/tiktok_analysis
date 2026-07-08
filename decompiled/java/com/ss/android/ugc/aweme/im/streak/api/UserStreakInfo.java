package com.ss.android.ugc.aweme.im.streak.api;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class UserStreakInfo {

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("uid")
    public final long uid;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStreakInfo(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserStreakInfo(long j, long j2) {
        this.uid = j;
        this.timestamp = j2;
    }
}

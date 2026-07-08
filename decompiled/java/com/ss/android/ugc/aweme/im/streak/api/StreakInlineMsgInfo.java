package com.ss.android.ugc.aweme.im.streak.api;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakInlineMsgInfo {

    @C09CT("expire_time")
    public final long expireTime;

    @C09CT("sort_order")
    public final long sortOrder;

    @C09CT("inline_msg_type")
    public final int type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakInlineMsgInfo)) {
            return false;
        }
        StreakInlineMsgInfo streakInlineMsgInfo = (StreakInlineMsgInfo) obj;
        return this.type == streakInlineMsgInfo.type && this.expireTime == streakInlineMsgInfo.expireTime && this.sortOrder == streakInlineMsgInfo.sortOrder;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakInlineMsgInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(", sortOrder=");
        sbLIZ.append(this.sortOrder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakInlineMsgInfo(int i, long j, long j2) {
        this.type = i;
        this.expireTime = j;
        this.sortOrder = j2;
    }
}

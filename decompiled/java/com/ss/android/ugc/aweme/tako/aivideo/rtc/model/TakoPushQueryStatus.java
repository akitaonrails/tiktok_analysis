package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoPushQueryStatus {

    @C09CT("err_code")
    public final int errCode;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public TakoPushQueryStatus() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoPushQueryStatus)) {
            return false;
        }
        TakoPushQueryStatus takoPushQueryStatus = (TakoPushQueryStatus) obj;
        return this.status == takoPushQueryStatus.status && this.errCode == takoPushQueryStatus.errCode;
    }

    public final int hashCode() {
        return (this.status * 31) + this.errCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPushQueryStatus(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", errCode=");
        sbLIZ.append(this.errCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoPushQueryStatus(int i, int i2) {
        this.status = i;
        this.errCode = i2;
    }
}

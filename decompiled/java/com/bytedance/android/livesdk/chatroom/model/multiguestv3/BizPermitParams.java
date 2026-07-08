package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizPermitParams {

    @C09CT("effective_seconds")
    public long effectiveSeconds;

    @C09CT("notice_confirmed")
    public boolean noticeConfirmed;

    @C09CT("permit_type")
    public int permitType;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizPermitParams(effectiveSeconds=");
        sbLIZ.append(this.effectiveSeconds);
        sbLIZ.append(", noticeConfirmed=");
        sbLIZ.append(this.noticeConfirmed);
        sbLIZ.append(", permitType=");
        sbLIZ.append(this.permitType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizPermitParams() {
        this(0L, false, 0);
    }

    public BizPermitParams(long j, boolean z, int i) {
        this.effectiveSeconds = j;
        this.noticeConfirmed = z;
        this.permitType = i;
    }
}

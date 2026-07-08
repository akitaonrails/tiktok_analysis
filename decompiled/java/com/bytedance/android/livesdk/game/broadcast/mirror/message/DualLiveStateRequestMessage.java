package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TE7;
import X.C0TER;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class DualLiveStateRequestMessage implements C0TER {

    @C09CT("resume_timestamp_millsec")
    public long resumeTimestampMillSec;

    public DualLiveStateRequestMessage() {
        this(0L);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return C0TE7.DUAL_LIVE_STATE_REQUEST.getMethod();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumeTimestampMillSec = ");
        sbLIZ.append(this.resumeTimestampMillSec);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DualLiveStateRequestMessage(long j) {
        this.resumeTimestampMillSec = j;
    }
}

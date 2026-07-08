package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TE7;
import X.C0TER;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class DualLiveStateMessage implements C0TER {

    @C09CT("duration_sec")
    public long durationSec;

    @C09CT("live_state")
    public int liveState;

    @C09CT("resume_timestamp_millsec")
    public long resumeTimestampMillSec;

    @C09CT("room_id")
    public String roomId;

    public DualLiveStateMessage() {
        this(-1, 0L, 0L, CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return C0TE7.DUAL_LIVE_STATE.getMethod();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveState = ");
        sbLIZ.append(this.liveState);
        sbLIZ.append(",durationSec = ");
        sbLIZ.append(this.durationSec);
        sbLIZ.append(",resumeTimestampMillSec = ");
        sbLIZ.append(this.resumeTimestampMillSec);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DualLiveStateMessage(int i, long j, long j2, String str) {
        this.liveState = i;
        this.durationSec = j;
        this.resumeTimestampMillSec = j2;
        this.roomId = str;
    }
}

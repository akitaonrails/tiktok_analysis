package com.ss.android.ugc.aweme.transcript;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class ServerTranscriptHints {

    @C09CT("end_index")
    public final long endIndex;

    @C09CT("end_time_ms")
    public final long endTimeMs;

    @C09CT("start_index")
    public final long startIndex;

    @C09CT("start_time_ms")
    public final long startTimeMs;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerTranscriptHints(startTimeMs=");
        sbLIZ.append(this.startTimeMs);
        sbLIZ.append(", endTimeMs=");
        sbLIZ.append(this.endTimeMs);
        sbLIZ.append(", startIndex=");
        sbLIZ.append(this.startIndex);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(this.endIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ServerTranscriptHints() {
        this(0L, 0L, 0L, 0L);
    }

    public ServerTranscriptHints(long j, long j2, long j3, long j4) {
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.startIndex = j3;
        this.endIndex = j4;
    }
}

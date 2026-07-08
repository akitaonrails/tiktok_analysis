package com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class AIGCArchWorkflowETData {

    @C09CT("duration")
    public final long duration;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowETData(duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCArchWorkflowETData() {
        this(0L);
    }

    public AIGCArchWorkflowETData(long j) {
        this.duration = j;
    }
}

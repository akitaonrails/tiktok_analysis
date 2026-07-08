package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowPollingRunningContext {

    @C09CT("server_status")
    public final int serverStatus;

    public AIGCWorkflowPollingRunningContext() {
        this(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIGCWorkflowPollingRunningContext) && this.serverStatus == ((AIGCWorkflowPollingRunningContext) obj).serverStatus;
    }

    public final int hashCode() {
        return this.serverStatus;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowPollingRunningContext(serverStatus=");
        sbLIZ.append(this.serverStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowPollingRunningContext(int i) {
        this.serverStatus = i;
    }
}

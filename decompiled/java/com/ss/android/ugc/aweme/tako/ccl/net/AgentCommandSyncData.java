package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AgentCommandSyncData {

    @C09CT("report_data")
    public final String reportData;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("scenario")
    public final int scenario;

    @C09CT("upstream_log_id")
    public final String upstreamLogId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentCommandSyncData)) {
            return false;
        }
        AgentCommandSyncData agentCommandSyncData = (AgentCommandSyncData) obj;
        return Intrinsics.LJFF(this.requestId, agentCommandSyncData.requestId) && Intrinsics.LJFF(this.reportData, agentCommandSyncData.reportData) && this.scenario == agentCommandSyncData.scenario && Intrinsics.LJFF(this.upstreamLogId, agentCommandSyncData.upstreamLogId);
    }

    public final int hashCode() {
        int iHashCode = ((((this.requestId.hashCode() * 31) + this.reportData.hashCode()) * 31) + this.scenario) * 31;
        String str = this.upstreamLogId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgentCommandSyncData(requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", reportData=");
        sbLIZ.append(this.reportData);
        sbLIZ.append(", scenario=");
        sbLIZ.append(this.scenario);
        sbLIZ.append(", upstreamLogId=");
        sbLIZ.append(this.upstreamLogId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AgentCommandSyncData(String str, String str2, int i, String str3) {
        this.requestId = str;
        this.reportData = str2;
        this.scenario = i;
        this.upstreamLogId = str3;
    }
}

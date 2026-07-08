package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ForwardSyncMetaInfo {

    @C09CT("forward_time")
    public final long forwardTIme;

    @C09CT("scenario")
    public final int scenario;

    @C09CT("upstream_log_id")
    public final String upstreamLogId;

    public ForwardSyncMetaInfo() {
        this(1, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardSyncMetaInfo)) {
            return false;
        }
        ForwardSyncMetaInfo forwardSyncMetaInfo = (ForwardSyncMetaInfo) obj;
        return this.scenario == forwardSyncMetaInfo.scenario && this.forwardTIme == forwardSyncMetaInfo.forwardTIme && Intrinsics.LJFF(this.upstreamLogId, forwardSyncMetaInfo.upstreamLogId);
    }

    public final int hashCode() {
        int iY2 = ((this.scenario * 31) + C786410Ut5.Y2(this.forwardTIme)) * 31;
        String str = this.upstreamLogId;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardSyncMetaInfo(scenario=");
        sbLIZ.append(this.scenario);
        sbLIZ.append(", forwardTIme=");
        sbLIZ.append(this.forwardTIme);
        sbLIZ.append(", upstreamLogId=");
        sbLIZ.append(this.upstreamLogId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ForwardSyncMetaInfo(int i, long j, String str) {
        this.scenario = i;
        this.forwardTIme = j;
        this.upstreamLogId = str;
    }
}

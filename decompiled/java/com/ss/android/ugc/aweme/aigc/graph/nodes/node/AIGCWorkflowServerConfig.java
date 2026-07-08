package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AIGCWorkflowServerConfig implements Serializable {

    @C09CT("enable_quota_cache_refresh")
    public final boolean enableQuotaCacheRefresh;

    public AIGCWorkflowServerConfig() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIGCWorkflowServerConfig) && this.enableQuotaCacheRefresh == ((AIGCWorkflowServerConfig) obj).enableQuotaCacheRefresh;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.enableQuotaCacheRefresh);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowServerConfig(enableQuotaCacheRefresh=");
        sbLIZ.append(this.enableQuotaCacheRefresh);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowServerConfig(boolean z) {
        this.enableQuotaCacheRefresh = z;
    }
}

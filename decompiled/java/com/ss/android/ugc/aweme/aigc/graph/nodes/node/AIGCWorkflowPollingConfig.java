package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C0LNQ;
import X.C2188811AlT;
import X.C543920LUw;
import X.C551920Lkk;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowPollingConfig implements Serializable {
    public static final C551920Lkk Companion = new Object() { // from class: X.0Lkk
    };

    @C09CT("enable_preload_output")
    public final boolean enablePreloadOutput;

    @C09CT("polling_interval_seconds")
    public final Integer pollingIntervalSeconds;

    @C09CT("timeout_in_seconds")
    public final Integer timeoutInSeconds;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowPollingConfig)) {
            return false;
        }
        AIGCWorkflowPollingConfig aIGCWorkflowPollingConfig = (AIGCWorkflowPollingConfig) obj;
        return Intrinsics.LJFF(this.timeoutInSeconds, aIGCWorkflowPollingConfig.timeoutInSeconds) && Intrinsics.LJFF(this.pollingIntervalSeconds, aIGCWorkflowPollingConfig.pollingIntervalSeconds) && this.enablePreloadOutput == aIGCWorkflowPollingConfig.enablePreloadOutput;
    }

    public int hashCode() {
        Integer num = this.timeoutInSeconds;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pollingIntervalSeconds;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.enablePreloadOutput);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowPollingConfig(timeoutInSeconds=");
        sbLIZ.append(this.timeoutInSeconds);
        sbLIZ.append(", pollingIntervalSeconds=");
        sbLIZ.append(this.pollingIntervalSeconds);
        sbLIZ.append(", enablePreloadOutput=");
        sbLIZ.append(this.enablePreloadOutput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowPollingConfig() {
        this(Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(C0LNQ.LIZ())), Integer.valueOf(C543920LUw.LIZ()), false);
    }

    public AIGCWorkflowPollingConfig(Integer num, Integer num2, boolean z) {
        this.timeoutInSeconds = num;
        this.pollingIntervalSeconds = num2;
        this.enablePreloadOutput = z;
    }
}

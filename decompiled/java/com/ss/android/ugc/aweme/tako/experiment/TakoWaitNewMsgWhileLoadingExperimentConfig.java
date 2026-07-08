package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class TakoWaitNewMsgWhileLoadingExperimentConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("timeout")
    public final long timeout;

    public TakoWaitNewMsgWhileLoadingExperimentConfig() {
        this(true, 3000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoWaitNewMsgWhileLoadingExperimentConfig)) {
            return false;
        }
        TakoWaitNewMsgWhileLoadingExperimentConfig takoWaitNewMsgWhileLoadingExperimentConfig = (TakoWaitNewMsgWhileLoadingExperimentConfig) obj;
        return this.enable == takoWaitNewMsgWhileLoadingExperimentConfig.enable && this.timeout == takoWaitNewMsgWhileLoadingExperimentConfig.timeout;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.timeout);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoWaitNewMsgWhileLoadingExperimentConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", timeout=");
        sbLIZ.append(this.timeout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoWaitNewMsgWhileLoadingExperimentConfig(boolean z, long j) {
        this.enable = z;
        this.timeout = j;
    }
}

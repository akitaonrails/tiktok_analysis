package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OutreachDecisionConfig {

    @C09CT("timing_action_list")
    public final List<TimingAction> timingActionConfig;

    public OutreachDecisionConfig() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachDecisionConfig(timingActionConfig=");
        sbLIZ.append(this.timingActionConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OutreachDecisionConfig(List<TimingAction> list) {
        this.timingActionConfig = list;
    }
}

package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class TakoAgentStateFeatureEventDetail {

    @C09CT("agentState")
    public final int agentState;

    public TakoAgentStateFeatureEventDetail() {
        this(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoAgentStateFeatureEventDetail) && this.agentState == ((TakoAgentStateFeatureEventDetail) obj).agentState;
    }

    public final int hashCode() {
        return this.agentState;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAgentStateFeatureEventDetail(agentState=");
        sbLIZ.append(this.agentState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAgentStateFeatureEventDetail(int i) {
        this.agentState = i;
    }
}

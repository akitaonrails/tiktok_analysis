package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes29.dex */
public final class TimingAction {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("outreach_type")
    public final String outreachType;

    @C09CT("timing")
    public final String timing;

    public TimingAction() {
        this(null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimingAction(outreachType=");
        sbLIZ.append(this.outreachType);
        sbLIZ.append(", timing=");
        sbLIZ.append(this.timing);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TimingAction(String str, String str2, String str3) {
        this.outreachType = str;
        this.timing = str2;
        this.actionType = str3;
    }
}

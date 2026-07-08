package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes17.dex */
public final class State {

    @C09CT("sessionStarted")
    public final boolean sessionStarted;

    @C09CT("usable")
    public final boolean usable;

    @C09CT("viewable")
    public final boolean viewable;

    public State() {
        this(false, false, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viewable ");
        sbLIZ.append(this.viewable);
        sbLIZ.append(", usable ");
        sbLIZ.append(this.usable);
        sbLIZ.append(", sessionStarted ");
        sbLIZ.append(this.sessionStarted);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public State(boolean z, boolean z2, boolean z3) {
        this.viewable = z;
        this.usable = z2;
        this.sessionStarted = z3;
    }
}

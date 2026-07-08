package com.ss.android.ugc.aweme.preloadv2;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class DfPreloadOptionV2 {

    @C09CT("bgDelay")
    public long bgDelay;

    @C09CT("bootDelay")
    public long bootDelay;

    @C09CT("nujDelay")
    public long nujDelay;

    @C09CT("retryCnt")
    public int retryCnt;

    public DfPreloadOptionV2() {
        this(0L, 0L, 0L, 1);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[nuj:");
        sbLIZ.append(this.nujDelay);
        sbLIZ.append(" boot:");
        sbLIZ.append(this.bootDelay);
        sbLIZ.append(" bg: ");
        sbLIZ.append(this.bgDelay);
        sbLIZ.append(" retryCnt: ");
        sbLIZ.append(this.retryCnt);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DfPreloadOptionV2(long j, long j2, long j3, int i) {
        this.nujDelay = j;
        this.bootDelay = j2;
        this.bgDelay = j3;
        this.retryCnt = i;
    }
}

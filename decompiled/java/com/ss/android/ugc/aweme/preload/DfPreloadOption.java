package com.ss.android.ugc.aweme.preload;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class DfPreloadOption {

    @C09CT("bgCount")
    public int bgCount;

    @C09CT("bgDelay")
    public long bgDelay;

    @C09CT("bootCount")
    public int bootCount;

    @C09CT("bootDelay")
    public long bootDelay;

    @C09CT("nujCount")
    public int nujCount;

    @C09CT("nujDelay")
    public long nujDelay;

    public DfPreloadOption() {
        this(2, -15000L, 5, -15000L, 5, -5000L);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[nuj:");
        sbLIZ.append(this.nujCount);
        sbLIZ.append(' ');
        sbLIZ.append(this.nujDelay);
        sbLIZ.append(" boot:");
        sbLIZ.append(this.bootCount);
        sbLIZ.append(' ');
        sbLIZ.append(this.bootDelay);
        sbLIZ.append(" bg:");
        sbLIZ.append(this.bgCount);
        sbLIZ.append(' ');
        sbLIZ.append(this.bgDelay);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DfPreloadOption(int i, long j, int i2, long j2, int i3, long j3) {
        this.nujCount = i;
        this.nujDelay = j;
        this.bootCount = i2;
        this.bootDelay = j2;
        this.bgCount = i3;
        this.bgDelay = j3;
    }
}

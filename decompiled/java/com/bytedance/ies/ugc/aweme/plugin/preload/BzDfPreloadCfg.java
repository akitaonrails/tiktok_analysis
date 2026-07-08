package com.bytedance.ies.ugc.aweme.plugin.preload;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class BzDfPreloadCfg {

    @C09CT("bgDelay")
    public long bgDelay;

    @C09CT("bootDelay")
    public long bootDelay;

    @C09CT("nujDelay")
    public long nujDelay;

    public BzDfPreloadCfg() {
        this(-1L, -1L, -1L);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[nujDelay:");
        sbLIZ.append(this.nujDelay);
        sbLIZ.append(" bootDelay:");
        sbLIZ.append(this.bootDelay);
        sbLIZ.append(" bgDelay:");
        sbLIZ.append(this.bgDelay);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BzDfPreloadCfg(long j, long j2, long j3) {
        this.nujDelay = j;
        this.bootDelay = j2;
        this.bgDelay = j3;
    }
}

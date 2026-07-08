package com.ss.android.ugc.aweme.autocut;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class PreloadNLEConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_concurrent_count")
    public final int maxConcurrentCount;

    public PreloadNLEConfig() {
        this(false, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadNLEConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", maxConcurrentCount=");
        sbLIZ.append(this.maxConcurrentCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadNLEConfig(boolean z, int i) {
        this.enable = z;
        this.maxConcurrentCount = i;
    }
}

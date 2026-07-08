package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class ECCommonPreloadConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("task_timeout_duration")
    public long timeout;

    public ECCommonPreloadConfig() {
        this(false, 30000L);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECCommonPreloadConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", timeout=");
        sbLIZ.append(this.timeout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECCommonPreloadConfig(boolean z, long j) {
        this.enable = z;
        this.timeout = j;
    }
}

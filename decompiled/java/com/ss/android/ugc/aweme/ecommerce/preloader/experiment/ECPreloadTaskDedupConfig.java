package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class ECPreloadTaskDedupConfig {

    @C09CT("enable_task_dedup")
    public final boolean enableTaskDedup;

    public ECPreloadTaskDedupConfig() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ECPreloadTaskDedupConfig) && this.enableTaskDedup == ((ECPreloadTaskDedupConfig) obj).enableTaskDedup;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.enableTaskDedup);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECPreloadTaskDedupConfig(enableTaskDedup=");
        sbLIZ.append(this.enableTaskDedup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECPreloadTaskDedupConfig(boolean z) {
        this.enableTaskDedup = z;
    }
}

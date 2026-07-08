package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSugRequestCancelQueueConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_parallel_count")
    public final int maxParallelCount;

    @C09CT("max_queue_size")
    public final int maxQueueSize;

    public EcSearchSugRequestCancelQueueConfig() {
        this(false, 1, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchSugRequestCancelQueueConfig)) {
            return false;
        }
        EcSearchSugRequestCancelQueueConfig ecSearchSugRequestCancelQueueConfig = (EcSearchSugRequestCancelQueueConfig) obj;
        return this.enable == ecSearchSugRequestCancelQueueConfig.enable && this.maxParallelCount == ecSearchSugRequestCancelQueueConfig.maxParallelCount && this.maxQueueSize == ecSearchSugRequestCancelQueueConfig.maxQueueSize;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + this.maxParallelCount) * 31) + this.maxQueueSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchSugRequestCancelQueueConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", maxParallelCount=");
        sbLIZ.append(this.maxParallelCount);
        sbLIZ.append(", maxQueueSize=");
        sbLIZ.append(this.maxQueueSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchSugRequestCancelQueueConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.maxParallelCount = i;
        this.maxQueueSize = i2;
    }
}

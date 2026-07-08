package com.ss.android.ugc.aweme.runnable;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SlideRunnableBlockConfigs {

    @C09CT("block_configs")
    public final List<SlideRunnableBlockConfig> blockConfigs;

    @C09CT("downgraded_runnable_queue_max_size")
    public final int downgradedRunnableQueueMaxSize;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("is_all_log_on")
    public final boolean isAllLogOn;

    @C09CT("lock_timeout")
    public final long lockTimeout;

    public SlideRunnableBlockConfigs() {
        this(false, false, 3000L, 0, new ArrayList());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlideRunnableBlockConfigs(enableStrategy=");
        sbLIZ.append(this.enableStrategy);
        sbLIZ.append(", isAllLogOn=");
        sbLIZ.append(this.isAllLogOn);
        sbLIZ.append(", lockTimeout=");
        sbLIZ.append(this.lockTimeout);
        sbLIZ.append(", downgradedRunnableQueueMaxSize=");
        sbLIZ.append(this.downgradedRunnableQueueMaxSize);
        sbLIZ.append(", blockConfigs=");
        sbLIZ.append(this.blockConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlideRunnableBlockConfigs(boolean z, boolean z2, long j, int i, List<SlideRunnableBlockConfig> list) {
        this.enableStrategy = z;
        this.isAllLogOn = z2;
        this.lockTimeout = j;
        this.downgradedRunnableQueueMaxSize = i;
        this.blockConfigs = list;
    }
}

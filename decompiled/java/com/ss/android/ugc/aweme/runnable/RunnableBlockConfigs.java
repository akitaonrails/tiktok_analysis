package com.ss.android.ugc.aweme.runnable;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC2184841Af4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class RunnableBlockConfigs {

    @C09CT("runnable_block_configs")
    public final List<RunnableBlockConfig> blockConfigs;

    @C09CT("distinct_str")
    public final String distinctStr;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("max_queue_size")
    public final int maxQueueSize;

    @C09CT("split_mode")
    public final int splitMode;

    @C09CT("staggered_release_config")
    public final StaggeredReleaseConfig staggeredReleaseConfig;

    @C09CT("task_timeout")
    public final long taskTimeOut;

    public RunnableBlockConfigs() {
        this(false, 0, new ArrayList(), 1500L, EnumC2184841Af4.NONE.ordinal(), "", null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableBlockConfigs(enableStrategy=");
        sbLIZ.append(this.enableStrategy);
        sbLIZ.append(", maxQueueSize=");
        sbLIZ.append(this.maxQueueSize);
        sbLIZ.append(", blockConfigs=");
        sbLIZ.append(this.blockConfigs);
        sbLIZ.append(", taskTimeOut=");
        sbLIZ.append(this.taskTimeOut);
        sbLIZ.append(", splitMode=");
        sbLIZ.append(this.splitMode);
        sbLIZ.append(", distinctStr='");
        sbLIZ.append(this.distinctStr);
        sbLIZ.append("', staggeredReleaseConfig=");
        sbLIZ.append(this.staggeredReleaseConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RunnableBlockConfigs(boolean z, int i, List<RunnableBlockConfig> list, long j, int i2, String str, StaggeredReleaseConfig staggeredReleaseConfig) {
        this.enableStrategy = z;
        this.maxQueueSize = i;
        this.blockConfigs = list;
        this.taskTimeOut = j;
        this.splitMode = i2;
        this.distinctStr = str;
        this.staggeredReleaseConfig = staggeredReleaseConfig;
    }
}

package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC2184841Af4;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveRunnableBlockConfigs {
    public static final TypeAdapter ADAPTER = new LiveRunnableBlockConfigs_OptTypeAdapter(NormalGson.singleton());

    @C09CT("runnable_block_configs")
    public List<LiveRunnableBlockConfig> blockConfigs;

    @C09CT("distinct_str")
    public String distinctStr;

    @C09CT("enable_strategy")
    public boolean enableStrategy;

    @C09CT("enter_opt_bitmask")
    public int enterOptBitmask;

    @C09CT("max_queue_size")
    public int maxQueueSize;

    @C09CT("split_interval")
    public long splitInterval;

    @C09CT("split_mode")
    public int splitMode;

    @C09CT("split_timeout")
    public long splitTimeout;

    @C09CT("task_timeout")
    public long taskTimeOut;

    public LiveRunnableBlockConfigs() {
        this(false, 0, new ArrayList(), 1500L, 0L, 0L, EnumC2184841Af4.NONE.ordinal(), "", 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRunnableBlockConfigs(enableStrategy=");
        sbLIZ.append(this.enableStrategy);
        sbLIZ.append(", maxQueueSize=");
        sbLIZ.append(this.maxQueueSize);
        sbLIZ.append(", blockConfigs=");
        sbLIZ.append(this.blockConfigs);
        sbLIZ.append(", taskTimeOut=");
        sbLIZ.append(this.taskTimeOut);
        sbLIZ.append(", splitInterval=");
        sbLIZ.append(this.splitInterval);
        sbLIZ.append(", splitTimeout=");
        sbLIZ.append(this.splitTimeout);
        sbLIZ.append(", splitMode=");
        sbLIZ.append(this.splitMode);
        sbLIZ.append(", distinctStr='");
        sbLIZ.append(this.distinctStr);
        sbLIZ.append("', enterOptBitmask=");
        sbLIZ.append(this.enterOptBitmask);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveRunnableBlockConfigs(boolean z, int i, List<LiveRunnableBlockConfig> list, long j, long j2, long j3, int i2, String str, int i3) {
        this.enableStrategy = z;
        this.maxQueueSize = i;
        this.blockConfigs = list;
        this.taskTimeOut = j;
        this.splitInterval = j2;
        this.splitTimeout = j3;
        this.splitMode = i2;
        this.distinctStr = str;
        this.enterOptBitmask = i3;
    }
}

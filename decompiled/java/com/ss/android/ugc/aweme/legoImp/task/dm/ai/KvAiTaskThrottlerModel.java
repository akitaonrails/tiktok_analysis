package com.ss.android.ugc.aweme.legoImp.task.dm.ai;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class KvAiTaskThrottlerModel {

    @C09CT("interval")
    public final int intervalSeconds;

    @C09CT("max_task_size")
    public final int maxTasks;

    public KvAiTaskThrottlerModel() {
        this(30, 10);
    }

    public KvAiTaskThrottlerModel(int i, int i2) {
        this.intervalSeconds = i;
        this.maxTasks = i2;
    }
}

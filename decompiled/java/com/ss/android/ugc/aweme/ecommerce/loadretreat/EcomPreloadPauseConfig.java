package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomPreloadPauseConfig {

    @C09CT("cancel_execute_task_when_destroyed")
    public final boolean cancelExecuteTaskWhenDestroyed;

    @C09CT("cancel_tasks_network_threshold")
    public final int cancelTasksNetworkThreshold;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("pause_tasks_network_threshold")
    public final int pauseTasksNetworkThreshold;

    @C09CT("re_prioritize_tasks")
    public final boolean rePrioritizeTasks;

    @C09CT("requeue_task")
    public final boolean requeueTask;

    public EcomPreloadPauseConfig() {
        this(false, false, 0, 0, false, false);
    }

    public EcomPreloadPauseConfig(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4) {
        this.enable = z;
        this.rePrioritizeTasks = z2;
        this.pauseTasksNetworkThreshold = i;
        this.cancelTasksNetworkThreshold = i2;
        this.cancelExecuteTaskWhenDestroyed = z3;
        this.requeueTask = z4;
    }
}

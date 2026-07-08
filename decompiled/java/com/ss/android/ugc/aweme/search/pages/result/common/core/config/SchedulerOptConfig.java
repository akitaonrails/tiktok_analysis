package com.ss.android.ugc.aweme.search.pages.result.common.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SchedulerOptConfig {

    @C09CT("check_full_opt_pos")
    public final int checkFullOptPos;

    @C09CT("chunk_task_delay_opt_pos")
    public final int chunkTaskDelayOptPos;

    @C09CT("chunk_task_delay_time")
    public final long chunkTaskDelayTime;

    @C09CT("chunk_task_running_opt")
    public final int chunkTaskRunningOpt;

    @C09CT("get_pending_size")
    public final int enableGetPendingSize;

    @C09CT("last_view_pos_opt")
    public final int enableLastViewPosOpt;

    @C09CT("enable_merge_task")
    public final int enableMergeTask;

    @C09CT("enable_post_front")
    public final int enablePostFront;

    @C09CT("force_layout_pos")
    public final int forceLayoutPos;

    @C09CT("merge_task_count")
    public final int mergeTaskCount;

    @C09CT("remove_predict_full_fill")
    public final int removePredictFullFill;

    public SchedulerOptConfig() {
        this(0, 0, 0, 0, 0, 0, -1, -1, 0, 0L, 0);
    }

    public SchedulerOptConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, int i10) {
        this.enablePostFront = i;
        this.enableMergeTask = i2;
        this.mergeTaskCount = i3;
        this.removePredictFullFill = i4;
        this.enableGetPendingSize = i5;
        this.enableLastViewPosOpt = i6;
        this.forceLayoutPos = i7;
        this.checkFullOptPos = i8;
        this.chunkTaskDelayOptPos = i9;
        this.chunkTaskDelayTime = j;
        this.chunkTaskRunningOpt = i10;
    }
}

package webcast.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FansTask {

    @C09CT("is_done")
    public boolean isDone;

    @C09CT("is_today_complete")
    public boolean isTodayComplete;

    @C09CT("step_progress")
    public long stepProgress;

    @C09CT("step_reward")
    public long stepReward;

    @C09CT("task_config")
    public FansTaskConfig taskConfig;

    @C09CT("task_cur_progress")
    public long taskCurProgress;

    @C09CT("task_total_progress")
    public long taskTotalProgress;

    @C09CT("task_type")
    public int taskType;

    @C09CT("unclaimed_points")
    public long unclaimedPoints;
}

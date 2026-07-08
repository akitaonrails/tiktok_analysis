package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorTaskProgress;
import webcast.data.AnchorTaskRewardInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorGrowCenterTaskInfo {

    @C09CT("reward_info")
    public AnchorTaskRewardInfo rewardInfo;

    @C09CT("reward_status")
    public int rewardStatus;

    @C09CT("task_expire_time")
    public long taskExpireTime;

    @C09CT("task_id")
    public long taskId;

    @C09CT("task_progress")
    public List<AnchorTaskProgress> taskProgress = new ArrayList();

    @C09CT("task_start_time")
    public long taskStartTime;

    @C09CT("task_status")
    public int taskStatus;
}

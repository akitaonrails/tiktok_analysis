package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowTaskListItem {

    @C09CT("reward_expire_time")
    public long rewardExpireTime;

    @C09CT("reward_info")
    public AnchorTaskRewardInfo rewardInfo;

    @C09CT("reward_status")
    public int rewardStatus;

    @C09CT("task_expire_time")
    public long taskExpireTime;

    @C09CT("task_finish_time")
    public long taskFinishTime;

    @C09CT("task_id")
    public long taskId;

    @C09CT("task_record_id")
    public long taskRecordId;

    @C09CT("task_reward_info")
    public AnchorGrowRewardInfo taskRewardInfo;

    @C09CT("task_start_time")
    public long taskStartTime;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_type")
    public int taskType;

    @C09CT("task_name")
    public String taskName = "";

    @C09CT("task_progress")
    public List<AnchorTaskProgress> taskProgress = new ArrayList();

    @C09CT("task_id_str")
    public String taskIdStr = "";

    @C09CT("task_record_id_str")
    public String taskRecordIdStr = "";
}

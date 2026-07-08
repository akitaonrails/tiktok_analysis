package tikcast.api.anchor;

import X.C09CT;
import webcast.data.glip.RewardAmount;

/* JADX INFO: loaded from: classes29.dex */
public final class UserTaskReward {

    @C09CT("billing_source")
    public int billingSource;

    @C09CT("confirm_revenue")
    public RewardAmount confirmRevenue;

    @C09CT("glip_biz_scene")
    public int glipBizScene;

    @C09CT("task_end_date")
    public long taskEndDate;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_start_date")
    public long taskStartDate;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_type")
    public int taskType;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("task_title")
    public String taskTitle = "";

    @C09CT("task_sub_title")
    public String taskSubTitle = "";

    @C09CT("task_cover")
    public String taskCover = "";
}

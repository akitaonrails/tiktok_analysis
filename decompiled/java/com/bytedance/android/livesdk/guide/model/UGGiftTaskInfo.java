package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UGGiftTaskInfo {

    @C09CT("complete_task_gift_id")
    public long completeTaskGiftId;

    @C09CT("pre_reward_ug_points")
    public long preRewardUgPoints;

    @C09CT("reward_ug_points")
    public long rewardUgPoints;

    @C09CT("show_banner_entry")
    public boolean showBannerEntry;

    @C09CT("task_biz_type")
    public int taskBizType;

    @C09CT("task_end_time")
    public long taskEndTime;

    @C09CT("task_period_days")
    public long taskPeriodDays;

    @C09CT("task_start_time")
    public long taskStartTime;

    @C09CT("ug_task_flow")
    public int ugTaskFlow;

    @C09CT("ug_task_status")
    public int ugTaskStatus;

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("reward_list")
    public List<RewardProcess> rewardList = new ArrayList();
}

package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;
import webcast.data.TouchPointData;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskInfo {

    @C09CT("anchor_rank_len")
    public long anchorRankLen;

    @C09CT("anchor_room_info")
    public AnchorRoomInfo anchorRoomInfo;

    @C09CT("available_in_current_room")
    public boolean availableInCurrentRoom;

    @C09CT("base_reward_amount")
    public long baseRewardAmount;

    @C09CT("extra")
    public TaskInfoExtra extra;

    @C09CT("has_next_task_period")
    public boolean hasNextTaskPeriod;

    @C09CT("is_remind_for_task_delay")
    public boolean isRemindForTaskDelay;

    @C09CT("pre_reward_amount")
    public long preRewardAmount;

    @C09CT("pre_reward_gift_id")
    public long preRewardGiftId;

    @C09CT("pre_reward_type")
    public int preRewardType;

    @C09CT("remind_area_text")
    public Text remindAreaText;

    @C09CT("reward_amount")
    public long rewardAmount;

    @C09CT("reward_gift_id")
    public long rewardGiftId;

    @C09CT("reward_type")
    public int rewardType;

    @C09CT("target_type")
    public int targetType;

    @C09CT("task_complete_end_time")
    public long taskCompleteEndTime;

    @C09CT("task_complete_target_num")
    public long taskCompleteTargetNum;

    @C09CT("task_completed_num")
    public long taskCompletedNum;

    @C09CT("task_flow_type")
    public int taskFlowType;

    @C09CT("task_priority")
    public long taskPriority;

    @C09CT("task_reward_end_time")
    public long taskRewardEndTime;

    @C09CT("task_start_time")
    public long taskStartTime;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_total_completed_num")
    public long taskTotalCompletedNum;

    @C09CT("task_type")
    public int taskType;

    @C09CT("user_base_data")
    public UserBaseData userBaseData;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("sub_tasks")
    public List<TaskInfo> subTasks = new ArrayList();

    @C09CT("reward_list")
    public List<RewardProcess> rewardList = new ArrayList();

    @C09CT("task_bonus_list")
    public List<TaskBonus> taskBonusList = new ArrayList();

    @C09CT("anchor_room_info_list")
    public List<AnchorRoomInfo> anchorRoomInfoList = new ArrayList();

    @C09CT("tp_data_list")
    public List<TouchPointData> tpDataList = new ArrayList();
}

package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TaskBonus {

    @C09CT("bonus_amount")
    public long bonusAmount;

    @C09CT("bonus_attached_task_id")
    public long bonusAttachedTaskId;

    @C09CT("bonus_attached_task_type")
    public int bonusAttachedTaskType;

    @C09CT("bonus_source_task_id")
    public long bonusSourceTaskId;

    @C09CT("bonus_source_task_type")
    public int bonusSourceTaskType;

    @C09CT("bonus_target_task_id")
    public long bonusTargetTaskId;

    @C09CT("bonus_target_task_type")
    public int bonusTargetTaskType;

    @C09CT("potential_target_task_list")
    public List<PotentialTargetTask> potentialTargetTaskList = new ArrayList();

    @C09CT("task_bonus_status")
    public int taskBonusStatus;

    @C09CT("task_bonus_type")
    public int taskBonusType;
}

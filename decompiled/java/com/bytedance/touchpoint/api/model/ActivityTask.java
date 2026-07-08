package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ActivityTask extends C1893670zNV {

    @C09CT("auto_done_task")
    public Boolean autoDone;

    @C09CT("award_cnt")
    public Integer awardCount;

    @C09CT("task_count")
    public int count;

    @C09CT("display_cash_amount")
    public Float displayCashAmount;

    @C09CT("finish_push")
    public String finishPush;

    @C09CT("is_auto")
    public boolean isAuto;

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("reward_layer")
    public List<Integer> rewardLayer;

    @C09CT("round_time")
    public Integer roundTime;

    @C09CT("round_time_done")
    public Boolean roundTimeDone;

    @C09CT("display_score_amount")
    public Integer scoreAmount;

    @C09CT("stop_auto_after_days")
    public int stopAutoDays;

    @C09CT("task_close")
    public Boolean taskClose;

    @C09CT("task_condition_items")
    public List<String> taskConditionItems;

    @C09CT("task_key")
    public String taskKey;

    @C09CT("task_type")
    public int taskType;

    @C09CT("time")
    public int time;

    @C09CT("upload_switch")
    public Boolean uploadSwitch;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTask)) {
            return false;
        }
        ActivityTask activityTask = (ActivityTask) obj;
        return Intrinsics.LJFF(this.taskKey, activityTask.taskKey) && this.taskType == activityTask.taskType && this.isAuto == activityTask.isAuto && Intrinsics.LJFF(this.finishPush, activityTask.finishPush) && this.time == activityTask.time && Intrinsics.LJFF(this.roundTime, activityTask.roundTime) && Intrinsics.LJFF(this.rewardLayer, activityTask.rewardLayer) && this.count == activityTask.count && Intrinsics.LJFF(this.taskConditionItems, activityTask.taskConditionItems) && Intrinsics.LJFF(this.scoreAmount, activityTask.scoreAmount) && Intrinsics.LJFF(this.notificationId, activityTask.notificationId) && Intrinsics.LJFF(this.uploadSwitch, activityTask.uploadSwitch) && this.stopAutoDays == activityTask.stopAutoDays && Intrinsics.LJFF(this.awardCount, activityTask.awardCount) && Intrinsics.LJFF(this.autoDone, activityTask.autoDone) && Intrinsics.LJFF(this.roundTimeDone, activityTask.roundTimeDone) && Intrinsics.LJFF(this.displayCashAmount, activityTask.displayCashAmount) && Intrinsics.LJFF(this.taskClose, activityTask.taskClose);
    }

    public final int hashCode() {
        int iHashCode = ((((this.taskKey.hashCode() * 31) + this.taskType) * 31) + C786410Ut5.Z2(this.isAuto)) * 31;
        String str = this.finishPush;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.time) * 31;
        Integer num = this.roundTime;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.rewardLayer;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.count) * 31;
        List<String> list2 = this.taskConditionItems;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.scoreAmount;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.notificationId;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.uploadSwitch;
        int iHashCode8 = (((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31) + this.stopAutoDays) * 31;
        Integer num3 = this.awardCount;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.autoDone;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.roundTimeDone;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f = this.displayCashAmount;
        int iHashCode12 = (iHashCode11 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool4 = this.taskClose;
        return iHashCode12 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityTask(taskKey=" + this.taskKey + ", taskType=" + this.taskType + ", isAuto=" + this.isAuto + ", finishPush=" + this.finishPush + ", time=" + this.time + ", roundTime=" + this.roundTime + ", rewardLayer=" + this.rewardLayer + ", count=" + this.count + ", taskConditionItems=" + this.taskConditionItems + ", scoreAmount=" + this.scoreAmount + ", notificationId=" + this.notificationId + ", uploadSwitch=" + this.uploadSwitch + ", stopAutoDays=" + this.stopAutoDays + ", awardCount=" + this.awardCount + ", autoDone=" + this.autoDone + ", roundTimeDone=" + this.roundTimeDone + ", displayCashAmount=" + this.displayCashAmount + ", taskClose=" + this.taskClose + ')';
    }

    public final ActivityTask LIZ() {
        return new ActivityTask(this.taskKey, this.taskType, this.isAuto, this.finishPush, this.time, this.roundTime, this.rewardLayer, this.count, this.taskConditionItems, this.scoreAmount, this.notificationId, this.uploadSwitch, this.stopAutoDays, this.awardCount, this.autoDone, this.roundTimeDone, this.displayCashAmount, this.taskClose);
    }

    public ActivityTask(String str, int i, boolean z, String str2, int i2, Integer num, List<Integer> list, int i3, List<String> list2, Integer num2, String str3, Boolean bool, int i4, Integer num3, Boolean bool2, Boolean bool3, Float f, Boolean bool4) {
        this.taskKey = str;
        this.taskType = i;
        this.isAuto = z;
        this.finishPush = str2;
        this.time = i2;
        this.roundTime = num;
        this.rewardLayer = list;
        this.count = i3;
        this.taskConditionItems = list2;
        this.scoreAmount = num2;
        this.notificationId = str3;
        this.uploadSwitch = bool;
        this.stopAutoDays = i4;
        this.awardCount = num3;
        this.autoDone = bool2;
        this.roundTimeDone = bool3;
        this.displayCashAmount = f;
        this.taskClose = bool4;
    }
}

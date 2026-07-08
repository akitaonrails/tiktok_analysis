package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTaskInfo {

    @C09CT("bonus_ratio")
    public Long bonusRatio;

    @C09CT("collected_count")
    public Long collectedCount;

    @C09CT("duration")
    public Long duration;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("finished")
    public Long finished;

    @C09CT("goal_count")
    public Long goalCount;

    @C09CT("has_next_task")
    public Long hasNextTask;

    @C09CT("start_time")
    public Long startTime;

    @C09CT("success")
    public Long success;

    @C09CT("task_round")
    public Long taskRound;

    @C09CT("task_type")
    public Long taskType;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.taskType != null) {
            sb.append(", task_type=");
            sb.append(this.taskType);
        }
        if (this.startTime != null) {
            sb.append(", start_time=");
            sb.append(this.startTime);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.endTime != null) {
            sb.append(", end_time=");
            sb.append(this.endTime);
        }
        if (this.taskRound != null) {
            sb.append(", task_round=");
            sb.append(this.taskRound);
        }
        if (this.collectedCount != null) {
            sb.append(", collected_count=");
            sb.append(this.collectedCount);
        }
        if (this.goalCount != null) {
            sb.append(", goal_count=");
            sb.append(this.goalCount);
        }
        if (this.finished != null) {
            sb.append(", finished=");
            sb.append(this.finished);
        }
        if (this.success != null) {
            sb.append(", success=");
            sb.append(this.success);
        }
        if (this.bonusRatio != null) {
            sb.append(", bonus_ratio=");
            sb.append(this.bonusRatio);
        }
        if (this.hasNextTask != null) {
            sb.append(", has_next_task=");
            sb.append(this.hasNextTask);
        }
        sb.replace(0, 2, "BattleTaskInfo{");
        sb.append('}');
        return sb.toString();
    }
}

package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TaskProgress {

    @C09CT("complete_percentage")
    public final Integer completePercentage;

    @C09CT("estimated_time_cost")
    public final Long estimatedTimeCost;

    @C09CT("process_end")
    public final Integer processEnd;

    @C09CT("process_start")
    public final Integer processStart;

    @C09CT("stage")
    public final Integer stage;

    @C09CT("start_time")
    public final Long startTime;

    public TaskProgress() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskProgress)) {
            return false;
        }
        TaskProgress taskProgress = (TaskProgress) obj;
        return Intrinsics.LJFF(this.stage, taskProgress.stage) && Intrinsics.LJFF(this.processStart, taskProgress.processStart) && Intrinsics.LJFF(this.processEnd, taskProgress.processEnd) && Intrinsics.LJFF(this.startTime, taskProgress.startTime) && Intrinsics.LJFF(this.estimatedTimeCost, taskProgress.estimatedTimeCost) && Intrinsics.LJFF(this.completePercentage, taskProgress.completePercentage);
    }

    public final int hashCode() {
        Integer num = this.stage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.processStart;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.processEnd;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.estimatedTimeCost;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num4 = this.completePercentage;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskProgress(stage=");
        sbLIZ.append(this.stage);
        sbLIZ.append(", processStart=");
        sbLIZ.append(this.processStart);
        sbLIZ.append(", processEnd=");
        sbLIZ.append(this.processEnd);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", estimatedTimeCost=");
        sbLIZ.append(this.estimatedTimeCost);
        sbLIZ.append(", completePercentage=");
        sbLIZ.append(this.completePercentage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaskProgress(Integer num, Integer num2, Integer num3, Long l, Long l2, Integer num4) {
        this.stage = num;
        this.processStart = num2;
        this.processEnd = num3;
        this.startTime = l;
        this.estimatedTimeCost = l2;
        this.completePercentage = num4;
    }
}

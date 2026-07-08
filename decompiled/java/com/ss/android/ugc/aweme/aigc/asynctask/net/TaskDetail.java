package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskResult;
import com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskDetail implements Parcelable {

    @C09CT("complete_percentage")
    public final float completePercentage;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("job_status")
    public final int jobStatus;

    @C09CT("job_type")
    public final Integer jobType;

    @C09CT("results")
    public final List<AIGCTaskResult> results;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("status_message")
    public final String statusMessage;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("waiting_time")
    public final long waitingTime;
    public static final Parcelable.Creator<TaskDetail> CREATOR = new Parcelable.Creator<TaskDetail>() { // from class: X.0LWV
        @Override // android.os.Parcelable.Creator
        public final TaskDetail createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            float f = parcel.readFloat();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AIGCTaskResult.CREATOR.createFromParcel(parcel));
            }
            return new TaskDetail(string, i, f, string2, numValueOf, j, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TaskDetail[] newArray(int i) {
            return new TaskDetail[i];
        }
    };
    public static final int $stable = 8;

    public TaskDetail() {
        this(null, 0, 0.0f, null, null, 0L, null, 0L, 0L, 0L, null, 2047, null);
    }

    public final TaskDetail copy(String str, int i, float f, String str2, Integer num, long j, List<AIGCTaskResult> list, long j2, long j3, long j4, String str3) {
        return new TaskDetail(str, i, f, str2, num, j, list, j2, j3, j4, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskDetail)) {
            return false;
        }
        TaskDetail taskDetail = (TaskDetail) obj;
        return Intrinsics.LJFF(this.taskId, taskDetail.taskId) && this.jobStatus == taskDetail.jobStatus && Float.compare(this.completePercentage, taskDetail.completePercentage) == 0 && Intrinsics.LJFF(this.statusMessage, taskDetail.statusMessage) && Intrinsics.LJFF(this.jobType, taskDetail.jobType) && this.waitingTime == taskDetail.waitingTime && Intrinsics.LJFF(this.results, taskDetail.results) && this.createTime == taskDetail.createTime && this.startTime == taskDetail.startTime && this.endTime == taskDetail.endTime && Intrinsics.LJFF(this.failReasonMsg, taskDetail.failReasonMsg);
    }

    public String toString() {
        return "TaskDetail(taskId=" + this.taskId + ", jobStatus=" + this.jobStatus + ", completePercentage=" + this.completePercentage + ", statusMessage=" + this.statusMessage + ", jobType=" + this.jobType + ", waitingTime=" + this.waitingTime + ", results=" + this.results + ", createTime=" + this.createTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", failReasonMsg=" + this.failReasonMsg + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.taskId);
        parcel.writeInt(this.jobStatus);
        parcel.writeFloat(this.completePercentage);
        parcel.writeString(this.statusMessage);
        Integer num = this.jobType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeLong(this.waitingTime);
        List<AIGCTaskResult> list = this.results;
        parcel.writeInt(list.size());
        Iterator<AIGCTaskResult> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.failReasonMsg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.taskId.hashCode() * 31) + this.jobStatus) * 31) + Float.floatToIntBits(this.completePercentage)) * 31) + this.statusMessage.hashCode()) * 31;
        Integer num = this.jobType;
        int iHashCode2 = (((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Y2(this.waitingTime)) * 31) + this.results.hashCode()) * 31) + C786410Ut5.Y2(this.createTime)) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31;
        String str = this.failReasonMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final float getCompletePercentage() {
        return this.completePercentage;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getFailReasonMsg() {
        return this.failReasonMsg;
    }

    public final int getJobStatus() {
        return this.jobStatus;
    }

    public final Integer getJobType() {
        return this.jobType;
    }

    public final List<AIGCTaskResult> getResults() {
        return this.results;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final long getWaitingTime() {
        return this.waitingTime;
    }

    public TaskDetail(String str, int i, float f, String str2, Integer num, long j, List<AIGCTaskResult> list, long j2, long j3, long j4, String str3) {
        this.taskId = str;
        this.jobStatus = i;
        this.completePercentage = f;
        this.statusMessage = str2;
        this.jobType = num;
        this.waitingTime = j;
        this.results = list;
        this.createTime = j2;
        this.startTime = j3;
        this.endTime = j4;
        this.failReasonMsg = str3;
    }

    public TaskDetail(String str, int i, float f, String str2, Integer num, long j, List list, long j2, long j3, long j4, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) == 0 ? str2 : "", (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? C13BV.INSTANCE : list, (i2 & 128) != 0 ? 0L : j2, (i2 & 256) != 0 ? 0L : j3, (i2 & 512) == 0 ? j4 : 0L, (i2 & 1024) != 0 ? null : str3);
    }
}

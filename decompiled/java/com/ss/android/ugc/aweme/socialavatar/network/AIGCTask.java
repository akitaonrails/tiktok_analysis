package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTask;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTaskResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AIGCTask implements Parcelable {

    @C09CT("complete_percentage")
    public final Float completePercentage;

    @C09CT("job_type")
    public final String jobType;

    @C09CT("results")
    public final List<AIGCTaskResult> results;

    @C09CT("job_status")
    public final Integer status;

    @C09CT("status_message")
    public final String statusMessage;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("waiting_time")
    public final Long waitingTimeMs;
    public static final Parcelable.Creator<AIGCTask> CREATOR = new Parcelable.Creator<AIGCTask>() { // from class: X.0HWI
        @Override // android.os.Parcelable.Creator
        public final AIGCTask createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Float fValueOf;
            Long lValueOf;
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AIGCTaskResult.CREATOR.createFromParcel(parcel));
                }
            }
            return new AIGCTask(string, numValueOf, fValueOf, string2, string3, lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCTask[] newArray(int i) {
            return new AIGCTask[i];
        }
    };
    public static final int $stable = 8;

    public final AIGCTask copy(String str, Integer num, Float f, String str2, String str3, Long l, List<AIGCTaskResult> list) {
        return new AIGCTask(str, num, f, str2, str3, l, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTask)) {
            return false;
        }
        AIGCTask aIGCTask = (AIGCTask) obj;
        return Intrinsics.LJFF(this.taskId, aIGCTask.taskId) && Intrinsics.LJFF(this.status, aIGCTask.status) && Intrinsics.LJFF(this.completePercentage, aIGCTask.completePercentage) && Intrinsics.LJFF(this.statusMessage, aIGCTask.statusMessage) && Intrinsics.LJFF(this.jobType, aIGCTask.jobType) && Intrinsics.LJFF(this.waitingTimeMs, aIGCTask.waitingTimeMs) && Intrinsics.LJFF(this.results, aIGCTask.results);
    }

    public int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.completePercentage;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.statusMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jobType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.waitingTimeMs;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        List<AIGCTaskResult> list = this.results;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCTask(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", completePercentage=");
        sbLIZ.append(this.completePercentage);
        sbLIZ.append(", statusMessage=");
        sbLIZ.append(this.statusMessage);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.jobType);
        sbLIZ.append(", waitingTimeMs=");
        sbLIZ.append(this.waitingTimeMs);
        sbLIZ.append(", results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskId);
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Float f = this.completePercentage;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.statusMessage);
        parcel.writeString(this.jobType);
        Long l = this.waitingTimeMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<AIGCTaskResult> list = this.results;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AIGCTaskResult> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final Float getCompletePercentage() {
        return this.completePercentage;
    }

    public final String getJobType() {
        return this.jobType;
    }

    public final List<AIGCTaskResult> getResults() {
        return this.results;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final Long getWaitingTimeMs() {
        return this.waitingTimeMs;
    }

    public AIGCTask(String str, Integer num, Float f, String str2, String str3, Long l, List<AIGCTaskResult> list) {
        this.taskId = str;
        this.status = num;
        this.completePercentage = f;
        this.statusMessage = str2;
        this.jobType = str3;
        this.waitingTimeMs = l;
        this.results = list;
    }
}

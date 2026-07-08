package com.bytedance.ies.powerpreload.task;

import X.C1202990hPV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;

/* JADX INFO: loaded from: classes19.dex */
public final class TaskTraceMetric implements Parcelable {
    public static final C1202990hPV CREATOR = new Parcelable.Creator<TaskTraceMetric>() { // from class: X.0hPV
        @Override // android.os.Parcelable.Creator
        public final TaskTraceMetric createFromParcel(Parcel parcel) {
            TaskTraceMetric taskTraceMetric = new TaskTraceMetric();
            taskTraceMetric.initTime = parcel.readLong();
            taskTraceMetric.taskExecuteStartTime = parcel.readLong();
            taskTraceMetric.taskExecuteEndTime = parcel.readLong();
            taskTraceMetric.shootStartTime = parcel.readLong();
            taskTraceMetric.shootEndTime = parcel.readLong();
            return taskTraceMetric;
        }

        @Override // android.os.Parcelable.Creator
        public final TaskTraceMetric[] newArray(int i) {
            return new TaskTraceMetric[i];
        }
    };
    public long initTime = SystemClock.elapsedRealtime();
    public long shootEndTime;
    public long shootStartTime;
    public long taskExecuteEndTime;
    public long taskExecuteStartTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initTime=");
        sbLIZ.append(this.initTime);
        sbLIZ.append("&taskExecuteStartTime=");
        sbLIZ.append(this.taskExecuteStartTime);
        sbLIZ.append('&');
        sbLIZ.append("taskExecuteEndTime=");
        sbLIZ.append(this.taskExecuteEndTime);
        sbLIZ.append("&shootStartTime=");
        sbLIZ.append(this.shootStartTime);
        sbLIZ.append("&shootEndTime=");
        sbLIZ.append(this.shootEndTime);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.initTime);
        parcel.writeLong(this.taskExecuteStartTime);
        parcel.writeLong(this.taskExecuteEndTime);
        parcel.writeLong(this.shootStartTime);
        parcel.writeLong(this.shootEndTime);
    }
}

package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.graph.net.LogPB;
import com.ss.android.ugc.aweme.aigc.graph.net.TaskDetail;
import com.ss.android.ugc.aweme.aigc.graph.net.TasksDetailResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TasksDetailResponse implements Parcelable {
    public static final Parcelable.Creator<TasksDetailResponse> CREATOR = new Parcelable.Creator<TasksDetailResponse>() { // from class: X.0LXE
        @Override // android.os.Parcelable.Creator
        public final TasksDetailResponse createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Boolean boolValueOf;
            Long lValueOf2;
            Integer numValueOf;
            LogPB logPBCreateFromParcel;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z2 = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TaskDetail.CREATOR.createFromParcel(parcel));
            }
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                logPBCreateFromParcel = null;
            } else {
                logPBCreateFromParcel = LogPB.CREATOR.createFromParcel(parcel);
            }
            LogPB logPB = logPBCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new TasksDetailResponse(arrayList, lValueOf, boolValueOf, lValueOf2, numValueOf, string, logPB, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TasksDetailResponse[] newArray(int i) {
            return new TasksDetailResponse[i];
        }
    };

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("enable_retry")
    public final Boolean enableRetry;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("log_pb")
    public final LogPB logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("task_statuses")
    public final List<TaskDetail> taskStatuses;

    @C09CT("waiting_time_ms")
    public final Long waitingTimeMs;

    public TasksDetailResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final TasksDetailResponse copy(List<TaskDetail> list, Long l, Boolean bool, Long l2, Integer num, String str, LogPB logPB, Boolean bool2) {
        return new TasksDetailResponse(list, l, bool, l2, num, str, logPB, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TasksDetailResponse)) {
            return false;
        }
        TasksDetailResponse tasksDetailResponse = (TasksDetailResponse) obj;
        return Intrinsics.LJFF(this.taskStatuses, tasksDetailResponse.taskStatuses) && Intrinsics.LJFF(this.cursor, tasksDetailResponse.cursor) && Intrinsics.LJFF(this.hasMore, tasksDetailResponse.hasMore) && Intrinsics.LJFF(this.waitingTimeMs, tasksDetailResponse.waitingTimeMs) && Intrinsics.LJFF(this.statusCode, tasksDetailResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tasksDetailResponse.statusMsg) && Intrinsics.LJFF(this.logPb, tasksDetailResponse.logPb) && Intrinsics.LJFF(this.enableRetry, tasksDetailResponse.enableRetry);
    }

    public int hashCode() {
        int iHashCode = this.taskStatuses.hashCode() * 31;
        Long l = this.cursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.waitingTimeMs;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        LogPB logPB = this.logPb;
        int iHashCode7 = (iHashCode6 + (logPB == null ? 0 : logPB.hashCode())) * 31;
        Boolean bool2 = this.enableRetry;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TasksDetailResponse(taskStatuses=");
        sbLIZ.append(this.taskStatuses);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", waitingTimeMs=");
        sbLIZ.append(this.waitingTimeMs);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", enableRetry=");
        sbLIZ.append(this.enableRetry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<TaskDetail> list = this.taskStatuses;
        parcel.writeInt(list.size());
        Iterator<TaskDetail> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        Long l = this.cursor;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l2 = this.waitingTimeMs;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
        LogPB logPB = this.logPb;
        if (logPB == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logPB.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.enableRetry;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getEnableRetry() {
        return this.enableRetry;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPB getLogPb() {
        return this.logPb;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final List<TaskDetail> getTaskStatuses() {
        return this.taskStatuses;
    }

    public final Long getWaitingTimeMs() {
        return this.waitingTimeMs;
    }

    public TasksDetailResponse(List<TaskDetail> list, Long l, Boolean bool, Long l2, Integer num, String str, LogPB logPB, Boolean bool2) {
        this.taskStatuses = list;
        this.cursor = l;
        this.hasMore = bool;
        this.waitingTimeMs = l2;
        this.statusCode = num;
        this.statusMsg = str;
        this.logPb = logPB;
        this.enableRetry = bool2;
    }

    public TasksDetailResponse(List list, Long l, Boolean bool, Long l2, Integer num, String str, LogPB logPB, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? logPB : null, (i & 128) != 0 ? Boolean.FALSE : bool2);
    }
}

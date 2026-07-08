package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTask;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTaskResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AIGCTaskResponse implements Parcelable {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    @C09CT("task_statuses")
    public final List<AIGCTask> taskStatusList;

    @C09CT("waiting_time_ms")
    public final Long waitingTimeMs;
    public static final Parcelable.Creator<AIGCTaskResponse> CREATOR = new Parcelable.Creator<AIGCTaskResponse>() { // from class: X.0HWG
        @Override // android.os.Parcelable.Creator
        public final AIGCTaskResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            Boolean boolValueOf;
            Long lValueOf;
            boolean z = false;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AIGCTask.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AIGCTaskResponse(arrayList, numValueOf, boolValueOf, lValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCTaskResponse[] newArray(int i) {
            return new AIGCTaskResponse[i];
        }
    };
    public static final int $stable = 8;

    public AIGCTaskResponse() {
        this(null, null, null, null, null, null);
    }

    public final AIGCTaskResponse copy(List<AIGCTask> list, Integer num, Boolean bool, Long l, Integer num2, String str) {
        return new AIGCTaskResponse(list, num, bool, l, num2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTaskResponse)) {
            return false;
        }
        AIGCTaskResponse aIGCTaskResponse = (AIGCTaskResponse) obj;
        return Intrinsics.LJFF(this.taskStatusList, aIGCTaskResponse.taskStatusList) && Intrinsics.LJFF(this.cursor, aIGCTaskResponse.cursor) && Intrinsics.LJFF(this.hasMore, aIGCTaskResponse.hasMore) && Intrinsics.LJFF(this.waitingTimeMs, aIGCTaskResponse.waitingTimeMs) && Intrinsics.LJFF(this.statusCode, aIGCTaskResponse.statusCode) && Intrinsics.LJFF(this.statusMessage, aIGCTaskResponse.statusMessage);
    }

    public int hashCode() {
        List<AIGCTask> list = this.taskStatusList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.cursor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.waitingTimeMs;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.statusCode;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.statusMessage;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCTaskResponse(taskStatusList=");
        sbLIZ.append(this.taskStatusList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", waitingTimeMs=");
        sbLIZ.append(this.waitingTimeMs);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMessage=");
        sbLIZ.append(this.statusMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AIGCTask> list = this.taskStatusList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AIGCTask> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.cursor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.waitingTimeMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.statusCode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.statusMessage);
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final List<AIGCTask> getTaskStatusList() {
        return this.taskStatusList;
    }

    public final Long getWaitingTimeMs() {
        return this.waitingTimeMs;
    }

    public AIGCTaskResponse(List<AIGCTask> list, Integer num, Boolean bool, Long l, Integer num2, String str) {
        this.taskStatusList = list;
        this.cursor = num;
        this.hasMore = bool;
        this.waitingTimeMs = l;
        this.statusCode = num2;
        this.statusMessage = str;
    }
}

package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTaskListRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AIGCTaskListRequest implements Parcelable {

    @C09CT("count")
    public final Integer count;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("filter_status")
    public final List<Integer> filterStatus;

    @C09CT("job_type")
    public final String jobType;

    @C09CT("task_ids")
    public final List<String> taskIds;
    public static final Parcelable.Creator<AIGCTaskListRequest> CREATOR = new Parcelable.Creator<AIGCTaskListRequest>() { // from class: X.0HWo
        @Override // android.os.Parcelable.Creator
        public final AIGCTaskListRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AIGCTaskListRequest(arrayListCreateStringArrayList, arrayList, numValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCTaskListRequest[] newArray(int i) {
            return new AIGCTaskListRequest[i];
        }
    };
    public static final int $stable = 8;

    public AIGCTaskListRequest() {
        this(null, null, 0, 1, "ai_moji");
    }

    public final AIGCTaskListRequest copy(List<String> list, List<Integer> list2, Integer num, Integer num2, String str) {
        return new AIGCTaskListRequest(list, list2, num, num2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTaskListRequest)) {
            return false;
        }
        AIGCTaskListRequest aIGCTaskListRequest = (AIGCTaskListRequest) obj;
        return Intrinsics.LJFF(this.taskIds, aIGCTaskListRequest.taskIds) && Intrinsics.LJFF(this.filterStatus, aIGCTaskListRequest.filterStatus) && Intrinsics.LJFF(this.cursor, aIGCTaskListRequest.cursor) && Intrinsics.LJFF(this.count, aIGCTaskListRequest.count) && Intrinsics.LJFF(this.jobType, aIGCTaskListRequest.jobType);
    }

    public int hashCode() {
        List<String> list = this.taskIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.filterStatus;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.cursor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.count;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.jobType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCTaskListRequest(taskIds=");
        sbLIZ.append(this.taskIds);
        sbLIZ.append(", filterStatus=");
        sbLIZ.append(this.filterStatus);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.jobType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.taskIds);
        List<Integer> list = this.filterStatus;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        Integer num = this.cursor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.jobType);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final List<Integer> getFilterStatus() {
        return this.filterStatus;
    }

    public final String getJobType() {
        return this.jobType;
    }

    public final List<String> getTaskIds() {
        return this.taskIds;
    }

    public AIGCTaskListRequest(List<String> list, List<Integer> list2, Integer num, Integer num2, String str) {
        this.taskIds = list;
        this.filterStatus = list2;
        this.cursor = num;
        this.count = num2;
        this.jobType = str;
    }
}

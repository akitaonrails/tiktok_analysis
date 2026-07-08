package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C13BV;
import X.C1893670zNV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchCoinTaskResponse extends C1893670zNV {

    @C09CT("icon")
    public final String icon;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("reward_score_multiplier")
    public final Float multiplier;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("notification_name")
    public final String notificationName;

    @C09CT("periodic_task")
    public final PeriodicTask periodicTask;

    @C09CT("task_close")
    public final boolean taskClose;

    @C09CT("task_key")
    public final String taskKey;

    @C09CT("task_list")
    public final List<SearchCoinTaskDetail> taskList;

    public SearchCoinTaskResponse() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCoinTaskResponse)) {
            return false;
        }
        SearchCoinTaskResponse searchCoinTaskResponse = (SearchCoinTaskResponse) obj;
        return Intrinsics.LJFF(this.notificationName, searchCoinTaskResponse.notificationName) && Intrinsics.LJFF(this.notificationId, searchCoinTaskResponse.notificationId) && Intrinsics.LJFF(this.taskKey, searchCoinTaskResponse.taskKey) && Intrinsics.LJFF(this.taskList, searchCoinTaskResponse.taskList) && Intrinsics.LJFF(this.icon, searchCoinTaskResponse.icon) && Intrinsics.LJFF(this.jumpLink, searchCoinTaskResponse.jumpLink) && this.taskClose == searchCoinTaskResponse.taskClose && Intrinsics.LJFF(this.multiplier, searchCoinTaskResponse.multiplier) && Intrinsics.LJFF(this.periodicTask, searchCoinTaskResponse.periodicTask);
    }

    public final int hashCode() {
        String str = this.notificationName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taskKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SearchCoinTaskDetail> list = this.taskList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpLink;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.taskClose)) * 31;
        Float f = this.multiplier;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        PeriodicTask periodicTask = this.periodicTask;
        return iHashCode7 + (periodicTask != null ? periodicTask.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCoinTaskResponse(notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", taskKey=");
        sbLIZ.append(this.taskKey);
        sbLIZ.append(", taskList=");
        sbLIZ.append(this.taskList);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", taskClose=");
        sbLIZ.append(this.taskClose);
        sbLIZ.append(", multiplier=");
        sbLIZ.append(this.multiplier);
        sbLIZ.append(", periodicTask=");
        sbLIZ.append(this.periodicTask);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchCoinTaskResponse(String str, String str2, String str3, List<SearchCoinTaskDetail> list, String str4, String str5, boolean z, Float f, PeriodicTask periodicTask) {
        this.notificationName = str;
        this.notificationId = str2;
        this.taskKey = str3;
        this.taskList = list;
        this.icon = str4;
        this.jumpLink = str5;
        this.taskClose = z;
        this.multiplier = f;
        this.periodicTask = periodicTask;
    }

    public SearchCoinTaskResponse(String str, String str2, String str3, List list, String str4, String str5, boolean z, Float f, PeriodicTask periodicTask, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? true : z, (i & 128) != 0 ? Float.valueOf(1.0f) : f, (i & 256) != 0 ? null : periodicTask);
    }
}

package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class PeriodicTask implements Serializable {

    @C09CT("counter_task_key")
    public final String counterTaskKey;

    @C09CT("current_consecutive_day")
    public final int currentConsecutiveDay;

    @C09CT("show_task_list")
    public final List<SearchCoinTaskDetail> showTaskList;

    public PeriodicTask() {
        this(null, 0, null, 7, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PeriodicTask(counterTaskKey=");
        sbLIZ.append(this.counterTaskKey);
        sbLIZ.append(", currentConsecutiveDay=");
        sbLIZ.append(this.currentConsecutiveDay);
        sbLIZ.append(", showTaskList=");
        sbLIZ.append(this.showTaskList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PeriodicTask(String str, int i, List<SearchCoinTaskDetail> list) {
        this.counterTaskKey = str;
        this.currentConsecutiveDay = i;
        this.showTaskList = list;
    }

    public PeriodicTask(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}

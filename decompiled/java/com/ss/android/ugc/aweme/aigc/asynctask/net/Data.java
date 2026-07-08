package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class Data {

    @C09CT("task_detail_list")
    public final List<com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail> taskDetailList;

    public Data() {
        this(null, 1, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Data(taskDetailList=");
        sbLIZ.append(this.taskDetailList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Data(List<com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail> list) {
        this.taskDetailList = list;
    }

    public Data(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

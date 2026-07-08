package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCPushMessage {

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("task_detail_list")
    public final List<TaskDetail> taskDetailList;

    public AIGCPushMessage() {
        this(null, 0, null, 7, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCPushMessage(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", taskDetailList=");
        sbLIZ.append(this.taskDetailList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCPushMessage(String str, int i, List<TaskDetail> list) {
        this.creationId = str;
        this.statusCode = i;
        this.taskDetailList = list;
    }

    public AIGCPushMessage(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}

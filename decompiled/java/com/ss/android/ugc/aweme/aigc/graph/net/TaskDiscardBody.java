package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TaskDiscardBody {

    @C09CT("task_id")
    public final String taskId;

    public TaskDiscardBody() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaskDiscardBody) && Intrinsics.LJFF(this.taskId, ((TaskDiscardBody) obj).taskId);
    }

    public final int hashCode() {
        String str = this.taskId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskDiscardBody(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaskDiscardBody(String str) {
        this.taskId = str;
    }
}

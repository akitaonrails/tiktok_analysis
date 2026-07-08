package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskInfo {

    @C09CT("can_retry")
    public final Boolean canRetry;

    @C09CT("client_task_id")
    public final String clientTaskId;

    @C09CT("error")
    public final ErrorInfo error;

    @C09CT("progress")
    public final TaskProgress progress;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("task_id")
    public final String taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskInfo)) {
            return false;
        }
        TaskInfo taskInfo = (TaskInfo) obj;
        return Intrinsics.LJFF(this.taskId, taskInfo.taskId) && Intrinsics.LJFF(this.clientTaskId, taskInfo.clientTaskId) && Intrinsics.LJFF(this.status, taskInfo.status) && Intrinsics.LJFF(this.progress, taskInfo.progress) && Intrinsics.LJFF(this.canRetry, taskInfo.canRetry) && Intrinsics.LJFF(this.error, taskInfo.error);
    }

    public final int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientTaskId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TaskProgress taskProgress = this.progress;
        int iHashCode4 = (iHashCode3 + (taskProgress == null ? 0 : taskProgress.hashCode())) * 31;
        Boolean bool = this.canRetry;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ErrorInfo errorInfo = this.error;
        return iHashCode5 + (errorInfo != null ? errorInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskInfo(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", clientTaskId=");
        sbLIZ.append(this.clientTaskId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", canRetry=");
        sbLIZ.append(this.canRetry);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaskInfo(String str, String str2, Integer num, TaskProgress taskProgress, Boolean bool, ErrorInfo errorInfo) {
        this.taskId = str;
        this.clientTaskId = str2;
        this.status = num;
        this.progress = taskProgress;
        this.canRetry = bool;
        this.error = errorInfo;
    }
}

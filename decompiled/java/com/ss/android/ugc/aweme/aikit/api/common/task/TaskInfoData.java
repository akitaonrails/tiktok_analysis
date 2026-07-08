package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskInfoData {

    @C09CT("lifecycle_info")
    public final TaskLifecycleInfo lifecycleInfo;

    public TaskInfoData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaskInfoData) && Intrinsics.LJFF(this.lifecycleInfo, ((TaskInfoData) obj).lifecycleInfo);
    }

    public int hashCode() {
        TaskLifecycleInfo taskLifecycleInfo = this.lifecycleInfo;
        if (taskLifecycleInfo == null) {
            return 0;
        }
        return taskLifecycleInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskInfoData(lifecycleInfo=");
        sbLIZ.append(this.lifecycleInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaskInfoData(TaskLifecycleInfo taskLifecycleInfo) {
        this.lifecycleInfo = taskLifecycleInfo;
    }
}

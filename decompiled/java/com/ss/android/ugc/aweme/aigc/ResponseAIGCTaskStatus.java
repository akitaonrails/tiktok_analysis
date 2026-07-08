package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ResponseAIGCTaskStatus extends AbstractC2126608Uu {

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    @C09CT("task_statuses")
    public final List<AIGCTaskStatus> tasks;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAIGCTaskStatus)) {
            return false;
        }
        ResponseAIGCTaskStatus responseAIGCTaskStatus = (ResponseAIGCTaskStatus) obj;
        return this.status_code == responseAIGCTaskStatus.status_code && Intrinsics.LJFF(this.status_msg, responseAIGCTaskStatus.status_msg) && Intrinsics.LJFF(this.tasks, responseAIGCTaskStatus.tasks);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<AIGCTaskStatus> list = this.tasks;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseAIGCTaskStatus(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", tasks=");
        sbLIZ.append(this.tasks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResponseAIGCTaskStatus(int i, String str, List<AIGCTaskStatus> list) {
        this.status_code = i;
        this.status_msg = str;
        this.tasks = list;
    }
}

package com.ss.android.ugc.aweme.theater.notify.push;

import X.C040G;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AITheaterCastPushPayload {

    @C09CT("server_task_id")
    @C040G
    public final String serverTaskId;

    public AITheaterCastPushPayload() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AITheaterCastPushPayload) && Intrinsics.LJFF(this.serverTaskId, ((AITheaterCastPushPayload) obj).serverTaskId);
    }

    public final int hashCode() {
        String str = this.serverTaskId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCastPushPayload(serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AITheaterCastPushPayload(String str) {
        this.serverTaskId = str;
    }
}

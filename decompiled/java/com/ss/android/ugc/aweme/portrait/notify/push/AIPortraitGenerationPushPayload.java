package com.ss.android.ugc.aweme.portrait.notify.push;

import X.C040G;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIPortraitGenerationPushPayload {
    public static final int $stable = 0;

    @C09CT("server_task_id")
    @C040G
    public final String serverTaskId;

    @C09CT("success")
    @C040G
    public final Boolean success;

    public AIPortraitGenerationPushPayload() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitGenerationPushPayload)) {
            return false;
        }
        AIPortraitGenerationPushPayload aIPortraitGenerationPushPayload = (AIPortraitGenerationPushPayload) obj;
        return Intrinsics.LJFF(this.serverTaskId, aIPortraitGenerationPushPayload.serverTaskId) && Intrinsics.LJFF(this.success, aIPortraitGenerationPushPayload.success);
    }

    public int hashCode() {
        String str = this.serverTaskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.success;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitGenerationPushPayload(serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", success=");
        sbLIZ.append(this.success);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIPortraitGenerationPushPayload(String str, Boolean bool) {
        this.serverTaskId = str;
        this.success = bool;
    }
}

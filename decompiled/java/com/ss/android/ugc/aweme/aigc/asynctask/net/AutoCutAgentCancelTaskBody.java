package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentCancelTaskBody {
    public static final int $stable = 0;

    @C09CT("request_id")
    public final String requestId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCutAgentCancelTaskBody) && Intrinsics.LJFF(this.requestId, ((AutoCutAgentCancelTaskBody) obj).requestId);
    }

    public int hashCode() {
        return this.requestId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentCancelTaskBody(requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutAgentCancelTaskBody() {
        this("");
    }

    public AutoCutAgentCancelTaskBody(String str) {
        this.requestId = str;
    }
}

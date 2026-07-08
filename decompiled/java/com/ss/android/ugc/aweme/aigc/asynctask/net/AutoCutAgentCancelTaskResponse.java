package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentCancelTaskResponse {
    public static final int $stable = 0;

    @C09CT("base_resp")
    public final AutoCutAgentBaseResp baseResp;

    public AutoCutAgentCancelTaskResponse() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCutAgentCancelTaskResponse) && Intrinsics.LJFF(this.baseResp, ((AutoCutAgentCancelTaskResponse) obj).baseResp);
    }

    public int hashCode() {
        AutoCutAgentBaseResp autoCutAgentBaseResp = this.baseResp;
        if (autoCutAgentBaseResp == null) {
            return 0;
        }
        return autoCutAgentBaseResp.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentCancelTaskResponse(baseResp=");
        sbLIZ.append(this.baseResp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutAgentCancelTaskResponse(AutoCutAgentBaseResp autoCutAgentBaseResp) {
        this.baseResp = autoCutAgentBaseResp;
    }
}

package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentTaskResponse {
    public static final int $stable = 0;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AutoCutAgentTaskResponse() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentTaskResponse)) {
            return false;
        }
        AutoCutAgentTaskResponse autoCutAgentTaskResponse = (AutoCutAgentTaskResponse) obj;
        return Intrinsics.LJFF(this.requestId, autoCutAgentTaskResponse.requestId) && Intrinsics.LJFF(this.statusCode, autoCutAgentTaskResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, autoCutAgentTaskResponse.statusMsg);
    }

    public int hashCode() {
        String str = this.requestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentTaskResponse(requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutAgentTaskResponse(String str, Integer num, String str2) {
        this.requestId = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}

package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentBaseResp {
    public static final int $stable = 0;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_message")
    public final String statusMsg;

    public AutoCutAgentBaseResp() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentBaseResp)) {
            return false;
        }
        AutoCutAgentBaseResp autoCutAgentBaseResp = (AutoCutAgentBaseResp) obj;
        return Intrinsics.LJFF(this.statusCode, autoCutAgentBaseResp.statusCode) && Intrinsics.LJFF(this.statusMsg, autoCutAgentBaseResp.statusMsg);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentBaseResp(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutAgentBaseResp(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}

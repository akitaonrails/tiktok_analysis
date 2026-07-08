package com.ss.android.ugc.aweme.aigc.label;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AIGCLabelStatusResponse {
    public static final int $stable = 0;

    @C09CT("overlabel_warning")
    public final String overlabelWarning;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("user_label_status")
    public final String userLabelStatus;

    public AIGCLabelStatusResponse() {
        this(0, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCLabelStatusResponse)) {
            return false;
        }
        AIGCLabelStatusResponse aIGCLabelStatusResponse = (AIGCLabelStatusResponse) obj;
        return this.statusCode == aIGCLabelStatusResponse.statusCode && Intrinsics.LJFF(this.statusMsg, aIGCLabelStatusResponse.statusMsg) && Intrinsics.LJFF(this.overlabelWarning, aIGCLabelStatusResponse.overlabelWarning) && Intrinsics.LJFF(this.userLabelStatus, aIGCLabelStatusResponse.userLabelStatus);
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overlabelWarning;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userLabelStatus;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCLabelStatusResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", overlabelWarning=");
        sbLIZ.append(this.overlabelWarning);
        sbLIZ.append(", userLabelStatus=");
        sbLIZ.append(this.userLabelStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCLabelStatusResponse(int i, String str, String str2, String str3) {
        this.statusCode = i;
        this.statusMsg = str;
        this.overlabelWarning = str2;
        this.userLabelStatus = str3;
    }
}

package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GetTaskInfoResponse {

    @C09CT("data")
    public final TaskInfoData data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public GetTaskInfoResponse() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTaskInfoResponse)) {
            return false;
        }
        GetTaskInfoResponse getTaskInfoResponse = (GetTaskInfoResponse) obj;
        return Intrinsics.LJFF(this.data, getTaskInfoResponse.data) && Intrinsics.LJFF(this.statusCode, getTaskInfoResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, getTaskInfoResponse.statusMsg);
    }

    public int hashCode() {
        TaskInfoData taskInfoData = this.data;
        int iHashCode = (taskInfoData == null ? 0 : taskInfoData.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetTaskInfoResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetTaskInfoResponse(TaskInfoData taskInfoData, Integer num, String str) {
        this.data = taskInfoData;
        this.statusCode = num;
        this.statusMsg = str;
    }
}

package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateTaskResponse {

    @C09CT("fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("log_pb")
    public final LogPB logPb;

    @C09CT("remain_quotas")
    public final List<QuotaStruct> remainQuotas;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("task_id")
    public final String taskId;

    public CreateTaskResponse() {
        this(null, null, null, "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateTaskResponse)) {
            return false;
        }
        CreateTaskResponse createTaskResponse = (CreateTaskResponse) obj;
        return Intrinsics.LJFF(this.taskId, createTaskResponse.taskId) && Intrinsics.LJFF(this.remainQuotas, createTaskResponse.remainQuotas) && Intrinsics.LJFF(this.statusCode, createTaskResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, createTaskResponse.statusMsg) && Intrinsics.LJFF(this.logPb, createTaskResponse.logPb) && Intrinsics.LJFF(this.failReasonMsg, createTaskResponse.failReasonMsg);
    }

    public final int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<QuotaStruct> list = this.remainQuotas;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LogPB logPB = this.logPb;
        int iHashCode5 = (iHashCode4 + (logPB == null ? 0 : logPB.hashCode())) * 31;
        String str3 = this.failReasonMsg;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateTaskResponse(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", remainQuotas=");
        sbLIZ.append(this.remainQuotas);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", failReasonMsg=");
        sbLIZ.append(this.failReasonMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateTaskResponse(String str, List<QuotaStruct> list, Integer num, String str2, LogPB logPB, String str3) {
        this.taskId = str;
        this.remainQuotas = list;
        this.statusCode = num;
        this.statusMsg = str2;
        this.logPb = logPB;
        this.failReasonMsg = str3;
    }
}

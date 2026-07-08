package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateTaskResponse {

    @C09CT("error_source")
    public final String errorSource;

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
        this(null, null, null, "", null, null, null);
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
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.errorSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateTaskResponse(String str, List<QuotaStruct> list, Integer num, String str2, LogPB logPB, String str3, String str4) {
        this.taskId = str;
        this.remainQuotas = list;
        this.statusCode = num;
        this.statusMsg = str2;
        this.logPb = logPB;
        this.failReasonMsg = str3;
        this.errorSource = str4;
    }
}

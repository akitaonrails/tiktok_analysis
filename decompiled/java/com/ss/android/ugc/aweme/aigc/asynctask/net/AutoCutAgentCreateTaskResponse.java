package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCheckStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentCreateTaskResponse {
    public static final int $stable = 0;

    @C09CT("base_resp")
    public final AutoCutAgentBaseResp baseResp;

    @C09CT("log_pb")
    public final AutoCutAgentCheckStatusResponse.LogPb logPb;

    @C09CT("res")
    public final Res res;

    public AutoCutAgentCreateTaskResponse() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentCreateTaskResponse)) {
            return false;
        }
        AutoCutAgentCreateTaskResponse autoCutAgentCreateTaskResponse = (AutoCutAgentCreateTaskResponse) obj;
        return Intrinsics.LJFF(this.baseResp, autoCutAgentCreateTaskResponse.baseResp) && Intrinsics.LJFF(this.res, autoCutAgentCreateTaskResponse.res) && Intrinsics.LJFF(this.logPb, autoCutAgentCreateTaskResponse.logPb);
    }

    public int hashCode() {
        AutoCutAgentBaseResp autoCutAgentBaseResp = this.baseResp;
        int iHashCode = (autoCutAgentBaseResp == null ? 0 : autoCutAgentBaseResp.hashCode()) * 31;
        Res res = this.res;
        int iHashCode2 = (iHashCode + (res == null ? 0 : res.hashCode())) * 31;
        AutoCutAgentCheckStatusResponse.LogPb logPb = this.logPb;
        return iHashCode2 + (logPb != null ? logPb.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentCreateTaskResponse(baseResp=");
        sbLIZ.append(this.baseResp);
        sbLIZ.append(", res=");
        sbLIZ.append(this.res);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Res {
        public static final int $stable = 0;

        @C09CT("fail_reason_msg")
        public final String failReasonMsg;

        @C09CT("task_id")
        public final String taskId;

        public Res() {
            this(null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Res)) {
                return false;
            }
            Res res = (Res) obj;
            return Intrinsics.LJFF(this.taskId, res.taskId) && Intrinsics.LJFF(this.failReasonMsg, res.failReasonMsg);
        }

        public int hashCode() {
            String str = this.taskId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.failReasonMsg;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Res(taskId=");
            sbLIZ.append(this.taskId);
            sbLIZ.append(", failReasonMsg=");
            sbLIZ.append(this.failReasonMsg);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Res(String str, String str2) {
            this.taskId = str;
            this.failReasonMsg = str2;
        }
    }

    public AutoCutAgentCreateTaskResponse(AutoCutAgentBaseResp autoCutAgentBaseResp, Res res, AutoCutAgentCheckStatusResponse.LogPb logPb) {
        this.baseResp = autoCutAgentBaseResp;
        this.res = res;
        this.logPb = logPb;
    }
}

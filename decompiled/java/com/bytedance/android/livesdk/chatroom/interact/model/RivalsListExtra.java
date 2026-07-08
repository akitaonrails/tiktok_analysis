package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes.dex */
public class RivalsListExtra extends Extra {

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    public static final class LogPbBean {

        @C09CT("client_log_id")
        public String clientLogId = "";

        @C09CT("impr_id")
        public String imprId;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LogPbBean{imprId='");
            sbLIZ.append(this.imprId);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public String getImprId() {
            return this.imprId;
        }
    }

    public String getRequestId() {
        LogPbBean logPbBean = this.logPbBean;
        return logPbBean != null ? logPbBean.imprId : "";
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RivalsListExtra{logPbBean=");
        sbLIZ.append(this.logPbBean);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }
}

package com.ss.android.ugc.aweme.simkit.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public class BaseResponse {
    public int error_code;
    public ServerTimeExtra extra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    public static class ServerTimeExtra {
        public String logid;
        public long now;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{now=");
            sbLIZ.append(this.now);
            sbLIZ.append(", logid='");
            sbLIZ.append(this.logid);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseResponse{status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append('\'');
        sbLIZ.append(", status_msg='");
        sbLIZ.append(this.status_msg);
        sbLIZ.append('\'');
        sbLIZ.append(", prompts='");
        sbLIZ.append(this.prompts);
        sbLIZ.append('\'');
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

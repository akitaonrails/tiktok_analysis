package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C632200Oqw;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class BaseResponse implements Serializable {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg = "";

    public final BaseResponse checkValid() throws C632200Oqw {
        if (this.statusCode == 0) {
            return this;
        }
        throw new C632200Oqw(this.statusCode, this.statusMsg, this);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }
}

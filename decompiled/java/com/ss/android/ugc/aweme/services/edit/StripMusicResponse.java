package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes29.dex */
public final class StripMusicResponse extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("req_id")
    public final String reqId;

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }
}

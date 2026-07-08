package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes10.dex */
public class BaseCommentResponse extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPd;

    public final LogPbBean getLogPd() {
        return this.logPd;
    }

    public final void setLogPd(LogPbBean logPbBean) {
        this.logPd = logPbBean;
    }
}

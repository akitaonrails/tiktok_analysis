package com.ss.android.ugc.aweme.aime.model;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEDetailModel extends BaseResponse implements C0X12, Serializable {
    public static final int $stable = 8;
    public transient String LL;

    @C09CT("style_info")
    public final AIMEStructModel aimeInfo;

    @C09CT("is_self")
    public final Boolean isSelf;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @Override // X.C0X12
    public String getRequestId() {
        String str = this.LL;
        return str == null ? "" : str;
    }

    public final AIMEStructModel getAimeInfo() {
        return this.aimeInfo;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getRid() {
        return this.LL;
    }

    public final Boolean isSelf() {
        return this.isSelf;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.LL = str;
    }

    public final void setRid(String str) {
        this.LL = str;
    }
}

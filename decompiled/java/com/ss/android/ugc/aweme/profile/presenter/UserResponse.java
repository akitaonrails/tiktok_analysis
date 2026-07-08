package com.ss.android.ugc.aweme.profile.presenter;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public final class UserResponse extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("user")
    public User user;

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUser(User user) {
        this.user = user;
    }
}

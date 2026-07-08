package com.ss.android.ugc.aweme.profile;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes14.dex */
public class UserResponse extends BaseResponse {

    @C09CT("toast_back")
    public int action;

    @C09CT("log_pb")
    public LogPbBean logPb;
    public User user;

    public int getAction() {
        return this.action;
    }

    public User getUser() {
        return this.user;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

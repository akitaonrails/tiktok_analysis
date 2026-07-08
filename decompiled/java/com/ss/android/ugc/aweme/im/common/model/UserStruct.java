package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes.dex */
public class UserStruct extends BaseResponse {

    @C09CT("user")
    public User user;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

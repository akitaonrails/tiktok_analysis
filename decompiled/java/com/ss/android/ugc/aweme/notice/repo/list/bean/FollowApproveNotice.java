package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes28.dex */
public final class FollowApproveNotice {

    @C09CT("from_user")
    public final User user;

    public FollowApproveNotice() {
        this(null);
    }

    public FollowApproveNotice(User user) {
        this.user = user;
    }
}

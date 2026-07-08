package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes29.dex */
public final class DuetNotice {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("from_user_info")
    public final User fromUser;

    @C09CT("to_user_info")
    public final User toUser;

    public DuetNotice(User user, User user2, Aweme aweme) {
        this.fromUser = user;
        this.toUser = user2;
        this.aweme = aweme;
    }
}

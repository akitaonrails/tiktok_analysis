package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes.dex */
public final class DonationNotice {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("from_user")
    public final User user;

    public DonationNotice(Aweme aweme, User user) {
        this.aweme = aweme;
        this.user = user;
    }
}

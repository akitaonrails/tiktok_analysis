package com.ss.android.ugc.aweme.account.profilebadge;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class UserGetResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("user")
    public final User user;

    public UserGetResponse(User user) {
        this.user = user;
    }
}

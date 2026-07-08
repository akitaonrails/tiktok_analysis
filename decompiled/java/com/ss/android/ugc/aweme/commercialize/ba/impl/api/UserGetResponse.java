package com.ss.android.ugc.aweme.commercialize.ba.impl.api;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class UserGetResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("user")
    public final User user;

    public UserGetResponse(User user) {
        this.user = user;
    }
}

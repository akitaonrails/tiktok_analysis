package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightFollowingUserEntry implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("from_follow")
    public final boolean fromFollow;

    @C09CT("red_dot")
    public SkylightFollowingUserRedDot redDot;

    @C09CT("user")
    public User user;

    public final void setRedDot(SkylightFollowingUserRedDot skylightFollowingUserRedDot) {
        this.redDot = skylightFollowingUserRedDot;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public SkylightFollowingUserEntry(User user, SkylightFollowingUserRedDot skylightFollowingUserRedDot, Aweme aweme, boolean z) {
        this.user = user;
        this.redDot = skylightFollowingUserRedDot;
        this.aweme = aweme;
        this.fromFollow = z;
    }
}

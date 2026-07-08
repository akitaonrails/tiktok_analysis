package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes11.dex */
public final class UserWithBlockSource {

    @C09CT("blocking_by_type")
    public int blockingByType;

    @C09CT("user")
    public User user;

    public UserWithBlockSource() {
        this(-1, null);
    }

    public UserWithBlockSource(int i, User user) {
        this.blockingByType = i;
        this.user = user;
    }
}

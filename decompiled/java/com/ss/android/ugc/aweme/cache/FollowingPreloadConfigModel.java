package com.ss.android.ugc.aweme.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class FollowingPreloadConfigModel {

    @C09CT("cache_size_limit")
    public final int cacheSizeLimit;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("user_scope_type")
    public final int userScopeType;

    public FollowingPreloadConfigModel() {
        this(false, 0, -1);
    }

    public FollowingPreloadConfigModel(boolean z, int i, int i2) {
        this.enable = z;
        this.userScopeType = i;
        this.cacheSizeLimit = i2;
    }
}

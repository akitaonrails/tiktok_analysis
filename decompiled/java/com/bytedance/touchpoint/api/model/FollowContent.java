package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowContent {

    @C09CT("user_info")
    public final UserInfo userInfo;

    public FollowContent() {
        this(null);
    }

    public FollowContent(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}

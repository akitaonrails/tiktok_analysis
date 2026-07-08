package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3CommentInputConfig {

    @C09CT("enable_emoji")
    public final boolean enableEmoji;

    @C09CT("expose_strategy")
    public final int exposeStrategy;

    public FriendsV3CommentInputConfig() {
        this(0, false);
    }

    public FriendsV3CommentInputConfig(int i, boolean z) {
        this.exposeStrategy = i;
        this.enableEmoji = z;
    }
}

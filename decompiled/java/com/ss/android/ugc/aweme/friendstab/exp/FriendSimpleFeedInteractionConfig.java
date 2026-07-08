package com.ss.android.ugc.aweme.friendstab.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendSimpleFeedInteractionConfig {

    @C09CT("expose_friend_comments")
    public final int exposeFriendComments;

    @C09CT("expose_message_box")
    public final int exposeMessageBox;

    public FriendSimpleFeedInteractionConfig() {
        this(0, 0);
    }

    public FriendSimpleFeedInteractionConfig(int i, int i2) {
        this.exposeFriendComments = i;
        this.exposeMessageBox = i2;
    }
}

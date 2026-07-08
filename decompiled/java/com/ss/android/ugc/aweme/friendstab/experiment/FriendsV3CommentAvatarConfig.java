package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3CommentAvatarConfig {

    @C09CT("enable_button_background")
    public final boolean enableButtonBackground;

    @C09CT("enable_comment_avatar")
    public final boolean enableCommentAvatar;

    public FriendsV3CommentAvatarConfig() {
        this(false, false);
    }

    public FriendsV3CommentAvatarConfig(boolean z, boolean z2) {
        this.enableButtonBackground = z;
        this.enableCommentAvatar = z2;
    }
}

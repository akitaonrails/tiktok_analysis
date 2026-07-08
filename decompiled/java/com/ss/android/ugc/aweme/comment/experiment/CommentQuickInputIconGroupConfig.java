package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentQuickInputIconGroupConfig implements Serializable {

    @C09CT("fyp_quick_comment_friends_show_icons")
    public final int enableInFypFriends;

    @C09CT("fyp_quick_comment_zero_comment_show_icons")
    public final int enableInFypZeroCommentVideo;

    @C09CT("feed_bottom_comment_show_icons")
    public final int enableInNotFriendOtherFeedPage;

    public CommentQuickInputIconGroupConfig() {
        this(0, 0, 0);
    }

    public CommentQuickInputIconGroupConfig(int i, int i2, int i3) {
        this.enableInFypFriends = i;
        this.enableInFypZeroCommentVideo = i2;
        this.enableInNotFriendOtherFeedPage = i3;
    }
}

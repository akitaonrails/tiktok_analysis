package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C19279710bj;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class InAppPushSetting implements Serializable {
    public static final C19279710bj Companion = new Object() { // from class: X.10bj
    };

    @C09CT("in_app_active_status_push")
    public final int inAppActiveStatusPush;

    @C09CT("in_app_comment_push")
    public final int inAppCommentPush;

    @C09CT("in_app_digg_push")
    public final int inAppDiggPush;

    @C09CT("in_app_follow_push")
    public final int inAppFollowPush;

    @C09CT("in_app_friends_post_push")
    public final int inAppFriendsPostPush;

    @C09CT("in_app_im_push")
    public final int inAppImPush;

    @C09CT("in_app_mention_push")
    public final int inAppMentionPush;

    @C09CT("in_app_other_channel_push")
    public final int inAppOtherPush;

    @C09CT("in_app_profile_viewer_push")
    public final int inAppProfileViewPush;

    public InAppPushSetting(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.inAppDiggPush = i;
        this.inAppCommentPush = i2;
        this.inAppFollowPush = i3;
        this.inAppMentionPush = i4;
        this.inAppImPush = i5;
        this.inAppActiveStatusPush = i6;
        this.inAppOtherPush = i7;
        this.inAppProfileViewPush = i8;
        this.inAppFriendsPostPush = i9;
    }
}

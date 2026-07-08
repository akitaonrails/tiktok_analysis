package com.ss.android.ugc.aweme.relation.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class StackCardConfig {

    @C09CT("new_post_threshold")
    public long newPostThreshold;

    @C09CT("story_avatar")
    public boolean storyAvatar;

    @C09CT("ui_style")
    public int uiStyle;

    public StackCardConfig() {
        this(0, 30L, true);
    }

    public StackCardConfig(int i, long j, boolean z) {
        this.uiStyle = i;
        this.newPostThreshold = j;
        this.storyAvatar = z;
    }
}

package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendRecListRedesignSetting {

    @C09CT("group")
    public int group;

    @C09CT("new_posts_threshold")
    public long newPostsThreshold;

    public FriendRecListRedesignSetting() {
        this(0, 7L);
    }

    public FriendRecListRedesignSetting(int i, long j) {
        this.group = i;
        this.newPostsThreshold = j;
    }
}

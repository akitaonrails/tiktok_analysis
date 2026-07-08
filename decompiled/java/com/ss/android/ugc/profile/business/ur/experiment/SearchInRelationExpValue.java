package com.ss.android.ugc.profile.business.ur.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class SearchInRelationExpValue {

    @C09CT("follower_count_limit")
    public final int followerCountLimit;

    @C09CT("following_count_limit")
    public final int followingCountLimit;

    @C09CT("group")
    public final int group;

    @C09CT("search_result_count")
    public final int searchResultCount;

    public SearchInRelationExpValue(int i, int i2, int i3, int i4) {
        this.group = i;
        this.followingCountLimit = i2;
        this.followerCountLimit = i3;
        this.searchResultCount = i4;
    }
}

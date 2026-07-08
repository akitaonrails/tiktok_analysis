package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class RecUserReverseMUFConfig {

    @C09CT("personal_homepage_following")
    public final ReverseMufConfig disableHomepageFollowing;

    @C09CT("personal_homepage_friends")
    public final ReverseMufConfig disableHomepageFriends;

    @C09CT("inbox_activities")
    public final ReverseMufConfig disableInboxActivities;

    @C09CT("inbox_first_page")
    public final ReverseMufConfig disableInboxFirstPage;

    @C09CT("personal_profile_horizontal")
    public final ReverseMufConfig disablePersonalHorizontal;

    public RecUserReverseMUFConfig() {
        this(new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{true, true}, new int[]{20, 10000}));
    }

    public RecUserReverseMUFConfig(ReverseMufConfig reverseMufConfig, ReverseMufConfig reverseMufConfig2, ReverseMufConfig reverseMufConfig3, ReverseMufConfig reverseMufConfig4, ReverseMufConfig reverseMufConfig5) {
        this.disableInboxFirstPage = reverseMufConfig;
        this.disableInboxActivities = reverseMufConfig2;
        this.disableHomepageFollowing = reverseMufConfig3;
        this.disableHomepageFriends = reverseMufConfig4;
        this.disablePersonalHorizontal = reverseMufConfig5;
    }
}

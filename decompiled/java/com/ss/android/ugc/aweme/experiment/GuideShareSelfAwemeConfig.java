package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class GuideShareSelfAwemeConfig {

    @C09CT("ug_friends_page_guide_share")
    public final int ugFriendsPageGuideShare;

    @C09CT("ug_self_aweme_guide_share_loop_times")
    public final int ugSelfAwemeGuideShareLoopTimes;

    @C09CT("ug_self_aweme_guide_share_play_second")
    public final int ugSelfAwemeGuideSharePlaySecond;

    @C09CT("ug_self_aweme_page_guide_share")
    public final int ugSelfAwemePageGuideShare;

    public GuideShareSelfAwemeConfig() {
        this(0, 0, 0, 0);
    }

    public GuideShareSelfAwemeConfig(int i, int i2, int i3, int i4) {
        this.ugFriendsPageGuideShare = i;
        this.ugSelfAwemePageGuideShare = i2;
        this.ugSelfAwemeGuideShareLoopTimes = i3;
        this.ugSelfAwemeGuideSharePlaySecond = i4;
    }
}

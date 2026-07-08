package com.ss.android.ugc.aweme.social.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowingListFreqParams {

    @C09CT("group")
    public final int group;

    @C09CT("hidden_suggestcard_day")
    public final Integer hideSuggestCardDay;

    @C09CT("unclick_suggestcard_limit")
    public final Integer maxClickSuggestCardCount;

    @C09CT("untoplist_suggestcard_day")
    public final Integer unTopListSuggestCardDay;

    public FollowingListFreqParams() {
        this(2, 7, 30, null);
    }

    public FollowingListFreqParams(int i, Integer num, Integer num2, Integer num3) {
        this.group = i;
        this.maxClickSuggestCardCount = num;
        this.unTopListSuggestCardDay = num2;
        this.hideSuggestCardDay = num3;
    }
}

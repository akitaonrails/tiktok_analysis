package com.ss.android.ugc.aweme.tablet.api.helper.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class PersonalizedFeedTooltipConfig {

    @C09CT("TooltipText")
    public final String tooltipText;

    @C09CT("Type")
    public final int tooltipType;

    public PersonalizedFeedTooltipConfig() {
        this(0, "Recommended feeds based on topics you watch most");
    }

    public PersonalizedFeedTooltipConfig(int i, String str) {
        this.tooltipType = i;
        this.tooltipText = str;
    }
}

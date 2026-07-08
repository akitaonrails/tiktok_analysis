package com.ss.android.ugc.aweme.tablet.api.helper.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class PersonalizedFeedTabConfig {
    public final boolean LIZ;

    @C09CT("EnableRedDot")
    public boolean enableRedDot;

    @C09CT("TopicTextEN")
    public final String eventTrackingTitle;

    @C09CT("TopicText")
    public final String title;

    @C09CT("TopicTextLocale")
    public final String titleLocale;

    @C09CT("TooltipConfig")
    public PersonalizedFeedTooltipConfig tooltip;

    @C09CT("TopicId")
    public final int topicFeedId;

    public PersonalizedFeedTabConfig() {
        this(true, 0, "", "", "", false, null);
    }

    public PersonalizedFeedTabConfig(boolean z, int i, String str, String str2, String str3, boolean z2, PersonalizedFeedTooltipConfig personalizedFeedTooltipConfig) {
        this.LIZ = z;
        this.topicFeedId = i;
        this.title = str;
        this.eventTrackingTitle = str2;
        this.titleLocale = str3;
        this.enableRedDot = z2;
        this.tooltip = personalizedFeedTooltipConfig;
    }
}

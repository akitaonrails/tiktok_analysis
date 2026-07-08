package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedTabConfig {
    public final boolean LIZ;

    @C09CT("event_tracking_name")
    public final String eventTrackingName;

    @C09CT("tab_title")
    public final String title;

    @C09CT("topic_feed_id")
    public final int topicFeedId;

    @C09CT("watched_all_string")
    public final String watchedAllString;

    public TopicFeedTabConfig() {
        this(true, 0, "", "", "");
    }

    public TopicFeedTabConfig(boolean z, int i, String str, String str2, String str3) {
        this.LIZ = z;
        this.topicFeedId = i;
        this.title = str;
        this.eventTrackingName = str2;
        this.watchedAllString = str3;
    }
}

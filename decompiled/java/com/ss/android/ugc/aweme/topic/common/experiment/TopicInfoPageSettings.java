package com.ss.android.ugc.aweme.topic.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class TopicInfoPageSettings {
    public static final DiscoveryTopicCdnSettingModel LIZ = new DiscoveryTopicCdnSettingModel("aweme://lynxview/?hide_nav_bar=1&channel=discovery_topic_book_info&bundle=pages%2Fbook_info%2Ftemplate.js&dynamic=1&group=discovery_topic_book_info", "aweme://lynxview/?hide_nav_bar=1&channel=discovery_topic_info&bundle=pages%2Ftopic_info%2Ftemplate.js&dynamic=1&group=discovery_topic_info");

    public static final class DiscoveryTopicCdnSettingModel {

        @C09CT("book_info_with_cdn_url")
        public final String bookCdnUrl;

        @C09CT("movie_info_with_cdn_url")
        public final String movieCdnUrl;

        public DiscoveryTopicCdnSettingModel() {
            this(null, null);
        }

        public DiscoveryTopicCdnSettingModel(String str, String str2) {
            this.bookCdnUrl = str;
            this.movieCdnUrl = str2;
        }
    }
}

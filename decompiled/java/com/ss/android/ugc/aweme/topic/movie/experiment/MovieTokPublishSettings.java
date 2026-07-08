package com.ss.android.ugc.aweme.topic.movie.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class MovieTokPublishSettings {
    public static final MovieTokPublishSettingsModel LIZ = new MovieTokPublishSettingsModel(null, null);

    public static final class MovieTokPublishSettingsModel {

        @C09CT("keywords")
        public final List<String> keywords;

        @C09CT("max_count_guide_show")
        public final Long maxCountGuideShow;

        public MovieTokPublishSettingsModel() {
            this(null, null);
        }

        public MovieTokPublishSettingsModel(List<String> list, Long l) {
            this.keywords = list;
            this.maxCountGuideShow = l;
        }
    }
}

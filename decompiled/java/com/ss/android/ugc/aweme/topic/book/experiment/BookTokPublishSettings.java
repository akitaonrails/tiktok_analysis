package com.ss.android.ugc.aweme.topic.book.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class BookTokPublishSettings {
    public static final BookTokPublishSettingsModel LIZ = new BookTokPublishSettingsModel(null, null);

    public static final class BookTokPublishSettingsModel {

        @C09CT("keywords")
        public final List<String> keywords;

        @C09CT("max_count_guide_show")
        public final Long maxCountGuideShow;

        public BookTokPublishSettingsModel() {
            this(null, null);
        }

        public BookTokPublishSettingsModel(List<String> list, Long l) {
            this.keywords = list;
            this.maxCountGuideShow = l;
        }
    }
}

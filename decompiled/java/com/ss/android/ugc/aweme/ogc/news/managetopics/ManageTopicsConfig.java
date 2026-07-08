package com.ss.android.ugc.aweme.ogc.news.managetopics;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class ManageTopicsConfig {
    public static final ManageTopicsTitleModel LIZ = new ManageTopicsTitleModel(null, null);

    public static final class ManageTopicsTitleModel {

        @C09CT("desc")
        public final String desc;

        @C09CT("title")
        public final String title;

        public ManageTopicsTitleModel() {
            this(null, null);
        }

        public ManageTopicsTitleModel(String str, String str2) {
            this.title = str;
            this.desc = str2;
        }
    }
}

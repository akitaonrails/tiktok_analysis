package com.ss.android.ugc.aweme.ogc.news.managetopics.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class ManageTopicsCacheConfig {
    public static final ManageTopicsCacheModel LIZ = new ManageTopicsCacheModel(true, 10000);

    public static final class ManageTopicsCacheModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("ttl_ms")
        public final long ttlMs;

        public ManageTopicsCacheModel() {
            this(true, 10000L);
        }

        public ManageTopicsCacheModel(boolean z, long j) {
            this.enable = z;
            this.ttlMs = j;
        }
    }
}

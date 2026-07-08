package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendSessionCacheExp {
    public static final Config LIZ = new Config(null, null);

    public static final class Config {

        @C09CT("poi_rec_session_cache_enable")
        public final Boolean recSessionCacheEnable;

        @C09CT("poi_rec_timeout")
        public final Long recTimeout;

        public Config(Boolean bool, Long l) {
            this.recSessionCacheEnable = bool;
            this.recTimeout = l;
        }
    }
}

package com.ss.android.ugc.aweme.music.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicChartFmpOptV2Settings {
    public static final MusicChartFmpOptV2SettingsConfig LIZ = new MusicChartFmpOptV2SettingsConfig(1800, 3, 3, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(215));

    public static final class MusicChartFmpOptV2SettingsConfig {

        @C09CT("expired_time")
        public final int expiredTime;

        @C09CT("max_preload_cache_size")
        public final int maxPreloadCacheSize;

        @C09CT("max_reuse_cache_size")
        public final int maxReuseCacheSize;

        @C09CT("thread_strategy")
        public final int threadStrategy;

        public MusicChartFmpOptV2SettingsConfig() {
            this(1800, 3, 3, 3);
        }

        public MusicChartFmpOptV2SettingsConfig(int i, int i2, int i3, int i4) {
            this.expiredTime = i;
            this.threadStrategy = i2;
            this.maxPreloadCacheSize = i3;
            this.maxReuseCacheSize = i4;
        }
    }
}

package com.ss.android.ugc.aweme.setting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoMusicDiskCacheOpt {
    public static final AutoMusicDiskCacheConfig LIZ = new AutoMusicDiskCacheConfig(false, 604800000, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(119));

    public static boolean LIZ() {
        return ((AutoMusicDiskCacheConfig) LIZIZ.getValue()).enable;
    }

    public static final class AutoMusicDiskCacheConfig {

        @C09CT("cache_expired_time_ms")
        public final long cacheExpiredTimeMs;

        @C09CT("clean_cache_when_used")
        public final boolean cleanCacheWhenUsed;

        @C09CT("enable")
        public final boolean enable;

        public AutoMusicDiskCacheConfig() {
            this(false, 604800000L, false);
        }

        public AutoMusicDiskCacheConfig(boolean z, long j, boolean z2) {
            this.enable = z;
            this.cacheExpiredTimeMs = j;
            this.cleanCacheWhenUsed = z2;
        }
    }
}

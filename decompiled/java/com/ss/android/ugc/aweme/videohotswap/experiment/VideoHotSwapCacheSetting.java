package com.ss.android.ugc.aweme.videohotswap.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoHotSwapCacheSetting {
    public static final VideoHotSwapCacheConfig LIZ = new VideoHotSwapCacheConfig(2, 2, TimeUnit.MINUTES.toMillis(1), 20);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(243));

    public static final class VideoHotSwapCacheConfig {

        @C09CT("cache_count")
        public final int cacheCount;

        @C09CT("cache_duration")
        public final long expirationInMillis;

        @C09CT("fetch_next_threshold")
        public final int fetchNextThreshold;

        @C09CT("fetch_prev_threshold")
        public final int fetchPrevThreshold;

        public VideoHotSwapCacheConfig(int i, int i2, long j, int i3) {
            this.fetchPrevThreshold = i;
            this.fetchNextThreshold = i2;
            this.expirationInMillis = j;
            this.cacheCount = i3;
        }
    }
}

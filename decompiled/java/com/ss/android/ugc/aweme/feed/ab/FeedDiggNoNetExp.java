package com.ss.android.ugc.aweme.feed.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.C733670SqD;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedDiggNoNetExp {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C733670SqD());

    /* JADX INFO: loaded from: classes28.dex */
    public static final class DiggNoNetConfig {

        @C09CT("cache_expire_hours")
        public final int cacheExpiredHours;

        @C09CT("cache_limit")
        public final int cacheLimitSize;

        @C09CT("delay_request_second")
        public final long delayRequestSecond;

        @C09CT("enable")
        public final int enable;

        @C09CT("retry_count")
        public final int retryCount;

        @C09CT("timeout_second")
        public final long timeoutSecond;

        public DiggNoNetConfig() {
            this(0, 2, 30, 0, -1L, -1L);
        }

        public DiggNoNetConfig(int i, int i2, int i3, int i4, long j, long j2) {
            this.enable = i;
            this.retryCount = i2;
            this.cacheLimitSize = i3;
            this.cacheExpiredHours = i4;
            this.timeoutSecond = j;
            this.delayRequestSecond = j2;
        }
    }

    public static DiggNoNetConfig LIZ() {
        return (DiggNoNetConfig) LIZ.getValue();
    }
}

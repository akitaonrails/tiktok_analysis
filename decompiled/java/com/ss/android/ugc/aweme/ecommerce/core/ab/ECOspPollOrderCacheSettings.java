package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ECOspPollOrderCacheSettings {
    public static final OSPPollOrderCacheConfig LIZ = new OSPPollOrderCacheConfig(false, null);

    public static final class OSPPollOrderCacheConfig {

        @C09CT("expire_duration")
        public final Integer cacheValidTime;

        @C09CT("enable_switch")
        public final boolean enable;

        public OSPPollOrderCacheConfig() {
            this(false, null);
        }

        public OSPPollOrderCacheConfig(boolean z, Integer num) {
            this.enable = z;
            this.cacheValidTime = num;
        }
    }
}

package com.ss.android.ugc.aweme.subscription.subonlyvideos.experiments;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.C717190SBh;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class SubOnlyVideoPaywallCacheConfigSetting {
    public static final PaywallCacheSetting LIZ = new PaywallCacheSetting(TimeUnit.MINUTES.toMillis(5), 15);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C717190SBh());

    public static PaywallCacheSetting LIZ() {
        return (PaywallCacheSetting) LIZIZ.getValue();
    }

    public static final class PaywallCacheSetting {

        @C09CT("cache_count")
        public final int cacheCount;

        @C09CT("expiration_time")
        public final long expirationTimeInMillis;

        public PaywallCacheSetting(long j, int i) {
            this.expirationTimeInMillis = j;
            this.cacheCount = i;
        }
    }
}

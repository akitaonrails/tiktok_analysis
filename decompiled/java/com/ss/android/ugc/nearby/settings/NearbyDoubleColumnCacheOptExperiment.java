package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyDoubleColumnCacheOptExperiment {
    public static final NearbyFirstLoadByCache LIZ = new NearbyFirstLoadByCache(0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(639));

    public static boolean LIZ() {
        return ((NearbyFirstLoadByCache) LIZIZ.getValue()).validSeconds > 0;
    }

    public static final class NearbyFirstLoadByCache {

        @C09CT("valid_seconds")
        public final long validSeconds;

        public NearbyFirstLoadByCache(long j) {
            this.validSeconds = j;
        }
    }
}

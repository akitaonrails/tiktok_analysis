package com.ss.android.ugc.aweme.property;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EnableEffectCleanupOnUsing {
    public static final EffectCleanConfig LIZ = new EffectCleanConfig(false, 2500, 2000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(86));

    public static final class EffectCleanConfig {

        @C09CT("cache_after_clean_mb")
        public final long cacheAfterCleanMb;

        @C09CT("cache_threshold_mb")
        public final long cacheThresholdMb;

        @C09CT("is_open")
        public final boolean isOpen;

        public EffectCleanConfig() {
            this(false, 2500L, 2000L);
        }

        public EffectCleanConfig(boolean z, long j, long j2) {
            this.isOpen = z;
            this.cacheThresholdMb = j;
            this.cacheAfterCleanMb = j2;
        }
    }
}

package com.ss.android.ugc.aweme.setting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EPEffectReadyOpt {
    public static final EffectReadyConfig LIZ = new EffectReadyConfig(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(96));

    public static final class EffectReadyConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("expiration_time")
        public final long expirationTime;

        public EffectReadyConfig() {
            this(false, 0L);
        }

        public EffectReadyConfig(boolean z, long j) {
            this.enable = z;
            this.expirationTime = j;
        }
    }
}

package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class VeMusicStreamTimeoutOpt {
    public static final VeMusicStreamTimeoutOptConfig LIZ = new VeMusicStreamTimeoutOptConfig(false, 10000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(284));

    public static final class VeMusicStreamTimeoutOptConfig {

        @C09CT("is_enable")
        public final boolean isEnable;

        @C09CT("timeout_ms")
        public final long timeoutMs;

        public VeMusicStreamTimeoutOptConfig() {
            this(false, 10000L);
        }

        public VeMusicStreamTimeoutOptConfig(boolean z, long j) {
            this.isEnable = z;
            this.timeoutMs = j;
        }
    }
}

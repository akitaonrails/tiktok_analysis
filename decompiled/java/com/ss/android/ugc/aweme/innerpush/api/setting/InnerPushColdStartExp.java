package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C01GW;
import X.C09CT;
import X.C1565400qq2;
import X.C1E9P;
import X.C1E9Q;
import X.C1E9R;
import X.C1E9S;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushColdStartExp {
    public static final Config LIZ = new Config(0, 0, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1E9S());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1E9Q());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1565400qq2());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1E9P());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1E9R());

    public static boolean LIZ() {
        return ((Boolean) LJFF.getValue()).booleanValue();
    }

    public static final class Config {

        @C09CT("cold_start_delay_seconds")
        public final long coldStartDelaySeconds;

        @C09CT("exp_value")
        public final int expVal;

        @C09CT("skip_video_pull")
        public final boolean skipVideoPull;

        public Config() {
            this(0, 0L, false);
        }

        public Config(int i, long j, boolean z) {
            this.expVal = i;
            this.coldStartDelaySeconds = j;
            this.skipVideoPull = z;
        }
    }
}

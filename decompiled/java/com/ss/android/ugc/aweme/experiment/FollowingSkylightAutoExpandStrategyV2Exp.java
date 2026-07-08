package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingSkylightAutoExpandStrategyV2Exp {
    public static final Config LIZ = new Config(false, 604800);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(118));

    public static final class Config {

        @C09CT("click_threshold")
        public final long clickThreshold;

        @C09CT("enable")
        public final boolean enable;

        public Config() {
            this(false, 604800L);
        }

        public Config(boolean z, long j) {
            this.enable = z;
            this.clickThreshold = j;
        }
    }
}

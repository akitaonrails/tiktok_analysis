package com.ss.android.ugc.aweme.discover.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DiscoveryFpsOptExperiment {
    public static final Config LIZ = new Config(false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(112));

    public static final class Config {

        @C09CT("enable_opt_function")
        public final boolean enable1;

        @C09CT("enable_opt_event_trace")
        public final boolean enable2;

        public Config() {
            this(false, false);
        }

        public Config(boolean z, boolean z2) {
            this.enable1 = z;
            this.enable2 = z2;
        }
    }
}

package com.ss.android.ugc.aweme.discover.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class DiscoveryCommonPoolExperiment {
    public static final DiscoveryCommonPoolExperimentConfig LIZ = new DiscoveryCommonPoolExperimentConfig(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(52));

    public static final class DiscoveryCommonPoolExperimentConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("pool_size")
        public final int poolSize;

        public DiscoveryCommonPoolExperimentConfig() {
            this(false, 16);
        }

        public DiscoveryCommonPoolExperimentConfig(boolean z, int i) {
            this.enable = z;
            this.poolSize = i;
        }
    }
}

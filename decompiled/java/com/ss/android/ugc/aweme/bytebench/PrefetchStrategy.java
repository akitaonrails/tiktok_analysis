package com.ss.android.ugc.aweme.bytebench;

import X.C01GW;
import X.C09CT;
import X.C0C64;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class PrefetchStrategy {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(92));
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(955));
        LIZJ = ((ShootHCPrefetchConfig) c01gwLIZIZ.getValue()).leftPrefetchCount;
        LIZLLL = ((ShootHCPrefetchConfig) c01gwLIZIZ.getValue()).rightPrefetchCount;
    }

    public static final class ShootHCPrefetchConfig {

        @C09CT("enable_prefetch")
        public final boolean enablePrefetch;

        @C09CT("left_prefetch_count")
        public final int leftPrefetchCount;

        @C09CT("right_prefetch_count")
        public final int rightPrefetchCount;

        public ShootHCPrefetchConfig() {
            this(false, 0, 0, 7, null);
        }

        public ShootHCPrefetchConfig(boolean z, int i, int i2) {
            this.enablePrefetch = z;
            this.leftPrefetchCount = i;
            this.rightPrefetchCount = i2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ShootHCPrefetchConfig(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i3 & 1) != 0) {
                if (C0C64.LJIILLIIL().LJIJ(31744, 2, "creative_tools_hc_effects_left_side_prefetch_count", true) <= 0 && C0C64.LJIILLIIL().LJIJ(31744, 2, "creative_tools_hc_effects_right_side_prefetch_count", true) <= 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            this(z, (i3 & 2) != 0 ? C0C64.LJIILLIIL().LJIJ(31744, 2, "creative_tools_hc_effects_left_side_prefetch_count", true) : i, (i3 & 4) != 0 ? C0C64.LJIILLIIL().LJIJ(31744, 2, "creative_tools_hc_effects_right_side_prefetch_count", true) : i2);
        }
    }
}

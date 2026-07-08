package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpInflaterOptExperiment {
    public static final Config LIZ = new Config(false, false, false, false);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(113));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((Config) c01gwLIZIZ.getValue()).useUltimateInflater;
        LIZLLL = ((Config) c01gwLIZIZ.getValue()).mergeInflateTiming;
        LJ = ((Config) c01gwLIZIZ.getValue()).mergeInflateTiming;
        LJFF = ((Config) c01gwLIZIZ.getValue()).useMynaMemoryLeakFix;
    }

    public static final class Config {

        @C09CT("merge_inflate_timing")
        public final boolean mergeInflateTiming;

        @C09CT("use_lazy_status_view")
        public final boolean useLazyStatusView;

        @C09CT("use_myna_memory_leak_fix")
        public final boolean useMynaMemoryLeakFix;

        @C09CT("use_ultimate_inflater")
        public final boolean useUltimateInflater;

        public Config() {
            this(false, false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.useUltimateInflater == config.useUltimateInflater && this.mergeInflateTiming == config.mergeInflateTiming && this.useLazyStatusView == config.useLazyStatusView && this.useMynaMemoryLeakFix == config.useMynaMemoryLeakFix;
        }

        public final int hashCode() {
            return (((((C786410Ut5.Z2(this.useUltimateInflater) * 31) + C786410Ut5.Z2(this.mergeInflateTiming)) * 31) + C786410Ut5.Z2(this.useLazyStatusView)) * 31) + C786410Ut5.Z2(this.useMynaMemoryLeakFix);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(useUltimateInflater=");
            sbLIZ.append(this.useUltimateInflater);
            sbLIZ.append(", mergeInflateTiming=");
            sbLIZ.append(this.mergeInflateTiming);
            sbLIZ.append(", useLazyStatusView=");
            sbLIZ.append(this.useLazyStatusView);
            sbLIZ.append(", useMynaMemoryLeakFix=");
            sbLIZ.append(this.useMynaMemoryLeakFix);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4) {
            this.useUltimateInflater = z;
            this.mergeInflateTiming = z2;
            this.useLazyStatusView = z3;
            this.useMynaMemoryLeakFix = z4;
        }
    }
}

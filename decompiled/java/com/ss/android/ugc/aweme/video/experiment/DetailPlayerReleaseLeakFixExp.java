package com.ss.android.ugc.aweme.video.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class DetailPlayerReleaseLeakFixExp {
    public static final Config LIZ = new Config(false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(287));

    public static final class Config {

        @C09CT("fix_independent_player_release")
        public final boolean fixIndependentPlayerRelease;

        @C09CT("fix_share_player_leak")
        public final boolean fixSharePlayerLeak;

        public Config() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.fixIndependentPlayerRelease == config.fixIndependentPlayerRelease && this.fixSharePlayerLeak == config.fixSharePlayerLeak;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.fixIndependentPlayerRelease) * 31) + C786410Ut5.Z2(this.fixSharePlayerLeak);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(fixIndependentPlayerRelease=");
            sbLIZ.append(this.fixIndependentPlayerRelease);
            sbLIZ.append(", fixSharePlayerLeak=");
            sbLIZ.append(this.fixSharePlayerLeak);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, boolean z2) {
            this.fixIndependentPlayerRelease = z;
            this.fixSharePlayerLeak = z2;
        }
    }
}

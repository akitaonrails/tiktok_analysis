package com.ss.android.ugc.aweme.tako.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoMiddlePageSugClickInterceptExperiment {
    public static final Config LIZ = new Config(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(621));

    public static final class Config {

        @C09CT("enable")
        public final int enable;

        @C09CT("threshold_ms")
        public final int thresholdMs;

        public Config() {
            this(0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && this.thresholdMs == config.thresholdMs;
        }

        public final int hashCode() {
            return (this.enable * 31) + this.thresholdMs;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", thresholdMs=");
            sbLIZ.append(this.thresholdMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, int i2) {
            this.enable = i;
            this.thresholdMs = i2;
        }
    }
}

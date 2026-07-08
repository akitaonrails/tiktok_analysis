package com.ss.android.ugc.aweme.feed.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ColdstartInsertAwemeCarryVideoExperiment {
    public static final Config LIZ = new Config(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(153));

    public static final class Config {

        @C09CT("data_size")
        public final int dataSize;

        @C09CT("enable")
        public final boolean enable;

        public Config() {
            this(false, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && this.dataSize == config.dataSize;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + this.dataSize;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", dataSize=");
            sbLIZ.append(this.dataSize);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, int i) {
            this.enable = z;
            this.dataSize = i;
        }
    }
}

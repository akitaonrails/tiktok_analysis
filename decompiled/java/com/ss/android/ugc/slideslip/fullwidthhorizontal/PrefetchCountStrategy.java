package com.ss.android.ugc.slideslip.fullwidthhorizontal;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PrefetchCountStrategy {
    public static final C01GW LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(602));
        LIZ = c01gwLIZIZ;
        LIZIZ = ((Config) c01gwLIZIZ.getValue()).leftPrefetchCount;
        LIZJ = ((Config) c01gwLIZIZ.getValue()).rightPrefetchCount;
    }

    public static final class Config {

        @C09CT("left_prefetch_count")
        public final int leftPrefetchCount;

        @C09CT("right_prefetch_count")
        public final int rightPrefetchCount;

        public Config() {
            this(1, 1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.leftPrefetchCount == config.leftPrefetchCount && this.rightPrefetchCount == config.rightPrefetchCount;
        }

        public final int hashCode() {
            return (this.leftPrefetchCount * 31) + this.rightPrefetchCount;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(leftPrefetchCount=");
            sbLIZ.append(this.leftPrefetchCount);
            sbLIZ.append(", rightPrefetchCount=");
            sbLIZ.append(this.rightPrefetchCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, int i2) {
            this.leftPrefetchCount = i;
            this.rightPrefetchCount = i2;
        }
    }
}

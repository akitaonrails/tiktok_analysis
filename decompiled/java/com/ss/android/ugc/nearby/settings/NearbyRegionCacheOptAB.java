package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyRegionCacheOptAB {
    public static final NearbyRegionCacheOptConfig LIZ = new NearbyRegionCacheOptConfig(0, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(643));

    public static final class NearbyRegionCacheOptConfig {

        @C09CT("count")
        public final int cacheNum;

        @C09CT("enable")
        public final boolean enableValue;

        public NearbyRegionCacheOptConfig() {
            this(0, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyRegionCacheOptConfig)) {
                return false;
            }
            NearbyRegionCacheOptConfig nearbyRegionCacheOptConfig = (NearbyRegionCacheOptConfig) obj;
            return this.cacheNum == nearbyRegionCacheOptConfig.cacheNum && this.enableValue == nearbyRegionCacheOptConfig.enableValue;
        }

        public final int hashCode() {
            return (this.cacheNum * 31) + C786410Ut5.Z2(this.enableValue);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyRegionCacheOptConfig(cacheNum=");
            sbLIZ.append(this.cacheNum);
            sbLIZ.append(", enableValue=");
            sbLIZ.append(this.enableValue);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyRegionCacheOptConfig(int i, boolean z) {
            this.cacheNum = i;
            this.enableValue = z;
        }
    }
}

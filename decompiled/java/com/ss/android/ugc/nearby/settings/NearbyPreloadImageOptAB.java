package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyPreloadImageOptAB {
    public static final NearbyPreloadImageConfig LIZ = new NearbyPreloadImageConfig(0, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(642));

    public static final class NearbyPreloadImageConfig {

        @C09CT("enable")
        public final boolean enableValue;

        @C09CT("count")
        public final int preloadCount;

        public NearbyPreloadImageConfig() {
            this(0, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyPreloadImageConfig)) {
                return false;
            }
            NearbyPreloadImageConfig nearbyPreloadImageConfig = (NearbyPreloadImageConfig) obj;
            return this.preloadCount == nearbyPreloadImageConfig.preloadCount && this.enableValue == nearbyPreloadImageConfig.enableValue;
        }

        public final int hashCode() {
            return (this.preloadCount * 31) + C786410Ut5.Z2(this.enableValue);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyPreloadImageConfig(preloadCount=");
            sbLIZ.append(this.preloadCount);
            sbLIZ.append(", enableValue=");
            sbLIZ.append(this.enableValue);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyPreloadImageConfig(int i, boolean z) {
            this.preloadCount = i;
            this.enableValue = z;
        }
    }
}

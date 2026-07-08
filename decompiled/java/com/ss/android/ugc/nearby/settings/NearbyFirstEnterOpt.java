package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFirstEnterOpt {
    public static final NearbyFirstEnterOptConfig LIZ = new NearbyFirstEnterOptConfig(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(641));

    public static final class NearbyFirstEnterOptConfig {

        @C09CT("enable")
        public final boolean enableValue;

        @C09CT("count")
        public final int preloadCount;

        public NearbyFirstEnterOptConfig() {
            this(false, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyFirstEnterOptConfig)) {
                return false;
            }
            NearbyFirstEnterOptConfig nearbyFirstEnterOptConfig = (NearbyFirstEnterOptConfig) obj;
            return this.enableValue == nearbyFirstEnterOptConfig.enableValue && this.preloadCount == nearbyFirstEnterOptConfig.preloadCount;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enableValue) * 31) + this.preloadCount;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyFirstEnterOptConfig(enableValue=");
            sbLIZ.append(this.enableValue);
            sbLIZ.append(", preloadCount=");
            sbLIZ.append(this.preloadCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyFirstEnterOptConfig(boolean z, int i) {
            this.enableValue = z;
            this.preloadCount = i;
        }
    }
}

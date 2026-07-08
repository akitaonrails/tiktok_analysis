package com.ss.android.ugc.aweme.commercialize.ucp.impl.ecp.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpForceFallbackToEcpExperiment {
    public static final UcpForceFallbackToEcpExperiment LIZ = new UcpForceFallbackToEcpExperiment();
    public static final UcpForceFallbackToEcpConfig LIZIZ = new UcpForceFallbackToEcpConfig(Boolean.TRUE, "2026-04-08", "fulfillment.address_change,payment.instruments_change,payment.credential");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(964));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(966));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(965));

    public static final class UcpForceFallbackToEcpConfig {

        @C09CT("ec_delegate")
        public final String ecDelegate;

        @C09CT("ec_version")
        public final String ecVersion;

        @C09CT("enable")
        public final Boolean enable;

        public UcpForceFallbackToEcpConfig() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UcpForceFallbackToEcpConfig)) {
                return false;
            }
            UcpForceFallbackToEcpConfig ucpForceFallbackToEcpConfig = (UcpForceFallbackToEcpConfig) obj;
            return Intrinsics.LJFF(this.enable, ucpForceFallbackToEcpConfig.enable) && Intrinsics.LJFF(this.ecVersion, ucpForceFallbackToEcpConfig.ecVersion) && Intrinsics.LJFF(this.ecDelegate, ucpForceFallbackToEcpConfig.ecDelegate);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.ecVersion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ecDelegate;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UcpForceFallbackToEcpConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", ecVersion=");
            sbLIZ.append(this.ecVersion);
            sbLIZ.append(", ecDelegate=");
            sbLIZ.append(this.ecDelegate);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public UcpForceFallbackToEcpConfig(Boolean bool, String str, String str2) {
            this.enable = bool;
            this.ecVersion = str;
            this.ecDelegate = str2;
        }
    }
}

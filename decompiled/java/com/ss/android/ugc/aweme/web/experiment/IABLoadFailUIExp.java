package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IABLoadFailUIExp {
    public static final IABLoadFailUIConfig LIZ = new IABLoadFailUIConfig(false, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(714));

    public static final class IABLoadFailUIConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("load_error_codes")
        public final List<Integer> loadErrorCodes;

        @C09CT("ssl_error_codes")
        public final List<Integer> sslErrorCodes;

        public IABLoadFailUIConfig() {
            this(false, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IABLoadFailUIConfig)) {
                return false;
            }
            IABLoadFailUIConfig iABLoadFailUIConfig = (IABLoadFailUIConfig) obj;
            return this.enable == iABLoadFailUIConfig.enable && Intrinsics.LJFF(this.loadErrorCodes, iABLoadFailUIConfig.loadErrorCodes) && Intrinsics.LJFF(this.sslErrorCodes, iABLoadFailUIConfig.sslErrorCodes);
        }

        public final int hashCode() {
            int iZ2 = C786410Ut5.Z2(this.enable) * 31;
            List<Integer> list = this.loadErrorCodes;
            int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
            List<Integer> list2 = this.sslErrorCodes;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IABLoadFailUIConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", loadErrorCodes=");
            sbLIZ.append(this.loadErrorCodes);
            sbLIZ.append(", sslErrorCodes=");
            sbLIZ.append(this.sslErrorCodes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public IABLoadFailUIConfig(boolean z, List<Integer> list, List<Integer> list2) {
            this.enable = z;
            this.loadErrorCodes = list;
            this.sslErrorCodes = list2;
        }
    }
}

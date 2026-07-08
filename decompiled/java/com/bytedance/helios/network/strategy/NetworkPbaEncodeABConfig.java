package com.bytedance.helios.network.strategy;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkPbaEncodeABConfig {
    public static final PbaEncodeConfig LIZ = new PbaEncodeConfig(false, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(24));

    public static final class PbaEncodeConfig {

        @C09CT("enable_new_pba_encode")
        public final boolean enableNewPbaEncode;

        @C09CT("enable_old_pba_header")
        public final boolean enableOldPbaHeader;

        public PbaEncodeConfig() {
            this(false, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PbaEncodeConfig)) {
                return false;
            }
            PbaEncodeConfig pbaEncodeConfig = (PbaEncodeConfig) obj;
            return this.enableNewPbaEncode == pbaEncodeConfig.enableNewPbaEncode && this.enableOldPbaHeader == pbaEncodeConfig.enableOldPbaHeader;
        }

        public PbaEncodeConfig(boolean z, boolean z2) {
            this.enableNewPbaEncode = z;
            this.enableOldPbaHeader = z2;
        }
    }
}

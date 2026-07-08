package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C01GW;
import X.C09CT;
import X.C1766290w43;
import X.C452501pT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMobSpliceCheckNetworkInterceptSetting {
    public static final EcMobSpliceCheckNetworkInterceptSetting LIZ = new EcMobSpliceCheckNetworkInterceptSetting();
    public static final InterceptSetting LIZIZ = new InterceptSetting(false, 3, 3);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1766290w43());

    public static final class InterceptSetting {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("limitSize")
        public final int limitSize;

        @C09CT("maxCapacity")
        public final int maxCapacity;

        public InterceptSetting() {
            this(false, 3, 3);
        }

        public InterceptSetting(boolean z, int i, int i2) {
            this.enable = z;
            this.maxCapacity = i;
            this.limitSize = i2;
        }
    }
}

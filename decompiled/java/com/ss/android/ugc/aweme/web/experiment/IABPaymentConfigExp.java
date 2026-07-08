package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABPaymentConfigExp {
    public static final IABPaymentConfig LIZ = new IABPaymentConfig(false, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(296));

    public static final class IABPaymentConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("first_regular")
        public final String firstRegulars;

        @C09CT("third_regulars")
        public final String thirdRegulars;

        public IABPaymentConfig() {
            this(false, null, null);
        }

        public IABPaymentConfig(boolean z, String str, String str2) {
            this.enable = z;
            this.thirdRegulars = str;
            this.firstRegulars = str2;
        }
    }
}

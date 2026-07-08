package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECAddressIdentityConfig {
    public static final IdentityConfig LIZ = new IdentityConfig(13, 18, "^[A-Z][AEIOU][A-Z]{2}[0-9]{6}[0-9A-Z]{3}$", "^(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$", "^[A-Z][AEIOU][A-Z]{2}[0-9]{6}[HM][A-Z]{5}[0-9A-Z][0-9]$", "^(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(157));

    public static final class IdentityConfig {

        @C09CT("curp_length")
        public final int curpLength;

        @C09CT("curp_rule_1")
        public final String curpRule1;

        @C09CT("curp_rule_2")
        public final String curpRule2;

        @C09CT("rfc_length")
        public final int rfcLength;

        @C09CT("rfc_rule_1")
        public final String rfcRule1;

        @C09CT("rfc_rule_2")
        public final String rfcRule2;

        public IdentityConfig() {
            this(13, 18, "^[A-Z][AEIOU][A-Z]{2}[0-9]{6}[0-9A-Z]{3}$", "^(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$", "^[A-Z][AEIOU][A-Z]{2}[0-9]{6}[HM][A-Z]{5}[0-9A-Z][0-9]$", "^(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$");
        }

        public IdentityConfig(int i, int i2, String str, String str2, String str3, String str4) {
            this.rfcLength = i;
            this.curpLength = i2;
            this.rfcRule1 = str;
            this.rfcRule2 = str2;
            this.curpRule1 = str3;
            this.curpRule2 = str4;
        }
    }

    public static IdentityConfig LIZ() {
        return (IdentityConfig) LIZIZ.getValue();
    }
}

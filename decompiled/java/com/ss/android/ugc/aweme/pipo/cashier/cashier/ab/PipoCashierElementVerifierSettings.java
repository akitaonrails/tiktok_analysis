package com.ss.android.ugc.aweme.pipo.cashier.cashier.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoCashierElementVerifierSettings {
    public static final PipoCashierElementVerifierConfig LIZ = new PipoCashierElementVerifierConfig(true, true, true, true, true, true, true, true, true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(223));

    public static PipoCashierElementVerifierConfig LIZ() {
        return (PipoCashierElementVerifierConfig) LIZIZ.getValue();
    }

    public static final class PipoCashierElementVerifierConfig {

        @C09CT("billing_city_switch")
        public boolean billingCitySwitch;

        @C09CT("billing_postal_code_switch")
        public boolean billingPostalCodeSwitch;

        @C09CT("billing_state_switch")
        public boolean billingStateSwitch;

        @C09CT("billing_street_switch")
        public boolean billingStreetSwitch;

        @C09CT("card_holder_switch")
        public final boolean cardHolderSwitch;

        @C09CT("card_number_switch")
        public final boolean cardNumberSwitch;

        @C09CT("cvv_switch")
        public final boolean cvvSwitch;

        @C09CT("date_switch")
        public final boolean dateSwitch;

        @C09CT("keyboard_switch")
        public boolean keyboardSwitch;

        @C09CT("luhn_switch")
        public final boolean luhnSwitch;

        @C09CT("main_switch")
        public final boolean mainSwitch;

        public PipoCashierElementVerifierConfig() {
            this(true, true, true, true, true, true, true, true, true, true, true);
        }

        public PipoCashierElementVerifierConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.mainSwitch = z;
            this.cardNumberSwitch = z2;
            this.luhnSwitch = z3;
            this.dateSwitch = z4;
            this.cvvSwitch = z5;
            this.cardHolderSwitch = z6;
            this.keyboardSwitch = z7;
            this.billingStreetSwitch = z8;
            this.billingStateSwitch = z9;
            this.billingCitySwitch = z10;
            this.billingPostalCodeSwitch = z11;
        }
    }
}

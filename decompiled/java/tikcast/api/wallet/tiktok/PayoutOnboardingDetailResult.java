package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class PayoutOnboardingDetailResult {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("confirmed")
        public boolean confirmed;

        @C09CT("default_pi_status")
        public int defaultPiStatus;

        @C09CT("kyc_fail_reason")
        public int kycFailReason;

        @C09CT("kyc_status")
        public int kycStatus;

        @C09CT("masked_instrument_identity")
        public String maskedInstrumentIdentity = "";

        @C09CT("pi_bind_status")
        public int piBindStatus;

        @C09CT("user_tax_status")
        public int userTaxStatus;
    }
}

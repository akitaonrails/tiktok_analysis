package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class UserPaymentStatusResult {

    @C09CT("data")
    public UserPaymentStatusResultData data;

    @C09CT("extra")
    public UserPaymentStatusResultExtra extra;

    public static final class UserPaymentStatusResultData {

        @C09CT("google_billing_program_ecl_available")
        public boolean googleBillingProgramEclAvailable;

        @C09CT("iap_country_code")
        public String iapCountryCode = "";
    }

    public static final class UserPaymentStatusResultExtra {

        @C09CT("error_message")
        public String errorMessage = "";

        @C09CT("status_code")
        public int statusCode;
    }
}

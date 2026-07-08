package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CheckEmailNotificationEligibilityResult {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("eligibility")
        public int eligibility;

        @C09CT("eligibility_user_group")
        public long eligibilityUserGroup;

        @C09CT("email_consent_needed")
        public boolean emailConsentNeeded;

        @C09CT("expiry_date")
        public long expiryDate;

        @C09CT("registration_ab_test_group")
        public long registrationAbTestGroup;
    }
}

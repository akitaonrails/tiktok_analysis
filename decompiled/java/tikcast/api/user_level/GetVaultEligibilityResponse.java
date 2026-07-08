package tikcast.api.user_level;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetVaultEligibilityResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("eligibility_score")
        public long eligibilityScore;

        @C09CT("eligibility_threshold")
        public long eligibilityThreshold;

        @C09CT("is_activated")
        public boolean isActivated;

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("shop_end_ms")
        public long shopEndMs;

        @C09CT("shop_id")
        public String shopId = "";

        @C09CT("shop_start_ms")
        public long shopStartMs;
    }
}

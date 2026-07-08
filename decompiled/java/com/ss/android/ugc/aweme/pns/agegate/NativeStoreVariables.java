package com.ss.android.ugc.aweme.pns.agegate;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NativeStoreVariables {

    @C09CT("age_consent_from_store")
    public final Integer ageConsentFromStore;

    @C09CT("age_threshold")
    public final AgeThreshold ageThreshold;

    @C09CT("did_third_party_age_range_action")
    public final Integer didThirdPartyAgeRangeAction;

    @C09CT("fallback_wait_duration")
    public final Integer fallbackWaitDuration;

    @C09CT("third_party_age_range_action")
    public final Integer thirdPartyAgeRangeAction;

    public NativeStoreVariables(Integer num, Integer num2, AgeThreshold ageThreshold, Integer num3, Integer num4) {
        this.thirdPartyAgeRangeAction = num;
        this.didThirdPartyAgeRangeAction = num2;
        this.ageThreshold = ageThreshold;
        this.ageConsentFromStore = num3;
        this.fallbackWaitDuration = num4;
    }
}

package com.ss.android.ugc.aweme.service.profilerec.model;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class ProfileRecResponse {

    @C09CT("onboarding_profile")
    public final OnboardingProfile profileRecStruct;

    public ProfileRecResponse() {
        this(null);
    }

    public ProfileRecResponse(OnboardingProfile onboardingProfile) {
        this.profileRecStruct = onboardingProfile;
    }
}

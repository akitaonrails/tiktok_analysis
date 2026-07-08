package com.ss.android.ugc.aweme.tako.startup.onboarding.config;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class OnBoardingConfig {

    @C09CT("Dark")
    public final DarkCoverImageUrl darkCoverUrl;

    @C09CT("Label")
    public final Label label;

    @C09CT("LearnMore")
    public final LearnMore learnMore;

    @C09CT("Light")
    public final LightCoverImageUrl lightCoverUrl;

    @C09CT("Shadow")
    public final Shadow shadow;

    public OnBoardingConfig() {
        this(null, null, null, null, null);
    }

    public OnBoardingConfig(DarkCoverImageUrl darkCoverImageUrl, LightCoverImageUrl lightCoverImageUrl, Label label, LearnMore learnMore, Shadow shadow) {
        this.darkCoverUrl = darkCoverImageUrl;
        this.lightCoverUrl = lightCoverImageUrl;
        this.label = label;
        this.learnMore = learnMore;
        this.shadow = shadow;
    }
}

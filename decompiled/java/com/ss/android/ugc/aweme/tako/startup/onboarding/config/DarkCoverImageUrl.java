package com.ss.android.ugc.aweme.tako.startup.onboarding.config;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class DarkCoverImageUrl {

    @C09CT("horizontal_dark_after_feed")
    public final String horizontalDarkAfterFeedUrl;

    @C09CT("horizontal_dark_image_generation_guide")
    public final String horizontalDarkImageGenerationUrl;

    @C09CT("horizontal_dark_experience_decision_menu")
    public final String horizontalDarkMenuUrl;

    @C09CT("horizontal_dark_experience_decision_travel")
    public final String horizontalDarkTravelUrl;

    @C09CT("vertical_dark_after_feed")
    public final String verticalDarkAfterFeedUrl;

    @C09CT("vertical_dark_image_generation_guide")
    public final String verticalDarkImageGenerationUrl;

    @C09CT("vertical_dark_experience_decision_menu")
    public final String verticalDarkMenuUrl;

    @C09CT("vertical_dark_experience_decision_travel")
    public final String verticalDarkTravelUrl;

    public DarkCoverImageUrl() {
        this(null, null, null, null, null, null, null, null);
    }

    public DarkCoverImageUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.horizontalDarkAfterFeedUrl = str;
        this.horizontalDarkImageGenerationUrl = str2;
        this.horizontalDarkMenuUrl = str3;
        this.horizontalDarkTravelUrl = str4;
        this.verticalDarkAfterFeedUrl = str5;
        this.verticalDarkImageGenerationUrl = str6;
        this.verticalDarkMenuUrl = str7;
        this.verticalDarkTravelUrl = str8;
    }
}

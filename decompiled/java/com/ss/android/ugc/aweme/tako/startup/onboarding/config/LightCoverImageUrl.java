package com.ss.android.ugc.aweme.tako.startup.onboarding.config;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class LightCoverImageUrl {

    @C09CT("horizontal_light_after_feed")
    public final String horizontalLightAfterFeedUrl;

    @C09CT("horizontal_light_image_generation_guide")
    public final String horizontalLightImageGenerationUrl;

    @C09CT("horizontal_light_experience_decision_menu")
    public final String horizontalLightMenuUrl;

    @C09CT("horizontal_light_experience_decision_travel")
    public final String horizontalLightTravelUrl;

    @C09CT("vertical_light_after_feed")
    public final String verticalLightAfterFeedUrl;

    @C09CT("vertical_light_image_generation_guide")
    public final String verticalLightImageGenerationUrl;

    @C09CT("vertical_light_experience_decision_menu")
    public final String verticalLightMenuUrl;

    @C09CT("vertical_light_experience_decision_travel")
    public final String verticalLightTravelUrl;

    public LightCoverImageUrl() {
        this(null, null, null, null, null, null, null, null);
    }

    public LightCoverImageUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.horizontalLightAfterFeedUrl = str;
        this.horizontalLightImageGenerationUrl = str2;
        this.horizontalLightMenuUrl = str3;
        this.horizontalLightTravelUrl = str4;
        this.verticalLightAfterFeedUrl = str5;
        this.verticalLightImageGenerationUrl = str6;
        this.verticalLightMenuUrl = str7;
        this.verticalLightTravelUrl = str8;
    }
}

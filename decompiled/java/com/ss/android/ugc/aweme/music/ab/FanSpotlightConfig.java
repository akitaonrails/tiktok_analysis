package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightConfig {
    public static final int $stable = 0;

    @C09CT("fan_spotlight_guide_image_url")
    public final String fanSpotlightGuideImageUrl = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/pldpoznuhpq/fan_spotlight_light_mode.png";

    @C09CT("fan_spotlight_guide_image_url_for_dark_mode")
    public final String fanSpotlightGuideImageUrlForDarkMode = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/pldpoznuhpq/fan_spotlight_dark_mode.png";

    public final String getFanSpotlightGuideImageUrl() {
        return this.fanSpotlightGuideImageUrl;
    }

    public final String getFanSpotlightGuideImageUrlForDarkMode() {
        return this.fanSpotlightGuideImageUrlForDarkMode;
    }
}

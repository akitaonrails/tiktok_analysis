package com.ss.android.ugc.aweme.socialavatar.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SAEffectSettingResponse {

    @C09CT("effect_header_background_dark_url")
    public final String effectHeaderBackgroundDarkUrl;

    @C09CT("effect_header_background_light_url")
    public final String effectHeaderBackgroundLightUrl;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("effect_popup_placeholder_url")
    public final String effectPopupPlaceholderUrl;

    @C09CT("effect_resource_id")
    public final String effectResourceId;

    @C09CT("generation_estimation_minute")
    public final Integer generationEstimationMinute;

    @C09CT("hexagon_background_dark")
    public final String hexagonBackgroundDark;

    @C09CT("hexagon_background_light")
    public final String hexagonBackgroundLight;

    @C09CT("hexagon_mask")
    public final String hexagonMask;

    public SAEffectSettingResponse() {
        this("https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hero_header_image_dark.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hero_header_image_light.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/avatar_effect_placeholder.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hexagon_background_dark.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hexagon_background_light.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hexagon_mask.webp", 1, "3840318771", "7605722708004835857");
    }

    public SAEffectSettingResponse(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        this.effectHeaderBackgroundDarkUrl = str;
        this.effectHeaderBackgroundLightUrl = str2;
        this.effectPopupPlaceholderUrl = str3;
        this.hexagonBackgroundDark = str4;
        this.hexagonBackgroundLight = str5;
        this.hexagonMask = str6;
        this.generationEstimationMinute = num;
        this.effectId = str7;
        this.effectResourceId = str8;
    }
}

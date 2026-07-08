package com.ss.android.ugc.aweme.im.sticker.api.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class IMSocialAvatarIntroImageAssetCDNConfigData {

    @C09CT("intro_dark_mode_cdn_url")
    public final String introDarkModeCDNUrl;

    @C09CT("intro_light_mode_cdn_url")
    public final String introLightModeCDNUrl;

    public IMSocialAvatarIntroImageAssetCDNConfigData() {
        this("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/default_light.webp", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/default_dark.webp");
    }

    public IMSocialAvatarIntroImageAssetCDNConfigData(String str, String str2) {
        this.introLightModeCDNUrl = str;
        this.introDarkModeCDNUrl = str2;
    }
}

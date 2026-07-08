package com.ss.android.ugc.aweme.im.sticker.api.socialavatar;

import X.C09CT;
import X.C435330H5f;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarImageAssetCDNConfigSettings;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarSettingsConfig {

    @C09CT("aimoji_sunsetting_hero_image_url")
    public final String aiMojiSunsettingHeroImageUrl;

    @C09CT("get_api_creation_in_progress_ttl")
    public final long aimojiInProgressRefreshTtl;

    @C09CT("aimoji_ttl")
    public final long aimojiRefreshTll;

    @C09CT("get_api_not_created_ttl")
    public final long appStartNotCreatedRefreshTtl;

    @C09CT("create_yours_image_dark_url")
    public final String createYoursImageDarkUrl;

    @C09CT("create_yours_image_url")
    public final String createYoursImageUrl;

    @C09CT("create_yours_on_story_image_url")
    public final String createYoursOnStoryImageUrl;

    @C09CT("hero_image_url")
    public final String heroImageUrl;

    @C09CT("share_center_expression")
    public final String shareCenterExpression;

    @C09CT("share_left_expression")
    public final String shareLeftExpression;

    @C09CT("share_right_expression")
    public final String shareRightExpression;

    @C09CT("social_avatar_icon_url")
    public final String socialAvatarIconUrl;

    public SocialAvatarSettingsConfig() {
        this(TimeUnit.HOURS.toMillis(1L), TimeUnit.SECONDS.toMillis(1L), TimeUnit.HOURS.toMillis(24L), "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/social-avatar-bighero.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/soclai-avatar-small-light.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/soclai-avatar-small-dark.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/social-avatar-story-3.png", "hi", "lol", "shocked", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/social-avatar-icon.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/sa_hero_image.png");
    }

    public final String LIZ() {
        if (C435330H5f.LIZ()) {
            String strLIZ = SocialAvatarImageAssetCDNConfigSettings.LIZ("social_avatar_icon_img");
            if (strLIZ != null) {
                return strLIZ;
            }
        } else {
            String str = this.socialAvatarIconUrl;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public SocialAvatarSettingsConfig(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.appStartNotCreatedRefreshTtl = j;
        this.aimojiInProgressRefreshTtl = j2;
        this.aimojiRefreshTll = j3;
        this.heroImageUrl = str;
        this.createYoursImageUrl = str2;
        this.createYoursImageDarkUrl = str3;
        this.createYoursOnStoryImageUrl = str4;
        this.shareCenterExpression = str5;
        this.shareLeftExpression = str6;
        this.shareRightExpression = str7;
        this.socialAvatarIconUrl = str8;
        this.aiMojiSunsettingHeroImageUrl = str9;
    }
}

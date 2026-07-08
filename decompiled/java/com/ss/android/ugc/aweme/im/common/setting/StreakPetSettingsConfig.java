package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetSettingsConfig {

    @C09CT("action_bar_icon_url")
    public final String actionBarIconUrl;

    @C09CT("assemble_delay_on_android")
    public final long assembleDelay;

    @C09CT("fallback_active_url")
    public final String fallbackActiveUrl;

    @C09CT("fallback_detect_duration")
    public final long fallbackDetectDuration;

    @C09CT("fallback_grey_url")
    public final String fallbackGreyUrl;

    @C09CT("fallback_group_active_url")
    public final String fallbackGroupActiveUrl;

    @C09CT("fallback_group_grey_url")
    public final String fallbackGroupGreyUrl;

    @C09CT("streak_pet_uid_abtest_fetch_enable_enter_chat")
    public final boolean fetchStreakPetExpInfoEnterChat;

    @C09CT("streak_pet_uid_abtest_fetch_frequency_control_when_cold_start")
    public final long fetchStreakPetExpInfoInboxInterval;

    @C09CT("streak_group_hatching_pet_share_invite_at_animation_url")
    public final String streakGroupHatchingPetShareUrl;

    @C09CT("streak_group_hatching_share_panel_bg")
    public final String streakGroupHatchingSharePanelBg;

    @C09CT("streak_group_hatching_share_panel_bg_dark")
    public final String streakGroupHatchingSharePanelBgDark;

    @C09CT("streak_pet_share_invite_at_animation_url")
    public final String streakPetShareInviteAtAnimationUrl;

    @C09CT("widget_schema")
    public final String widgetSchema;

    public StreakPetSettingsConfig() {
        this(true, 86400000L, 10000L, 1500L, "aweme://lynxview?surl=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2F7%2Fgecko%2Fresource%2Ftiktok_im_streak_pet%2Fwidget%2Ftemplate.js&use_spark=1&gecko_url_redirection=1&use_forest=1&bdhm_bid=tiktok_im_streak_pet&bdhm_pid=streak_pet_widget&channel=tiktok_im_streak_pet&bundle=widget%2Ftemplate.js&self_adaptive_height=1&enable_canvas=1&enable_canvas_optimize=1", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource/mt_dm_streak_common_resource/streak_pet_ac_icon.png", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource/mt_dm_streak_common_resource/streak_pet_widget_active_fallback.png", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource/mt_dm_streak_common_resource/streak_pet_widget_grey_fallback.png", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource/mt_dm_streak_common_resource/streak_pet_widget_active_fallback.png", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource/mt_dm_streak_common_resource/streak_pet_widget_grey_fallback.png", "https://sf-teko-source.tiktokcdn-eu.com/obj/tiktok-teko-source-euttp/10/teko/resource/mt_dm_streak_common_resource/dm_streak_pet/egg_share_panel_animation.json", "https://sf-teko-source.tiktokcdn-eu.com/obj/tiktok-teko-internal-euttp/7/teko/resource/mt_dm_streak_common_resource/dm_streak_pet/streak_group_hatching_share_panel_bg.jpeg", "https://sf-teko-source.tiktokcdn-eu.com/obj/tiktok-teko-internal-euttp/7/teko/resource/mt_dm_streak_common_resource/dm_streak_pet/streak_group_hatching_share_panel_bg_dark.jpeg", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/mt_dm_streak_common_resource/dm_streak_pet/group_streak_pet_hatching_share_panel_animation.json");
    }

    public StreakPetSettingsConfig(boolean z, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.fetchStreakPetExpInfoEnterChat = z;
        this.fetchStreakPetExpInfoInboxInterval = j;
        this.fallbackDetectDuration = j2;
        this.assembleDelay = j3;
        this.widgetSchema = str;
        this.actionBarIconUrl = str2;
        this.fallbackActiveUrl = str3;
        this.fallbackGreyUrl = str4;
        this.fallbackGroupActiveUrl = str5;
        this.fallbackGroupGreyUrl = str6;
        this.streakPetShareInviteAtAnimationUrl = str7;
        this.streakGroupHatchingSharePanelBg = str8;
        this.streakGroupHatchingSharePanelBgDark = str9;
        this.streakGroupHatchingPetShareUrl = str10;
    }
}

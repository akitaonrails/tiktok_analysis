package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class AdaptExpConfig {
    public static final TypeAdapter ADAPTER = new AdaptExpConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("adapt_badge_downgrade")
    public boolean adaptBadgeDowngrade;

    @C09CT("adapt_banner_expand_downgrade")
    public boolean adaptBannerExpandDowngrade;

    @C09CT("adapt_disable_alog")
    public boolean adaptDisableAlog;

    @C09CT("adapt_disable_apm_log")
    public boolean adaptDisableApmLog;

    @C09CT("adapt_public_screen_emoji_message_downgrade")
    public boolean adaptEmojiMessageDowngrade;

    @C09CT("adapt_epi_downgrade")
    public boolean adaptEpiDowngrade;

    @C09CT("adapt_like_count_refresh_interval")
    public boolean adaptLikeCountRefreshInterval;

    @C09CT("adapt_live_gift_downgrade")
    public boolean adaptLiveGiftDowngrade;

    @C09CT("adapt_live_match_downgrade")
    public boolean adaptLiveMatchDowngrade;

    @C09CT("adapt_rank_anim_disable")
    public boolean adaptRankAnimDisable;

    @C09CT("adapt_rank_anim_interval")
    public boolean adaptRankAnimInterval;

    @C09CT("adapt_screen_brightness_downgrade")
    public boolean adaptScreenBrightnessDowngrade;

    @C09CT("adapt_voice_wave_downgrade")
    public boolean adaptVoiceWaveDowngrade;

    @C09CT("adapt_wish_list_downgrade")
    public boolean adaptWishListDowngrade;

    @C09CT("advanced_message_downgrade")
    public boolean advacedMessageDowngrade;

    @C09CT("brightness_downgrade_target")
    public float brightnessDowngradeTarget;

    @C09CT("brightness_downgrade_upper")
    public int brightnessDowngradeUpper;

    @C09CT("adapt_comment_combo_tray_anim")
    public boolean enableCommentComboTrayAnim;

    @C09CT("adapt_like_anim_anchor_downgrade")
    public boolean enableLikeAnimAnchorDowngrade;

    @C09CT("adapt_like_anim_audience_downgrade")
    public boolean enableLikeAnimAudienceDowngrade;

    @C09CT("adapt_like_progress_anim")
    public boolean enableLikeProgressAnim;

    @C09CT("adapt_live_player_downgrade")
    public boolean enableLivePlayerDowngrade;

    @C09CT("adapt_live_survey")
    public boolean enableLiveSurvey;

    @C09CT("adapt_online_audience_refresh_interval")
    public boolean enableOnlineAudienceRefreshInterval;

    @C09CT("adapt_public_screen_anim")
    public boolean enablePublicScreenAnim;

    @C09CT("adapt_public_screen_fading_edge")
    public boolean enablePublicScreenFadingEdge;

    @C09CT("adapt_public_screen_first_message_interval")
    public boolean enablePublicScreenFirstMsgInterval;

    @C09CT("adapt_public_screen_message_limit")
    public boolean enablePublicScreenMessageLimit;

    @C09CT("adapt_public_screen_refresh_interval")
    public boolean enablePublicScreenRefreshInterval;

    @C09CT("adapt_room_sticker")
    public boolean enableRoomSticker;

    @C09CT("adapt_short_touch_anim")
    public boolean enableShortTouchAnim;

    @C09CT("gift_tray_combo_downgrade")
    public boolean giftTrayComboDowngrade;

    @C09CT("like_count_refresh_interval")
    public long likeCountRefreshInterval;

    @C09CT("online_audience_refresh_interval")
    public long onlineAudienceRefreshInterval;

    @C09CT("public_screen_refresh_interval")
    public int publicScreenRefreshInterval;

    @C09CT("public_screen_refresh_map")
    public Map<String, Float> publicScreenRefreshMap;

    @C09CT("rank_anim_interval")
    public long rankAnimInterval;

    @C09CT("wish_list_downgrade_delay")
    public long wishListDowngradeDelay;

    public AdaptExpConfig() {
        this(false, false, false, false, false, false, false, false, false, false, 0, false, 2L, false, false, false, 2L, false, false, false, 2000L, false, false, false, false, false, false, Mp4ScreenVideoLoadTimeout.CONTROL, false, 80, 0.6f, false, false, false, false, C2097608Jq.LJ(), false, false);
    }

    public final boolean getAdaptBadgeDowngrade() {
        return this.adaptBadgeDowngrade;
    }

    public final boolean getAdaptBannerExpandDowngrade() {
        return this.adaptBannerExpandDowngrade;
    }

    public final boolean getAdaptDisableAlog() {
        return this.adaptDisableAlog;
    }

    public final boolean getAdaptDisableApmLog() {
        return this.adaptDisableApmLog;
    }

    public final boolean getAdaptEmojiMessageDowngrade() {
        return this.adaptEmojiMessageDowngrade;
    }

    public final boolean getAdaptEpiDowngrade() {
        return this.adaptEpiDowngrade;
    }

    public final boolean getAdaptLikeCountRefreshInterval() {
        return this.adaptLikeCountRefreshInterval;
    }

    public final boolean getAdaptLiveGiftDowngrade() {
        return this.adaptLiveGiftDowngrade;
    }

    public final boolean getAdaptLiveMatchDowngrade() {
        return this.adaptLiveMatchDowngrade;
    }

    public final boolean getAdaptRankAnimDisable() {
        return this.adaptRankAnimDisable;
    }

    public final boolean getAdaptRankAnimInterval() {
        return this.adaptRankAnimInterval;
    }

    public final boolean getAdaptScreenBrightnessDowngrade() {
        return this.adaptScreenBrightnessDowngrade;
    }

    public final boolean getAdaptVoiceWaveDowngrade() {
        return this.adaptVoiceWaveDowngrade;
    }

    public final boolean getAdaptWishListDowngrade() {
        return this.adaptWishListDowngrade;
    }

    public final boolean getAdvacedMessageDowngrade() {
        return this.advacedMessageDowngrade;
    }

    public final float getBrightnessDowngradeTarget() {
        return this.brightnessDowngradeTarget;
    }

    public final int getBrightnessDowngradeUpper() {
        return this.brightnessDowngradeUpper;
    }

    public final boolean getEnableCommentComboTrayAnim() {
        return this.enableCommentComboTrayAnim;
    }

    public final boolean getEnableLikeAnimAnchorDowngrade() {
        return this.enableLikeAnimAnchorDowngrade;
    }

    public final boolean getEnableLikeAnimAudienceDowngrade() {
        return this.enableLikeAnimAudienceDowngrade;
    }

    public final boolean getEnableLikeProgressAnim() {
        return this.enableLikeProgressAnim;
    }

    public final boolean getEnableLivePlayerDowngrade() {
        return this.enableLivePlayerDowngrade;
    }

    public final boolean getEnableLiveSurvey() {
        return this.enableLiveSurvey;
    }

    public final boolean getEnableOnlineAudienceRefreshInterval() {
        return this.enableOnlineAudienceRefreshInterval;
    }

    public final boolean getEnablePublicScreenAnim() {
        return this.enablePublicScreenAnim;
    }

    public final boolean getEnablePublicScreenFadingEdge() {
        return this.enablePublicScreenFadingEdge;
    }

    public final boolean getEnablePublicScreenFirstMsgInterval() {
        return this.enablePublicScreenFirstMsgInterval;
    }

    public final boolean getEnablePublicScreenMessageLimit() {
        return this.enablePublicScreenMessageLimit;
    }

    public final boolean getEnablePublicScreenRefreshInterval() {
        return this.enablePublicScreenRefreshInterval;
    }

    public final boolean getEnableRoomSticker() {
        return this.enableRoomSticker;
    }

    public final boolean getEnableShortTouchAnim() {
        return this.enableShortTouchAnim;
    }

    public final boolean getGiftTrayComboDowngrade() {
        return this.giftTrayComboDowngrade;
    }

    public final long getLikeCountRefreshInterval() {
        return this.likeCountRefreshInterval;
    }

    public final long getOnlineAudienceRefreshInterval() {
        return this.onlineAudienceRefreshInterval;
    }

    public final int getPublicScreenRefreshInterval() {
        return this.publicScreenRefreshInterval;
    }

    public final Map<String, Float> getPublicScreenRefreshMap() {
        return this.publicScreenRefreshMap;
    }

    public final long getRankAnimInterval() {
        return this.rankAnimInterval;
    }

    public final long getWishListDowngradeDelay() {
        return this.wishListDowngradeDelay;
    }

    public final void setAdaptBadgeDowngrade(boolean z) {
        this.adaptBadgeDowngrade = z;
    }

    public final void setAdaptBannerExpandDowngrade(boolean z) {
        this.adaptBannerExpandDowngrade = z;
    }

    public final void setAdaptDisableAlog(boolean z) {
        this.adaptDisableAlog = z;
    }

    public final void setAdaptDisableApmLog(boolean z) {
        this.adaptDisableApmLog = z;
    }

    public final void setAdaptEmojiMessageDowngrade(boolean z) {
        this.adaptEmojiMessageDowngrade = z;
    }

    public final void setAdaptEpiDowngrade(boolean z) {
        this.adaptEpiDowngrade = z;
    }

    public final void setAdaptLikeCountRefreshInterval(boolean z) {
        this.adaptLikeCountRefreshInterval = z;
    }

    public final void setAdaptLiveGiftDowngrade(boolean z) {
        this.adaptLiveGiftDowngrade = z;
    }

    public final void setAdaptLiveMatchDowngrade(boolean z) {
        this.adaptLiveMatchDowngrade = z;
    }

    public final void setAdaptRankAnimDisable(boolean z) {
        this.adaptRankAnimDisable = z;
    }

    public final void setAdaptRankAnimInterval(boolean z) {
        this.adaptRankAnimInterval = z;
    }

    public final void setAdaptScreenBrightnessDowngrade(boolean z) {
        this.adaptScreenBrightnessDowngrade = z;
    }

    public final void setAdaptVoiceWaveDowngrade(boolean z) {
        this.adaptVoiceWaveDowngrade = z;
    }

    public final void setAdaptWishListDowngrade(boolean z) {
        this.adaptWishListDowngrade = z;
    }

    public final void setAdvacedMessageDowngrade(boolean z) {
        this.advacedMessageDowngrade = z;
    }

    public final void setBrightnessDowngradeTarget(float f) {
        this.brightnessDowngradeTarget = f;
    }

    public final void setBrightnessDowngradeUpper(int i) {
        this.brightnessDowngradeUpper = i;
    }

    public final void setEnableCommentComboTrayAnim(boolean z) {
        this.enableCommentComboTrayAnim = z;
    }

    public final void setEnableLikeAnimAnchorDowngrade(boolean z) {
        this.enableLikeAnimAnchorDowngrade = z;
    }

    public final void setEnableLikeAnimAudienceDowngrade(boolean z) {
        this.enableLikeAnimAudienceDowngrade = z;
    }

    public final void setEnableLikeProgressAnim(boolean z) {
        this.enableLikeProgressAnim = z;
    }

    public final void setEnableLivePlayerDowngrade(boolean z) {
        this.enableLivePlayerDowngrade = z;
    }

    public final void setEnableLiveSurvey(boolean z) {
        this.enableLiveSurvey = z;
    }

    public final void setEnableOnlineAudienceRefreshInterval(boolean z) {
        this.enableOnlineAudienceRefreshInterval = z;
    }

    public final void setEnablePublicScreenAnim(boolean z) {
        this.enablePublicScreenAnim = z;
    }

    public final void setEnablePublicScreenFadingEdge(boolean z) {
        this.enablePublicScreenFadingEdge = z;
    }

    public final void setEnablePublicScreenFirstMsgInterval(boolean z) {
        this.enablePublicScreenFirstMsgInterval = z;
    }

    public final void setEnablePublicScreenMessageLimit(boolean z) {
        this.enablePublicScreenMessageLimit = z;
    }

    public final void setEnablePublicScreenRefreshInterval(boolean z) {
        this.enablePublicScreenRefreshInterval = z;
    }

    public final void setEnableRoomSticker(boolean z) {
        this.enableRoomSticker = z;
    }

    public final void setEnableShortTouchAnim(boolean z) {
        this.enableShortTouchAnim = z;
    }

    public final void setGiftTrayComboDowngrade(boolean z) {
        this.giftTrayComboDowngrade = z;
    }

    public final void setLikeCountRefreshInterval(long j) {
        this.likeCountRefreshInterval = j;
    }

    public final void setOnlineAudienceRefreshInterval(long j) {
        this.onlineAudienceRefreshInterval = j;
    }

    public final void setPublicScreenRefreshInterval(int i) {
        this.publicScreenRefreshInterval = i;
    }

    public final void setPublicScreenRefreshMap(Map<String, Float> map) {
        this.publicScreenRefreshMap = map;
    }

    public final void setRankAnimInterval(long j) {
        this.rankAnimInterval = j;
    }

    public final void setWishListDowngradeDelay(long j) {
        this.wishListDowngradeDelay = j;
    }

    public AdaptExpConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, boolean z11, long j, boolean z12, boolean z13, boolean z14, long j2, boolean z15, boolean z16, boolean z17, long j3, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, long j4, boolean z24, int i2, float f, boolean z25, boolean z26, boolean z27, boolean z28, Map<String, Float> map, boolean z29, boolean z30) {
        this.enablePublicScreenFadingEdge = z;
        this.enablePublicScreenAnim = z2;
        this.enablePublicScreenRefreshInterval = z3;
        this.enablePublicScreenFirstMsgInterval = z4;
        this.enablePublicScreenMessageLimit = z5;
        this.enableShortTouchAnim = z6;
        this.enableCommentComboTrayAnim = z7;
        this.enableLikeProgressAnim = z8;
        this.enableLiveSurvey = z9;
        this.enableRoomSticker = z10;
        this.publicScreenRefreshInterval = i;
        this.enableOnlineAudienceRefreshInterval = z11;
        this.onlineAudienceRefreshInterval = j;
        this.adaptDisableAlog = z12;
        this.adaptDisableApmLog = z13;
        this.adaptLikeCountRefreshInterval = z14;
        this.likeCountRefreshInterval = j2;
        this.adaptLiveGiftDowngrade = z15;
        this.adaptLiveMatchDowngrade = z16;
        this.adaptRankAnimInterval = z17;
        this.rankAnimInterval = j3;
        this.adaptRankAnimDisable = z18;
        this.enableLikeAnimAudienceDowngrade = z19;
        this.enableLikeAnimAnchorDowngrade = z20;
        this.enableLivePlayerDowngrade = z21;
        this.adaptBannerExpandDowngrade = z22;
        this.adaptWishListDowngrade = z23;
        this.wishListDowngradeDelay = j4;
        this.adaptScreenBrightnessDowngrade = z24;
        this.brightnessDowngradeUpper = i2;
        this.brightnessDowngradeTarget = f;
        this.adaptVoiceWaveDowngrade = z25;
        this.adaptBadgeDowngrade = z26;
        this.adaptEmojiMessageDowngrade = z27;
        this.adaptEpiDowngrade = z28;
        this.publicScreenRefreshMap = map;
        this.giftTrayComboDowngrade = z29;
        this.advacedMessageDowngrade = z30;
    }
}

package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ScalableDowngradeConfig {
    public static final TypeAdapter ADAPTER = new ScalableDowngradeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disable_alog")
    public boolean disableAlog;

    @C09CT("disable_apm_log")
    public boolean disableApmLog;

    @C09CT("disable_banner")
    public boolean disableBanner;

    @C09CT("disable_gift_notify_anim")
    public boolean disableGiftNotifyAnim;

    @C09CT("disable_gift_tray_anim")
    public boolean disableGiftTrayAnim;

    @C09CT("disable_other_like_anim")
    public boolean disableOtherLikeAnim;

    @C09CT("disable_public_screen_avatar_preload")
    public boolean disablePublicAvatarPreload;

    @C09CT("disable_public_screen_anim")
    public boolean disablePublicScreenAnim;

    @C09CT("disable_public_screen_fading_edge")
    public boolean disablePublicScreenFadingEdge;

    @C09CT("disable_self_like")
    public boolean disableSelfLike;

    @C09CT("down_refer_type")
    public int downReferType;

    @C09CT("downgradeByScoreInterval")
    public int downgradeByScoreInterval;

    @C09CT("hot_temperature")
    public int hotTemperature;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("level_serious_fps")
    public int levelSeriousFps;

    @C09CT("level_serious_fps_end")
    public int levelSeriousFpsEnd;

    @C09CT("level_serious_fps_start")
    public int levelSeriousFpsStart;

    @C09CT("msg_qps_heavy")
    public int msgQpsHeavy;

    @C09CT("online_audience_refresh_interval")
    public long onlineAudienceRefreshInterval;

    @C09CT("progressive_downgrade_config")
    public ProgressiveDowngradeConfig progressiveDowngradeConfig;

    @C09CT("progressive_downgrade_enable")
    public boolean progressiveDowngradeEnable;

    @C09CT("progressive_upgrade")
    public boolean progressiveUpgrade;

    @C09CT("public_screen_anim_recover")
    public boolean publicScreenAnimRecover;

    @C09CT("public_screen_refresh_interval")
    public int publicScreenRefreshInterval;

    @C09CT("rank_entry_anim_loop_interval_ms")
    public long rankEntryAnimLoopIntervalMs;

    @C09CT("upgrade_interval_ms")
    public long upgradeIntervalMs;

    @C09CT("user_info_like_count_update_interval_ms")
    public long userInfoLikeCountUpdateIntervalMs;

    public ScalableDowngradeConfig() {
        this(false, 0, false, false, false, 2000, false, false, false, false, false, false, 0L, 0L, false, false, 2L, 43, 21, 30, 10, 10, 60000L, true, 1, false, new ProgressiveDowngradeConfig(40.0f, 60.0f));
    }

    public final boolean getDisableAlog() {
        return this.disableAlog;
    }

    public final boolean getDisableApmLog() {
        return this.disableApmLog;
    }

    public final boolean getDisableBanner() {
        return this.disableBanner;
    }

    public final boolean getDisableGiftNotifyAnim() {
        return this.disableGiftNotifyAnim;
    }

    public final boolean getDisableGiftTrayAnim() {
        return this.disableGiftTrayAnim;
    }

    public final boolean getDisableOtherLikeAnim() {
        return this.disableOtherLikeAnim;
    }

    public final boolean getDisablePublicAvatarPreload() {
        return this.disablePublicAvatarPreload;
    }

    public final boolean getDisablePublicScreenAnim() {
        return this.disablePublicScreenAnim;
    }

    public final boolean getDisablePublicScreenFadingEdge() {
        return this.disablePublicScreenFadingEdge;
    }

    public final boolean getDisableSelfLike() {
        return this.disableSelfLike;
    }

    public final int getDownReferType() {
        return this.downReferType;
    }

    public final int getDowngradeByScoreInterval() {
        return this.downgradeByScoreInterval;
    }

    public final int getHotTemperature() {
        return this.hotTemperature;
    }

    public final int getLevelSeriousFps() {
        return this.levelSeriousFps;
    }

    public final int getLevelSeriousFpsEnd() {
        return this.levelSeriousFpsEnd;
    }

    public final int getLevelSeriousFpsStart() {
        return this.levelSeriousFpsStart;
    }

    public final int getMsgQpsHeavy() {
        return this.msgQpsHeavy;
    }

    public final long getOnlineAudienceRefreshInterval() {
        return this.onlineAudienceRefreshInterval;
    }

    public final ProgressiveDowngradeConfig getProgressiveDowngradeConfig() {
        return this.progressiveDowngradeConfig;
    }

    public final boolean getProgressiveDowngradeEnable() {
        return this.progressiveDowngradeEnable;
    }

    public final boolean getProgressiveUpgrade() {
        return this.progressiveUpgrade;
    }

    public final boolean getPublicScreenAnimRecover() {
        return this.publicScreenAnimRecover;
    }

    public final int getPublicScreenRefreshInterval() {
        return this.publicScreenRefreshInterval;
    }

    public final long getRankEntryAnimLoopIntervalMs() {
        return this.rankEntryAnimLoopIntervalMs;
    }

    public final long getUpgradeIntervalMs() {
        return this.upgradeIntervalMs;
    }

    public final long getUserInfoLikeCountUpdateIntervalMs() {
        return this.userInfoLikeCountUpdateIntervalMs;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setDisableAlog(boolean z) {
        this.disableAlog = z;
    }

    public final void setDisableApmLog(boolean z) {
        this.disableApmLog = z;
    }

    public final void setDisableBanner(boolean z) {
        this.disableBanner = z;
    }

    public final void setDisableGiftNotifyAnim(boolean z) {
        this.disableGiftNotifyAnim = z;
    }

    public final void setDisableGiftTrayAnim(boolean z) {
        this.disableGiftTrayAnim = z;
    }

    public final void setDisableOtherLikeAnim(boolean z) {
        this.disableOtherLikeAnim = z;
    }

    public final void setDisablePublicAvatarPreload(boolean z) {
        this.disablePublicAvatarPreload = z;
    }

    public final void setDisablePublicScreenAnim(boolean z) {
        this.disablePublicScreenAnim = z;
    }

    public final void setDisablePublicScreenFadingEdge(boolean z) {
        this.disablePublicScreenFadingEdge = z;
    }

    public final void setDisableSelfLike(boolean z) {
        this.disableSelfLike = z;
    }

    public final void setDownReferType(int i) {
        this.downReferType = i;
    }

    public final void setDowngradeByScoreInterval(int i) {
        this.downgradeByScoreInterval = i;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setHotTemperature(int i) {
        this.hotTemperature = i;
    }

    public final void setLevelSeriousFps(int i) {
        this.levelSeriousFps = i;
    }

    public final void setLevelSeriousFpsEnd(int i) {
        this.levelSeriousFpsEnd = i;
    }

    public final void setLevelSeriousFpsStart(int i) {
        this.levelSeriousFpsStart = i;
    }

    public final void setMsgQpsHeavy(int i) {
        this.msgQpsHeavy = i;
    }

    public final void setOnlineAudienceRefreshInterval(long j) {
        this.onlineAudienceRefreshInterval = j;
    }

    public final void setProgressiveDowngradeConfig(ProgressiveDowngradeConfig progressiveDowngradeConfig) {
        this.progressiveDowngradeConfig = progressiveDowngradeConfig;
    }

    public final void setProgressiveDowngradeEnable(boolean z) {
        this.progressiveDowngradeEnable = z;
    }

    public final void setProgressiveUpgrade(boolean z) {
        this.progressiveUpgrade = z;
    }

    public final void setPublicScreenAnimRecover(boolean z) {
        this.publicScreenAnimRecover = z;
    }

    public final void setPublicScreenRefreshInterval(int i) {
        this.publicScreenRefreshInterval = i;
    }

    public final void setRankEntryAnimLoopIntervalMs(long j) {
        this.rankEntryAnimLoopIntervalMs = j;
    }

    public final void setUpgradeIntervalMs(long j) {
        this.upgradeIntervalMs = j;
    }

    public final void setUserInfoLikeCountUpdateIntervalMs(long j) {
        this.userInfoLikeCountUpdateIntervalMs = j;
    }

    public ScalableDowngradeConfig(boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, long j, long j2, boolean z11, boolean z12, long j3, int i3, int i4, int i5, int i6, int i7, long j4, boolean z13, int i8, boolean z14, ProgressiveDowngradeConfig progressiveDowngradeConfig) {
        this.isEnabled = z;
        this.downReferType = i;
        this.disablePublicScreenAnim = z2;
        this.disablePublicScreenFadingEdge = z3;
        this.publicScreenAnimRecover = z4;
        this.publicScreenRefreshInterval = i2;
        this.disablePublicAvatarPreload = z5;
        this.disableOtherLikeAnim = z6;
        this.disableBanner = z7;
        this.disableAlog = z8;
        this.disableApmLog = z9;
        this.disableSelfLike = z10;
        this.rankEntryAnimLoopIntervalMs = j;
        this.userInfoLikeCountUpdateIntervalMs = j2;
        this.disableGiftTrayAnim = z11;
        this.disableGiftNotifyAnim = z12;
        this.onlineAudienceRefreshInterval = j3;
        this.hotTemperature = i3;
        this.levelSeriousFpsStart = i4;
        this.levelSeriousFpsEnd = i5;
        this.levelSeriousFps = i6;
        this.msgQpsHeavy = i7;
        this.upgradeIntervalMs = j4;
        this.progressiveUpgrade = z13;
        this.downgradeByScoreInterval = i8;
        this.progressiveDowngradeEnable = z14;
        this.progressiveDowngradeConfig = progressiveDowngradeConfig;
    }
}

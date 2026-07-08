package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("hot_room_scalable_downgrade")
public final class ScalableDowngradeSetting {
    public static volatile boolean isDisableLog;
    public static final ScalableDowngradeSetting INSTANCE = new ScalableDowngradeSetting();
    public static final ScalableDowngradeConfig DEFAULT = new ScalableDowngradeConfig(false, 0, false, false, false, 2000, false, false, false, false, false, false, 0, 0, false, false, 2, 43, 21, 30, 10, 10, 60000, true, 1, false, new ProgressiveDowngradeConfig(40.0f, 60.0f));

    public static final int downReferType() {
        return INSTANCE.getConfig().getDownReferType();
    }

    private final ScalableDowngradeConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ScalableDowngradeConfig scalableDowngradeConfig = DEFAULT;
        ScalableDowngradeConfig scalableDowngradeConfig2 = (ScalableDowngradeConfig) settingsManager.getValueSafely("hot_room_scalable_downgrade", scalableDowngradeConfig);
        return scalableDowngradeConfig2 != null ? scalableDowngradeConfig2 : scalableDowngradeConfig;
    }

    public static final int getDowngradeByScoreInterval() {
        return INSTANCE.getConfig().getDowngradeByScoreInterval();
    }

    public static final ProgressiveDowngradeConfig getProgressiveDowngradeConfig() {
        return INSTANCE.getConfig().getProgressiveDowngradeConfig();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().isEnabled();
    }

    public static final boolean isProgressiveDowngradeEnable() {
        return INSTANCE.getConfig().getProgressiveDowngradeEnable();
    }

    public static final boolean disableAlog() {
        return isEnabled() && INSTANCE.getConfig().getDisableAlog() && isDisableLog;
    }

    public static final boolean disableApmLog() {
        return isEnabled() && INSTANCE.getConfig().getDisableApmLog() && isDisableLog;
    }

    public static final boolean disableBanner() {
        return isEnabled() && INSTANCE.getConfig().getDisableBanner();
    }

    public static final boolean disableGiftNotifyAnim() {
        return isEnabled() && INSTANCE.getConfig().getDisableGiftNotifyAnim();
    }

    public static final boolean disableGiftTrayAnim() {
        return isEnabled() && INSTANCE.getConfig().getDisableGiftTrayAnim();
    }

    public static final boolean disableOtherLikeAnim() {
        return isEnabled() && INSTANCE.getConfig().getDisableOtherLikeAnim();
    }

    public static final boolean disablePublicScreenAnimAndFadingEdge() {
        return isEnabled() && INSTANCE.getConfig().getDisablePublicScreenAnim();
    }

    public static final boolean disablePublicScreenAvatarPreload() {
        return isEnabled() && INSTANCE.getConfig().getDisablePublicAvatarPreload();
    }

    public static final boolean disablePublicScreenFadingEdge() {
        return isEnabled() && INSTANCE.getConfig().getDisablePublicScreenFadingEdge();
    }

    public static final boolean disableSelfLike() {
        return isEnabled() && INSTANCE.getConfig().getDisableSelfLike();
    }

    public static final boolean enablePublicScreenAnimRecover() {
        return isEnabled() && INSTANCE.getConfig().getPublicScreenAnimRecover();
    }

    public static final long getRankEntranceLoopIntervalMs() {
        if (isEnabled()) {
            return INSTANCE.getConfig().getRankEntryAnimLoopIntervalMs();
        }
        return 0L;
    }

    public static final long getUserInfoLikeCountUpdateIntervalMs() {
        if (isEnabled()) {
            return INSTANCE.getConfig().getUserInfoLikeCountUpdateIntervalMs();
        }
        return 0L;
    }

    public final int hotTemperature() {
        return getConfig().getHotTemperature();
    }

    public final int levelCriticalFps() {
        return getConfig().getLevelSeriousFps();
    }

    public final int levelSeriousFpsEnd() {
        return getConfig().getLevelSeriousFpsEnd();
    }

    public final int levelSeriousFpsStart() {
        return getConfig().getLevelSeriousFpsStart();
    }

    public final int msgQpsHeavy() {
        return getConfig().getMsgQpsHeavy();
    }

    public final boolean progressiveUpgrade() {
        return getConfig().getProgressiveUpgrade();
    }

    public final long upgradeIntervalMs() {
        return getConfig().getUpgradeIntervalMs();
    }

    public final boolean isDisableLog() {
        return isDisableLog;
    }

    public static final long getOnlineAudienceRefreshInterval(long j) {
        if (isEnabled()) {
            return INSTANCE.getConfig().getOnlineAudienceRefreshInterval();
        }
        return j;
    }

    public static final int getPublicScreenRefreshInterval(int i) {
        if (isEnabled()) {
            ScalableDowngradeSetting scalableDowngradeSetting = INSTANCE;
            if (scalableDowngradeSetting.getConfig().getPublicScreenRefreshInterval() > 2000) {
                return scalableDowngradeSetting.getConfig().getPublicScreenRefreshInterval();
            }
            return i;
        }
        return i;
    }

    public final void setDisableLog(boolean z) {
        isDisableLog = z;
    }
}

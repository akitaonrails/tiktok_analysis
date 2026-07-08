package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_card_smooth_exit_config")
public final class LiveCadSmoothExitSetting {
    public static final LiveCadSmoothExitSetting INSTANCE = new LiveCadSmoothExitSetting();
    public static final LiveCardSmoothExitConfig DEFAULT = new LiveCardSmoothExitConfig(false, 300, 0);

    private final LiveCardSmoothExitConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveCardSmoothExitConfig liveCardSmoothExitConfig = DEFAULT;
        LiveCardSmoothExitConfig liveCardSmoothExitConfig2 = (LiveCardSmoothExitConfig) settingsManager.getValueSafely("live_card_smooth_exit_config", liveCardSmoothExitConfig);
        return liveCardSmoothExitConfig2 != null ? liveCardSmoothExitConfig2 : liveCardSmoothExitConfig;
    }

    public final boolean enable() {
        return getSettingValue().enable;
    }

    public final long getPreviewCardDuration() {
        LiveCardSmoothExitConfig settingValue = getSettingValue();
        if (settingValue.enable) {
            return settingValue.previewCardDuration;
        }
        return 0L;
    }

    public final long getRoomExitDuration() {
        if (getSettingValue().enable) {
            return getSettingValue().roomExitDuration;
        }
        return 0L;
    }
}

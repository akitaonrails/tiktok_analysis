package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_about_me_merge")
public final class LiveAboutMeMergeSetting {
    public static final LiveAboutMeMergeSetting INSTANCE = new LiveAboutMeMergeSetting();
    public static final LiveAboutMeMergeConfig DEFAULT = new LiveAboutMeMergeConfig("", "", "", "", "");

    public static final String urlFullscreen() {
        return INSTANCE.getSettingValue().urlFullscreen;
    }

    public static final String urlPopup() {
        return INSTANCE.getSettingValue().urlPopup;
    }

    public static final String urlPopupLiveSheet() {
        return INSTANCE.getSettingValue().urlPopupLiveSheet;
    }

    public static final String urlUpgradePopup() {
        return INSTANCE.getSettingValue().urlUpgradePopup;
    }

    public static final String urlUpgradePopupLiveSheet() {
        return INSTANCE.getSettingValue().urlUpgradePopupLiveSheet;
    }

    public final LiveAboutMeMergeConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveAboutMeMergeConfig liveAboutMeMergeConfig = DEFAULT;
        LiveAboutMeMergeConfig liveAboutMeMergeConfig2 = (LiveAboutMeMergeConfig) settingsManager.getValueSafely("live_about_me_merge", liveAboutMeMergeConfig);
        return liveAboutMeMergeConfig2 != null ? liveAboutMeMergeConfig2 : liveAboutMeMergeConfig;
    }
}

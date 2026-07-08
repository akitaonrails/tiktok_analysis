package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_screenshot_share")
public final class ScreenshotSharePanelSetting {
    public static final int DEFAULT = 0;
    public static final ScreenshotSharePanelSetting INSTANCE = new ScreenshotSharePanelSetting();

    public final boolean enableV1() {
        return SettingsManager.INSTANCE.getIntValue("live_screenshot_share", DEFAULT) == 1;
    }

    public final boolean enableV2() {
        return SettingsManager.INSTANCE.getIntValue("live_screenshot_share", DEFAULT) == 2;
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_screenshot_share", DEFAULT) != 0;
    }
}

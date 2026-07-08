package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_screenshot_interval")
public final class VirtualSexualScreenshotIntervalSetting {
    public static final long DEFAULT = 3000;
    public static final VirtualSexualScreenshotIntervalSetting INSTANCE = new VirtualSexualScreenshotIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("virtual_sexual_screenshot_interval", DEFAULT);
    }
}

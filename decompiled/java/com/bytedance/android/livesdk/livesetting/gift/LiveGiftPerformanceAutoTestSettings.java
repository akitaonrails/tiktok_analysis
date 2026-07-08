package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("gift_test_automation_api_enabled")
public final class LiveGiftPerformanceAutoTestSettings {
    public static final int DEFAULT = 0;
    public static final LiveGiftPerformanceAutoTestSettings INSTANCE = new LiveGiftPerformanceAutoTestSettings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gift_test_automation_api_enabled", DEFAULT);
    }
}

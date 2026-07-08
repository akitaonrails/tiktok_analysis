package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_setting_style")
public final class LiveLongPressOptimizedSettings {
    public static final LiveLongPressOptimizedSettings INSTANCE = new LiveLongPressOptimizedSettings();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_setting_style", DEFAULT);

    public static final boolean enable() {
        return value > 0;
    }
}

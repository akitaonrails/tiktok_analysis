package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_new_framework")
public final class LiveShortTouchNewFrameworkSetting {
    public static final LiveShortTouchNewFrameworkSetting INSTANCE = new LiveShortTouchNewFrameworkSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_short_touch_new_framework", DEFAULT);

    public final boolean enableNewFramework() {
        return value;
    }
}

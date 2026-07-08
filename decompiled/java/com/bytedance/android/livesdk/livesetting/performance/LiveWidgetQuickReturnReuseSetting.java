package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_widget_quick_return_reuse")
public final class LiveWidgetQuickReturnReuseSetting {
    public static final LiveWidgetQuickReturnReuseSetting INSTANCE = new LiveWidgetQuickReturnReuseSetting();
    public static final QuickReturnConfig DEFAULT = new QuickReturnConfig();

    private final QuickReturnConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        QuickReturnConfig quickReturnConfig = DEFAULT;
        QuickReturnConfig quickReturnConfig2 = (QuickReturnConfig) settingsManager.getValueSafely("live_widget_quick_return_reuse", quickReturnConfig);
        return quickReturnConfig2 != null ? quickReturnConfig2 : quickReturnConfig;
    }

    public final boolean enable() {
        return !getValue().whitelist.isEmpty();
    }

    public final long getDelayMillis() {
        return ((long) getValue().delaySeconds) * 1000;
    }

    public final boolean isInWhitelist(Class<?> cls) {
        return getValue().whitelist.contains(cls.getSimpleName());
    }
}

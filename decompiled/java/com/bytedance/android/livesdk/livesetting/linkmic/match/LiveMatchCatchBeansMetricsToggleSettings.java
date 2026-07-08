package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_catch_beans_event_tracking")
public final class LiveMatchCatchBeansMetricsToggleSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatchCatchBeansMetricsToggleSettings INSTANCE = new LiveMatchCatchBeansMetricsToggleSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_catch_beans_event_tracking", DEFAULT);
    }
}

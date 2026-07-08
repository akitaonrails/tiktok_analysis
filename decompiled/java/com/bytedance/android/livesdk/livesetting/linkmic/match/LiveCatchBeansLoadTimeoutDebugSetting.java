package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_catch_beans_load_timeout_mock")
public final class LiveCatchBeansLoadTimeoutDebugSetting {
    public static final int DEFAULT = 1;
    public static final LiveCatchBeansLoadTimeoutDebugSetting INSTANCE = new LiveCatchBeansLoadTimeoutDebugSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("live_catch_beans_load_timeout_mock", DEFAULT) == 1;
    }
}

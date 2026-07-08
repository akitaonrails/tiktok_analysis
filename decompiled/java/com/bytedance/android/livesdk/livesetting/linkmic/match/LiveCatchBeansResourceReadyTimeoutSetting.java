package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_catch_beans_game_ready_timeout")
public final class LiveCatchBeansResourceReadyTimeoutSetting {
    public static final LiveCatchBeansResourceReadyTimeoutSetting INSTANCE = new LiveCatchBeansResourceReadyTimeoutSetting();
    public static final long DEFAULT = 15;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_catch_beans_game_ready_timeout", DEFAULT);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}

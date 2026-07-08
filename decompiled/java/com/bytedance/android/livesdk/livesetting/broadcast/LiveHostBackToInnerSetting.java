package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_host_back_to_inner")
public final class LiveHostBackToInnerSetting {
    public static final HostBackToInnerConfig DEFAULT;
    public static final LiveHostBackToInnerSetting INSTANCE = new LiveHostBackToInnerSetting();
    public static final HostBackToInnerConfig config;

    static {
        HostBackToInnerConfig hostBackToInnerConfig = new HostBackToInnerConfig(false, false, 1000L);
        DEFAULT = hostBackToInnerConfig;
        config = (HostBackToInnerConfig) SettingsManager.INSTANCE.getValueSafely("live_host_back_to_inner", hostBackToInnerConfig);
    }

    public final long autoDrawDelay() {
        return config.getAutoDrawDelay();
    }

    public final boolean enableAutoDraw() {
        return config.getEnableAutoDraw();
    }

    public final boolean enableOpt() {
        return config.getEnableOpt();
    }
}

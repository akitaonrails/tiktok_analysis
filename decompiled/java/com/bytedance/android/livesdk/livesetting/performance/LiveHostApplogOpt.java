package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_host_applog_opt")
public final class LiveHostApplogOpt {
    public static final LiveHostApplogOpt INSTANCE = new LiveHostApplogOpt();
    public static final LiveHostApplogOptConfig DEFAULT = new LiveHostApplogOptConfig();

    public static final long getOptTime() {
        return ((LiveHostApplogOptConfig) SettingsManager.INSTANCE.getValueSafely("live_host_applog_opt", new LiveHostApplogOptConfig())).optTime;
    }

    public static final boolean isCacheEnabled() {
        LiveHostApplogOpt liveHostApplogOpt = INSTANCE;
        return liveHostApplogOpt.getStatus() == 1 || liveHostApplogOpt.getStatus() == 3;
    }

    public static final boolean isEnabled() {
        return INSTANCE.getStatus() != 0;
    }

    public static final boolean isTransactionEnabled() {
        LiveHostApplogOpt liveHostApplogOpt = INSTANCE;
        return liveHostApplogOpt.getStatus() == 2 || liveHostApplogOpt.getStatus() == 3;
    }

    public final LiveHostApplogOptConfig getValue() {
        return (LiveHostApplogOptConfig) SettingsManager.INSTANCE.getValueSafely("live_host_applog_opt", new LiveHostApplogOptConfig());
    }

    public final int getStatus() {
        return getValue().status;
    }
}

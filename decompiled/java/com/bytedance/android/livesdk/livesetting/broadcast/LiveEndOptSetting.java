package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_end_opt_setting")
public final class LiveEndOptSetting {
    public static final LiveEndOptSetting INSTANCE = new LiveEndOptSetting();
    public static final LiveEndOptConfig DEFAULT = new LiveEndOptConfig(0, 500);

    private final LiveEndOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveEndOptConfig liveEndOptConfig = DEFAULT;
        LiveEndOptConfig liveEndOptConfig2 = (LiveEndOptConfig) settingsManager.getValueSafely("live_end_opt_setting", liveEndOptConfig);
        return liveEndOptConfig2 != null ? liveEndOptConfig2 : liveEndOptConfig;
    }

    public final boolean enableLiveEndOpt() {
        return getValue().enableLiveEndOpt == 1;
    }

    public final long getLiveEndTimeout() {
        return getValue().liveEndTimeout;
    }
}

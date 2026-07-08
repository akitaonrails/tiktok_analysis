package com.bytedance.android.livesdk.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_stream_strategy_pre_init_app_info_budle")
public final class LiveStreamPreInitAppInfoBundleSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamPreInitAppInfoBundleSetting INSTANCE = new LiveStreamPreInitAppInfoBundleSetting();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_strategy_pre_init_app_info_budle", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = true, value = "live_harmony_os_disable_pip")
public final class LiveHarmonyOSDisablePipSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHarmonyOSDisablePipSetting INSTANCE = new LiveHarmonyOSDisablePipSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_harmony_os_disable_pip", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_triones_monitor_config")
public final class LinkMicRustMonitorConfigSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicRustMonitorConfigSetting INSTANCE = new LinkMicRustMonitorConfigSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_triones_monitor_config", DEFAULT);
    }

    public final boolean canReport() {
        return getValue();
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_mode_switch_rust_fix")
public final class LinkMicModeSwitchRustFixSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicModeSwitchRustFixSetting INSTANCE = new LinkMicModeSwitchRustFixSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_mode_switch_rust_fix", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "enable_multiguest_enter_veplugin_guard")
public final class MultiGuestEnterVEPluginGuardSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestEnterVEPluginGuardSetting INSTANCE = new MultiGuestEnterVEPluginGuardSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_multiguest_enter_veplugin_guard", DEFAULT);
    }
}

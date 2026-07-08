package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_opt_get_settings")
public final class MultiGuestOptGetSettingsSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestOptGetSettingsSetting INSTANCE = new MultiGuestOptGetSettingsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_opt_get_settings", DEFAULT);
    }
}

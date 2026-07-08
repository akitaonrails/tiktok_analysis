package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_plugin_properties_init_anr_setting")
public final class LivePluginPropertiesInitANRSetting {
    public static final boolean DEFAULT = false;
    public static final LivePluginPropertiesInitANRSetting INSTANCE = new LivePluginPropertiesInitANRSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_static_log", LiveStaticLogOptSetting.DEFAULT);
    }
}

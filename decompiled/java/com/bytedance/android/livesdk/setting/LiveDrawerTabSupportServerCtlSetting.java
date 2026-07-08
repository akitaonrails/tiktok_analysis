package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_tab_support_server_ctl")
public final class LiveDrawerTabSupportServerCtlSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDrawerTabSupportServerCtlSetting INSTANCE = new LiveDrawerTabSupportServerCtlSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drawer_tab_support_server_ctl", DEFAULT);
    }
}

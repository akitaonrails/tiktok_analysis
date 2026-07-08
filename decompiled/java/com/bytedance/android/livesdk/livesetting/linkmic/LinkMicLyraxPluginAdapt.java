package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_linkmic_lyrax_plugin_adapt")
public final class LinkMicLyraxPluginAdapt {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final LinkMicLyraxPluginAdapt INSTANCE = new LinkMicLyraxPluginAdapt();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_linkmic_lyrax_plugin_adapt", DEFAULT);
    }
}

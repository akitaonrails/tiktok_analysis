package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_opt_kibana_log")
public final class LinkMicRustOptKibanaLog {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustOptKibanaLog INSTANCE = new LinkMicRustOptKibanaLog();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_opt_kibana_log", DEFAULT);
    }
}

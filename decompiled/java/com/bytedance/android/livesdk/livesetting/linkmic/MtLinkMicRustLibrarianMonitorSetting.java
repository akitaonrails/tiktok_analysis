package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_plugin_so_result")
public final class MtLinkMicRustLibrarianMonitorSetting {
    public static final boolean DEFAULT = true;
    public static final MtLinkMicRustLibrarianMonitorSetting INSTANCE = new MtLinkMicRustLibrarianMonitorSetting();

    public static final boolean enableReport() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_plugin_so_result", DEFAULT);
    }
}

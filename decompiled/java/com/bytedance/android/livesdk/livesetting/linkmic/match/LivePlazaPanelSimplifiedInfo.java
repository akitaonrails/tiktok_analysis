package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_enable_simplifed_playmode_info")
public final class LivePlazaPanelSimplifiedInfo {
    public static final boolean DEFAULT = false;
    public static final LivePlazaPanelSimplifiedInfo INSTANCE = new LivePlazaPanelSimplifiedInfo();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_simplifed_playmode_info", DEFAULT);
    }
}

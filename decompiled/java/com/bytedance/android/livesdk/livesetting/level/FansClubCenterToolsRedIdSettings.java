package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_tools_red_hot_id")
public final class FansClubCenterToolsRedIdSettings {
    public static final String DEFAULT = "";
    public static final FansClubCenterToolsRedIdSettings INSTANCE = new FansClubCenterToolsRedIdSettings();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_center_tools_red_hot_id", DEFAULT);
    }
}

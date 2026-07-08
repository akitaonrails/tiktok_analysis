package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_user_management_panel_schema")
public final class LiveCoHostUserManagementPanelSchemaSetting {
    public static final LiveCoHostUserManagementPanelSchemaSetting INSTANCE = new LiveCoHostUserManagementPanelSchemaSetting();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=enlarge_cohost";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_cohost_user_management_panel_schema", DEFAULT);
    }
}

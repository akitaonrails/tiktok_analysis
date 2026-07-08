package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_playbook_mock_resource_id_setting")
public final class LivePlaybookMockResourceIdSetting {
    public static final String DEFAULT = "";
    public static final LivePlaybookMockResourceIdSetting INSTANCE = new LivePlaybookMockResourceIdSetting();

    public final String getResourceId() {
        return SettingsManager.INSTANCE.getStringValue("live_playbook_mock_resource_id_setting", DEFAULT);
    }
}

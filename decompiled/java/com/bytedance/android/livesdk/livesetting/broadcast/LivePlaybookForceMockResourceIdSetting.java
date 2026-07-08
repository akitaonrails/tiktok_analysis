package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_playbook_force_mock_resource_id_setting")
public final class LivePlaybookForceMockResourceIdSetting {
    public static final boolean DEFAULT = false;
    public static final LivePlaybookForceMockResourceIdSetting INSTANCE = new LivePlaybookForceMockResourceIdSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_playbook_force_mock_resource_id_setting", DEFAULT);
    }
}

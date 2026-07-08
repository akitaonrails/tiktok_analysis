package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_status_diagnostics_perf_config_android")
public final class LiveAnchorStatusDiagnosticsPerfConfigAndroidSetting {
    public static final LiveAnchorStatusDiagnosticsPerfConfigAndroidSetting INSTANCE = new LiveAnchorStatusDiagnosticsPerfConfigAndroidSetting();
    public static final LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig DEFAULT = new LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig(null, null, null);

    public final LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig getValue() {
        LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig liveAnchorStatusDiagnosticsPerfConfigAndroidConfig = (LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig) SettingsManager.INSTANCE.getValueSafely(LiveAnchorStatusDiagnosticsPerfConfigAndroidSetting.class);
        return liveAnchorStatusDiagnosticsPerfConfigAndroidConfig == null ? DEFAULT : liveAnchorStatusDiagnosticsPerfConfigAndroidConfig;
    }
}

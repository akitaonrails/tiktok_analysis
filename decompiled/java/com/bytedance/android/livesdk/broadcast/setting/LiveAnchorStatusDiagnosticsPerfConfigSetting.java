package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_status_diagnostics_perf_config")
public final class LiveAnchorStatusDiagnosticsPerfConfigSetting {
    public static final LiveAnchorStatusDiagnosticsPerfConfigSetting INSTANCE = new LiveAnchorStatusDiagnosticsPerfConfigSetting();
    public static final LiveAnchorStatusDiagnosticsPerfConfig DEFAULT = new LiveAnchorStatusDiagnosticsPerfConfig(0.4d, 0.7d, 0.5d, 0.8d, 2000, 500, 40.0d, 43.0d, 15);

    public final LiveAnchorStatusDiagnosticsPerfConfig getValue() {
        LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig = (LiveAnchorStatusDiagnosticsPerfConfig) SettingsManager.INSTANCE.getValueSafely(LiveAnchorStatusDiagnosticsPerfConfigSetting.class);
        return liveAnchorStatusDiagnosticsPerfConfig == null ? DEFAULT : liveAnchorStatusDiagnosticsPerfConfig;
    }
}

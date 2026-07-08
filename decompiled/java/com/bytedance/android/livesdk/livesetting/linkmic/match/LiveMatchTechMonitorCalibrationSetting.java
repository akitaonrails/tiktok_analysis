package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_tech_monitor_calibration")
public final class LiveMatchTechMonitorCalibrationSetting {
    public static final LiveMatchTechMonitorCalibrationSetting INSTANCE = new LiveMatchTechMonitorCalibrationSetting();
    public static final MatchTechMonitorConfig DEFAULT = new MatchTechMonitorConfig(true, true, true);

    public final MatchTechMonitorConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MatchTechMonitorConfig matchTechMonitorConfig = DEFAULT;
        MatchTechMonitorConfig matchTechMonitorConfig2 = (MatchTechMonitorConfig) settingsManager.getValueSafely("live_match_tech_monitor_calibration", matchTechMonitorConfig);
        return matchTechMonitorConfig2 != null ? matchTechMonitorConfig2 : matchTechMonitorConfig;
    }

    public final boolean isFunnelDetailEnabled() {
        return getValue().enableFunnelDetail;
    }

    public final boolean isInviteeRequestFromPassingEnabled() {
        return getValue().enableInviteeRequestFromPassing;
    }

    public final boolean isRequestFromEnabled() {
        return getValue().enableRequestFrom;
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_invitation_over_issurance_config")
public final class LiveCohostInvitationOverIssuranceConfigSetting {
    public static final LiveCohostInvitationOverIssuranceConfigSetting INSTANCE = new LiveCohostInvitationOverIssuranceConfigSetting();
    public static final LiveCohostInvitationOverIssuranceConfig DEFAULT = new LiveCohostInvitationOverIssuranceConfig(0, 3, new int[0]);

    public static final LiveCohostInvitationOverIssuranceConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveCohostInvitationOverIssuranceConfig liveCohostInvitationOverIssuranceConfig = DEFAULT;
        LiveCohostInvitationOverIssuranceConfig liveCohostInvitationOverIssuranceConfig2 = (LiveCohostInvitationOverIssuranceConfig) settingsManager.getValueSafely("live_cohost_invitation_over_issurance_config", liveCohostInvitationOverIssuranceConfig);
        return liveCohostInvitationOverIssuranceConfig2 != null ? liveCohostInvitationOverIssuranceConfig2 : liveCohostInvitationOverIssuranceConfig;
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_pre_approve_config")
public final class MultiGuestPreApproveConfigSetting {
    public static final MultiGuestPreApproveConfigSetting INSTANCE = new MultiGuestPreApproveConfigSetting();
    public static final PreApproveConfig DEFAULT = new PreApproveConfig(true, 5, 5, 3);

    public static final PreApproveConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PreApproveConfig preApproveConfig = DEFAULT;
        PreApproveConfig preApproveConfig2 = (PreApproveConfig) settingsManager.getValueSafely("multi_guest_pre_approve_config", preApproveConfig);
        return preApproveConfig2 != null ? preApproveConfig2 : preApproveConfig;
    }

    public static final int getAnchorToastDuration() {
        return getValue().anchorToastDuration;
    }

    public static final int getAudienceBubbleDuration() {
        return getValue().audienceBubbleDuration;
    }

    public static final int getMaxPreApproveCount() {
        return getValue().maxPreApproveCount;
    }

    public static final boolean isPreApproveEnabled() {
        return getValue().enable;
    }
}

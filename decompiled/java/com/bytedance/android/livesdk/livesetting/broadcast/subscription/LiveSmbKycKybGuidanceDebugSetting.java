package com.bytedance.android.livesdk.livesetting.broadcast.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_smb_kyc_kyb_guidance_skip_frequency_control")
public final class LiveSmbKycKybGuidanceDebugSetting {
    public static final int DEFAULT = 0;
    public static final LiveSmbKycKybGuidanceDebugSetting INSTANCE = new LiveSmbKycKybGuidanceDebugSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_smb_kyc_kyb_guidance_skip_frequency_control", DEFAULT);
    }

    public final boolean isSkipFrequencyControl() {
        return getValue() == 1;
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("payout_onboarding_url")
public final class LiveSubsPayoutOnboardingUrlSetting {
    public static final LiveSubsPayoutOnboardingUrlSetting INSTANCE = new LiveSubsPayoutOnboardingUrlSetting();
    public static final SubsPayoutOnboardingUrlConfig DEFAULT = new SubsPayoutOnboardingUrlConfig("");

    public static final String payoutOnboardingPopup() {
        return INSTANCE.getSettingValue().payoutOnboardingPopup;
    }

    public final SubsPayoutOnboardingUrlConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig = DEFAULT;
        SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig2 = (SubsPayoutOnboardingUrlConfig) settingsManager.getValueSafely("payout_onboarding_url", subsPayoutOnboardingUrlConfig);
        return subsPayoutOnboardingUrlConfig2 != null ? subsPayoutOnboardingUrlConfig2 : subsPayoutOnboardingUrlConfig;
    }
}

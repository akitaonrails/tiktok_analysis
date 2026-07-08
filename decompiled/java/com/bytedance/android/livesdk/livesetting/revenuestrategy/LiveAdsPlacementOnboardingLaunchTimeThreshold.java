package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ads_placement_onboarding_launch_time_threshold")
public final class LiveAdsPlacementOnboardingLaunchTimeThreshold {
    public static final LiveAdsPlacementOnboardingLaunchTimeThreshold INSTANCE = new LiveAdsPlacementOnboardingLaunchTimeThreshold();
    public static final int DEFAULT = 15;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_ads_placement_onboarding_launch_time_threshold", DEFAULT);
    }
}

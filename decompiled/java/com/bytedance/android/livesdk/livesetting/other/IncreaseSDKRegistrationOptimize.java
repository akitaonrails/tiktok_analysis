package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("increase_sdk_registration_optimize")
public final class IncreaseSDKRegistrationOptimize {
    public static final IncreaseSDKRegistrationConfig DEFAULT;
    public static final IncreaseSDKRegistrationOptimize INSTANCE = new IncreaseSDKRegistrationOptimize();
    public static final IncreaseSDKRegistrationConfig value;

    static {
        IncreaseSDKRegistrationConfig increaseSDKRegistrationConfig = new IncreaseSDKRegistrationConfig(false, false, false, false);
        DEFAULT = increaseSDKRegistrationConfig;
        IncreaseSDKRegistrationConfig increaseSDKRegistrationConfig2 = (IncreaseSDKRegistrationConfig) SettingsManager.INSTANCE.getValueSafely(IncreaseSDKRegistrationOptimize.class);
        if (increaseSDKRegistrationConfig2 != null) {
            increaseSDKRegistrationConfig = increaseSDKRegistrationConfig2;
        }
        value = increaseSDKRegistrationConfig;
    }

    public static final boolean avoidComponentLoading() {
        return value.avoidComponentLoading;
    }

    public static final boolean avoidFirstFrame() {
        return value.avoidFirstFrame;
    }

    public static final boolean parseRuleLocally() {
        return value.parseRuleLocally;
    }

    public static final boolean registerOnDemand() {
        return value.registerOnDemand;
    }
}

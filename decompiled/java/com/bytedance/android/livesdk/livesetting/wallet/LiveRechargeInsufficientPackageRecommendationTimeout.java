package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_insufficient_package_recommendation_timeout")
public final class LiveRechargeInsufficientPackageRecommendationTimeout {
    public static final long DEFAULT = 2;
    public static final LiveRechargeInsufficientPackageRecommendationTimeout INSTANCE = new LiveRechargeInsufficientPackageRecommendationTimeout();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_recharge_insufficient_package_recommendation_timeout", DEFAULT);
    }
}

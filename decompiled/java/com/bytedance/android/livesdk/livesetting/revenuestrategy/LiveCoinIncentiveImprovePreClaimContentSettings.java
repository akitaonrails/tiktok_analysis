package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_preclaim_information_opt")
public final class LiveCoinIncentiveImprovePreClaimContentSettings {
    public static final boolean DEFAULT = false;
    public static final LiveCoinIncentiveImprovePreClaimContentSettings INSTANCE = new LiveCoinIncentiveImprovePreClaimContentSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_preclaim_information_opt", DEFAULT);
    }
}

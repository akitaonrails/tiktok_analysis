package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_first_recharge_page_policy")
public final class LiveRoomFirstRechargePolicyConfig {
    public static final LiveRoomFirstRechargePolicyConfig INSTANCE = new LiveRoomFirstRechargePolicyConfig();
    public static final FirstRechargePolicyParams DEFAULT = new FirstRechargePolicyParams(null, null, null, null, null, false, null, false, null, null, null, null, null, 8191, null);

    public final FirstRechargePolicyParams getValue() {
        return (FirstRechargePolicyParams) SettingsManager.INSTANCE.getValueSafely("live_first_recharge_page_policy", DEFAULT);
    }
}

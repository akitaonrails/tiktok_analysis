package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_sync_effect_realtime")
public final class LiveSdkMultiGuestSyncEffectRealtimeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestSyncEffectRealtimeSetting INSTANCE = new LiveSdkMultiGuestSyncEffectRealtimeSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_sync_effect_realtime", DEFAULT);
    }
}

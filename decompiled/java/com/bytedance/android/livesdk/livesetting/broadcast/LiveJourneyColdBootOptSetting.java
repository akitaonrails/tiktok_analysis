package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_journey_cold_boot_opt")
public final class LiveJourneyColdBootOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveJourneyColdBootOptSetting INSTANCE = new LiveJourneyColdBootOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_journey_cold_boot_opt", DEFAULT);
    }
}

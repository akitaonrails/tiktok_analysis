package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_pin_card_active_time_seconds")
public final class LivePcsPinCardActiveTimeSecondsSetting {
    public static final int DEFAULT = 30;
    public static final LivePcsPinCardActiveTimeSecondsSetting INSTANCE = new LivePcsPinCardActiveTimeSecondsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_pin_card_active_time_seconds", DEFAULT);
    }
}

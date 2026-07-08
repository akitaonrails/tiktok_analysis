package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_run_pin_card_check_time")
public final class LivePcsRunPinCardCheckTimeSetting {
    public static final int DEFAULT = 300;
    public static final LivePcsRunPinCardCheckTimeSetting INSTANCE = new LivePcsRunPinCardCheckTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_run_pin_card_check_time", DEFAULT);
    }
}

package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_run_pin_card_client_ai_strategy")
public final class LivePcsRunPinCardClientAiStrategySetting {
    public static final int DEFAULT = 0;
    public static final LivePcsRunPinCardClientAiStrategySetting INSTANCE = new LivePcsRunPinCardClientAiStrategySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_run_pin_card_client_ai_strategy", DEFAULT) > 0;
    }
}

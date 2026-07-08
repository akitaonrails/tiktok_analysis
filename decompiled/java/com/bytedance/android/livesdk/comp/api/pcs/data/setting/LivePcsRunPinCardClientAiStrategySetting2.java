package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_run_pin_card_client_ai_strategy2")
public final class LivePcsRunPinCardClientAiStrategySetting2 {
    public static final int DEFAULT = 0;
    public static final LivePcsRunPinCardClientAiStrategySetting2 INSTANCE = new LivePcsRunPinCardClientAiStrategySetting2();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_run_pin_card_client_ai_strategy2", DEFAULT);
    }

    public final boolean enable() {
        return getValue() >= 0;
    }
}

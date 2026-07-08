package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_pin_card_margin_test")
public final class LivePcsPinCardMarginTestSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsPinCardMarginTestSetting INSTANCE = new LivePcsPinCardMarginTestSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_pin_card_margin_test", DEFAULT);
    }
}

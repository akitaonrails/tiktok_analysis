package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_payment_error_code_mock")
public final class LivePcsPaymentErrorCodeMockSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsPaymentErrorCodeMockSetting INSTANCE = new LivePcsPaymentErrorCodeMockSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_payment_error_code_mock", DEFAULT);
    }
}

package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_contract_create_error_code_mock")
public final class LivePcsContractCreateErrorCodeMockSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsContractCreateErrorCodeMockSetting INSTANCE = new LivePcsContractCreateErrorCodeMockSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_contract_create_error_code_mock", DEFAULT);
    }
}

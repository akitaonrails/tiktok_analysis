package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_contract_create_error_code_mock")
public final class LiveMockContractCreateErrorCode {
    public static final int DEFAULT = 0;
    public static final LiveMockContractCreateErrorCode INSTANCE = new LiveMockContractCreateErrorCode();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sub_contract_create_error_code_mock", DEFAULT);
    }
}

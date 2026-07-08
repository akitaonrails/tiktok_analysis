package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("wallet_iap_optimization_experiment_params")
public final class LiveWalletIAPOptimizationExperimentParams {
    public static final LiveWalletIAPOptimizationExperimentParams INSTANCE = new LiveWalletIAPOptimizationExperimentParams();
    public static final Map<String, Object> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Object> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Object> map = DEFAULT;
        Map<String, Object> map2 = (Map) settingsManager.getValueSafely("wallet_iap_optimization_experiment_params", map);
        return map2 != null ? map2 : map;
    }
}

package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_popup_optimize_open_audience")
public final class LiveHybridPopupOptimizeOpenAudienceSetting {
    public static final LiveHybridPopupOptimizeOpenAudienceSetting INSTANCE = new LiveHybridPopupOptimizeOpenAudienceSetting();
    public static final SparkPopupOptimizeConfig DEFAULT = new SparkPopupOptimizeConfig(false, false, null);

    public final SparkPopupOptimizeConfig getConfig() {
        return (SparkPopupOptimizeConfig) SettingsManager.INSTANCE.getValueSafely("live_hybrid_popup_optimize_open_audience", DEFAULT);
    }
}

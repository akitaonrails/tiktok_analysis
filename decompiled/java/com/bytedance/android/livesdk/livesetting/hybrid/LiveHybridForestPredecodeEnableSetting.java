package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_forest_predecode_enable")
public final class LiveHybridForestPredecodeEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridForestPredecodeEnableSetting INSTANCE = new LiveHybridForestPredecodeEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_forest_predecode_enable", DEFAULT);
    }
}

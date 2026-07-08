package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_fetch_thread_dispatch_optimization")
public final class LiveHybridFetchThreadDispatchOptimizationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridFetchThreadDispatchOptimizationSetting INSTANCE = new LiveHybridFetchThreadDispatchOptimizationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_fetch_thread_dispatch_optimization", DEFAULT);
    }
}

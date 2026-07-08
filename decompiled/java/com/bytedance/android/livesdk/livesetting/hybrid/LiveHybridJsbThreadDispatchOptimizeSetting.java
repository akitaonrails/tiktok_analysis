package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_jsb_thread_dispatch_optimize")
public final class LiveHybridJsbThreadDispatchOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridJsbThreadDispatchOptimizeSetting INSTANCE = new LiveHybridJsbThreadDispatchOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_jsb_thread_dispatch_optimize", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_memory_leak_fix")
public final class LiveHybridMemoryLeakFixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridMemoryLeakFixSetting INSTANCE = new LiveHybridMemoryLeakFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_memory_leak_fix", DEFAULT);
    }
}

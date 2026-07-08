package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_capsule_dispose_timing_optimize")
public final class LiveCapsuleDisposeTimingOptimizeSetting {
    public static final LiveCapsuleDisposeTimingOptimizeSetting INSTANCE = new LiveCapsuleDisposeTimingOptimizeSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_capsule_dispose_timing_optimize", DEFAULT);
    }
}

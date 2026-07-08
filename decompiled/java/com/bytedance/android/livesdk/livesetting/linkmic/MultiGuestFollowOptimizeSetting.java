package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_follow_optimize")
public final class MultiGuestFollowOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestFollowOptimizeSetting INSTANCE = new MultiGuestFollowOptimizeSetting();

    private final int value() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_follow_optimize", DEFAULT);
    }

    public final boolean followFallback() {
        return value() == 1;
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_smooth_interaction_setting")
public final class LiveSmoothInteractionOptimizeSetting {
    public static final LiveSmoothInteractionOptimizeSetting INSTANCE = new LiveSmoothInteractionOptimizeSetting();
    public static final LiveMultiTabBackInterceptionData DEFAULT = new LiveMultiTabBackInterceptionData(true, 2000, true);

    public final LiveMultiTabBackInterceptionData getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMultiTabBackInterceptionData liveMultiTabBackInterceptionData = DEFAULT;
        LiveMultiTabBackInterceptionData liveMultiTabBackInterceptionData2 = (LiveMultiTabBackInterceptionData) settingsManager.getValueSafely("live_smooth_interaction_setting", liveMultiTabBackInterceptionData);
        return liveMultiTabBackInterceptionData2 != null ? liveMultiTabBackInterceptionData2 : liveMultiTabBackInterceptionData;
    }

    public final boolean enablePermissionOptimize() {
        return getValue().enablePermissionOptimize;
    }

    public final LiveMultiTabBackInterceptionData getDEFAULT() {
        return DEFAULT;
    }
}

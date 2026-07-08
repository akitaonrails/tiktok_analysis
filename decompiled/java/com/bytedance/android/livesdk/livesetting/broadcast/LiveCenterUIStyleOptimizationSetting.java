package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_center_realtime_entry_style")
public final class LiveCenterUIStyleOptimizationSetting {
    public static final LiveCenterUIStyleOptimizationSetting INSTANCE = new LiveCenterUIStyleOptimizationSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_anchor_center_realtime_entry_style", DEFAULT);

    public final boolean enable() {
        return value == 1;
    }
}

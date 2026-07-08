package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_center_prompt_card_default_dock")
public final class LiveCenterUIStyleOptimizationPositionSetting {
    public static final LiveCenterUIStyleOptimizationPositionSetting INSTANCE = new LiveCenterUIStyleOptimizationPositionSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_anchor_center_prompt_card_default_dock", DEFAULT);

    public final boolean isDefaultBottom() {
        return value == 1;
    }

    public final boolean isDefaultTop() {
        return value == 0;
    }
}

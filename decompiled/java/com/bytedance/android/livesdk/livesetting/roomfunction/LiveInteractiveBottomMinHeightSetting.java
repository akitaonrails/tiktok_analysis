package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_interactive_bottom_min_height")
public final class LiveInteractiveBottomMinHeightSetting {
    public static final LiveInteractiveBottomMinHeightSetting INSTANCE = new LiveInteractiveBottomMinHeightSetting();
    public static final int DEFAULT = 100;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_interactive_bottom_min_height", DEFAULT);
    }
}

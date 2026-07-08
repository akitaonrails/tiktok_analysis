package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_strategy_capsule_style")
public final class LiveMultiStrategyCapsuleStyleSetting {
    public static final int DEFAULT = 0;
    public static final LiveMultiStrategyCapsuleStyleSetting INSTANCE = new LiveMultiStrategyCapsuleStyleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_strategy_capsule_style", DEFAULT);
    }

    public final boolean isNewStyle() {
        return getValue() == 2;
    }

    public final boolean isNewStyleV2() {
        return getValue() == 3;
    }
}

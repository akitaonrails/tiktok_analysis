package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_strategy_capsule_display_name")
public final class LiveMultiStrategyCapsuleDisplayNameSetting {
    public static final int DEFAULT = 0;
    public static final LiveMultiStrategyCapsuleDisplayNameSetting INSTANCE = new LiveMultiStrategyCapsuleDisplayNameSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_strategy_capsule_display_name", DEFAULT);
    }

    public final boolean isUsername() {
        return getValue() == 1;
    }
}

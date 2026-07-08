package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "increase_strategy")
public final class IncreaseStrategySetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final IncreaseStrategySetting INSTANCE = new IncreaseStrategySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("increase_strategy", DEFAULT);
    }
}

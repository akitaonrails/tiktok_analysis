package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_mirror_service_strategy_setting")
public final class LiveMirrorServiceStrategySetting {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveMirrorServiceStrategySetting INSTANCE = new LiveMirrorServiceStrategySetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_mirror_service_strategy_setting", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}

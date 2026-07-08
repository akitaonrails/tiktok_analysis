package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "self_seen_barrage_visual_effect_resources")
public final class SelfSeenBarrageResourcesSetting {
    public static final SelfSeenBarrageResourcesSetting INSTANCE = new SelfSeenBarrageResourcesSetting();
    public static final SelfSeenResourceConfig DEFAULT = new SelfSeenResourceConfig(null, null);

    public final SelfSeenResourceConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SelfSeenResourceConfig selfSeenResourceConfig = DEFAULT;
        SelfSeenResourceConfig selfSeenResourceConfig2 = (SelfSeenResourceConfig) settingsManager.getValueSafely("self_seen_barrage_visual_effect_resources", selfSeenResourceConfig);
        return selfSeenResourceConfig2 != null ? selfSeenResourceConfig2 : selfSeenResourceConfig;
    }
}

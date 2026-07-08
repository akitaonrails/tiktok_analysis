package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_co_host_same_effect_panel_count")
public final class LiveCohostSameEffectDisplayMaxCountSetting {
    public static final int DEFAULT = 12;
    public static final LiveCohostSameEffectDisplayMaxCountSetting INSTANCE = new LiveCohostSameEffectDisplayMaxCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_co_host_same_effect_panel_count", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "effect_layout_animation_delay_interval_in_ms")
public final class LinkMicTakeStageLayoutAnimationDelayInterval {
    public static final int $stable = 0;
    public static final LinkMicTakeStageLayoutAnimationDelayInterval INSTANCE = new LinkMicTakeStageLayoutAnimationDelayInterval();
    public static final int DEFAULT = 2000;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("effect_layout_animation_delay_interval_in_ms", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "enable_effect_layout_animation_for_dolphin")
public final class LinkMicTakeStageLayoutAnimationForDolphin {
    public static final int $stable = 0;
    public static final LinkMicTakeStageLayoutAnimationForDolphin INSTANCE = new LinkMicTakeStageLayoutAnimationForDolphin();
    public static final boolean DEFAULT = true;

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_effect_layout_animation_for_dolphin", DEFAULT);
    }
}

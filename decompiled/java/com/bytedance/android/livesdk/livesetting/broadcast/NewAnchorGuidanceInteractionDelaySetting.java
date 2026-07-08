package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "new_anchor_guidance_interaction_delay")
public final class NewAnchorGuidanceInteractionDelaySetting {
    public static final long DEFAULT = 30000;
    public static final NewAnchorGuidanceInteractionDelaySetting INSTANCE = new NewAnchorGuidanceInteractionDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("new_anchor_guidance_interaction_delay", DEFAULT);
    }
}

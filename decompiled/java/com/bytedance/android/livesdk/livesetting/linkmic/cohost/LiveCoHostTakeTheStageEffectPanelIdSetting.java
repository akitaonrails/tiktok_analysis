package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_switch_turn_effect_panel_id")
public final class LiveCoHostTakeTheStageEffectPanelIdSetting {
    public static final LiveCoHostTakeTheStageEffectPanelIdSetting INSTANCE = new LiveCoHostTakeTheStageEffectPanelIdSetting();
    public static final String DEFAULT = "live_take_stage";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_take_the_stage_switch_turn_effect_panel_id", DEFAULT);
    }
}

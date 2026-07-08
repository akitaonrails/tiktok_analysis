package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_switch_turn_effect_resource_id")
public final class LiveCoHostTakeTheStageEffectResourceIdSetting {
    public static final LiveCoHostTakeTheStageEffectResourceIdSetting INSTANCE = new LiveCoHostTakeTheStageEffectResourceIdSetting();
    public static final String DEFAULT = "7496340542020653569";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_take_the_stage_switch_turn_effect_resource_id", DEFAULT);
    }
}

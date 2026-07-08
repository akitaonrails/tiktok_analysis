package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_new_layout_update_gp_to_fe_enable")
public final class LiveCoHostTakeTheStageV2UpdateGPSetting {
    public static final LiveCoHostTakeTheStageV2UpdateGPSetting INSTANCE = new LiveCoHostTakeTheStageV2UpdateGPSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_new_layout_update_gp_to_fe_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_new_v2_adjust_by_player_callback")
public final class LiveCoHostTakeTheStageV2AdjustByPlayerCallbackSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostTakeTheStageV2AdjustByPlayerCallbackSetting INSTANCE = new LiveCoHostTakeTheStageV2AdjustByPlayerCallbackSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_new_v2_adjust_by_player_callback", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

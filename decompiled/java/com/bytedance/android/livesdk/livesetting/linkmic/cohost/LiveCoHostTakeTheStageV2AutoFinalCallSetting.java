package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_v2_auto_final_call_enable")
public final class LiveCoHostTakeTheStageV2AutoFinalCallSetting {
    public static final LiveCoHostTakeTheStageV2AutoFinalCallSetting INSTANCE = new LiveCoHostTakeTheStageV2AutoFinalCallSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_v2_auto_final_call_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_take_the_stage_final_call_duration")
public final class LiveCoHostTakeTheStageFinalCallDurationSetting {
    public static final LiveCoHostTakeTheStageFinalCallDurationSetting INSTANCE = new LiveCoHostTakeTheStageFinalCallDurationSetting();
    public static final long DEFAULT = 60;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_take_the_stage_final_call_duration", DEFAULT);
    }
}

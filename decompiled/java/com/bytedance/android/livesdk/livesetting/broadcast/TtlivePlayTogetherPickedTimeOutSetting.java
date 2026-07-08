package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_play_together_picked_time_out_setting")
public final class TtlivePlayTogetherPickedTimeOutSetting {
    public static final TtlivePlayTogetherPickedTimeOutSetting INSTANCE = new TtlivePlayTogetherPickedTimeOutSetting();
    public static final long DEFAULT = 300000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlive_play_together_picked_time_out_setting", DEFAULT);
    }
}

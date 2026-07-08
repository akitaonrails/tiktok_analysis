package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_count_down_sec")
public final class LiveCoHostTakeTheStageCountdownSecSetting {
    public static final LiveCoHostTakeTheStageCountdownSecSetting INSTANCE = new LiveCoHostTakeTheStageCountdownSecSetting();
    public static final long DEFAULT = 90;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_take_the_stage_count_down_sec", DEFAULT);
    }
}

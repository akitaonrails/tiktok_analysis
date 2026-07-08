package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = true, value = "live_pause_push_fps")
public final class PauseOptPushFpsSetting {
    public static final int DEFAULT = 1;
    public static final PauseOptPushFpsSetting INSTANCE = new PauseOptPushFpsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pause_push_fps", DEFAULT);
    }
}

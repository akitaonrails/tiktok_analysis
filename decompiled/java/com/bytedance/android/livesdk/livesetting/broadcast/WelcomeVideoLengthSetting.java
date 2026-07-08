package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_task_welcome_video_length")
public final class WelcomeVideoLengthSetting {
    public static final int DEFAULT = 0;
    public static final WelcomeVideoLengthSetting INSTANCE = new WelcomeVideoLengthSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_task_welcome_video_length", DEFAULT);
    }
}

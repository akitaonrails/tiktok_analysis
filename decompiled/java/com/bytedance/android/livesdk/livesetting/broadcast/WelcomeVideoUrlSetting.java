package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_task_welcome_video_url")
public final class WelcomeVideoUrlSetting {
    public static final String DEFAULT = "";
    public static final WelcomeVideoUrlSetting INSTANCE = new WelcomeVideoUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_task_welcome_video_url", DEFAULT);
    }
}

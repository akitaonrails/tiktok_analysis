package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_journey_launch_task_enable")
public final class LiveAnchorLaunchRequestSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAnchorLaunchRequestSetting INSTANCE = new LiveAnchorLaunchRequestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_journey_launch_task_enable", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_stream_goal_request_opt")
public final class LiveStreamGoalRequestOptSetting {
    public static final LiveStreamGoalRequestOptSetting INSTANCE = new LiveStreamGoalRequestOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_stream_goal_request_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}

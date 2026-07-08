package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pitaya_clear_delayed_tasks_on_room_release")
public final class LivePitayaClearDelayedTasksOnRoomReleaseSetting {
    public static final boolean DEFAULT = false;
    public static final LivePitayaClearDelayedTasksOnRoomReleaseSetting INSTANCE = new LivePitayaClearDelayedTasksOnRoomReleaseSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pitaya_clear_delayed_tasks_on_room_release", DEFAULT);
    }
}

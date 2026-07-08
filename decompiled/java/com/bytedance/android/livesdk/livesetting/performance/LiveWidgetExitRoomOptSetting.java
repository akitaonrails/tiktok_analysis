package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_widget_exit_room_opt")
public final class LiveWidgetExitRoomOptSetting {
    public static final LiveWidgetExitRoomOptSetting INSTANCE = new LiveWidgetExitRoomOptSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_widget_exit_room_opt", DEFAULT);

    public final boolean enable() {
        return value != 0;
    }

    public final boolean enableComment() {
        return (value & 8) == 8;
    }

    public final boolean enableFollow() {
        return (value & 1) == 1;
    }

    public final boolean enableFollowProfile() {
        return (value & 2) == 2;
    }

    public final boolean enableUnfollowProfile() {
        return (value & 4) == 4;
    }
}

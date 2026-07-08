package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_click_exit_room_opt")
public final class LiveClickExitRoomOptSetting {
    public static final LiveClickExitRoomOptSetting INSTANCE = new LiveClickExitRoomOptSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_click_exit_room_opt", DEFAULT);

    public final boolean disableStopPlayerWhenExitSmooth() {
        return (value & 32) == 32;
    }

    public final boolean disableStopRoomWhenExitSmooth() {
        return (value & 64) == 64;
    }

    public final boolean enableApiCancel() {
        return (value & 1) == 1;
    }

    public final boolean enableDelayTaskOpt() {
        return (value & 8) == 8;
    }

    public final boolean enableMessageOpt() {
        return (value & 4) == 4;
    }

    public final boolean enableOnlyHideInteractLayer() {
        return (value & 128) == 128;
    }

    public final boolean enableReuseOpt() {
        return (value & 2) == 2;
    }

    public final boolean enableStopRoom() {
        return (value & 16) == 16;
    }

    public final boolean enableCancelableTask() {
        return enableApiCancel() || enableDelayTaskOpt();
    }

    public final int value() {
        return value;
    }
}

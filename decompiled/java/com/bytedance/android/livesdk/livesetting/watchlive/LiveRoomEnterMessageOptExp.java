package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_room_enter_message_opt")
public final class LiveRoomEnterMessageOptExp {
    public static final boolean DEFAULT = false;
    public static final LiveRoomEnterMessageOptExp INSTANCE = new LiveRoomEnterMessageOptExp();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_room_enter_message_opt", DEFAULT);
    }
}

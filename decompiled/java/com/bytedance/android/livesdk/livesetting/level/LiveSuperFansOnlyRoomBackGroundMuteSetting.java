package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_super_fans_only_room_app_background_mute")
public final class LiveSuperFansOnlyRoomBackGroundMuteSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSuperFansOnlyRoomBackGroundMuteSetting INSTANCE = new LiveSuperFansOnlyRoomBackGroundMuteSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_super_fans_only_room_app_background_mute", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_landscape_close_room_opt_setting")
public final class LiveLandscapeCloseRoomOptSettingSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLandscapeCloseRoomOptSettingSetting INSTANCE = new LiveLandscapeCloseRoomOptSettingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_landscape_close_room_opt_setting", DEFAULT);
    }
}

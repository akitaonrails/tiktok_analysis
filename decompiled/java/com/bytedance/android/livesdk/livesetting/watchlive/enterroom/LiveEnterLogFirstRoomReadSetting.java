package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_log_first_room_read")
public final class LiveEnterLogFirstRoomReadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnterLogFirstRoomReadSetting INSTANCE = new LiveEnterLogFirstRoomReadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_log_first_room_read", DEFAULT);
    }
}

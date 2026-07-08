package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "enter_room_version")
public final class LiveEnterRoomVersionSetting {
    public static final LiveEnterRoomVersionSetting INSTANCE = new LiveEnterRoomVersionSetting();
    public static final String DEFAULT = "";

    public static final String getVersion() {
        String str = (String) SettingsManager.INSTANCE.getValueSafely(LiveEnterRoomVersionSetting.class);
        return str == null ? DEFAULT : str;
    }
}

package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_watch_room_enter_diagnosis_enable")
public final class LiveWatchRoomEnterDiagnosisSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWatchRoomEnterDiagnosisSetting INSTANCE = new LiveWatchRoomEnterDiagnosisSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_watch_room_enter_diagnosis_enable", DEFAULT);
    }
}

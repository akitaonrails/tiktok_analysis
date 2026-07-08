package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_start_mirror_service_interval_settings")
public final class GameStartMirrorServiceIntervalSetting {
    public static final long DEFAULT = 30000;
    public static final GameStartMirrorServiceIntervalSetting INSTANCE = new GameStartMirrorServiceIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlive_game_start_mirror_service_interval_settings", DEFAULT);
    }
}

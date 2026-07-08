package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_force_start_mirror_service_times_settings")
public final class GameForceStartMirrorServiceTimsSetting {
    public static final int DEFAULT = 10;
    public static final GameForceStartMirrorServiceTimsSetting INSTANCE = new GameForceStartMirrorServiceTimsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_force_start_mirror_service_times_settings", DEFAULT);
    }
}

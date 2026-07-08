package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_start_mirror_service_settings")
public final class GameStartMirrorServiceSetting {
    public static final boolean DEFAULT = false;
    public static final boolean GROUP_EXPERIMENT = true;
    public static final GameStartMirrorServiceSetting INSTANCE = new GameStartMirrorServiceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_start_mirror_service_settings", DEFAULT);
    }
}

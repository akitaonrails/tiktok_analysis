package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_broadcast_speed_test_upload_mapping")
public final class GameLiveBroadcastSpeedDetectionUploadMappingSetting {
    public static final GameLiveBroadcastSpeedDetectionUploadMappingSetting INSTANCE = new GameLiveBroadcastSpeedDetectionUploadMappingSetting();
    public static final UploadSpeedDetectionMapping DEFAULT = new UploadSpeedDetectionMapping(0.5f, 1.5f, 2.5f, 4.0f, 6.0f, 6.0f);

    public final UploadSpeedDetectionMapping getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        UploadSpeedDetectionMapping uploadSpeedDetectionMapping = DEFAULT;
        UploadSpeedDetectionMapping uploadSpeedDetectionMapping2 = (UploadSpeedDetectionMapping) settingsManager.getValueSafely("ttlive_game_broadcast_speed_test_upload_mapping", uploadSpeedDetectionMapping);
        return uploadSpeedDetectionMapping2 != null ? uploadSpeedDetectionMapping2 : uploadSpeedDetectionMapping;
    }
}

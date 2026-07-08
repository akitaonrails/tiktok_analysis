package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_audio_infer_libra_setting")
public final class GameAudioInferLibraSetting {
    public static final int DEFAULT = 0;
    public static final GameAudioInferLibraSetting INSTANCE = new GameAudioInferLibraSetting();
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_audio_infer_libra_setting", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == ENABLE;
    }
}

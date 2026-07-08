package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey(preciseExperiment = false, value = "game_rest_recognition_live")
public final class GameRestRecognitionLiveSetting {
    public static final GameRestRecognitionLiveSetting INSTANCE = new GameRestRecognitionLiveSetting();
    public static final GameRestConfig DEFAULT = new GameRestConfig();

    public final GameRestConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameRestConfig gameRestConfig = DEFAULT;
        GameRestConfig gameRestConfig2 = (GameRestConfig) settingsManager.getValueSafely("game_rest_recognition_live", gameRestConfig);
        return gameRestConfig2 != null ? gameRestConfig2 : gameRestConfig;
    }

    public final boolean isRecognitionLive(Long l) {
        if (l != null) {
            l.longValue();
            Long[] lArr = INSTANCE.getValue().recognitionGames;
            if (lArr != null) {
                for (Long l2 : lArr) {
                    if (l2.longValue() == l.longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isRecognitionLiveTag(Long l) {
        if (l != null) {
            l.longValue();
            Long[] lArr = INSTANCE.getValue().recognitionGameTags;
            if (lArr != null) {
                for (Long l2 : lArr) {
                    if (l2.longValue() == l.longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

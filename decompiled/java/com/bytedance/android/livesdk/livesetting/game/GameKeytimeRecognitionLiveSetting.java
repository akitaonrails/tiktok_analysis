package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC1294060jmO;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey(preciseExperiment = false, value = "game_keytime_recognition_live")
public final class GameKeytimeRecognitionLiveSetting {
    public static final GameKeytimeRecognitionLiveSetting INSTANCE = new GameKeytimeRecognitionLiveSetting();
    public static final GameLiveKeyTime DEFAULT = new GameLiveKeyTime();

    public final GameLiveKeyTime getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameLiveKeyTime gameLiveKeyTime = DEFAULT;
        GameLiveKeyTime gameLiveKeyTime2 = (GameLiveKeyTime) settingsManager.getValueSafely("game_keytime_recognition_live", gameLiveKeyTime);
        return gameLiveKeyTime2 != null ? gameLiveKeyTime2 : gameLiveKeyTime;
    }

    public final boolean enableReportHighlight() {
        return getValue().highlightReportInterval != -1;
    }

    public final boolean isRecognitionLive(Long l) {
        if (l != null) {
            l.longValue();
            Long[] lArr = INSTANCE.getValue().recognitionFusionIds;
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

    @InterfaceC1294060jmO
    public final boolean isRecognitionLiveTag(Long l) {
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
}

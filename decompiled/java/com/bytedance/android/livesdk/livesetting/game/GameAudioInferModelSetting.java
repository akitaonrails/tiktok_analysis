package com.bytedance.android.livesdk.livesetting.game;

import X.C19748512Ol;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.GameAudioInferModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("game_audio_infer_model_setting")
public final class GameAudioInferModelSetting {
    public static final GameAudioInferModelSetting INSTANCE = new GameAudioInferModelSetting();
    public static final String DEFAULT = "";

    public final Map<String, GameAudioInferModel> getValue() {
        try {
            return (Map) C19748512Ol.LIZIZ.LJIIIIZZ(SettingsManager.INSTANCE.getStringValue("game_audio_infer_model_setting", DEFAULT), new TypeToken<Map<String, ? extends GameAudioInferModel>>() { // from class: X.0hOZ
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

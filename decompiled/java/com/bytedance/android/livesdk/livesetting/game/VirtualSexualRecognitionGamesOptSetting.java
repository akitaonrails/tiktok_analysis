package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_recognition_games_opt")
public final class VirtualSexualRecognitionGamesOptSetting {
    public static final boolean DEFAULT = false;
    public static final VirtualSexualRecognitionGamesOptSetting INSTANCE = new VirtualSexualRecognitionGamesOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("virtual_sexual_recognition_games_opt", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_recognition_games_list")
public final class VirtualSexualRecognitionGamesListSetting {
    public static final VirtualSexualRecognitionGamesListSetting INSTANCE = new VirtualSexualRecognitionGamesListSetting();
    public static final long[] DEFAULT = new long[0];

    public final long[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        long[] jArr = DEFAULT;
        long[] jArr2 = (long[]) settingsManager.getValueSafely("virtual_sexual_recognition_games_list", jArr);
        return jArr2 != null ? jArr2 : jArr;
    }

    public final boolean isRecognitionLive(long j) {
        for (long j2 : getValue()) {
            if (j2 == j) {
                return true;
            }
        }
        return false;
    }
}

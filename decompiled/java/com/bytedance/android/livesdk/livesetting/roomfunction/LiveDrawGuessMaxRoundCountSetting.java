package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_draw_guess_max_round_count")
public final class LiveDrawGuessMaxRoundCountSetting {
    public static final int DEFAULT = 0;
    public static final LiveDrawGuessMaxRoundCountSetting INSTANCE = new LiveDrawGuessMaxRoundCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_draw_guess_max_round_count", DEFAULT);
    }
}

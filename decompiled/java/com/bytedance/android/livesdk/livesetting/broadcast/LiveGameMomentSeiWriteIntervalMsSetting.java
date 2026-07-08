package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_sei_write_interval_ms")
public final class LiveGameMomentSeiWriteIntervalMsSetting {
    public static final long DEFAULT = 1000;
    public static final LiveGameMomentSeiWriteIntervalMsSetting INSTANCE = new LiveGameMomentSeiWriteIntervalMsSetting();

    public final long getWriteSeiFrequency() {
        return SettingsManager.INSTANCE.getLongValue("live_game_moment_sei_write_interval_ms", DEFAULT);
    }
}

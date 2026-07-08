package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_count_down_timer_play_mode_config")
public final class LinkmicCountDownTimerPlayModeConfig {
    public static final LinkmicCountDownTimerPlayModeConfig INSTANCE = new LinkmicCountDownTimerPlayModeConfig();
    public static final LinkmicCountdownTimerPlayModeData DEFAULT = new LinkmicCountdownTimerPlayModeData(true, 3, 3, 60);

    public final LinkmicCountdownTimerPlayModeData getValue() {
        LinkmicCountdownTimerPlayModeData linkmicCountdownTimerPlayModeData = (LinkmicCountdownTimerPlayModeData) SettingsManager.INSTANCE.getValueSafely(LinkmicCountDownTimerPlayModeConfig.class);
        return linkmicCountdownTimerPlayModeData == null ? DEFAULT : linkmicCountdownTimerPlayModeData;
    }

    public final long endCountdownReqBackupDelayTime() {
        return getValue().endCountdownReqBackupDelayTime;
    }

    public final long enlargeImBackupDelayTime() {
        return getValue().enlargeImBackupDelayTime;
    }

    public final boolean isServiceEnable() {
        return getValue().enableCountdownService;
    }

    public final long maxCustomCountDownDuration() {
        return getValue().maxCustomCountDownDuration;
    }
}

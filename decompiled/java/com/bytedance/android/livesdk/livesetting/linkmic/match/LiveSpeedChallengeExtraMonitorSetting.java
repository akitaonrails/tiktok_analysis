package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_speed_challenge_extra_monitor_setting")
public final class LiveSpeedChallengeExtraMonitorSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSpeedChallengeExtraMonitorSetting INSTANCE = new LiveSpeedChallengeExtraMonitorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_speed_challenge_extra_monitor_setting", DEFAULT);
    }
}

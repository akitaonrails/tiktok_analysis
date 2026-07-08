package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_speed_challenge_npe_fix_enable")
public final class LiveSpeedChallengeNpeFixSetting {
    public static final int DEFAULT = 1;
    public static final LiveSpeedChallengeNpeFixSetting INSTANCE = new LiveSpeedChallengeNpeFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_match_speed_challenge_npe_fix_enable", DEFAULT) == 1;
    }
}

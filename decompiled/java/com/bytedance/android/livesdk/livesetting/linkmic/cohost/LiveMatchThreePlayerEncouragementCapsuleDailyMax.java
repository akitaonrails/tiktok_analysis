package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_three_player_encouragement_capsule_daily_max")
public final class LiveMatchThreePlayerEncouragementCapsuleDailyMax {
    public static final int DEFAULT = 1;
    public static final LiveMatchThreePlayerEncouragementCapsuleDailyMax INSTANCE = new LiveMatchThreePlayerEncouragementCapsuleDailyMax();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_three_player_encouragement_capsule_daily_max", DEFAULT);
    }
}

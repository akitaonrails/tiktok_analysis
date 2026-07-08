package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_three_player_encouragement_capsule_max_ignored")
public final class LiveMatchThreePlayerEncouragementCapsuleMaxIgnored {
    public static final int DEFAULT = 7;
    public static final LiveMatchThreePlayerEncouragementCapsuleMaxIgnored INSTANCE = new LiveMatchThreePlayerEncouragementCapsuleMaxIgnored();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_three_player_encouragement_capsule_max_ignored", DEFAULT);
    }
}

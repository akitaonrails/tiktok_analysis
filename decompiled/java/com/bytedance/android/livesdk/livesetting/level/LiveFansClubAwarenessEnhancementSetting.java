package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_fans_club_awareness_enhancement")
public final class LiveFansClubAwarenessEnhancementSetting {
    public static final int DEFAULT = 0;
    public static final LiveFansClubAwarenessEnhancementSetting INSTANCE = new LiveFansClubAwarenessEnhancementSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_awareness_enhancement", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}

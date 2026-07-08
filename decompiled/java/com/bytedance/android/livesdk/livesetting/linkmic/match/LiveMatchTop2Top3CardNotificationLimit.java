package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_top2_top3_card_notification_limit")
public final class LiveMatchTop2Top3CardNotificationLimit {
    public static final LiveMatchTop2Top3CardNotificationLimit INSTANCE = new LiveMatchTop2Top3CardNotificationLimit();
    public static final int DEFAULT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_top2_top3_card_notification_limit", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}

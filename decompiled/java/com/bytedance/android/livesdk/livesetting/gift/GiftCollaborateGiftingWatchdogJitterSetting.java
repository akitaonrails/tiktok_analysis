package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("collaborative_gift_watchdog_jitter_ms")
public final class GiftCollaborateGiftingWatchdogJitterSetting {
    public static final GiftCollaborateGiftingWatchdogJitterSetting INSTANCE = new GiftCollaborateGiftingWatchdogJitterSetting();
    public static final int DEFAULT = LivePreCreateNextRoomPlayer.ENABLE;
    public static final int expireMs = SettingsManager.INSTANCE.getIntValue("collaborative_gift_watchdog_jitter_ms", LivePreCreateNextRoomPlayer.ENABLE);

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getExpireMs() {
        return expireMs;
    }
}

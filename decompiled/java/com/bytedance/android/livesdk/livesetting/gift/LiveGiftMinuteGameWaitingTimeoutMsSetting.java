package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_minute_game_waiting_timeout_ms")
public final class LiveGiftMinuteGameWaitingTimeoutMsSetting {
    public static final LiveGiftMinuteGameWaitingTimeoutMsSetting INSTANCE = new LiveGiftMinuteGameWaitingTimeoutMsSetting();
    public static final int DEFAULT = 15000;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_minute_game_waiting_timeout_ms", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}

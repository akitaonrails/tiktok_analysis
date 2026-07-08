package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_minute_game_setting")
public final class LiveGiftMinuteGameSetting {
    public static final LiveGiftMinuteGameSetting INSTANCE = new LiveGiftMinuteGameSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_minute_game_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}

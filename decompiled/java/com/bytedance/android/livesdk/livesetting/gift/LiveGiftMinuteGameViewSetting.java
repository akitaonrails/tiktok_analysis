package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("enable_minute_game_viewer")
public final class LiveGiftMinuteGameViewSetting {
    public static final LiveGiftMinuteGameViewSetting INSTANCE = new LiveGiftMinuteGameViewSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_minute_game_viewer", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}

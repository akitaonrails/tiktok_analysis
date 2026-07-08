package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("first_screen_debounce_click_interval")
public final class FirstScreenDebounceClickIntervalSetting {
    public static final int DEFAULT = 300;
    public static final FirstScreenDebounceClickIntervalSetting INSTANCE = new FirstScreenDebounceClickIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("first_screen_debounce_click_interval", DEFAULT);
    }
}

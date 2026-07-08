package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("first_screen_debounce_click_enabled")
public final class FirstScreenDebounceClickEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final FirstScreenDebounceClickEnabledSetting INSTANCE = new FirstScreenDebounceClickEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("first_screen_debounce_click_enabled", DEFAULT);
    }
}

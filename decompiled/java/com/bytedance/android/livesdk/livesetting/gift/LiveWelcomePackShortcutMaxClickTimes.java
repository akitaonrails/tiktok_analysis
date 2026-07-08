package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_welcome_pack_shortcut_max_click_times")
public final class LiveWelcomePackShortcutMaxClickTimes {
    public static final int DEFAULT = 2;
    public static final LiveWelcomePackShortcutMaxClickTimes INSTANCE = new LiveWelcomePackShortcutMaxClickTimes();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_welcome_pack_shortcut_max_click_times", DEFAULT);
    }
}

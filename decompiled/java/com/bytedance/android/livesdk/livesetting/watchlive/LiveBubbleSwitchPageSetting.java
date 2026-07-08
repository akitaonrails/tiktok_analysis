package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_bubble_switch_page")
public final class LiveBubbleSwitchPageSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBubbleSwitchPageSetting INSTANCE = new LiveBubbleSwitchPageSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_bubble_switch_page", DEFAULT);
    }
}

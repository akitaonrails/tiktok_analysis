package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fast_scroll_delay_public_screen")
public final class LiveFastScrollDelayPublicScreenSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFastScrollDelayPublicScreenSetting INSTANCE = new LiveFastScrollDelayPublicScreenSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fast_scroll_delay_public_screen", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}

package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_online_audience_clear_screen_opt")
public final class LiveOnlineRankClearScreenOptSetting {
    public static final LiveOnlineRankClearScreenOptSetting INSTANCE = new LiveOnlineRankClearScreenOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_online_audience_clear_screen_opt", true);

    public final boolean enable() {
        return value;
    }
}

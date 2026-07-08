package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enable_player_set_timeout")
public final class LiveEnablePlayerSetTimeoutSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnablePlayerSetTimeoutSetting INSTANCE = new LiveEnablePlayerSetTimeoutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_player_set_timeout", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_reuse_player_stop_setting")
public final class LiveReusePlayerStopSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveReusePlayerStopSetting INSTANCE = new LiveReusePlayerStopSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_reuse_player_stop_setting", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_bg_music_switch")
public final class LiveBgMusicSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBgMusicSwitchSetting INSTANCE = new LiveBgMusicSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_bg_music_switch", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_only_allow_music_region_setting")
public final class LiveSubOnlyAllowMusicSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubOnlyAllowMusicSetting INSTANCE = new LiveSubOnlyAllowMusicSetting();

    public static final boolean getEnableAllowMusic() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_only_allow_music_region_setting", DEFAULT);
    }
}

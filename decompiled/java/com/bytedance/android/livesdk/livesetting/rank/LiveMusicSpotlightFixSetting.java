package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_music_spotlight_fix_setting")
public final class LiveMusicSpotlightFixSetting {
    public static final LiveMusicSpotlightFixSetting INSTANCE = new LiveMusicSpotlightFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_music_spotlight_fix_setting", DEFAULT);
    }
}

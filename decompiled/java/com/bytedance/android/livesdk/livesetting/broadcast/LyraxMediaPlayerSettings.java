package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("lyrax_media_player_enable")
public final class LyraxMediaPlayerSettings {
    public static final LyraxMediaPlayerSettings INSTANCE = new LyraxMediaPlayerSettings();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("lyrax_media_player_enable", DEFAULT);
    }
}

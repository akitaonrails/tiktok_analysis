package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_live_studio_downloads_page_scheme")
public final class LiveStudioDownloadsLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveStudioDownloadsLynxUrlSetting INSTANCE = new LiveStudioDownloadsLynxUrlSetting();

    public final String getLynxUrl() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_live_studio_downloads_page_scheme", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_live_studio_access_page_scheme")
public final class LiveStudioGetPermissionWebUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveStudioGetPermissionWebUrlSetting INSTANCE = new LiveStudioGetPermissionWebUrlSetting();

    public final String getWebUrl() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_live_studio_access_page_scheme", DEFAULT);
    }
}

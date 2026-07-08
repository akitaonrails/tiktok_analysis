package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_new_broadcast_new_help_page_scheme")
public final class LiveNewGameBroadcastBannerHelpPageScheme {
    public static final String DEFAULT = "";
    public static final LiveNewGameBroadcastBannerHelpPageScheme INSTANCE = new LiveNewGameBroadcastBannerHelpPageScheme();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_new_broadcast_new_help_page_scheme", DEFAULT);
    }
}

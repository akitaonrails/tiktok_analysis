package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_game_link_mic_feed_setting")
public final class GameLinkMicFeedSetting {
    public static final boolean DEFAULT = false;
    public static final boolean GROUP_BLOCK = true;
    public static final GameLinkMicFeedSetting INSTANCE = new GameLinkMicFeedSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_game_link_mic_feed_setting", DEFAULT);
    }

    public final boolean isDefault() {
        return !getValue();
    }
}

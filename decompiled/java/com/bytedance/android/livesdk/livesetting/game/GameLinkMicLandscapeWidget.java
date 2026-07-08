package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("game_link_mic_landscape_widget")
public final class GameLinkMicLandscapeWidget {
    public static final boolean DEFAULT = false;
    public static final GameLinkMicLandscapeWidget INSTANCE = new GameLinkMicLandscapeWidget();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_link_mic_landscape_widget", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == DEFAULT;
    }
}

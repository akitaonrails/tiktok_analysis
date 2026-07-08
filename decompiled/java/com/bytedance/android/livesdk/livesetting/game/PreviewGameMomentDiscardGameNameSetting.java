package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("preview_game_moment_discard_game_name")
public final class PreviewGameMomentDiscardGameNameSetting {
    public static final boolean DEFAULT = false;
    public static final PreviewGameMomentDiscardGameNameSetting INSTANCE = new PreviewGameMomentDiscardGameNameSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("preview_game_moment_discard_game_name", DEFAULT);
    }
}

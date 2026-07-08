package com.bytedance.android.livesdk.livesetting.broadcast.dynamic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_rust_settings")
public final class GameRustSetting {
    public static final boolean DEFAULT = true;
    public static final boolean GROUP_EXPERIMENT = false;
    public static final GameRustSetting INSTANCE = new GameRustSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_rust_settings", DEFAULT);
    }
}

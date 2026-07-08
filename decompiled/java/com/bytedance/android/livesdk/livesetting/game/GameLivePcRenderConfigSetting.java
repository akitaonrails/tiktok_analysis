package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("game_live_pc_render_config")
public final class GameLivePcRenderConfigSetting {
    public static final boolean DEFAULT = true;
    public static final GameLivePcRenderConfigSetting INSTANCE = new GameLivePcRenderConfigSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_pc_render_config", DEFAULT);
    }
}

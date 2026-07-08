package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_live_pc_render_reset_preview")
public final class GameLivePcRenderResetPreviewSetting {
    public static final boolean DEFAULT = true;
    public static final GameLivePcRenderResetPreviewSetting INSTANCE = new GameLivePcRenderResetPreviewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_pc_render_reset_preview", DEFAULT);
    }
}

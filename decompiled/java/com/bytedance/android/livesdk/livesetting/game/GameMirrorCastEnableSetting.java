package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_mirror_cast_enable")
public final class GameMirrorCastEnableSetting {
    public static final boolean DEFAULT = false;
    public static final GameMirrorCastEnableSetting INSTANCE = new GameMirrorCastEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_mirror_cast_enable", DEFAULT);
    }
}

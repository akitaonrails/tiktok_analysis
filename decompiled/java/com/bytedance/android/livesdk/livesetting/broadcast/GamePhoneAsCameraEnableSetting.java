package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_support_ls_camera")
public final class GamePhoneAsCameraEnableSetting {
    public static final boolean DEFAULT = true;
    public static final GamePhoneAsCameraEnableSetting INSTANCE = new GamePhoneAsCameraEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_support_ls_camera", DEFAULT);
    }
}

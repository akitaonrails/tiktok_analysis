package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_listener_enable")
public final class GameDualDeviceLinkListenerEnable {
    public static final boolean DISABLE = false;
    public static final GameDualDeviceLinkListenerEnable INSTANCE = new GameDualDeviceLinkListenerEnable();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_dual_device_listener_enable", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_live_anchor_net_access_enable")
public final class GameLiveAnchorNetAccessEnable {
    public static final GameLiveAnchorNetAccessEnable INSTANCE = new GameLiveAnchorNetAccessEnable();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_anchor_net_access_enable", DEFAULT);
    }
}

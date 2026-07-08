package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "broadcast_game_live_adaptive_switcher")
public final class BroadcastGameLiveAdaptiveSwitcherSetting {
    public static final boolean DEFAULT = false;
    public static final BroadcastGameLiveAdaptiveSwitcherSetting INSTANCE = new BroadcastGameLiveAdaptiveSwitcherSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("broadcast_game_live_adaptive_switcher", DEFAULT);
    }
}

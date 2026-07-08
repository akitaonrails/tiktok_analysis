package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_game_broadcast_frame")
public final class EnableGameBroadcastFrameSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final EnableGameBroadcastFrameSetting INSTANCE = new EnableGameBroadcastFrameSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_game_broadcast_frame", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}

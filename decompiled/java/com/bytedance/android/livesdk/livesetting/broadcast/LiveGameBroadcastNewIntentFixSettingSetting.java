package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_broadcast_new_intent_fix_setting")
public final class LiveGameBroadcastNewIntentFixSettingSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGameBroadcastNewIntentFixSettingSetting INSTANCE = new LiveGameBroadcastNewIntentFixSettingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_game_broadcast_new_intent_fix_setting", DEFAULT);
    }
}

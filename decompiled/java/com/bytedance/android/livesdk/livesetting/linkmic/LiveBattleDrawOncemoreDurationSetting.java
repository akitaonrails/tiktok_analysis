package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_battle_draw_oncemore_duration")
public final class LiveBattleDrawOncemoreDurationSetting {
    public static final long DEFAULT = 3;
    public static final LiveBattleDrawOncemoreDurationSetting INSTANCE = new LiveBattleDrawOncemoreDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_battle_draw_oncemore_duration", DEFAULT);
    }
}

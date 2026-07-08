package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_battle_draw_oncemore_enable")
public final class LiveBattleDrawOncemoreSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBattleDrawOncemoreSetting INSTANCE = new LiveBattleDrawOncemoreSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_battle_draw_oncemore_enable", DEFAULT);
    }
}

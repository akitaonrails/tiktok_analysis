package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_interact_battle_duration")
public final class LiveInteractBattleDurationSetting {
    public static final long DEFAULT = 301;
    public static final LiveInteractBattleDurationSetting INSTANCE = new LiveInteractBattleDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_interact_battle_duration", DEFAULT);
    }
}

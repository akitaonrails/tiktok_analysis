package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_interact_battle_punish_duration")
public final class LiveInteractBattlePunishDurationSetting {
    public static final long DEFAULT = 181;
    public static final LiveInteractBattlePunishDurationSetting INSTANCE = new LiveInteractBattlePunishDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_interact_battle_punish_duration", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("match_delay_battle_info_open_enable")
public final class LiveMatchDelayBattleInfoOpenSettings {
    public static final int DEFAULT = 0;
    public static final LiveMatchDelayBattleInfoOpenSettings INSTANCE = new LiveMatchDelayBattleInfoOpenSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("match_delay_battle_info_open_enable", DEFAULT) == 1;
    }
}
